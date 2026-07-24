package mcframe.clientMBBE.MBBEP0100;

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

	public static final String $disp_str001 = "disp_str001";
	public static final String $disp_str002 = "disp_str002";
	public static final String $disp_str003 = "disp_str003";
	public static final String $disp_str004 = "disp_str004";
	public static final String $disp_str005 = "disp_str005";
	public static final String $disp_str006 = "disp_str006";
	public static final String $disp_str007 = "disp_str007";
	public static final String $disp_str008 = "disp_str008";
	public static final String $disp_str009 = "disp_str009";
	public static final String $disp_str010 = "disp_str010";
	public static final String $disp_str011 = "disp_str011";
	public static final String $disp_str012 = "disp_str012";
	public static final String $disp_str013 = "disp_str013";
	public static final String $disp_str014 = "disp_str014";
	public static final String $disp_str015 = "disp_str015";
	public static final String $disp_str016 = "disp_str016";
	public static final String $disp_str017 = "disp_str017";
	public static final String $disp_str018 = "disp_str018";
	public static final String $disp_str019 = "disp_str019";
	public static final String $disp_str020 = "disp_str020";
	public static final String $disp_str021 = "disp_str021";
	public static final String $disp_str022 = "disp_str022";
	public static final String $disp_str023 = "disp_str023";
	public static final String $disp_str024 = "disp_str024";
	public static final String $disp_str025 = "disp_str025";
	public static final String $disp_str026 = "disp_str026";
	public static final String $disp_str027 = "disp_str027";
	public static final String $disp_str028 = "disp_str028";
	public static final String $disp_str029 = "disp_str029";
	public static final String $disp_str030 = "disp_str030";
	public static final String $disp_str031 = "disp_str031";
	public static final String $disp_str032 = "disp_str032";
	public static final String $disp_str033 = "disp_str033";
	public static final String $disp_str034 = "disp_str034";
	public static final String $disp_str035 = "disp_str035";
	public static final String $disp_str036 = "disp_str036";
	public static final String $disp_str037 = "disp_str037";
	public static final String $disp_str038 = "disp_str038";
	public static final String $disp_str039 = "disp_str039";
	public static final String $disp_str040 = "disp_str040";
	public static final String $disp_str041 = "disp_str041";
	public static final String $disp_str042 = "disp_str042";
	public static final String $disp_str043 = "disp_str043";
	public static final String $disp_str044 = "disp_str044";
	public static final String $disp_str045 = "disp_str045";
	public static final String $disp_str046 = "disp_str046";
	public static final String $disp_str047 = "disp_str047";
	public static final String $disp_str048 = "disp_str048";
	public static final String $disp_str049 = "disp_str049";
	public static final String $disp_str050 = "disp_str050";
	public static final String $disp_str051 = "disp_str051";
	public static final String $disp_str052 = "disp_str052";
	public static final String $disp_str053 = "disp_str053";
	public static final String $disp_str054 = "disp_str054";
	public static final String $disp_str055 = "disp_str055";
	public static final String $disp_str056 = "disp_str056";
	public static final String $disp_str057 = "disp_str057";
	public static final String $disp_str058 = "disp_str058";
	public static final String $disp_str059 = "disp_str059";
	public static final String $disp_str060 = "disp_str060";
	public static final String $disp_str061 = "disp_str061";
	public static final String $disp_str062 = "disp_str062";
	public static final String $disp_str063 = "disp_str063";
	public static final String $disp_str064 = "disp_str064";
	public static final String $disp_str065 = "disp_str065";
	public static final String $disp_str066 = "disp_str066";
	public static final String $disp_str067 = "disp_str067";
	public static final String $disp_str068 = "disp_str068";
	public static final String $disp_str069 = "disp_str069";
	public static final String $disp_str070 = "disp_str070";
	public static final String $disp_str071 = "disp_str071";
	public static final String $disp_str072 = "disp_str072";
	public static final String $disp_str073 = "disp_str073";
	public static final String $disp_str074 = "disp_str074";
	public static final String $disp_str075 = "disp_str075";
	public static final String $disp_str076 = "disp_str076";
	public static final String $disp_str077 = "disp_str077";
	public static final String $disp_str078 = "disp_str078";
	public static final String $disp_str079 = "disp_str079";
	public static final String $disp_str080 = "disp_str080";
	public static final String $disp_str081 = "disp_str081";
	public static final String $disp_str082 = "disp_str082";
	public static final String $disp_str083 = "disp_str083";
	public static final String $disp_str084 = "disp_str084";
	public static final String $disp_str085 = "disp_str085";
	public static final String $disp_str086 = "disp_str086";
	public static final String $disp_str087 = "disp_str087";
	public static final String $disp_str088 = "disp_str088";
	public static final String $disp_str089 = "disp_str089";
	public static final String $disp_str090 = "disp_str090";
	public static final String $disp_str091 = "disp_str091";
	public static final String $disp_str092 = "disp_str092";
	public static final String $disp_str093 = "disp_str093";
	public static final String $disp_str094 = "disp_str094";
	public static final String $disp_str095 = "disp_str095";
	public static final String $disp_str096 = "disp_str096";
	public static final String $disp_str097 = "disp_str097";
	public static final String $disp_str098 = "disp_str098";
	public static final String $disp_str099 = "disp_str099";
	public static final String $disp_str100 = "disp_str100";
	public static final String $disp_str101 = "disp_str101";
	public static final String $disp_str102 = "disp_str102";
	public static final String $disp_str103 = "disp_str103";
	public static final String $disp_str104 = "disp_str104";
	public static final String $disp_str105 = "disp_str105";
	public static final String $disp_str106 = "disp_str106";
	public static final String $disp_str107 = "disp_str107";
	public static final String $disp_str108 = "disp_str108";
	public static final String $disp_str109 = "disp_str109";
	public static final String $disp_str110 = "disp_str110";
	public static final String $disp_str111 = "disp_str111";
	public static final String $disp_str112 = "disp_str112";
	public static final String $disp_str113 = "disp_str113";
	public static final String $disp_str114 = "disp_str114";
	public static final String $disp_str115 = "disp_str115";
	public static final String $disp_str116 = "disp_str116";
	public static final String $disp_str117 = "disp_str117";
	public static final String $disp_str118 = "disp_str118";
	public static final String $disp_str119 = "disp_str119";
	public static final String $disp_str120 = "disp_str120";
	public static final String $disp_str121 = "disp_str121";
	public static final String $disp_str122 = "disp_str122";
	public static final String $disp_str123 = "disp_str123";
	public static final String $disp_str124 = "disp_str124";
	public static final String $disp_str125 = "disp_str125";
	public static final String $disp_str126 = "disp_str126";
	public static final String $disp_str127 = "disp_str127";
	public static final String $disp_str128 = "disp_str128";
	public static final String $disp_str129 = "disp_str129";
	public static final String $disp_str130 = "disp_str130";
	public static final String $disp_str131 = "disp_str131";
	public static final String $disp_str132 = "disp_str132";
	public static final String $disp_str133 = "disp_str133";
	public static final String $disp_str134 = "disp_str134";
	public static final String $disp_str135 = "disp_str135";
	public static final String $disp_str136 = "disp_str136";
	public static final String $disp_str137 = "disp_str137";
	public static final String $disp_str138 = "disp_str138";
	public static final String $disp_str139 = "disp_str139";
	public static final String $disp_str140 = "disp_str140";
	public static final String $disp_str141 = "disp_str141";
	public static final String $disp_str142 = "disp_str142";
	public static final String $disp_str143 = "disp_str143";
	public static final String $disp_str144 = "disp_str144";
	public static final String $disp_str145 = "disp_str145";
	public static final String $disp_str146 = "disp_str146";
	public static final String $disp_str147 = "disp_str147";
	public static final String $disp_str148 = "disp_str148";
	public static final String $disp_str149 = "disp_str149";
	public static final String $disp_str150 = "disp_str150";
	public static final String $disp_str151 = "disp_str151";
	public static final String $disp_str152 = "disp_str152";
	public static final String $disp_str153 = "disp_str153";
	public static final String $disp_str154 = "disp_str154";
	public static final String $disp_str155 = "disp_str155";
	public static final String $disp_str156 = "disp_str156";
	public static final String $disp_str157 = "disp_str157";
	public static final String $disp_str158 = "disp_str158";
	public static final String $disp_str159 = "disp_str159";
	public static final String $disp_str160 = "disp_str160";
	public static final String $disp_str161 = "disp_str161";
	public static final String $disp_str162 = "disp_str162";
	public static final String $disp_str163 = "disp_str163";
	public static final String $disp_str164 = "disp_str164";
	public static final String $disp_str165 = "disp_str165";
	public static final String $disp_str166 = "disp_str166";
	public static final String $disp_str167 = "disp_str167";
	public static final String $disp_str168 = "disp_str168";
	public static final String $disp_str169 = "disp_str169";
	public static final String $disp_str170 = "disp_str170";
	public static final String $disp_str171 = "disp_str171";
	public static final String $disp_str172 = "disp_str172";
	public static final String $disp_str173 = "disp_str173";
	public static final String $disp_str174 = "disp_str174";
	public static final String $disp_str175 = "disp_str175";
	public static final String $disp_str176 = "disp_str176";
	public static final String $disp_str177 = "disp_str177";
	public static final String $disp_str178 = "disp_str178";
	public static final String $disp_str179 = "disp_str179";
	public static final String $disp_str180 = "disp_str180";
	public static final String $disp_str181 = "disp_str181";
	public static final String $disp_str182 = "disp_str182";
	public static final String $disp_str183 = "disp_str183";
	public static final String $disp_str184 = "disp_str184";
	public static final String $disp_str185 = "disp_str185";
	public static final String $disp_str186 = "disp_str186";
	public static final String $disp_str187 = "disp_str187";
	public static final String $disp_str188 = "disp_str188";
	public static final String $disp_str189 = "disp_str189";
	public static final String $disp_str190 = "disp_str190";
	public static final String $disp_str191 = "disp_str191";
	public static final String $disp_str192 = "disp_str192";
	public static final String $disp_str193 = "disp_str193";
	public static final String $disp_str194 = "disp_str194";
	public static final String $disp_str195 = "disp_str195";
	public static final String $disp_str196 = "disp_str196";
	public static final String $disp_str197 = "disp_str197";
	public static final String $disp_str198 = "disp_str198";
	public static final String $disp_str199 = "disp_str199";
	public static final String $disp_str200 = "disp_str200";
	public static final String $disp_dt001 = "disp_dt001";
	public static final String $disp_dt002 = "disp_dt002";
	public static final String $disp_dt003 = "disp_dt003";
	public static final String $disp_dt004 = "disp_dt004";
	public static final String $disp_dt005 = "disp_dt005";
	public static final String $disp_dt006 = "disp_dt006";
	public static final String $disp_dt007 = "disp_dt007";
	public static final String $disp_dt008 = "disp_dt008";
	public static final String $disp_dt009 = "disp_dt009";
	public static final String $disp_dt010 = "disp_dt010";
	public static final String $disp_num001 = "disp_num001";
	public static final String $disp_num002 = "disp_num002";
	public static final String $disp_num003 = "disp_num003";
	public static final String $disp_num004 = "disp_num004";
	public static final String $disp_num005 = "disp_num005";
	public static final String $disp_num006 = "disp_num006";
	public static final String $disp_num007 = "disp_num007";
	public static final String $disp_num008 = "disp_num008";
	public static final String $disp_num009 = "disp_num009";
	public static final String $disp_num010 = "disp_num010";
	public static final String $add_col_data = "add_col_data";


	public static final MCMeta disp_str001_META = createCommonMeta($disp_str001, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str002_META = createCommonMeta($disp_str002, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str003_META = createCommonMeta($disp_str003, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str004_META = createCommonMeta($disp_str004, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str005_META = createCommonMeta($disp_str005, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str006_META = createCommonMeta($disp_str006, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str007_META = createCommonMeta($disp_str007, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str008_META = createCommonMeta($disp_str008, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str009_META = createCommonMeta($disp_str009, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str010_META = createCommonMeta($disp_str010, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str011_META = createCommonMeta($disp_str011, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str012_META = createCommonMeta($disp_str012, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str013_META = createCommonMeta($disp_str013, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str014_META = createCommonMeta($disp_str014, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str015_META = createCommonMeta($disp_str015, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str016_META = createCommonMeta($disp_str016, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str017_META = createCommonMeta($disp_str017, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str018_META = createCommonMeta($disp_str018, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str019_META = createCommonMeta($disp_str019, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str020_META = createCommonMeta($disp_str020, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str021_META = createCommonMeta($disp_str021, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str022_META = createCommonMeta($disp_str022, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str023_META = createCommonMeta($disp_str023, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str024_META = createCommonMeta($disp_str024, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str025_META = createCommonMeta($disp_str025, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str026_META = createCommonMeta($disp_str026, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str027_META = createCommonMeta($disp_str027, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str028_META = createCommonMeta($disp_str028, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str029_META = createCommonMeta($disp_str029, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str030_META = createCommonMeta($disp_str030, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str031_META = createCommonMeta($disp_str031, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str032_META = createCommonMeta($disp_str032, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str033_META = createCommonMeta($disp_str033, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str034_META = createCommonMeta($disp_str034, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str035_META = createCommonMeta($disp_str035, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str036_META = createCommonMeta($disp_str036, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str037_META = createCommonMeta($disp_str037, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str038_META = createCommonMeta($disp_str038, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str039_META = createCommonMeta($disp_str039, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str040_META = createCommonMeta($disp_str040, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str041_META = createCommonMeta($disp_str041, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str042_META = createCommonMeta($disp_str042, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str043_META = createCommonMeta($disp_str043, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str044_META = createCommonMeta($disp_str044, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str045_META = createCommonMeta($disp_str045, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str046_META = createCommonMeta($disp_str046, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str047_META = createCommonMeta($disp_str047, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str048_META = createCommonMeta($disp_str048, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str049_META = createCommonMeta($disp_str049, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str050_META = createCommonMeta($disp_str050, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str051_META = createCommonMeta($disp_str051, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str052_META = createCommonMeta($disp_str052, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str053_META = createCommonMeta($disp_str053, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str054_META = createCommonMeta($disp_str054, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str055_META = createCommonMeta($disp_str055, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str056_META = createCommonMeta($disp_str056, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str057_META = createCommonMeta($disp_str057, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str058_META = createCommonMeta($disp_str058, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str059_META = createCommonMeta($disp_str059, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str060_META = createCommonMeta($disp_str060, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str061_META = createCommonMeta($disp_str061, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str062_META = createCommonMeta($disp_str062, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str063_META = createCommonMeta($disp_str063, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str064_META = createCommonMeta($disp_str064, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str065_META = createCommonMeta($disp_str065, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str066_META = createCommonMeta($disp_str066, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str067_META = createCommonMeta($disp_str067, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str068_META = createCommonMeta($disp_str068, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str069_META = createCommonMeta($disp_str069, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str070_META = createCommonMeta($disp_str070, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str071_META = createCommonMeta($disp_str071, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str072_META = createCommonMeta($disp_str072, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str073_META = createCommonMeta($disp_str073, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str074_META = createCommonMeta($disp_str074, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str075_META = createCommonMeta($disp_str075, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str076_META = createCommonMeta($disp_str076, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str077_META = createCommonMeta($disp_str077, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str078_META = createCommonMeta($disp_str078, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str079_META = createCommonMeta($disp_str079, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str080_META = createCommonMeta($disp_str080, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str081_META = createCommonMeta($disp_str081, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str082_META = createCommonMeta($disp_str082, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str083_META = createCommonMeta($disp_str083, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str084_META = createCommonMeta($disp_str084, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str085_META = createCommonMeta($disp_str085, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str086_META = createCommonMeta($disp_str086, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str087_META = createCommonMeta($disp_str087, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str088_META = createCommonMeta($disp_str088, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str089_META = createCommonMeta($disp_str089, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str090_META = createCommonMeta($disp_str090, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str091_META = createCommonMeta($disp_str091, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str092_META = createCommonMeta($disp_str092, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str093_META = createCommonMeta($disp_str093, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str094_META = createCommonMeta($disp_str094, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str095_META = createCommonMeta($disp_str095, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str096_META = createCommonMeta($disp_str096, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str097_META = createCommonMeta($disp_str097, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str098_META = createCommonMeta($disp_str098, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str099_META = createCommonMeta($disp_str099, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str100_META = createCommonMeta($disp_str100, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str101_META = createCommonMeta($disp_str101, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str102_META = createCommonMeta($disp_str102, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str103_META = createCommonMeta($disp_str103, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str104_META = createCommonMeta($disp_str104, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str105_META = createCommonMeta($disp_str105, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str106_META = createCommonMeta($disp_str106, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str107_META = createCommonMeta($disp_str107, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str108_META = createCommonMeta($disp_str108, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str109_META = createCommonMeta($disp_str109, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str110_META = createCommonMeta($disp_str110, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str111_META = createCommonMeta($disp_str111, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str112_META = createCommonMeta($disp_str112, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str113_META = createCommonMeta($disp_str113, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str114_META = createCommonMeta($disp_str114, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str115_META = createCommonMeta($disp_str115, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str116_META = createCommonMeta($disp_str116, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str117_META = createCommonMeta($disp_str117, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str118_META = createCommonMeta($disp_str118, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str119_META = createCommonMeta($disp_str119, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str120_META = createCommonMeta($disp_str120, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str121_META = createCommonMeta($disp_str121, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str122_META = createCommonMeta($disp_str122, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str123_META = createCommonMeta($disp_str123, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str124_META = createCommonMeta($disp_str124, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str125_META = createCommonMeta($disp_str125, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str126_META = createCommonMeta($disp_str126, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str127_META = createCommonMeta($disp_str127, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str128_META = createCommonMeta($disp_str128, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str129_META = createCommonMeta($disp_str129, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str130_META = createCommonMeta($disp_str130, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str131_META = createCommonMeta($disp_str131, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str132_META = createCommonMeta($disp_str132, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str133_META = createCommonMeta($disp_str133, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str134_META = createCommonMeta($disp_str134, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str135_META = createCommonMeta($disp_str135, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str136_META = createCommonMeta($disp_str136, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str137_META = createCommonMeta($disp_str137, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str138_META = createCommonMeta($disp_str138, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str139_META = createCommonMeta($disp_str139, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str140_META = createCommonMeta($disp_str140, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str141_META = createCommonMeta($disp_str141, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str142_META = createCommonMeta($disp_str142, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str143_META = createCommonMeta($disp_str143, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str144_META = createCommonMeta($disp_str144, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str145_META = createCommonMeta($disp_str145, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str146_META = createCommonMeta($disp_str146, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str147_META = createCommonMeta($disp_str147, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str148_META = createCommonMeta($disp_str148, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str149_META = createCommonMeta($disp_str149, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str150_META = createCommonMeta($disp_str150, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str151_META = createCommonMeta($disp_str151, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str152_META = createCommonMeta($disp_str152, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str153_META = createCommonMeta($disp_str153, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str154_META = createCommonMeta($disp_str154, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str155_META = createCommonMeta($disp_str155, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str156_META = createCommonMeta($disp_str156, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str157_META = createCommonMeta($disp_str157, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str158_META = createCommonMeta($disp_str158, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str159_META = createCommonMeta($disp_str159, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str160_META = createCommonMeta($disp_str160, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str161_META = createCommonMeta($disp_str161, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str162_META = createCommonMeta($disp_str162, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str163_META = createCommonMeta($disp_str163, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str164_META = createCommonMeta($disp_str164, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str165_META = createCommonMeta($disp_str165, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str166_META = createCommonMeta($disp_str166, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str167_META = createCommonMeta($disp_str167, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str168_META = createCommonMeta($disp_str168, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str169_META = createCommonMeta($disp_str169, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str170_META = createCommonMeta($disp_str170, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str171_META = createCommonMeta($disp_str171, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str172_META = createCommonMeta($disp_str172, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str173_META = createCommonMeta($disp_str173, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str174_META = createCommonMeta($disp_str174, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str175_META = createCommonMeta($disp_str175, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str176_META = createCommonMeta($disp_str176, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str177_META = createCommonMeta($disp_str177, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str178_META = createCommonMeta($disp_str178, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str179_META = createCommonMeta($disp_str179, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str180_META = createCommonMeta($disp_str180, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str181_META = createCommonMeta($disp_str181, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str182_META = createCommonMeta($disp_str182, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str183_META = createCommonMeta($disp_str183, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str184_META = createCommonMeta($disp_str184, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str185_META = createCommonMeta($disp_str185, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str186_META = createCommonMeta($disp_str186, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str187_META = createCommonMeta($disp_str187, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str188_META = createCommonMeta($disp_str188, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str189_META = createCommonMeta($disp_str189, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str190_META = createCommonMeta($disp_str190, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str191_META = createCommonMeta($disp_str191, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str192_META = createCommonMeta($disp_str192, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str193_META = createCommonMeta($disp_str193, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str194_META = createCommonMeta($disp_str194, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str195_META = createCommonMeta($disp_str195, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str196_META = createCommonMeta($disp_str196, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str197_META = createCommonMeta($disp_str197, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str198_META = createCommonMeta($disp_str198, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str199_META = createCommonMeta($disp_str199, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_str200_META = createCommonMeta($disp_str200, mcframe.commonMA.meta.MA_META.DISP_STR);
	public static final MCMeta disp_dt001_META = createCommonMeta($disp_dt001, mcframe.commonMA.meta.MA_META.DISP_DT);
	public static final MCMeta disp_dt002_META = createCommonMeta($disp_dt002, mcframe.commonMA.meta.MA_META.DISP_DT);
	public static final MCMeta disp_dt003_META = createCommonMeta($disp_dt003, mcframe.commonMA.meta.MA_META.DISP_DT);
	public static final MCMeta disp_dt004_META = createCommonMeta($disp_dt004, mcframe.commonMA.meta.MA_META.DISP_DT);
	public static final MCMeta disp_dt005_META = createCommonMeta($disp_dt005, mcframe.commonMA.meta.MA_META.DISP_DT);
	public static final MCMeta disp_dt006_META = createCommonMeta($disp_dt006, mcframe.commonMA.meta.MA_META.DISP_DT);
	public static final MCMeta disp_dt007_META = createCommonMeta($disp_dt007, mcframe.commonMA.meta.MA_META.DISP_DT);
	public static final MCMeta disp_dt008_META = createCommonMeta($disp_dt008, mcframe.commonMA.meta.MA_META.DISP_DT);
	public static final MCMeta disp_dt009_META = createCommonMeta($disp_dt009, mcframe.commonMA.meta.MA_META.DISP_DT);
	public static final MCMeta disp_dt010_META = createCommonMeta($disp_dt010, mcframe.commonMA.meta.MA_META.DISP_DT);
	public static final MCMeta disp_num001_META = createCommonMeta($disp_num001, mcframe.commonMA.meta.MA_META.DISP_NUM);
	public static final MCMeta disp_num002_META = createCommonMeta($disp_num002, mcframe.commonMA.meta.MA_META.DISP_NUM);
	public static final MCMeta disp_num003_META = createCommonMeta($disp_num003, mcframe.commonMA.meta.MA_META.DISP_NUM);
	public static final MCMeta disp_num004_META = createCommonMeta($disp_num004, mcframe.commonMA.meta.MA_META.DISP_NUM);
	public static final MCMeta disp_num005_META = createCommonMeta($disp_num005, mcframe.commonMA.meta.MA_META.DISP_NUM);
	public static final MCMeta disp_num006_META = createCommonMeta($disp_num006, mcframe.commonMA.meta.MA_META.DISP_NUM);
	public static final MCMeta disp_num007_META = createCommonMeta($disp_num007, mcframe.commonMA.meta.MA_META.DISP_NUM);
	public static final MCMeta disp_num008_META = createCommonMeta($disp_num008, mcframe.commonMA.meta.MA_META.DISP_NUM);
	public static final MCMeta disp_num009_META = createCommonMeta($disp_num009, mcframe.commonMA.meta.MA_META.DISP_NUM);
	public static final MCMeta disp_num010_META = createCommonMeta($disp_num010, mcframe.commonMA.meta.MA_META.DISP_NUM);
	public static final MCMeta add_col_data_META = createStringMeta($add_col_data);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			disp_str001_META,
			disp_str002_META,
			disp_str003_META,
			disp_str004_META,
			disp_str005_META,
			disp_str006_META,
			disp_str007_META,
			disp_str008_META,
			disp_str009_META,
			disp_str010_META,
			disp_str011_META,
			disp_str012_META,
			disp_str013_META,
			disp_str014_META,
			disp_str015_META,
			disp_str016_META,
			disp_str017_META,
			disp_str018_META,
			disp_str019_META,
			disp_str020_META,
			disp_str021_META,
			disp_str022_META,
			disp_str023_META,
			disp_str024_META,
			disp_str025_META,
			disp_str026_META,
			disp_str027_META,
			disp_str028_META,
			disp_str029_META,
			disp_str030_META,
			disp_str031_META,
			disp_str032_META,
			disp_str033_META,
			disp_str034_META,
			disp_str035_META,
			disp_str036_META,
			disp_str037_META,
			disp_str038_META,
			disp_str039_META,
			disp_str040_META,
			disp_str041_META,
			disp_str042_META,
			disp_str043_META,
			disp_str044_META,
			disp_str045_META,
			disp_str046_META,
			disp_str047_META,
			disp_str048_META,
			disp_str049_META,
			disp_str050_META,
			disp_str051_META,
			disp_str052_META,
			disp_str053_META,
			disp_str054_META,
			disp_str055_META,
			disp_str056_META,
			disp_str057_META,
			disp_str058_META,
			disp_str059_META,
			disp_str060_META,
			disp_str061_META,
			disp_str062_META,
			disp_str063_META,
			disp_str064_META,
			disp_str065_META,
			disp_str066_META,
			disp_str067_META,
			disp_str068_META,
			disp_str069_META,
			disp_str070_META,
			disp_str071_META,
			disp_str072_META,
			disp_str073_META,
			disp_str074_META,
			disp_str075_META,
			disp_str076_META,
			disp_str077_META,
			disp_str078_META,
			disp_str079_META,
			disp_str080_META,
			disp_str081_META,
			disp_str082_META,
			disp_str083_META,
			disp_str084_META,
			disp_str085_META,
			disp_str086_META,
			disp_str087_META,
			disp_str088_META,
			disp_str089_META,
			disp_str090_META,
			disp_str091_META,
			disp_str092_META,
			disp_str093_META,
			disp_str094_META,
			disp_str095_META,
			disp_str096_META,
			disp_str097_META,
			disp_str098_META,
			disp_str099_META,
			disp_str100_META,
			disp_str101_META,
			disp_str102_META,
			disp_str103_META,
			disp_str104_META,
			disp_str105_META,
			disp_str106_META,
			disp_str107_META,
			disp_str108_META,
			disp_str109_META,
			disp_str110_META,
			disp_str111_META,
			disp_str112_META,
			disp_str113_META,
			disp_str114_META,
			disp_str115_META,
			disp_str116_META,
			disp_str117_META,
			disp_str118_META,
			disp_str119_META,
			disp_str120_META,
			disp_str121_META,
			disp_str122_META,
			disp_str123_META,
			disp_str124_META,
			disp_str125_META,
			disp_str126_META,
			disp_str127_META,
			disp_str128_META,
			disp_str129_META,
			disp_str130_META,
			disp_str131_META,
			disp_str132_META,
			disp_str133_META,
			disp_str134_META,
			disp_str135_META,
			disp_str136_META,
			disp_str137_META,
			disp_str138_META,
			disp_str139_META,
			disp_str140_META,
			disp_str141_META,
			disp_str142_META,
			disp_str143_META,
			disp_str144_META,
			disp_str145_META,
			disp_str146_META,
			disp_str147_META,
			disp_str148_META,
			disp_str149_META,
			disp_str150_META,
			disp_str151_META,
			disp_str152_META,
			disp_str153_META,
			disp_str154_META,
			disp_str155_META,
			disp_str156_META,
			disp_str157_META,
			disp_str158_META,
			disp_str159_META,
			disp_str160_META,
			disp_str161_META,
			disp_str162_META,
			disp_str163_META,
			disp_str164_META,
			disp_str165_META,
			disp_str166_META,
			disp_str167_META,
			disp_str168_META,
			disp_str169_META,
			disp_str170_META,
			disp_str171_META,
			disp_str172_META,
			disp_str173_META,
			disp_str174_META,
			disp_str175_META,
			disp_str176_META,
			disp_str177_META,
			disp_str178_META,
			disp_str179_META,
			disp_str180_META,
			disp_str181_META,
			disp_str182_META,
			disp_str183_META,
			disp_str184_META,
			disp_str185_META,
			disp_str186_META,
			disp_str187_META,
			disp_str188_META,
			disp_str189_META,
			disp_str190_META,
			disp_str191_META,
			disp_str192_META,
			disp_str193_META,
			disp_str194_META,
			disp_str195_META,
			disp_str196_META,
			disp_str197_META,
			disp_str198_META,
			disp_str199_META,
			disp_str200_META,
			disp_dt001_META,
			disp_dt002_META,
			disp_dt003_META,
			disp_dt004_META,
			disp_dt005_META,
			disp_dt006_META,
			disp_dt007_META,
			disp_dt008_META,
			disp_dt009_META,
			disp_dt010_META,
			disp_num001_META,
			disp_num002_META,
			disp_num003_META,
			disp_num004_META,
			disp_num005_META,
			disp_num006_META,
			disp_num007_META,
			disp_num008_META,
			disp_num009_META,
			disp_num010_META,
			add_col_data_META
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
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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



	public String disp_str001() {
		return getConstString(offset + 0, $disp_str001);
	}

	public void disp_str001(String value) {
		setConstString(offset + 0, $disp_str001, value);
	}


	public String disp_str002() {
		return getConstString(offset + 1, $disp_str002);
	}

	public void disp_str002(String value) {
		setConstString(offset + 1, $disp_str002, value);
	}


	public String disp_str003() {
		return getConstString(offset + 2, $disp_str003);
	}

	public void disp_str003(String value) {
		setConstString(offset + 2, $disp_str003, value);
	}


	public String disp_str004() {
		return getConstString(offset + 3, $disp_str004);
	}

	public void disp_str004(String value) {
		setConstString(offset + 3, $disp_str004, value);
	}


	public String disp_str005() {
		return getConstString(offset + 4, $disp_str005);
	}

	public void disp_str005(String value) {
		setConstString(offset + 4, $disp_str005, value);
	}


	public String disp_str006() {
		return getConstString(offset + 5, $disp_str006);
	}

	public void disp_str006(String value) {
		setConstString(offset + 5, $disp_str006, value);
	}


	public String disp_str007() {
		return getConstString(offset + 6, $disp_str007);
	}

	public void disp_str007(String value) {
		setConstString(offset + 6, $disp_str007, value);
	}


	public String disp_str008() {
		return getConstString(offset + 7, $disp_str008);
	}

	public void disp_str008(String value) {
		setConstString(offset + 7, $disp_str008, value);
	}


	public String disp_str009() {
		return getConstString(offset + 8, $disp_str009);
	}

	public void disp_str009(String value) {
		setConstString(offset + 8, $disp_str009, value);
	}


	public String disp_str010() {
		return getConstString(offset + 9, $disp_str010);
	}

	public void disp_str010(String value) {
		setConstString(offset + 9, $disp_str010, value);
	}


	public String disp_str011() {
		return getConstString(offset + 10, $disp_str011);
	}

	public void disp_str011(String value) {
		setConstString(offset + 10, $disp_str011, value);
	}


	public String disp_str012() {
		return getConstString(offset + 11, $disp_str012);
	}

	public void disp_str012(String value) {
		setConstString(offset + 11, $disp_str012, value);
	}


	public String disp_str013() {
		return getConstString(offset + 12, $disp_str013);
	}

	public void disp_str013(String value) {
		setConstString(offset + 12, $disp_str013, value);
	}


	public String disp_str014() {
		return getConstString(offset + 13, $disp_str014);
	}

	public void disp_str014(String value) {
		setConstString(offset + 13, $disp_str014, value);
	}


	public String disp_str015() {
		return getConstString(offset + 14, $disp_str015);
	}

	public void disp_str015(String value) {
		setConstString(offset + 14, $disp_str015, value);
	}


	public String disp_str016() {
		return getConstString(offset + 15, $disp_str016);
	}

	public void disp_str016(String value) {
		setConstString(offset + 15, $disp_str016, value);
	}


	public String disp_str017() {
		return getConstString(offset + 16, $disp_str017);
	}

	public void disp_str017(String value) {
		setConstString(offset + 16, $disp_str017, value);
	}


	public String disp_str018() {
		return getConstString(offset + 17, $disp_str018);
	}

	public void disp_str018(String value) {
		setConstString(offset + 17, $disp_str018, value);
	}


	public String disp_str019() {
		return getConstString(offset + 18, $disp_str019);
	}

	public void disp_str019(String value) {
		setConstString(offset + 18, $disp_str019, value);
	}


	public String disp_str020() {
		return getConstString(offset + 19, $disp_str020);
	}

	public void disp_str020(String value) {
		setConstString(offset + 19, $disp_str020, value);
	}


	public String disp_str021() {
		return getConstString(offset + 20, $disp_str021);
	}

	public void disp_str021(String value) {
		setConstString(offset + 20, $disp_str021, value);
	}


	public String disp_str022() {
		return getConstString(offset + 21, $disp_str022);
	}

	public void disp_str022(String value) {
		setConstString(offset + 21, $disp_str022, value);
	}


	public String disp_str023() {
		return getConstString(offset + 22, $disp_str023);
	}

	public void disp_str023(String value) {
		setConstString(offset + 22, $disp_str023, value);
	}


	public String disp_str024() {
		return getConstString(offset + 23, $disp_str024);
	}

	public void disp_str024(String value) {
		setConstString(offset + 23, $disp_str024, value);
	}


	public String disp_str025() {
		return getConstString(offset + 24, $disp_str025);
	}

	public void disp_str025(String value) {
		setConstString(offset + 24, $disp_str025, value);
	}


	public String disp_str026() {
		return getConstString(offset + 25, $disp_str026);
	}

	public void disp_str026(String value) {
		setConstString(offset + 25, $disp_str026, value);
	}


	public String disp_str027() {
		return getConstString(offset + 26, $disp_str027);
	}

	public void disp_str027(String value) {
		setConstString(offset + 26, $disp_str027, value);
	}


	public String disp_str028() {
		return getConstString(offset + 27, $disp_str028);
	}

	public void disp_str028(String value) {
		setConstString(offset + 27, $disp_str028, value);
	}


	public String disp_str029() {
		return getConstString(offset + 28, $disp_str029);
	}

	public void disp_str029(String value) {
		setConstString(offset + 28, $disp_str029, value);
	}


	public String disp_str030() {
		return getConstString(offset + 29, $disp_str030);
	}

	public void disp_str030(String value) {
		setConstString(offset + 29, $disp_str030, value);
	}


	public String disp_str031() {
		return getConstString(offset + 30, $disp_str031);
	}

	public void disp_str031(String value) {
		setConstString(offset + 30, $disp_str031, value);
	}


	public String disp_str032() {
		return getConstString(offset + 31, $disp_str032);
	}

	public void disp_str032(String value) {
		setConstString(offset + 31, $disp_str032, value);
	}


	public String disp_str033() {
		return getConstString(offset + 32, $disp_str033);
	}

	public void disp_str033(String value) {
		setConstString(offset + 32, $disp_str033, value);
	}


	public String disp_str034() {
		return getConstString(offset + 33, $disp_str034);
	}

	public void disp_str034(String value) {
		setConstString(offset + 33, $disp_str034, value);
	}


	public String disp_str035() {
		return getConstString(offset + 34, $disp_str035);
	}

	public void disp_str035(String value) {
		setConstString(offset + 34, $disp_str035, value);
	}


	public String disp_str036() {
		return getConstString(offset + 35, $disp_str036);
	}

	public void disp_str036(String value) {
		setConstString(offset + 35, $disp_str036, value);
	}


	public String disp_str037() {
		return getConstString(offset + 36, $disp_str037);
	}

	public void disp_str037(String value) {
		setConstString(offset + 36, $disp_str037, value);
	}


	public String disp_str038() {
		return getConstString(offset + 37, $disp_str038);
	}

	public void disp_str038(String value) {
		setConstString(offset + 37, $disp_str038, value);
	}


	public String disp_str039() {
		return getConstString(offset + 38, $disp_str039);
	}

	public void disp_str039(String value) {
		setConstString(offset + 38, $disp_str039, value);
	}


	public String disp_str040() {
		return getConstString(offset + 39, $disp_str040);
	}

	public void disp_str040(String value) {
		setConstString(offset + 39, $disp_str040, value);
	}


	public String disp_str041() {
		return getConstString(offset + 40, $disp_str041);
	}

	public void disp_str041(String value) {
		setConstString(offset + 40, $disp_str041, value);
	}


	public String disp_str042() {
		return getConstString(offset + 41, $disp_str042);
	}

	public void disp_str042(String value) {
		setConstString(offset + 41, $disp_str042, value);
	}


	public String disp_str043() {
		return getConstString(offset + 42, $disp_str043);
	}

	public void disp_str043(String value) {
		setConstString(offset + 42, $disp_str043, value);
	}


	public String disp_str044() {
		return getConstString(offset + 43, $disp_str044);
	}

	public void disp_str044(String value) {
		setConstString(offset + 43, $disp_str044, value);
	}


	public String disp_str045() {
		return getConstString(offset + 44, $disp_str045);
	}

	public void disp_str045(String value) {
		setConstString(offset + 44, $disp_str045, value);
	}


	public String disp_str046() {
		return getConstString(offset + 45, $disp_str046);
	}

	public void disp_str046(String value) {
		setConstString(offset + 45, $disp_str046, value);
	}


	public String disp_str047() {
		return getConstString(offset + 46, $disp_str047);
	}

	public void disp_str047(String value) {
		setConstString(offset + 46, $disp_str047, value);
	}


	public String disp_str048() {
		return getConstString(offset + 47, $disp_str048);
	}

	public void disp_str048(String value) {
		setConstString(offset + 47, $disp_str048, value);
	}


	public String disp_str049() {
		return getConstString(offset + 48, $disp_str049);
	}

	public void disp_str049(String value) {
		setConstString(offset + 48, $disp_str049, value);
	}


	public String disp_str050() {
		return getConstString(offset + 49, $disp_str050);
	}

	public void disp_str050(String value) {
		setConstString(offset + 49, $disp_str050, value);
	}


	public String disp_str051() {
		return getConstString(offset + 50, $disp_str051);
	}

	public void disp_str051(String value) {
		setConstString(offset + 50, $disp_str051, value);
	}


	public String disp_str052() {
		return getConstString(offset + 51, $disp_str052);
	}

	public void disp_str052(String value) {
		setConstString(offset + 51, $disp_str052, value);
	}


	public String disp_str053() {
		return getConstString(offset + 52, $disp_str053);
	}

	public void disp_str053(String value) {
		setConstString(offset + 52, $disp_str053, value);
	}


	public String disp_str054() {
		return getConstString(offset + 53, $disp_str054);
	}

	public void disp_str054(String value) {
		setConstString(offset + 53, $disp_str054, value);
	}


	public String disp_str055() {
		return getConstString(offset + 54, $disp_str055);
	}

	public void disp_str055(String value) {
		setConstString(offset + 54, $disp_str055, value);
	}


	public String disp_str056() {
		return getConstString(offset + 55, $disp_str056);
	}

	public void disp_str056(String value) {
		setConstString(offset + 55, $disp_str056, value);
	}


	public String disp_str057() {
		return getConstString(offset + 56, $disp_str057);
	}

	public void disp_str057(String value) {
		setConstString(offset + 56, $disp_str057, value);
	}


	public String disp_str058() {
		return getConstString(offset + 57, $disp_str058);
	}

	public void disp_str058(String value) {
		setConstString(offset + 57, $disp_str058, value);
	}


	public String disp_str059() {
		return getConstString(offset + 58, $disp_str059);
	}

	public void disp_str059(String value) {
		setConstString(offset + 58, $disp_str059, value);
	}


	public String disp_str060() {
		return getConstString(offset + 59, $disp_str060);
	}

	public void disp_str060(String value) {
		setConstString(offset + 59, $disp_str060, value);
	}


	public String disp_str061() {
		return getConstString(offset + 60, $disp_str061);
	}

	public void disp_str061(String value) {
		setConstString(offset + 60, $disp_str061, value);
	}


	public String disp_str062() {
		return getConstString(offset + 61, $disp_str062);
	}

	public void disp_str062(String value) {
		setConstString(offset + 61, $disp_str062, value);
	}


	public String disp_str063() {
		return getConstString(offset + 62, $disp_str063);
	}

	public void disp_str063(String value) {
		setConstString(offset + 62, $disp_str063, value);
	}


	public String disp_str064() {
		return getConstString(offset + 63, $disp_str064);
	}

	public void disp_str064(String value) {
		setConstString(offset + 63, $disp_str064, value);
	}


	public String disp_str065() {
		return getConstString(offset + 64, $disp_str065);
	}

	public void disp_str065(String value) {
		setConstString(offset + 64, $disp_str065, value);
	}


	public String disp_str066() {
		return getConstString(offset + 65, $disp_str066);
	}

	public void disp_str066(String value) {
		setConstString(offset + 65, $disp_str066, value);
	}


	public String disp_str067() {
		return getConstString(offset + 66, $disp_str067);
	}

	public void disp_str067(String value) {
		setConstString(offset + 66, $disp_str067, value);
	}


	public String disp_str068() {
		return getConstString(offset + 67, $disp_str068);
	}

	public void disp_str068(String value) {
		setConstString(offset + 67, $disp_str068, value);
	}


	public String disp_str069() {
		return getConstString(offset + 68, $disp_str069);
	}

	public void disp_str069(String value) {
		setConstString(offset + 68, $disp_str069, value);
	}


	public String disp_str070() {
		return getConstString(offset + 69, $disp_str070);
	}

	public void disp_str070(String value) {
		setConstString(offset + 69, $disp_str070, value);
	}


	public String disp_str071() {
		return getConstString(offset + 70, $disp_str071);
	}

	public void disp_str071(String value) {
		setConstString(offset + 70, $disp_str071, value);
	}


	public String disp_str072() {
		return getConstString(offset + 71, $disp_str072);
	}

	public void disp_str072(String value) {
		setConstString(offset + 71, $disp_str072, value);
	}


	public String disp_str073() {
		return getConstString(offset + 72, $disp_str073);
	}

	public void disp_str073(String value) {
		setConstString(offset + 72, $disp_str073, value);
	}


	public String disp_str074() {
		return getConstString(offset + 73, $disp_str074);
	}

	public void disp_str074(String value) {
		setConstString(offset + 73, $disp_str074, value);
	}


	public String disp_str075() {
		return getConstString(offset + 74, $disp_str075);
	}

	public void disp_str075(String value) {
		setConstString(offset + 74, $disp_str075, value);
	}


	public String disp_str076() {
		return getConstString(offset + 75, $disp_str076);
	}

	public void disp_str076(String value) {
		setConstString(offset + 75, $disp_str076, value);
	}


	public String disp_str077() {
		return getConstString(offset + 76, $disp_str077);
	}

	public void disp_str077(String value) {
		setConstString(offset + 76, $disp_str077, value);
	}


	public String disp_str078() {
		return getConstString(offset + 77, $disp_str078);
	}

	public void disp_str078(String value) {
		setConstString(offset + 77, $disp_str078, value);
	}


	public String disp_str079() {
		return getConstString(offset + 78, $disp_str079);
	}

	public void disp_str079(String value) {
		setConstString(offset + 78, $disp_str079, value);
	}


	public String disp_str080() {
		return getConstString(offset + 79, $disp_str080);
	}

	public void disp_str080(String value) {
		setConstString(offset + 79, $disp_str080, value);
	}


	public String disp_str081() {
		return getConstString(offset + 80, $disp_str081);
	}

	public void disp_str081(String value) {
		setConstString(offset + 80, $disp_str081, value);
	}


	public String disp_str082() {
		return getConstString(offset + 81, $disp_str082);
	}

	public void disp_str082(String value) {
		setConstString(offset + 81, $disp_str082, value);
	}


	public String disp_str083() {
		return getConstString(offset + 82, $disp_str083);
	}

	public void disp_str083(String value) {
		setConstString(offset + 82, $disp_str083, value);
	}


	public String disp_str084() {
		return getConstString(offset + 83, $disp_str084);
	}

	public void disp_str084(String value) {
		setConstString(offset + 83, $disp_str084, value);
	}


	public String disp_str085() {
		return getConstString(offset + 84, $disp_str085);
	}

	public void disp_str085(String value) {
		setConstString(offset + 84, $disp_str085, value);
	}


	public String disp_str086() {
		return getConstString(offset + 85, $disp_str086);
	}

	public void disp_str086(String value) {
		setConstString(offset + 85, $disp_str086, value);
	}


	public String disp_str087() {
		return getConstString(offset + 86, $disp_str087);
	}

	public void disp_str087(String value) {
		setConstString(offset + 86, $disp_str087, value);
	}


	public String disp_str088() {
		return getConstString(offset + 87, $disp_str088);
	}

	public void disp_str088(String value) {
		setConstString(offset + 87, $disp_str088, value);
	}


	public String disp_str089() {
		return getConstString(offset + 88, $disp_str089);
	}

	public void disp_str089(String value) {
		setConstString(offset + 88, $disp_str089, value);
	}


	public String disp_str090() {
		return getConstString(offset + 89, $disp_str090);
	}

	public void disp_str090(String value) {
		setConstString(offset + 89, $disp_str090, value);
	}


	public String disp_str091() {
		return getConstString(offset + 90, $disp_str091);
	}

	public void disp_str091(String value) {
		setConstString(offset + 90, $disp_str091, value);
	}


	public String disp_str092() {
		return getConstString(offset + 91, $disp_str092);
	}

	public void disp_str092(String value) {
		setConstString(offset + 91, $disp_str092, value);
	}


	public String disp_str093() {
		return getConstString(offset + 92, $disp_str093);
	}

	public void disp_str093(String value) {
		setConstString(offset + 92, $disp_str093, value);
	}


	public String disp_str094() {
		return getConstString(offset + 93, $disp_str094);
	}

	public void disp_str094(String value) {
		setConstString(offset + 93, $disp_str094, value);
	}


	public String disp_str095() {
		return getConstString(offset + 94, $disp_str095);
	}

	public void disp_str095(String value) {
		setConstString(offset + 94, $disp_str095, value);
	}


	public String disp_str096() {
		return getConstString(offset + 95, $disp_str096);
	}

	public void disp_str096(String value) {
		setConstString(offset + 95, $disp_str096, value);
	}


	public String disp_str097() {
		return getConstString(offset + 96, $disp_str097);
	}

	public void disp_str097(String value) {
		setConstString(offset + 96, $disp_str097, value);
	}


	public String disp_str098() {
		return getConstString(offset + 97, $disp_str098);
	}

	public void disp_str098(String value) {
		setConstString(offset + 97, $disp_str098, value);
	}


	public String disp_str099() {
		return getConstString(offset + 98, $disp_str099);
	}

	public void disp_str099(String value) {
		setConstString(offset + 98, $disp_str099, value);
	}


	public String disp_str100() {
		return getConstString(offset + 99, $disp_str100);
	}

	public void disp_str100(String value) {
		setConstString(offset + 99, $disp_str100, value);
	}


	public String disp_str101() {
		return getConstString(offset + 100, $disp_str101);
	}

	public void disp_str101(String value) {
		setConstString(offset + 100, $disp_str101, value);
	}


	public String disp_str102() {
		return getConstString(offset + 101, $disp_str102);
	}

	public void disp_str102(String value) {
		setConstString(offset + 101, $disp_str102, value);
	}


	public String disp_str103() {
		return getConstString(offset + 102, $disp_str103);
	}

	public void disp_str103(String value) {
		setConstString(offset + 102, $disp_str103, value);
	}


	public String disp_str104() {
		return getConstString(offset + 103, $disp_str104);
	}

	public void disp_str104(String value) {
		setConstString(offset + 103, $disp_str104, value);
	}


	public String disp_str105() {
		return getConstString(offset + 104, $disp_str105);
	}

	public void disp_str105(String value) {
		setConstString(offset + 104, $disp_str105, value);
	}


	public String disp_str106() {
		return getConstString(offset + 105, $disp_str106);
	}

	public void disp_str106(String value) {
		setConstString(offset + 105, $disp_str106, value);
	}


	public String disp_str107() {
		return getConstString(offset + 106, $disp_str107);
	}

	public void disp_str107(String value) {
		setConstString(offset + 106, $disp_str107, value);
	}


	public String disp_str108() {
		return getConstString(offset + 107, $disp_str108);
	}

	public void disp_str108(String value) {
		setConstString(offset + 107, $disp_str108, value);
	}


	public String disp_str109() {
		return getConstString(offset + 108, $disp_str109);
	}

	public void disp_str109(String value) {
		setConstString(offset + 108, $disp_str109, value);
	}


	public String disp_str110() {
		return getConstString(offset + 109, $disp_str110);
	}

	public void disp_str110(String value) {
		setConstString(offset + 109, $disp_str110, value);
	}


	public String disp_str111() {
		return getConstString(offset + 110, $disp_str111);
	}

	public void disp_str111(String value) {
		setConstString(offset + 110, $disp_str111, value);
	}


	public String disp_str112() {
		return getConstString(offset + 111, $disp_str112);
	}

	public void disp_str112(String value) {
		setConstString(offset + 111, $disp_str112, value);
	}


	public String disp_str113() {
		return getConstString(offset + 112, $disp_str113);
	}

	public void disp_str113(String value) {
		setConstString(offset + 112, $disp_str113, value);
	}


	public String disp_str114() {
		return getConstString(offset + 113, $disp_str114);
	}

	public void disp_str114(String value) {
		setConstString(offset + 113, $disp_str114, value);
	}


	public String disp_str115() {
		return getConstString(offset + 114, $disp_str115);
	}

	public void disp_str115(String value) {
		setConstString(offset + 114, $disp_str115, value);
	}


	public String disp_str116() {
		return getConstString(offset + 115, $disp_str116);
	}

	public void disp_str116(String value) {
		setConstString(offset + 115, $disp_str116, value);
	}


	public String disp_str117() {
		return getConstString(offset + 116, $disp_str117);
	}

	public void disp_str117(String value) {
		setConstString(offset + 116, $disp_str117, value);
	}


	public String disp_str118() {
		return getConstString(offset + 117, $disp_str118);
	}

	public void disp_str118(String value) {
		setConstString(offset + 117, $disp_str118, value);
	}


	public String disp_str119() {
		return getConstString(offset + 118, $disp_str119);
	}

	public void disp_str119(String value) {
		setConstString(offset + 118, $disp_str119, value);
	}


	public String disp_str120() {
		return getConstString(offset + 119, $disp_str120);
	}

	public void disp_str120(String value) {
		setConstString(offset + 119, $disp_str120, value);
	}


	public String disp_str121() {
		return getConstString(offset + 120, $disp_str121);
	}

	public void disp_str121(String value) {
		setConstString(offset + 120, $disp_str121, value);
	}


	public String disp_str122() {
		return getConstString(offset + 121, $disp_str122);
	}

	public void disp_str122(String value) {
		setConstString(offset + 121, $disp_str122, value);
	}


	public String disp_str123() {
		return getConstString(offset + 122, $disp_str123);
	}

	public void disp_str123(String value) {
		setConstString(offset + 122, $disp_str123, value);
	}


	public String disp_str124() {
		return getConstString(offset + 123, $disp_str124);
	}

	public void disp_str124(String value) {
		setConstString(offset + 123, $disp_str124, value);
	}


	public String disp_str125() {
		return getConstString(offset + 124, $disp_str125);
	}

	public void disp_str125(String value) {
		setConstString(offset + 124, $disp_str125, value);
	}


	public String disp_str126() {
		return getConstString(offset + 125, $disp_str126);
	}

	public void disp_str126(String value) {
		setConstString(offset + 125, $disp_str126, value);
	}


	public String disp_str127() {
		return getConstString(offset + 126, $disp_str127);
	}

	public void disp_str127(String value) {
		setConstString(offset + 126, $disp_str127, value);
	}


	public String disp_str128() {
		return getConstString(offset + 127, $disp_str128);
	}

	public void disp_str128(String value) {
		setConstString(offset + 127, $disp_str128, value);
	}


	public String disp_str129() {
		return getConstString(offset + 128, $disp_str129);
	}

	public void disp_str129(String value) {
		setConstString(offset + 128, $disp_str129, value);
	}


	public String disp_str130() {
		return getConstString(offset + 129, $disp_str130);
	}

	public void disp_str130(String value) {
		setConstString(offset + 129, $disp_str130, value);
	}


	public String disp_str131() {
		return getConstString(offset + 130, $disp_str131);
	}

	public void disp_str131(String value) {
		setConstString(offset + 130, $disp_str131, value);
	}


	public String disp_str132() {
		return getConstString(offset + 131, $disp_str132);
	}

	public void disp_str132(String value) {
		setConstString(offset + 131, $disp_str132, value);
	}


	public String disp_str133() {
		return getConstString(offset + 132, $disp_str133);
	}

	public void disp_str133(String value) {
		setConstString(offset + 132, $disp_str133, value);
	}


	public String disp_str134() {
		return getConstString(offset + 133, $disp_str134);
	}

	public void disp_str134(String value) {
		setConstString(offset + 133, $disp_str134, value);
	}


	public String disp_str135() {
		return getConstString(offset + 134, $disp_str135);
	}

	public void disp_str135(String value) {
		setConstString(offset + 134, $disp_str135, value);
	}


	public String disp_str136() {
		return getConstString(offset + 135, $disp_str136);
	}

	public void disp_str136(String value) {
		setConstString(offset + 135, $disp_str136, value);
	}


	public String disp_str137() {
		return getConstString(offset + 136, $disp_str137);
	}

	public void disp_str137(String value) {
		setConstString(offset + 136, $disp_str137, value);
	}


	public String disp_str138() {
		return getConstString(offset + 137, $disp_str138);
	}

	public void disp_str138(String value) {
		setConstString(offset + 137, $disp_str138, value);
	}


	public String disp_str139() {
		return getConstString(offset + 138, $disp_str139);
	}

	public void disp_str139(String value) {
		setConstString(offset + 138, $disp_str139, value);
	}


	public String disp_str140() {
		return getConstString(offset + 139, $disp_str140);
	}

	public void disp_str140(String value) {
		setConstString(offset + 139, $disp_str140, value);
	}


	public String disp_str141() {
		return getConstString(offset + 140, $disp_str141);
	}

	public void disp_str141(String value) {
		setConstString(offset + 140, $disp_str141, value);
	}


	public String disp_str142() {
		return getConstString(offset + 141, $disp_str142);
	}

	public void disp_str142(String value) {
		setConstString(offset + 141, $disp_str142, value);
	}


	public String disp_str143() {
		return getConstString(offset + 142, $disp_str143);
	}

	public void disp_str143(String value) {
		setConstString(offset + 142, $disp_str143, value);
	}


	public String disp_str144() {
		return getConstString(offset + 143, $disp_str144);
	}

	public void disp_str144(String value) {
		setConstString(offset + 143, $disp_str144, value);
	}


	public String disp_str145() {
		return getConstString(offset + 144, $disp_str145);
	}

	public void disp_str145(String value) {
		setConstString(offset + 144, $disp_str145, value);
	}


	public String disp_str146() {
		return getConstString(offset + 145, $disp_str146);
	}

	public void disp_str146(String value) {
		setConstString(offset + 145, $disp_str146, value);
	}


	public String disp_str147() {
		return getConstString(offset + 146, $disp_str147);
	}

	public void disp_str147(String value) {
		setConstString(offset + 146, $disp_str147, value);
	}


	public String disp_str148() {
		return getConstString(offset + 147, $disp_str148);
	}

	public void disp_str148(String value) {
		setConstString(offset + 147, $disp_str148, value);
	}


	public String disp_str149() {
		return getConstString(offset + 148, $disp_str149);
	}

	public void disp_str149(String value) {
		setConstString(offset + 148, $disp_str149, value);
	}


	public String disp_str150() {
		return getConstString(offset + 149, $disp_str150);
	}

	public void disp_str150(String value) {
		setConstString(offset + 149, $disp_str150, value);
	}


	public String disp_str151() {
		return getConstString(offset + 150, $disp_str151);
	}

	public void disp_str151(String value) {
		setConstString(offset + 150, $disp_str151, value);
	}


	public String disp_str152() {
		return getConstString(offset + 151, $disp_str152);
	}

	public void disp_str152(String value) {
		setConstString(offset + 151, $disp_str152, value);
	}


	public String disp_str153() {
		return getConstString(offset + 152, $disp_str153);
	}

	public void disp_str153(String value) {
		setConstString(offset + 152, $disp_str153, value);
	}


	public String disp_str154() {
		return getConstString(offset + 153, $disp_str154);
	}

	public void disp_str154(String value) {
		setConstString(offset + 153, $disp_str154, value);
	}


	public String disp_str155() {
		return getConstString(offset + 154, $disp_str155);
	}

	public void disp_str155(String value) {
		setConstString(offset + 154, $disp_str155, value);
	}


	public String disp_str156() {
		return getConstString(offset + 155, $disp_str156);
	}

	public void disp_str156(String value) {
		setConstString(offset + 155, $disp_str156, value);
	}


	public String disp_str157() {
		return getConstString(offset + 156, $disp_str157);
	}

	public void disp_str157(String value) {
		setConstString(offset + 156, $disp_str157, value);
	}


	public String disp_str158() {
		return getConstString(offset + 157, $disp_str158);
	}

	public void disp_str158(String value) {
		setConstString(offset + 157, $disp_str158, value);
	}


	public String disp_str159() {
		return getConstString(offset + 158, $disp_str159);
	}

	public void disp_str159(String value) {
		setConstString(offset + 158, $disp_str159, value);
	}


	public String disp_str160() {
		return getConstString(offset + 159, $disp_str160);
	}

	public void disp_str160(String value) {
		setConstString(offset + 159, $disp_str160, value);
	}


	public String disp_str161() {
		return getConstString(offset + 160, $disp_str161);
	}

	public void disp_str161(String value) {
		setConstString(offset + 160, $disp_str161, value);
	}


	public String disp_str162() {
		return getConstString(offset + 161, $disp_str162);
	}

	public void disp_str162(String value) {
		setConstString(offset + 161, $disp_str162, value);
	}


	public String disp_str163() {
		return getConstString(offset + 162, $disp_str163);
	}

	public void disp_str163(String value) {
		setConstString(offset + 162, $disp_str163, value);
	}


	public String disp_str164() {
		return getConstString(offset + 163, $disp_str164);
	}

	public void disp_str164(String value) {
		setConstString(offset + 163, $disp_str164, value);
	}


	public String disp_str165() {
		return getConstString(offset + 164, $disp_str165);
	}

	public void disp_str165(String value) {
		setConstString(offset + 164, $disp_str165, value);
	}


	public String disp_str166() {
		return getConstString(offset + 165, $disp_str166);
	}

	public void disp_str166(String value) {
		setConstString(offset + 165, $disp_str166, value);
	}


	public String disp_str167() {
		return getConstString(offset + 166, $disp_str167);
	}

	public void disp_str167(String value) {
		setConstString(offset + 166, $disp_str167, value);
	}


	public String disp_str168() {
		return getConstString(offset + 167, $disp_str168);
	}

	public void disp_str168(String value) {
		setConstString(offset + 167, $disp_str168, value);
	}


	public String disp_str169() {
		return getConstString(offset + 168, $disp_str169);
	}

	public void disp_str169(String value) {
		setConstString(offset + 168, $disp_str169, value);
	}


	public String disp_str170() {
		return getConstString(offset + 169, $disp_str170);
	}

	public void disp_str170(String value) {
		setConstString(offset + 169, $disp_str170, value);
	}


	public String disp_str171() {
		return getConstString(offset + 170, $disp_str171);
	}

	public void disp_str171(String value) {
		setConstString(offset + 170, $disp_str171, value);
	}


	public String disp_str172() {
		return getConstString(offset + 171, $disp_str172);
	}

	public void disp_str172(String value) {
		setConstString(offset + 171, $disp_str172, value);
	}


	public String disp_str173() {
		return getConstString(offset + 172, $disp_str173);
	}

	public void disp_str173(String value) {
		setConstString(offset + 172, $disp_str173, value);
	}


	public String disp_str174() {
		return getConstString(offset + 173, $disp_str174);
	}

	public void disp_str174(String value) {
		setConstString(offset + 173, $disp_str174, value);
	}


	public String disp_str175() {
		return getConstString(offset + 174, $disp_str175);
	}

	public void disp_str175(String value) {
		setConstString(offset + 174, $disp_str175, value);
	}


	public String disp_str176() {
		return getConstString(offset + 175, $disp_str176);
	}

	public void disp_str176(String value) {
		setConstString(offset + 175, $disp_str176, value);
	}


	public String disp_str177() {
		return getConstString(offset + 176, $disp_str177);
	}

	public void disp_str177(String value) {
		setConstString(offset + 176, $disp_str177, value);
	}


	public String disp_str178() {
		return getConstString(offset + 177, $disp_str178);
	}

	public void disp_str178(String value) {
		setConstString(offset + 177, $disp_str178, value);
	}


	public String disp_str179() {
		return getConstString(offset + 178, $disp_str179);
	}

	public void disp_str179(String value) {
		setConstString(offset + 178, $disp_str179, value);
	}


	public String disp_str180() {
		return getConstString(offset + 179, $disp_str180);
	}

	public void disp_str180(String value) {
		setConstString(offset + 179, $disp_str180, value);
	}


	public String disp_str181() {
		return getConstString(offset + 180, $disp_str181);
	}

	public void disp_str181(String value) {
		setConstString(offset + 180, $disp_str181, value);
	}


	public String disp_str182() {
		return getConstString(offset + 181, $disp_str182);
	}

	public void disp_str182(String value) {
		setConstString(offset + 181, $disp_str182, value);
	}


	public String disp_str183() {
		return getConstString(offset + 182, $disp_str183);
	}

	public void disp_str183(String value) {
		setConstString(offset + 182, $disp_str183, value);
	}


	public String disp_str184() {
		return getConstString(offset + 183, $disp_str184);
	}

	public void disp_str184(String value) {
		setConstString(offset + 183, $disp_str184, value);
	}


	public String disp_str185() {
		return getConstString(offset + 184, $disp_str185);
	}

	public void disp_str185(String value) {
		setConstString(offset + 184, $disp_str185, value);
	}


	public String disp_str186() {
		return getConstString(offset + 185, $disp_str186);
	}

	public void disp_str186(String value) {
		setConstString(offset + 185, $disp_str186, value);
	}


	public String disp_str187() {
		return getConstString(offset + 186, $disp_str187);
	}

	public void disp_str187(String value) {
		setConstString(offset + 186, $disp_str187, value);
	}


	public String disp_str188() {
		return getConstString(offset + 187, $disp_str188);
	}

	public void disp_str188(String value) {
		setConstString(offset + 187, $disp_str188, value);
	}


	public String disp_str189() {
		return getConstString(offset + 188, $disp_str189);
	}

	public void disp_str189(String value) {
		setConstString(offset + 188, $disp_str189, value);
	}


	public String disp_str190() {
		return getConstString(offset + 189, $disp_str190);
	}

	public void disp_str190(String value) {
		setConstString(offset + 189, $disp_str190, value);
	}


	public String disp_str191() {
		return getConstString(offset + 190, $disp_str191);
	}

	public void disp_str191(String value) {
		setConstString(offset + 190, $disp_str191, value);
	}


	public String disp_str192() {
		return getConstString(offset + 191, $disp_str192);
	}

	public void disp_str192(String value) {
		setConstString(offset + 191, $disp_str192, value);
	}


	public String disp_str193() {
		return getConstString(offset + 192, $disp_str193);
	}

	public void disp_str193(String value) {
		setConstString(offset + 192, $disp_str193, value);
	}


	public String disp_str194() {
		return getConstString(offset + 193, $disp_str194);
	}

	public void disp_str194(String value) {
		setConstString(offset + 193, $disp_str194, value);
	}


	public String disp_str195() {
		return getConstString(offset + 194, $disp_str195);
	}

	public void disp_str195(String value) {
		setConstString(offset + 194, $disp_str195, value);
	}


	public String disp_str196() {
		return getConstString(offset + 195, $disp_str196);
	}

	public void disp_str196(String value) {
		setConstString(offset + 195, $disp_str196, value);
	}


	public String disp_str197() {
		return getConstString(offset + 196, $disp_str197);
	}

	public void disp_str197(String value) {
		setConstString(offset + 196, $disp_str197, value);
	}


	public String disp_str198() {
		return getConstString(offset + 197, $disp_str198);
	}

	public void disp_str198(String value) {
		setConstString(offset + 197, $disp_str198, value);
	}


	public String disp_str199() {
		return getConstString(offset + 198, $disp_str199);
	}

	public void disp_str199(String value) {
		setConstString(offset + 198, $disp_str199, value);
	}


	public String disp_str200() {
		return getConstString(offset + 199, $disp_str200);
	}

	public void disp_str200(String value) {
		setConstString(offset + 199, $disp_str200, value);
	}


	public MCDate disp_dt001() {
		return getConstDate(offset + 200, $disp_dt001);
	}

	public void disp_dt001(MCDate value) {
		setConstDate(offset + 200, $disp_dt001, value);
	}


	public MCDate disp_dt002() {
		return getConstDate(offset + 201, $disp_dt002);
	}

	public void disp_dt002(MCDate value) {
		setConstDate(offset + 201, $disp_dt002, value);
	}


	public MCDate disp_dt003() {
		return getConstDate(offset + 202, $disp_dt003);
	}

	public void disp_dt003(MCDate value) {
		setConstDate(offset + 202, $disp_dt003, value);
	}


	public MCDate disp_dt004() {
		return getConstDate(offset + 203, $disp_dt004);
	}

	public void disp_dt004(MCDate value) {
		setConstDate(offset + 203, $disp_dt004, value);
	}


	public MCDate disp_dt005() {
		return getConstDate(offset + 204, $disp_dt005);
	}

	public void disp_dt005(MCDate value) {
		setConstDate(offset + 204, $disp_dt005, value);
	}


	public MCDate disp_dt006() {
		return getConstDate(offset + 205, $disp_dt006);
	}

	public void disp_dt006(MCDate value) {
		setConstDate(offset + 205, $disp_dt006, value);
	}


	public MCDate disp_dt007() {
		return getConstDate(offset + 206, $disp_dt007);
	}

	public void disp_dt007(MCDate value) {
		setConstDate(offset + 206, $disp_dt007, value);
	}


	public MCDate disp_dt008() {
		return getConstDate(offset + 207, $disp_dt008);
	}

	public void disp_dt008(MCDate value) {
		setConstDate(offset + 207, $disp_dt008, value);
	}


	public MCDate disp_dt009() {
		return getConstDate(offset + 208, $disp_dt009);
	}

	public void disp_dt009(MCDate value) {
		setConstDate(offset + 208, $disp_dt009, value);
	}


	public MCDate disp_dt010() {
		return getConstDate(offset + 209, $disp_dt010);
	}

	public void disp_dt010(MCDate value) {
		setConstDate(offset + 209, $disp_dt010, value);
	}


	public MCNumber disp_num001() {
		return getConstNumber(offset + 210, $disp_num001);
	}

	public void disp_num001(MCNumber value) {
		setConstNumber(offset + 210, $disp_num001, value);
	}

	public void disp_num001(int value) {
		setConstNumber(offset + 210, $disp_num001, value);
	}

	public void disp_num001(long value) {
		setConstNumber(offset + 210, $disp_num001, value);
	}

	public void disp_num001(float value) {
		setConstNumber(offset + 210, $disp_num001, value);
	}

	public void disp_num001(double value) {
		setConstNumber(offset + 210, $disp_num001, value);
	}


	public MCNumber disp_num002() {
		return getConstNumber(offset + 211, $disp_num002);
	}

	public void disp_num002(MCNumber value) {
		setConstNumber(offset + 211, $disp_num002, value);
	}

	public void disp_num002(int value) {
		setConstNumber(offset + 211, $disp_num002, value);
	}

	public void disp_num002(long value) {
		setConstNumber(offset + 211, $disp_num002, value);
	}

	public void disp_num002(float value) {
		setConstNumber(offset + 211, $disp_num002, value);
	}

	public void disp_num002(double value) {
		setConstNumber(offset + 211, $disp_num002, value);
	}


	public MCNumber disp_num003() {
		return getConstNumber(offset + 212, $disp_num003);
	}

	public void disp_num003(MCNumber value) {
		setConstNumber(offset + 212, $disp_num003, value);
	}

	public void disp_num003(int value) {
		setConstNumber(offset + 212, $disp_num003, value);
	}

	public void disp_num003(long value) {
		setConstNumber(offset + 212, $disp_num003, value);
	}

	public void disp_num003(float value) {
		setConstNumber(offset + 212, $disp_num003, value);
	}

	public void disp_num003(double value) {
		setConstNumber(offset + 212, $disp_num003, value);
	}


	public MCNumber disp_num004() {
		return getConstNumber(offset + 213, $disp_num004);
	}

	public void disp_num004(MCNumber value) {
		setConstNumber(offset + 213, $disp_num004, value);
	}

	public void disp_num004(int value) {
		setConstNumber(offset + 213, $disp_num004, value);
	}

	public void disp_num004(long value) {
		setConstNumber(offset + 213, $disp_num004, value);
	}

	public void disp_num004(float value) {
		setConstNumber(offset + 213, $disp_num004, value);
	}

	public void disp_num004(double value) {
		setConstNumber(offset + 213, $disp_num004, value);
	}


	public MCNumber disp_num005() {
		return getConstNumber(offset + 214, $disp_num005);
	}

	public void disp_num005(MCNumber value) {
		setConstNumber(offset + 214, $disp_num005, value);
	}

	public void disp_num005(int value) {
		setConstNumber(offset + 214, $disp_num005, value);
	}

	public void disp_num005(long value) {
		setConstNumber(offset + 214, $disp_num005, value);
	}

	public void disp_num005(float value) {
		setConstNumber(offset + 214, $disp_num005, value);
	}

	public void disp_num005(double value) {
		setConstNumber(offset + 214, $disp_num005, value);
	}


	public MCNumber disp_num006() {
		return getConstNumber(offset + 215, $disp_num006);
	}

	public void disp_num006(MCNumber value) {
		setConstNumber(offset + 215, $disp_num006, value);
	}

	public void disp_num006(int value) {
		setConstNumber(offset + 215, $disp_num006, value);
	}

	public void disp_num006(long value) {
		setConstNumber(offset + 215, $disp_num006, value);
	}

	public void disp_num006(float value) {
		setConstNumber(offset + 215, $disp_num006, value);
	}

	public void disp_num006(double value) {
		setConstNumber(offset + 215, $disp_num006, value);
	}


	public MCNumber disp_num007() {
		return getConstNumber(offset + 216, $disp_num007);
	}

	public void disp_num007(MCNumber value) {
		setConstNumber(offset + 216, $disp_num007, value);
	}

	public void disp_num007(int value) {
		setConstNumber(offset + 216, $disp_num007, value);
	}

	public void disp_num007(long value) {
		setConstNumber(offset + 216, $disp_num007, value);
	}

	public void disp_num007(float value) {
		setConstNumber(offset + 216, $disp_num007, value);
	}

	public void disp_num007(double value) {
		setConstNumber(offset + 216, $disp_num007, value);
	}


	public MCNumber disp_num008() {
		return getConstNumber(offset + 217, $disp_num008);
	}

	public void disp_num008(MCNumber value) {
		setConstNumber(offset + 217, $disp_num008, value);
	}

	public void disp_num008(int value) {
		setConstNumber(offset + 217, $disp_num008, value);
	}

	public void disp_num008(long value) {
		setConstNumber(offset + 217, $disp_num008, value);
	}

	public void disp_num008(float value) {
		setConstNumber(offset + 217, $disp_num008, value);
	}

	public void disp_num008(double value) {
		setConstNumber(offset + 217, $disp_num008, value);
	}


	public MCNumber disp_num009() {
		return getConstNumber(offset + 218, $disp_num009);
	}

	public void disp_num009(MCNumber value) {
		setConstNumber(offset + 218, $disp_num009, value);
	}

	public void disp_num009(int value) {
		setConstNumber(offset + 218, $disp_num009, value);
	}

	public void disp_num009(long value) {
		setConstNumber(offset + 218, $disp_num009, value);
	}

	public void disp_num009(float value) {
		setConstNumber(offset + 218, $disp_num009, value);
	}

	public void disp_num009(double value) {
		setConstNumber(offset + 218, $disp_num009, value);
	}


	public MCNumber disp_num010() {
		return getConstNumber(offset + 219, $disp_num010);
	}

	public void disp_num010(MCNumber value) {
		setConstNumber(offset + 219, $disp_num010, value);
	}

	public void disp_num010(int value) {
		setConstNumber(offset + 219, $disp_num010, value);
	}

	public void disp_num010(long value) {
		setConstNumber(offset + 219, $disp_num010, value);
	}

	public void disp_num010(float value) {
		setConstNumber(offset + 219, $disp_num010, value);
	}

	public void disp_num010(double value) {
		setConstNumber(offset + 219, $disp_num010, value);
	}


	public String add_col_data() {
		return getConstString(offset + 220, $add_col_data);
	}

	public void add_col_data(String value) {
		setConstString(offset + 220, $add_col_data, value);
	}


	public String getString(String name) {
		if ($disp_str001.equalsIgnoreCase(name)) {
			return disp_str001();
		}
		if ($disp_str002.equalsIgnoreCase(name)) {
			return disp_str002();
		}
		if ($disp_str003.equalsIgnoreCase(name)) {
			return disp_str003();
		}
		if ($disp_str004.equalsIgnoreCase(name)) {
			return disp_str004();
		}
		if ($disp_str005.equalsIgnoreCase(name)) {
			return disp_str005();
		}
		if ($disp_str006.equalsIgnoreCase(name)) {
			return disp_str006();
		}
		if ($disp_str007.equalsIgnoreCase(name)) {
			return disp_str007();
		}
		if ($disp_str008.equalsIgnoreCase(name)) {
			return disp_str008();
		}
		if ($disp_str009.equalsIgnoreCase(name)) {
			return disp_str009();
		}
		if ($disp_str010.equalsIgnoreCase(name)) {
			return disp_str010();
		}
		if ($disp_str011.equalsIgnoreCase(name)) {
			return disp_str011();
		}
		if ($disp_str012.equalsIgnoreCase(name)) {
			return disp_str012();
		}
		if ($disp_str013.equalsIgnoreCase(name)) {
			return disp_str013();
		}
		if ($disp_str014.equalsIgnoreCase(name)) {
			return disp_str014();
		}
		if ($disp_str015.equalsIgnoreCase(name)) {
			return disp_str015();
		}
		if ($disp_str016.equalsIgnoreCase(name)) {
			return disp_str016();
		}
		if ($disp_str017.equalsIgnoreCase(name)) {
			return disp_str017();
		}
		if ($disp_str018.equalsIgnoreCase(name)) {
			return disp_str018();
		}
		if ($disp_str019.equalsIgnoreCase(name)) {
			return disp_str019();
		}
		if ($disp_str020.equalsIgnoreCase(name)) {
			return disp_str020();
		}
		if ($disp_str021.equalsIgnoreCase(name)) {
			return disp_str021();
		}
		if ($disp_str022.equalsIgnoreCase(name)) {
			return disp_str022();
		}
		if ($disp_str023.equalsIgnoreCase(name)) {
			return disp_str023();
		}
		if ($disp_str024.equalsIgnoreCase(name)) {
			return disp_str024();
		}
		if ($disp_str025.equalsIgnoreCase(name)) {
			return disp_str025();
		}
		if ($disp_str026.equalsIgnoreCase(name)) {
			return disp_str026();
		}
		if ($disp_str027.equalsIgnoreCase(name)) {
			return disp_str027();
		}
		if ($disp_str028.equalsIgnoreCase(name)) {
			return disp_str028();
		}
		if ($disp_str029.equalsIgnoreCase(name)) {
			return disp_str029();
		}
		if ($disp_str030.equalsIgnoreCase(name)) {
			return disp_str030();
		}
		if ($disp_str031.equalsIgnoreCase(name)) {
			return disp_str031();
		}
		if ($disp_str032.equalsIgnoreCase(name)) {
			return disp_str032();
		}
		if ($disp_str033.equalsIgnoreCase(name)) {
			return disp_str033();
		}
		if ($disp_str034.equalsIgnoreCase(name)) {
			return disp_str034();
		}
		if ($disp_str035.equalsIgnoreCase(name)) {
			return disp_str035();
		}
		if ($disp_str036.equalsIgnoreCase(name)) {
			return disp_str036();
		}
		if ($disp_str037.equalsIgnoreCase(name)) {
			return disp_str037();
		}
		if ($disp_str038.equalsIgnoreCase(name)) {
			return disp_str038();
		}
		if ($disp_str039.equalsIgnoreCase(name)) {
			return disp_str039();
		}
		if ($disp_str040.equalsIgnoreCase(name)) {
			return disp_str040();
		}
		if ($disp_str041.equalsIgnoreCase(name)) {
			return disp_str041();
		}
		if ($disp_str042.equalsIgnoreCase(name)) {
			return disp_str042();
		}
		if ($disp_str043.equalsIgnoreCase(name)) {
			return disp_str043();
		}
		if ($disp_str044.equalsIgnoreCase(name)) {
			return disp_str044();
		}
		if ($disp_str045.equalsIgnoreCase(name)) {
			return disp_str045();
		}
		if ($disp_str046.equalsIgnoreCase(name)) {
			return disp_str046();
		}
		if ($disp_str047.equalsIgnoreCase(name)) {
			return disp_str047();
		}
		if ($disp_str048.equalsIgnoreCase(name)) {
			return disp_str048();
		}
		if ($disp_str049.equalsIgnoreCase(name)) {
			return disp_str049();
		}
		if ($disp_str050.equalsIgnoreCase(name)) {
			return disp_str050();
		}
		if ($disp_str051.equalsIgnoreCase(name)) {
			return disp_str051();
		}
		if ($disp_str052.equalsIgnoreCase(name)) {
			return disp_str052();
		}
		if ($disp_str053.equalsIgnoreCase(name)) {
			return disp_str053();
		}
		if ($disp_str054.equalsIgnoreCase(name)) {
			return disp_str054();
		}
		if ($disp_str055.equalsIgnoreCase(name)) {
			return disp_str055();
		}
		if ($disp_str056.equalsIgnoreCase(name)) {
			return disp_str056();
		}
		if ($disp_str057.equalsIgnoreCase(name)) {
			return disp_str057();
		}
		if ($disp_str058.equalsIgnoreCase(name)) {
			return disp_str058();
		}
		if ($disp_str059.equalsIgnoreCase(name)) {
			return disp_str059();
		}
		if ($disp_str060.equalsIgnoreCase(name)) {
			return disp_str060();
		}
		if ($disp_str061.equalsIgnoreCase(name)) {
			return disp_str061();
		}
		if ($disp_str062.equalsIgnoreCase(name)) {
			return disp_str062();
		}
		if ($disp_str063.equalsIgnoreCase(name)) {
			return disp_str063();
		}
		if ($disp_str064.equalsIgnoreCase(name)) {
			return disp_str064();
		}
		if ($disp_str065.equalsIgnoreCase(name)) {
			return disp_str065();
		}
		if ($disp_str066.equalsIgnoreCase(name)) {
			return disp_str066();
		}
		if ($disp_str067.equalsIgnoreCase(name)) {
			return disp_str067();
		}
		if ($disp_str068.equalsIgnoreCase(name)) {
			return disp_str068();
		}
		if ($disp_str069.equalsIgnoreCase(name)) {
			return disp_str069();
		}
		if ($disp_str070.equalsIgnoreCase(name)) {
			return disp_str070();
		}
		if ($disp_str071.equalsIgnoreCase(name)) {
			return disp_str071();
		}
		if ($disp_str072.equalsIgnoreCase(name)) {
			return disp_str072();
		}
		if ($disp_str073.equalsIgnoreCase(name)) {
			return disp_str073();
		}
		if ($disp_str074.equalsIgnoreCase(name)) {
			return disp_str074();
		}
		if ($disp_str075.equalsIgnoreCase(name)) {
			return disp_str075();
		}
		if ($disp_str076.equalsIgnoreCase(name)) {
			return disp_str076();
		}
		if ($disp_str077.equalsIgnoreCase(name)) {
			return disp_str077();
		}
		if ($disp_str078.equalsIgnoreCase(name)) {
			return disp_str078();
		}
		if ($disp_str079.equalsIgnoreCase(name)) {
			return disp_str079();
		}
		if ($disp_str080.equalsIgnoreCase(name)) {
			return disp_str080();
		}
		if ($disp_str081.equalsIgnoreCase(name)) {
			return disp_str081();
		}
		if ($disp_str082.equalsIgnoreCase(name)) {
			return disp_str082();
		}
		if ($disp_str083.equalsIgnoreCase(name)) {
			return disp_str083();
		}
		if ($disp_str084.equalsIgnoreCase(name)) {
			return disp_str084();
		}
		if ($disp_str085.equalsIgnoreCase(name)) {
			return disp_str085();
		}
		if ($disp_str086.equalsIgnoreCase(name)) {
			return disp_str086();
		}
		if ($disp_str087.equalsIgnoreCase(name)) {
			return disp_str087();
		}
		if ($disp_str088.equalsIgnoreCase(name)) {
			return disp_str088();
		}
		if ($disp_str089.equalsIgnoreCase(name)) {
			return disp_str089();
		}
		if ($disp_str090.equalsIgnoreCase(name)) {
			return disp_str090();
		}
		if ($disp_str091.equalsIgnoreCase(name)) {
			return disp_str091();
		}
		if ($disp_str092.equalsIgnoreCase(name)) {
			return disp_str092();
		}
		if ($disp_str093.equalsIgnoreCase(name)) {
			return disp_str093();
		}
		if ($disp_str094.equalsIgnoreCase(name)) {
			return disp_str094();
		}
		if ($disp_str095.equalsIgnoreCase(name)) {
			return disp_str095();
		}
		if ($disp_str096.equalsIgnoreCase(name)) {
			return disp_str096();
		}
		if ($disp_str097.equalsIgnoreCase(name)) {
			return disp_str097();
		}
		if ($disp_str098.equalsIgnoreCase(name)) {
			return disp_str098();
		}
		if ($disp_str099.equalsIgnoreCase(name)) {
			return disp_str099();
		}
		if ($disp_str100.equalsIgnoreCase(name)) {
			return disp_str100();
		}
		if ($disp_str101.equalsIgnoreCase(name)) {
			return disp_str101();
		}
		if ($disp_str102.equalsIgnoreCase(name)) {
			return disp_str102();
		}
		if ($disp_str103.equalsIgnoreCase(name)) {
			return disp_str103();
		}
		if ($disp_str104.equalsIgnoreCase(name)) {
			return disp_str104();
		}
		if ($disp_str105.equalsIgnoreCase(name)) {
			return disp_str105();
		}
		if ($disp_str106.equalsIgnoreCase(name)) {
			return disp_str106();
		}
		if ($disp_str107.equalsIgnoreCase(name)) {
			return disp_str107();
		}
		if ($disp_str108.equalsIgnoreCase(name)) {
			return disp_str108();
		}
		if ($disp_str109.equalsIgnoreCase(name)) {
			return disp_str109();
		}
		if ($disp_str110.equalsIgnoreCase(name)) {
			return disp_str110();
		}
		if ($disp_str111.equalsIgnoreCase(name)) {
			return disp_str111();
		}
		if ($disp_str112.equalsIgnoreCase(name)) {
			return disp_str112();
		}
		if ($disp_str113.equalsIgnoreCase(name)) {
			return disp_str113();
		}
		if ($disp_str114.equalsIgnoreCase(name)) {
			return disp_str114();
		}
		if ($disp_str115.equalsIgnoreCase(name)) {
			return disp_str115();
		}
		if ($disp_str116.equalsIgnoreCase(name)) {
			return disp_str116();
		}
		if ($disp_str117.equalsIgnoreCase(name)) {
			return disp_str117();
		}
		if ($disp_str118.equalsIgnoreCase(name)) {
			return disp_str118();
		}
		if ($disp_str119.equalsIgnoreCase(name)) {
			return disp_str119();
		}
		if ($disp_str120.equalsIgnoreCase(name)) {
			return disp_str120();
		}
		if ($disp_str121.equalsIgnoreCase(name)) {
			return disp_str121();
		}
		if ($disp_str122.equalsIgnoreCase(name)) {
			return disp_str122();
		}
		if ($disp_str123.equalsIgnoreCase(name)) {
			return disp_str123();
		}
		if ($disp_str124.equalsIgnoreCase(name)) {
			return disp_str124();
		}
		if ($disp_str125.equalsIgnoreCase(name)) {
			return disp_str125();
		}
		if ($disp_str126.equalsIgnoreCase(name)) {
			return disp_str126();
		}
		if ($disp_str127.equalsIgnoreCase(name)) {
			return disp_str127();
		}
		if ($disp_str128.equalsIgnoreCase(name)) {
			return disp_str128();
		}
		if ($disp_str129.equalsIgnoreCase(name)) {
			return disp_str129();
		}
		if ($disp_str130.equalsIgnoreCase(name)) {
			return disp_str130();
		}
		if ($disp_str131.equalsIgnoreCase(name)) {
			return disp_str131();
		}
		if ($disp_str132.equalsIgnoreCase(name)) {
			return disp_str132();
		}
		if ($disp_str133.equalsIgnoreCase(name)) {
			return disp_str133();
		}
		if ($disp_str134.equalsIgnoreCase(name)) {
			return disp_str134();
		}
		if ($disp_str135.equalsIgnoreCase(name)) {
			return disp_str135();
		}
		if ($disp_str136.equalsIgnoreCase(name)) {
			return disp_str136();
		}
		if ($disp_str137.equalsIgnoreCase(name)) {
			return disp_str137();
		}
		if ($disp_str138.equalsIgnoreCase(name)) {
			return disp_str138();
		}
		if ($disp_str139.equalsIgnoreCase(name)) {
			return disp_str139();
		}
		if ($disp_str140.equalsIgnoreCase(name)) {
			return disp_str140();
		}
		if ($disp_str141.equalsIgnoreCase(name)) {
			return disp_str141();
		}
		if ($disp_str142.equalsIgnoreCase(name)) {
			return disp_str142();
		}
		if ($disp_str143.equalsIgnoreCase(name)) {
			return disp_str143();
		}
		if ($disp_str144.equalsIgnoreCase(name)) {
			return disp_str144();
		}
		if ($disp_str145.equalsIgnoreCase(name)) {
			return disp_str145();
		}
		if ($disp_str146.equalsIgnoreCase(name)) {
			return disp_str146();
		}
		if ($disp_str147.equalsIgnoreCase(name)) {
			return disp_str147();
		}
		if ($disp_str148.equalsIgnoreCase(name)) {
			return disp_str148();
		}
		if ($disp_str149.equalsIgnoreCase(name)) {
			return disp_str149();
		}
		if ($disp_str150.equalsIgnoreCase(name)) {
			return disp_str150();
		}
		if ($disp_str151.equalsIgnoreCase(name)) {
			return disp_str151();
		}
		if ($disp_str152.equalsIgnoreCase(name)) {
			return disp_str152();
		}
		if ($disp_str153.equalsIgnoreCase(name)) {
			return disp_str153();
		}
		if ($disp_str154.equalsIgnoreCase(name)) {
			return disp_str154();
		}
		if ($disp_str155.equalsIgnoreCase(name)) {
			return disp_str155();
		}
		if ($disp_str156.equalsIgnoreCase(name)) {
			return disp_str156();
		}
		if ($disp_str157.equalsIgnoreCase(name)) {
			return disp_str157();
		}
		if ($disp_str158.equalsIgnoreCase(name)) {
			return disp_str158();
		}
		if ($disp_str159.equalsIgnoreCase(name)) {
			return disp_str159();
		}
		if ($disp_str160.equalsIgnoreCase(name)) {
			return disp_str160();
		}
		if ($disp_str161.equalsIgnoreCase(name)) {
			return disp_str161();
		}
		if ($disp_str162.equalsIgnoreCase(name)) {
			return disp_str162();
		}
		if ($disp_str163.equalsIgnoreCase(name)) {
			return disp_str163();
		}
		if ($disp_str164.equalsIgnoreCase(name)) {
			return disp_str164();
		}
		if ($disp_str165.equalsIgnoreCase(name)) {
			return disp_str165();
		}
		if ($disp_str166.equalsIgnoreCase(name)) {
			return disp_str166();
		}
		if ($disp_str167.equalsIgnoreCase(name)) {
			return disp_str167();
		}
		if ($disp_str168.equalsIgnoreCase(name)) {
			return disp_str168();
		}
		if ($disp_str169.equalsIgnoreCase(name)) {
			return disp_str169();
		}
		if ($disp_str170.equalsIgnoreCase(name)) {
			return disp_str170();
		}
		if ($disp_str171.equalsIgnoreCase(name)) {
			return disp_str171();
		}
		if ($disp_str172.equalsIgnoreCase(name)) {
			return disp_str172();
		}
		if ($disp_str173.equalsIgnoreCase(name)) {
			return disp_str173();
		}
		if ($disp_str174.equalsIgnoreCase(name)) {
			return disp_str174();
		}
		if ($disp_str175.equalsIgnoreCase(name)) {
			return disp_str175();
		}
		if ($disp_str176.equalsIgnoreCase(name)) {
			return disp_str176();
		}
		if ($disp_str177.equalsIgnoreCase(name)) {
			return disp_str177();
		}
		if ($disp_str178.equalsIgnoreCase(name)) {
			return disp_str178();
		}
		if ($disp_str179.equalsIgnoreCase(name)) {
			return disp_str179();
		}
		if ($disp_str180.equalsIgnoreCase(name)) {
			return disp_str180();
		}
		if ($disp_str181.equalsIgnoreCase(name)) {
			return disp_str181();
		}
		if ($disp_str182.equalsIgnoreCase(name)) {
			return disp_str182();
		}
		if ($disp_str183.equalsIgnoreCase(name)) {
			return disp_str183();
		}
		if ($disp_str184.equalsIgnoreCase(name)) {
			return disp_str184();
		}
		if ($disp_str185.equalsIgnoreCase(name)) {
			return disp_str185();
		}
		if ($disp_str186.equalsIgnoreCase(name)) {
			return disp_str186();
		}
		if ($disp_str187.equalsIgnoreCase(name)) {
			return disp_str187();
		}
		if ($disp_str188.equalsIgnoreCase(name)) {
			return disp_str188();
		}
		if ($disp_str189.equalsIgnoreCase(name)) {
			return disp_str189();
		}
		if ($disp_str190.equalsIgnoreCase(name)) {
			return disp_str190();
		}
		if ($disp_str191.equalsIgnoreCase(name)) {
			return disp_str191();
		}
		if ($disp_str192.equalsIgnoreCase(name)) {
			return disp_str192();
		}
		if ($disp_str193.equalsIgnoreCase(name)) {
			return disp_str193();
		}
		if ($disp_str194.equalsIgnoreCase(name)) {
			return disp_str194();
		}
		if ($disp_str195.equalsIgnoreCase(name)) {
			return disp_str195();
		}
		if ($disp_str196.equalsIgnoreCase(name)) {
			return disp_str196();
		}
		if ($disp_str197.equalsIgnoreCase(name)) {
			return disp_str197();
		}
		if ($disp_str198.equalsIgnoreCase(name)) {
			return disp_str198();
		}
		if ($disp_str199.equalsIgnoreCase(name)) {
			return disp_str199();
		}
		if ($disp_str200.equalsIgnoreCase(name)) {
			return disp_str200();
		}
		if ($add_col_data.equalsIgnoreCase(name)) {
			return add_col_data();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($disp_num001.equalsIgnoreCase(name)) {
			return disp_num001();
		}
		if ($disp_num002.equalsIgnoreCase(name)) {
			return disp_num002();
		}
		if ($disp_num003.equalsIgnoreCase(name)) {
			return disp_num003();
		}
		if ($disp_num004.equalsIgnoreCase(name)) {
			return disp_num004();
		}
		if ($disp_num005.equalsIgnoreCase(name)) {
			return disp_num005();
		}
		if ($disp_num006.equalsIgnoreCase(name)) {
			return disp_num006();
		}
		if ($disp_num007.equalsIgnoreCase(name)) {
			return disp_num007();
		}
		if ($disp_num008.equalsIgnoreCase(name)) {
			return disp_num008();
		}
		if ($disp_num009.equalsIgnoreCase(name)) {
			return disp_num009();
		}
		if ($disp_num010.equalsIgnoreCase(name)) {
			return disp_num010();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($disp_dt001.equalsIgnoreCase(name)) {
			return disp_dt001();
		}
		if ($disp_dt002.equalsIgnoreCase(name)) {
			return disp_dt002();
		}
		if ($disp_dt003.equalsIgnoreCase(name)) {
			return disp_dt003();
		}
		if ($disp_dt004.equalsIgnoreCase(name)) {
			return disp_dt004();
		}
		if ($disp_dt005.equalsIgnoreCase(name)) {
			return disp_dt005();
		}
		if ($disp_dt006.equalsIgnoreCase(name)) {
			return disp_dt006();
		}
		if ($disp_dt007.equalsIgnoreCase(name)) {
			return disp_dt007();
		}
		if ($disp_dt008.equalsIgnoreCase(name)) {
			return disp_dt008();
		}
		if ($disp_dt009.equalsIgnoreCase(name)) {
			return disp_dt009();
		}
		if ($disp_dt010.equalsIgnoreCase(name)) {
			return disp_dt010();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($disp_str001.equalsIgnoreCase(name)) {
			return disp_str001();
		}
		if ($disp_str002.equalsIgnoreCase(name)) {
			return disp_str002();
		}
		if ($disp_str003.equalsIgnoreCase(name)) {
			return disp_str003();
		}
		if ($disp_str004.equalsIgnoreCase(name)) {
			return disp_str004();
		}
		if ($disp_str005.equalsIgnoreCase(name)) {
			return disp_str005();
		}
		if ($disp_str006.equalsIgnoreCase(name)) {
			return disp_str006();
		}
		if ($disp_str007.equalsIgnoreCase(name)) {
			return disp_str007();
		}
		if ($disp_str008.equalsIgnoreCase(name)) {
			return disp_str008();
		}
		if ($disp_str009.equalsIgnoreCase(name)) {
			return disp_str009();
		}
		if ($disp_str010.equalsIgnoreCase(name)) {
			return disp_str010();
		}
		if ($disp_str011.equalsIgnoreCase(name)) {
			return disp_str011();
		}
		if ($disp_str012.equalsIgnoreCase(name)) {
			return disp_str012();
		}
		if ($disp_str013.equalsIgnoreCase(name)) {
			return disp_str013();
		}
		if ($disp_str014.equalsIgnoreCase(name)) {
			return disp_str014();
		}
		if ($disp_str015.equalsIgnoreCase(name)) {
			return disp_str015();
		}
		if ($disp_str016.equalsIgnoreCase(name)) {
			return disp_str016();
		}
		if ($disp_str017.equalsIgnoreCase(name)) {
			return disp_str017();
		}
		if ($disp_str018.equalsIgnoreCase(name)) {
			return disp_str018();
		}
		if ($disp_str019.equalsIgnoreCase(name)) {
			return disp_str019();
		}
		if ($disp_str020.equalsIgnoreCase(name)) {
			return disp_str020();
		}
		if ($disp_str021.equalsIgnoreCase(name)) {
			return disp_str021();
		}
		if ($disp_str022.equalsIgnoreCase(name)) {
			return disp_str022();
		}
		if ($disp_str023.equalsIgnoreCase(name)) {
			return disp_str023();
		}
		if ($disp_str024.equalsIgnoreCase(name)) {
			return disp_str024();
		}
		if ($disp_str025.equalsIgnoreCase(name)) {
			return disp_str025();
		}
		if ($disp_str026.equalsIgnoreCase(name)) {
			return disp_str026();
		}
		if ($disp_str027.equalsIgnoreCase(name)) {
			return disp_str027();
		}
		if ($disp_str028.equalsIgnoreCase(name)) {
			return disp_str028();
		}
		if ($disp_str029.equalsIgnoreCase(name)) {
			return disp_str029();
		}
		if ($disp_str030.equalsIgnoreCase(name)) {
			return disp_str030();
		}
		if ($disp_str031.equalsIgnoreCase(name)) {
			return disp_str031();
		}
		if ($disp_str032.equalsIgnoreCase(name)) {
			return disp_str032();
		}
		if ($disp_str033.equalsIgnoreCase(name)) {
			return disp_str033();
		}
		if ($disp_str034.equalsIgnoreCase(name)) {
			return disp_str034();
		}
		if ($disp_str035.equalsIgnoreCase(name)) {
			return disp_str035();
		}
		if ($disp_str036.equalsIgnoreCase(name)) {
			return disp_str036();
		}
		if ($disp_str037.equalsIgnoreCase(name)) {
			return disp_str037();
		}
		if ($disp_str038.equalsIgnoreCase(name)) {
			return disp_str038();
		}
		if ($disp_str039.equalsIgnoreCase(name)) {
			return disp_str039();
		}
		if ($disp_str040.equalsIgnoreCase(name)) {
			return disp_str040();
		}
		if ($disp_str041.equalsIgnoreCase(name)) {
			return disp_str041();
		}
		if ($disp_str042.equalsIgnoreCase(name)) {
			return disp_str042();
		}
		if ($disp_str043.equalsIgnoreCase(name)) {
			return disp_str043();
		}
		if ($disp_str044.equalsIgnoreCase(name)) {
			return disp_str044();
		}
		if ($disp_str045.equalsIgnoreCase(name)) {
			return disp_str045();
		}
		if ($disp_str046.equalsIgnoreCase(name)) {
			return disp_str046();
		}
		if ($disp_str047.equalsIgnoreCase(name)) {
			return disp_str047();
		}
		if ($disp_str048.equalsIgnoreCase(name)) {
			return disp_str048();
		}
		if ($disp_str049.equalsIgnoreCase(name)) {
			return disp_str049();
		}
		if ($disp_str050.equalsIgnoreCase(name)) {
			return disp_str050();
		}
		if ($disp_str051.equalsIgnoreCase(name)) {
			return disp_str051();
		}
		if ($disp_str052.equalsIgnoreCase(name)) {
			return disp_str052();
		}
		if ($disp_str053.equalsIgnoreCase(name)) {
			return disp_str053();
		}
		if ($disp_str054.equalsIgnoreCase(name)) {
			return disp_str054();
		}
		if ($disp_str055.equalsIgnoreCase(name)) {
			return disp_str055();
		}
		if ($disp_str056.equalsIgnoreCase(name)) {
			return disp_str056();
		}
		if ($disp_str057.equalsIgnoreCase(name)) {
			return disp_str057();
		}
		if ($disp_str058.equalsIgnoreCase(name)) {
			return disp_str058();
		}
		if ($disp_str059.equalsIgnoreCase(name)) {
			return disp_str059();
		}
		if ($disp_str060.equalsIgnoreCase(name)) {
			return disp_str060();
		}
		if ($disp_str061.equalsIgnoreCase(name)) {
			return disp_str061();
		}
		if ($disp_str062.equalsIgnoreCase(name)) {
			return disp_str062();
		}
		if ($disp_str063.equalsIgnoreCase(name)) {
			return disp_str063();
		}
		if ($disp_str064.equalsIgnoreCase(name)) {
			return disp_str064();
		}
		if ($disp_str065.equalsIgnoreCase(name)) {
			return disp_str065();
		}
		if ($disp_str066.equalsIgnoreCase(name)) {
			return disp_str066();
		}
		if ($disp_str067.equalsIgnoreCase(name)) {
			return disp_str067();
		}
		if ($disp_str068.equalsIgnoreCase(name)) {
			return disp_str068();
		}
		if ($disp_str069.equalsIgnoreCase(name)) {
			return disp_str069();
		}
		if ($disp_str070.equalsIgnoreCase(name)) {
			return disp_str070();
		}
		if ($disp_str071.equalsIgnoreCase(name)) {
			return disp_str071();
		}
		if ($disp_str072.equalsIgnoreCase(name)) {
			return disp_str072();
		}
		if ($disp_str073.equalsIgnoreCase(name)) {
			return disp_str073();
		}
		if ($disp_str074.equalsIgnoreCase(name)) {
			return disp_str074();
		}
		if ($disp_str075.equalsIgnoreCase(name)) {
			return disp_str075();
		}
		if ($disp_str076.equalsIgnoreCase(name)) {
			return disp_str076();
		}
		if ($disp_str077.equalsIgnoreCase(name)) {
			return disp_str077();
		}
		if ($disp_str078.equalsIgnoreCase(name)) {
			return disp_str078();
		}
		if ($disp_str079.equalsIgnoreCase(name)) {
			return disp_str079();
		}
		if ($disp_str080.equalsIgnoreCase(name)) {
			return disp_str080();
		}
		if ($disp_str081.equalsIgnoreCase(name)) {
			return disp_str081();
		}
		if ($disp_str082.equalsIgnoreCase(name)) {
			return disp_str082();
		}
		if ($disp_str083.equalsIgnoreCase(name)) {
			return disp_str083();
		}
		if ($disp_str084.equalsIgnoreCase(name)) {
			return disp_str084();
		}
		if ($disp_str085.equalsIgnoreCase(name)) {
			return disp_str085();
		}
		if ($disp_str086.equalsIgnoreCase(name)) {
			return disp_str086();
		}
		if ($disp_str087.equalsIgnoreCase(name)) {
			return disp_str087();
		}
		if ($disp_str088.equalsIgnoreCase(name)) {
			return disp_str088();
		}
		if ($disp_str089.equalsIgnoreCase(name)) {
			return disp_str089();
		}
		if ($disp_str090.equalsIgnoreCase(name)) {
			return disp_str090();
		}
		if ($disp_str091.equalsIgnoreCase(name)) {
			return disp_str091();
		}
		if ($disp_str092.equalsIgnoreCase(name)) {
			return disp_str092();
		}
		if ($disp_str093.equalsIgnoreCase(name)) {
			return disp_str093();
		}
		if ($disp_str094.equalsIgnoreCase(name)) {
			return disp_str094();
		}
		if ($disp_str095.equalsIgnoreCase(name)) {
			return disp_str095();
		}
		if ($disp_str096.equalsIgnoreCase(name)) {
			return disp_str096();
		}
		if ($disp_str097.equalsIgnoreCase(name)) {
			return disp_str097();
		}
		if ($disp_str098.equalsIgnoreCase(name)) {
			return disp_str098();
		}
		if ($disp_str099.equalsIgnoreCase(name)) {
			return disp_str099();
		}
		if ($disp_str100.equalsIgnoreCase(name)) {
			return disp_str100();
		}
		if ($disp_str101.equalsIgnoreCase(name)) {
			return disp_str101();
		}
		if ($disp_str102.equalsIgnoreCase(name)) {
			return disp_str102();
		}
		if ($disp_str103.equalsIgnoreCase(name)) {
			return disp_str103();
		}
		if ($disp_str104.equalsIgnoreCase(name)) {
			return disp_str104();
		}
		if ($disp_str105.equalsIgnoreCase(name)) {
			return disp_str105();
		}
		if ($disp_str106.equalsIgnoreCase(name)) {
			return disp_str106();
		}
		if ($disp_str107.equalsIgnoreCase(name)) {
			return disp_str107();
		}
		if ($disp_str108.equalsIgnoreCase(name)) {
			return disp_str108();
		}
		if ($disp_str109.equalsIgnoreCase(name)) {
			return disp_str109();
		}
		if ($disp_str110.equalsIgnoreCase(name)) {
			return disp_str110();
		}
		if ($disp_str111.equalsIgnoreCase(name)) {
			return disp_str111();
		}
		if ($disp_str112.equalsIgnoreCase(name)) {
			return disp_str112();
		}
		if ($disp_str113.equalsIgnoreCase(name)) {
			return disp_str113();
		}
		if ($disp_str114.equalsIgnoreCase(name)) {
			return disp_str114();
		}
		if ($disp_str115.equalsIgnoreCase(name)) {
			return disp_str115();
		}
		if ($disp_str116.equalsIgnoreCase(name)) {
			return disp_str116();
		}
		if ($disp_str117.equalsIgnoreCase(name)) {
			return disp_str117();
		}
		if ($disp_str118.equalsIgnoreCase(name)) {
			return disp_str118();
		}
		if ($disp_str119.equalsIgnoreCase(name)) {
			return disp_str119();
		}
		if ($disp_str120.equalsIgnoreCase(name)) {
			return disp_str120();
		}
		if ($disp_str121.equalsIgnoreCase(name)) {
			return disp_str121();
		}
		if ($disp_str122.equalsIgnoreCase(name)) {
			return disp_str122();
		}
		if ($disp_str123.equalsIgnoreCase(name)) {
			return disp_str123();
		}
		if ($disp_str124.equalsIgnoreCase(name)) {
			return disp_str124();
		}
		if ($disp_str125.equalsIgnoreCase(name)) {
			return disp_str125();
		}
		if ($disp_str126.equalsIgnoreCase(name)) {
			return disp_str126();
		}
		if ($disp_str127.equalsIgnoreCase(name)) {
			return disp_str127();
		}
		if ($disp_str128.equalsIgnoreCase(name)) {
			return disp_str128();
		}
		if ($disp_str129.equalsIgnoreCase(name)) {
			return disp_str129();
		}
		if ($disp_str130.equalsIgnoreCase(name)) {
			return disp_str130();
		}
		if ($disp_str131.equalsIgnoreCase(name)) {
			return disp_str131();
		}
		if ($disp_str132.equalsIgnoreCase(name)) {
			return disp_str132();
		}
		if ($disp_str133.equalsIgnoreCase(name)) {
			return disp_str133();
		}
		if ($disp_str134.equalsIgnoreCase(name)) {
			return disp_str134();
		}
		if ($disp_str135.equalsIgnoreCase(name)) {
			return disp_str135();
		}
		if ($disp_str136.equalsIgnoreCase(name)) {
			return disp_str136();
		}
		if ($disp_str137.equalsIgnoreCase(name)) {
			return disp_str137();
		}
		if ($disp_str138.equalsIgnoreCase(name)) {
			return disp_str138();
		}
		if ($disp_str139.equalsIgnoreCase(name)) {
			return disp_str139();
		}
		if ($disp_str140.equalsIgnoreCase(name)) {
			return disp_str140();
		}
		if ($disp_str141.equalsIgnoreCase(name)) {
			return disp_str141();
		}
		if ($disp_str142.equalsIgnoreCase(name)) {
			return disp_str142();
		}
		if ($disp_str143.equalsIgnoreCase(name)) {
			return disp_str143();
		}
		if ($disp_str144.equalsIgnoreCase(name)) {
			return disp_str144();
		}
		if ($disp_str145.equalsIgnoreCase(name)) {
			return disp_str145();
		}
		if ($disp_str146.equalsIgnoreCase(name)) {
			return disp_str146();
		}
		if ($disp_str147.equalsIgnoreCase(name)) {
			return disp_str147();
		}
		if ($disp_str148.equalsIgnoreCase(name)) {
			return disp_str148();
		}
		if ($disp_str149.equalsIgnoreCase(name)) {
			return disp_str149();
		}
		if ($disp_str150.equalsIgnoreCase(name)) {
			return disp_str150();
		}
		if ($disp_str151.equalsIgnoreCase(name)) {
			return disp_str151();
		}
		if ($disp_str152.equalsIgnoreCase(name)) {
			return disp_str152();
		}
		if ($disp_str153.equalsIgnoreCase(name)) {
			return disp_str153();
		}
		if ($disp_str154.equalsIgnoreCase(name)) {
			return disp_str154();
		}
		if ($disp_str155.equalsIgnoreCase(name)) {
			return disp_str155();
		}
		if ($disp_str156.equalsIgnoreCase(name)) {
			return disp_str156();
		}
		if ($disp_str157.equalsIgnoreCase(name)) {
			return disp_str157();
		}
		if ($disp_str158.equalsIgnoreCase(name)) {
			return disp_str158();
		}
		if ($disp_str159.equalsIgnoreCase(name)) {
			return disp_str159();
		}
		if ($disp_str160.equalsIgnoreCase(name)) {
			return disp_str160();
		}
		if ($disp_str161.equalsIgnoreCase(name)) {
			return disp_str161();
		}
		if ($disp_str162.equalsIgnoreCase(name)) {
			return disp_str162();
		}
		if ($disp_str163.equalsIgnoreCase(name)) {
			return disp_str163();
		}
		if ($disp_str164.equalsIgnoreCase(name)) {
			return disp_str164();
		}
		if ($disp_str165.equalsIgnoreCase(name)) {
			return disp_str165();
		}
		if ($disp_str166.equalsIgnoreCase(name)) {
			return disp_str166();
		}
		if ($disp_str167.equalsIgnoreCase(name)) {
			return disp_str167();
		}
		if ($disp_str168.equalsIgnoreCase(name)) {
			return disp_str168();
		}
		if ($disp_str169.equalsIgnoreCase(name)) {
			return disp_str169();
		}
		if ($disp_str170.equalsIgnoreCase(name)) {
			return disp_str170();
		}
		if ($disp_str171.equalsIgnoreCase(name)) {
			return disp_str171();
		}
		if ($disp_str172.equalsIgnoreCase(name)) {
			return disp_str172();
		}
		if ($disp_str173.equalsIgnoreCase(name)) {
			return disp_str173();
		}
		if ($disp_str174.equalsIgnoreCase(name)) {
			return disp_str174();
		}
		if ($disp_str175.equalsIgnoreCase(name)) {
			return disp_str175();
		}
		if ($disp_str176.equalsIgnoreCase(name)) {
			return disp_str176();
		}
		if ($disp_str177.equalsIgnoreCase(name)) {
			return disp_str177();
		}
		if ($disp_str178.equalsIgnoreCase(name)) {
			return disp_str178();
		}
		if ($disp_str179.equalsIgnoreCase(name)) {
			return disp_str179();
		}
		if ($disp_str180.equalsIgnoreCase(name)) {
			return disp_str180();
		}
		if ($disp_str181.equalsIgnoreCase(name)) {
			return disp_str181();
		}
		if ($disp_str182.equalsIgnoreCase(name)) {
			return disp_str182();
		}
		if ($disp_str183.equalsIgnoreCase(name)) {
			return disp_str183();
		}
		if ($disp_str184.equalsIgnoreCase(name)) {
			return disp_str184();
		}
		if ($disp_str185.equalsIgnoreCase(name)) {
			return disp_str185();
		}
		if ($disp_str186.equalsIgnoreCase(name)) {
			return disp_str186();
		}
		if ($disp_str187.equalsIgnoreCase(name)) {
			return disp_str187();
		}
		if ($disp_str188.equalsIgnoreCase(name)) {
			return disp_str188();
		}
		if ($disp_str189.equalsIgnoreCase(name)) {
			return disp_str189();
		}
		if ($disp_str190.equalsIgnoreCase(name)) {
			return disp_str190();
		}
		if ($disp_str191.equalsIgnoreCase(name)) {
			return disp_str191();
		}
		if ($disp_str192.equalsIgnoreCase(name)) {
			return disp_str192();
		}
		if ($disp_str193.equalsIgnoreCase(name)) {
			return disp_str193();
		}
		if ($disp_str194.equalsIgnoreCase(name)) {
			return disp_str194();
		}
		if ($disp_str195.equalsIgnoreCase(name)) {
			return disp_str195();
		}
		if ($disp_str196.equalsIgnoreCase(name)) {
			return disp_str196();
		}
		if ($disp_str197.equalsIgnoreCase(name)) {
			return disp_str197();
		}
		if ($disp_str198.equalsIgnoreCase(name)) {
			return disp_str198();
		}
		if ($disp_str199.equalsIgnoreCase(name)) {
			return disp_str199();
		}
		if ($disp_str200.equalsIgnoreCase(name)) {
			return disp_str200();
		}
		if ($add_col_data.equalsIgnoreCase(name)) {
			return add_col_data();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($disp_num001.equalsIgnoreCase(name)) {
			return disp_num001();
		}
		if ($disp_num002.equalsIgnoreCase(name)) {
			return disp_num002();
		}
		if ($disp_num003.equalsIgnoreCase(name)) {
			return disp_num003();
		}
		if ($disp_num004.equalsIgnoreCase(name)) {
			return disp_num004();
		}
		if ($disp_num005.equalsIgnoreCase(name)) {
			return disp_num005();
		}
		if ($disp_num006.equalsIgnoreCase(name)) {
			return disp_num006();
		}
		if ($disp_num007.equalsIgnoreCase(name)) {
			return disp_num007();
		}
		if ($disp_num008.equalsIgnoreCase(name)) {
			return disp_num008();
		}
		if ($disp_num009.equalsIgnoreCase(name)) {
			return disp_num009();
		}
		if ($disp_num010.equalsIgnoreCase(name)) {
			return disp_num010();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($disp_dt001.equalsIgnoreCase(name)) {
			return disp_dt001();
		}
		if ($disp_dt002.equalsIgnoreCase(name)) {
			return disp_dt002();
		}
		if ($disp_dt003.equalsIgnoreCase(name)) {
			return disp_dt003();
		}
		if ($disp_dt004.equalsIgnoreCase(name)) {
			return disp_dt004();
		}
		if ($disp_dt005.equalsIgnoreCase(name)) {
			return disp_dt005();
		}
		if ($disp_dt006.equalsIgnoreCase(name)) {
			return disp_dt006();
		}
		if ($disp_dt007.equalsIgnoreCase(name)) {
			return disp_dt007();
		}
		if ($disp_dt008.equalsIgnoreCase(name)) {
			return disp_dt008();
		}
		if ($disp_dt009.equalsIgnoreCase(name)) {
			return disp_dt009();
		}
		if ($disp_dt010.equalsIgnoreCase(name)) {
			return disp_dt010();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($disp_str001.equalsIgnoreCase(name)) {
			disp_str001(value);
			return;
		}
		if ($disp_str002.equalsIgnoreCase(name)) {
			disp_str002(value);
			return;
		}
		if ($disp_str003.equalsIgnoreCase(name)) {
			disp_str003(value);
			return;
		}
		if ($disp_str004.equalsIgnoreCase(name)) {
			disp_str004(value);
			return;
		}
		if ($disp_str005.equalsIgnoreCase(name)) {
			disp_str005(value);
			return;
		}
		if ($disp_str006.equalsIgnoreCase(name)) {
			disp_str006(value);
			return;
		}
		if ($disp_str007.equalsIgnoreCase(name)) {
			disp_str007(value);
			return;
		}
		if ($disp_str008.equalsIgnoreCase(name)) {
			disp_str008(value);
			return;
		}
		if ($disp_str009.equalsIgnoreCase(name)) {
			disp_str009(value);
			return;
		}
		if ($disp_str010.equalsIgnoreCase(name)) {
			disp_str010(value);
			return;
		}
		if ($disp_str011.equalsIgnoreCase(name)) {
			disp_str011(value);
			return;
		}
		if ($disp_str012.equalsIgnoreCase(name)) {
			disp_str012(value);
			return;
		}
		if ($disp_str013.equalsIgnoreCase(name)) {
			disp_str013(value);
			return;
		}
		if ($disp_str014.equalsIgnoreCase(name)) {
			disp_str014(value);
			return;
		}
		if ($disp_str015.equalsIgnoreCase(name)) {
			disp_str015(value);
			return;
		}
		if ($disp_str016.equalsIgnoreCase(name)) {
			disp_str016(value);
			return;
		}
		if ($disp_str017.equalsIgnoreCase(name)) {
			disp_str017(value);
			return;
		}
		if ($disp_str018.equalsIgnoreCase(name)) {
			disp_str018(value);
			return;
		}
		if ($disp_str019.equalsIgnoreCase(name)) {
			disp_str019(value);
			return;
		}
		if ($disp_str020.equalsIgnoreCase(name)) {
			disp_str020(value);
			return;
		}
		if ($disp_str021.equalsIgnoreCase(name)) {
			disp_str021(value);
			return;
		}
		if ($disp_str022.equalsIgnoreCase(name)) {
			disp_str022(value);
			return;
		}
		if ($disp_str023.equalsIgnoreCase(name)) {
			disp_str023(value);
			return;
		}
		if ($disp_str024.equalsIgnoreCase(name)) {
			disp_str024(value);
			return;
		}
		if ($disp_str025.equalsIgnoreCase(name)) {
			disp_str025(value);
			return;
		}
		if ($disp_str026.equalsIgnoreCase(name)) {
			disp_str026(value);
			return;
		}
		if ($disp_str027.equalsIgnoreCase(name)) {
			disp_str027(value);
			return;
		}
		if ($disp_str028.equalsIgnoreCase(name)) {
			disp_str028(value);
			return;
		}
		if ($disp_str029.equalsIgnoreCase(name)) {
			disp_str029(value);
			return;
		}
		if ($disp_str030.equalsIgnoreCase(name)) {
			disp_str030(value);
			return;
		}
		if ($disp_str031.equalsIgnoreCase(name)) {
			disp_str031(value);
			return;
		}
		if ($disp_str032.equalsIgnoreCase(name)) {
			disp_str032(value);
			return;
		}
		if ($disp_str033.equalsIgnoreCase(name)) {
			disp_str033(value);
			return;
		}
		if ($disp_str034.equalsIgnoreCase(name)) {
			disp_str034(value);
			return;
		}
		if ($disp_str035.equalsIgnoreCase(name)) {
			disp_str035(value);
			return;
		}
		if ($disp_str036.equalsIgnoreCase(name)) {
			disp_str036(value);
			return;
		}
		if ($disp_str037.equalsIgnoreCase(name)) {
			disp_str037(value);
			return;
		}
		if ($disp_str038.equalsIgnoreCase(name)) {
			disp_str038(value);
			return;
		}
		if ($disp_str039.equalsIgnoreCase(name)) {
			disp_str039(value);
			return;
		}
		if ($disp_str040.equalsIgnoreCase(name)) {
			disp_str040(value);
			return;
		}
		if ($disp_str041.equalsIgnoreCase(name)) {
			disp_str041(value);
			return;
		}
		if ($disp_str042.equalsIgnoreCase(name)) {
			disp_str042(value);
			return;
		}
		if ($disp_str043.equalsIgnoreCase(name)) {
			disp_str043(value);
			return;
		}
		if ($disp_str044.equalsIgnoreCase(name)) {
			disp_str044(value);
			return;
		}
		if ($disp_str045.equalsIgnoreCase(name)) {
			disp_str045(value);
			return;
		}
		if ($disp_str046.equalsIgnoreCase(name)) {
			disp_str046(value);
			return;
		}
		if ($disp_str047.equalsIgnoreCase(name)) {
			disp_str047(value);
			return;
		}
		if ($disp_str048.equalsIgnoreCase(name)) {
			disp_str048(value);
			return;
		}
		if ($disp_str049.equalsIgnoreCase(name)) {
			disp_str049(value);
			return;
		}
		if ($disp_str050.equalsIgnoreCase(name)) {
			disp_str050(value);
			return;
		}
		if ($disp_str051.equalsIgnoreCase(name)) {
			disp_str051(value);
			return;
		}
		if ($disp_str052.equalsIgnoreCase(name)) {
			disp_str052(value);
			return;
		}
		if ($disp_str053.equalsIgnoreCase(name)) {
			disp_str053(value);
			return;
		}
		if ($disp_str054.equalsIgnoreCase(name)) {
			disp_str054(value);
			return;
		}
		if ($disp_str055.equalsIgnoreCase(name)) {
			disp_str055(value);
			return;
		}
		if ($disp_str056.equalsIgnoreCase(name)) {
			disp_str056(value);
			return;
		}
		if ($disp_str057.equalsIgnoreCase(name)) {
			disp_str057(value);
			return;
		}
		if ($disp_str058.equalsIgnoreCase(name)) {
			disp_str058(value);
			return;
		}
		if ($disp_str059.equalsIgnoreCase(name)) {
			disp_str059(value);
			return;
		}
		if ($disp_str060.equalsIgnoreCase(name)) {
			disp_str060(value);
			return;
		}
		if ($disp_str061.equalsIgnoreCase(name)) {
			disp_str061(value);
			return;
		}
		if ($disp_str062.equalsIgnoreCase(name)) {
			disp_str062(value);
			return;
		}
		if ($disp_str063.equalsIgnoreCase(name)) {
			disp_str063(value);
			return;
		}
		if ($disp_str064.equalsIgnoreCase(name)) {
			disp_str064(value);
			return;
		}
		if ($disp_str065.equalsIgnoreCase(name)) {
			disp_str065(value);
			return;
		}
		if ($disp_str066.equalsIgnoreCase(name)) {
			disp_str066(value);
			return;
		}
		if ($disp_str067.equalsIgnoreCase(name)) {
			disp_str067(value);
			return;
		}
		if ($disp_str068.equalsIgnoreCase(name)) {
			disp_str068(value);
			return;
		}
		if ($disp_str069.equalsIgnoreCase(name)) {
			disp_str069(value);
			return;
		}
		if ($disp_str070.equalsIgnoreCase(name)) {
			disp_str070(value);
			return;
		}
		if ($disp_str071.equalsIgnoreCase(name)) {
			disp_str071(value);
			return;
		}
		if ($disp_str072.equalsIgnoreCase(name)) {
			disp_str072(value);
			return;
		}
		if ($disp_str073.equalsIgnoreCase(name)) {
			disp_str073(value);
			return;
		}
		if ($disp_str074.equalsIgnoreCase(name)) {
			disp_str074(value);
			return;
		}
		if ($disp_str075.equalsIgnoreCase(name)) {
			disp_str075(value);
			return;
		}
		if ($disp_str076.equalsIgnoreCase(name)) {
			disp_str076(value);
			return;
		}
		if ($disp_str077.equalsIgnoreCase(name)) {
			disp_str077(value);
			return;
		}
		if ($disp_str078.equalsIgnoreCase(name)) {
			disp_str078(value);
			return;
		}
		if ($disp_str079.equalsIgnoreCase(name)) {
			disp_str079(value);
			return;
		}
		if ($disp_str080.equalsIgnoreCase(name)) {
			disp_str080(value);
			return;
		}
		if ($disp_str081.equalsIgnoreCase(name)) {
			disp_str081(value);
			return;
		}
		if ($disp_str082.equalsIgnoreCase(name)) {
			disp_str082(value);
			return;
		}
		if ($disp_str083.equalsIgnoreCase(name)) {
			disp_str083(value);
			return;
		}
		if ($disp_str084.equalsIgnoreCase(name)) {
			disp_str084(value);
			return;
		}
		if ($disp_str085.equalsIgnoreCase(name)) {
			disp_str085(value);
			return;
		}
		if ($disp_str086.equalsIgnoreCase(name)) {
			disp_str086(value);
			return;
		}
		if ($disp_str087.equalsIgnoreCase(name)) {
			disp_str087(value);
			return;
		}
		if ($disp_str088.equalsIgnoreCase(name)) {
			disp_str088(value);
			return;
		}
		if ($disp_str089.equalsIgnoreCase(name)) {
			disp_str089(value);
			return;
		}
		if ($disp_str090.equalsIgnoreCase(name)) {
			disp_str090(value);
			return;
		}
		if ($disp_str091.equalsIgnoreCase(name)) {
			disp_str091(value);
			return;
		}
		if ($disp_str092.equalsIgnoreCase(name)) {
			disp_str092(value);
			return;
		}
		if ($disp_str093.equalsIgnoreCase(name)) {
			disp_str093(value);
			return;
		}
		if ($disp_str094.equalsIgnoreCase(name)) {
			disp_str094(value);
			return;
		}
		if ($disp_str095.equalsIgnoreCase(name)) {
			disp_str095(value);
			return;
		}
		if ($disp_str096.equalsIgnoreCase(name)) {
			disp_str096(value);
			return;
		}
		if ($disp_str097.equalsIgnoreCase(name)) {
			disp_str097(value);
			return;
		}
		if ($disp_str098.equalsIgnoreCase(name)) {
			disp_str098(value);
			return;
		}
		if ($disp_str099.equalsIgnoreCase(name)) {
			disp_str099(value);
			return;
		}
		if ($disp_str100.equalsIgnoreCase(name)) {
			disp_str100(value);
			return;
		}
		if ($disp_str101.equalsIgnoreCase(name)) {
			disp_str101(value);
			return;
		}
		if ($disp_str102.equalsIgnoreCase(name)) {
			disp_str102(value);
			return;
		}
		if ($disp_str103.equalsIgnoreCase(name)) {
			disp_str103(value);
			return;
		}
		if ($disp_str104.equalsIgnoreCase(name)) {
			disp_str104(value);
			return;
		}
		if ($disp_str105.equalsIgnoreCase(name)) {
			disp_str105(value);
			return;
		}
		if ($disp_str106.equalsIgnoreCase(name)) {
			disp_str106(value);
			return;
		}
		if ($disp_str107.equalsIgnoreCase(name)) {
			disp_str107(value);
			return;
		}
		if ($disp_str108.equalsIgnoreCase(name)) {
			disp_str108(value);
			return;
		}
		if ($disp_str109.equalsIgnoreCase(name)) {
			disp_str109(value);
			return;
		}
		if ($disp_str110.equalsIgnoreCase(name)) {
			disp_str110(value);
			return;
		}
		if ($disp_str111.equalsIgnoreCase(name)) {
			disp_str111(value);
			return;
		}
		if ($disp_str112.equalsIgnoreCase(name)) {
			disp_str112(value);
			return;
		}
		if ($disp_str113.equalsIgnoreCase(name)) {
			disp_str113(value);
			return;
		}
		if ($disp_str114.equalsIgnoreCase(name)) {
			disp_str114(value);
			return;
		}
		if ($disp_str115.equalsIgnoreCase(name)) {
			disp_str115(value);
			return;
		}
		if ($disp_str116.equalsIgnoreCase(name)) {
			disp_str116(value);
			return;
		}
		if ($disp_str117.equalsIgnoreCase(name)) {
			disp_str117(value);
			return;
		}
		if ($disp_str118.equalsIgnoreCase(name)) {
			disp_str118(value);
			return;
		}
		if ($disp_str119.equalsIgnoreCase(name)) {
			disp_str119(value);
			return;
		}
		if ($disp_str120.equalsIgnoreCase(name)) {
			disp_str120(value);
			return;
		}
		if ($disp_str121.equalsIgnoreCase(name)) {
			disp_str121(value);
			return;
		}
		if ($disp_str122.equalsIgnoreCase(name)) {
			disp_str122(value);
			return;
		}
		if ($disp_str123.equalsIgnoreCase(name)) {
			disp_str123(value);
			return;
		}
		if ($disp_str124.equalsIgnoreCase(name)) {
			disp_str124(value);
			return;
		}
		if ($disp_str125.equalsIgnoreCase(name)) {
			disp_str125(value);
			return;
		}
		if ($disp_str126.equalsIgnoreCase(name)) {
			disp_str126(value);
			return;
		}
		if ($disp_str127.equalsIgnoreCase(name)) {
			disp_str127(value);
			return;
		}
		if ($disp_str128.equalsIgnoreCase(name)) {
			disp_str128(value);
			return;
		}
		if ($disp_str129.equalsIgnoreCase(name)) {
			disp_str129(value);
			return;
		}
		if ($disp_str130.equalsIgnoreCase(name)) {
			disp_str130(value);
			return;
		}
		if ($disp_str131.equalsIgnoreCase(name)) {
			disp_str131(value);
			return;
		}
		if ($disp_str132.equalsIgnoreCase(name)) {
			disp_str132(value);
			return;
		}
		if ($disp_str133.equalsIgnoreCase(name)) {
			disp_str133(value);
			return;
		}
		if ($disp_str134.equalsIgnoreCase(name)) {
			disp_str134(value);
			return;
		}
		if ($disp_str135.equalsIgnoreCase(name)) {
			disp_str135(value);
			return;
		}
		if ($disp_str136.equalsIgnoreCase(name)) {
			disp_str136(value);
			return;
		}
		if ($disp_str137.equalsIgnoreCase(name)) {
			disp_str137(value);
			return;
		}
		if ($disp_str138.equalsIgnoreCase(name)) {
			disp_str138(value);
			return;
		}
		if ($disp_str139.equalsIgnoreCase(name)) {
			disp_str139(value);
			return;
		}
		if ($disp_str140.equalsIgnoreCase(name)) {
			disp_str140(value);
			return;
		}
		if ($disp_str141.equalsIgnoreCase(name)) {
			disp_str141(value);
			return;
		}
		if ($disp_str142.equalsIgnoreCase(name)) {
			disp_str142(value);
			return;
		}
		if ($disp_str143.equalsIgnoreCase(name)) {
			disp_str143(value);
			return;
		}
		if ($disp_str144.equalsIgnoreCase(name)) {
			disp_str144(value);
			return;
		}
		if ($disp_str145.equalsIgnoreCase(name)) {
			disp_str145(value);
			return;
		}
		if ($disp_str146.equalsIgnoreCase(name)) {
			disp_str146(value);
			return;
		}
		if ($disp_str147.equalsIgnoreCase(name)) {
			disp_str147(value);
			return;
		}
		if ($disp_str148.equalsIgnoreCase(name)) {
			disp_str148(value);
			return;
		}
		if ($disp_str149.equalsIgnoreCase(name)) {
			disp_str149(value);
			return;
		}
		if ($disp_str150.equalsIgnoreCase(name)) {
			disp_str150(value);
			return;
		}
		if ($disp_str151.equalsIgnoreCase(name)) {
			disp_str151(value);
			return;
		}
		if ($disp_str152.equalsIgnoreCase(name)) {
			disp_str152(value);
			return;
		}
		if ($disp_str153.equalsIgnoreCase(name)) {
			disp_str153(value);
			return;
		}
		if ($disp_str154.equalsIgnoreCase(name)) {
			disp_str154(value);
			return;
		}
		if ($disp_str155.equalsIgnoreCase(name)) {
			disp_str155(value);
			return;
		}
		if ($disp_str156.equalsIgnoreCase(name)) {
			disp_str156(value);
			return;
		}
		if ($disp_str157.equalsIgnoreCase(name)) {
			disp_str157(value);
			return;
		}
		if ($disp_str158.equalsIgnoreCase(name)) {
			disp_str158(value);
			return;
		}
		if ($disp_str159.equalsIgnoreCase(name)) {
			disp_str159(value);
			return;
		}
		if ($disp_str160.equalsIgnoreCase(name)) {
			disp_str160(value);
			return;
		}
		if ($disp_str161.equalsIgnoreCase(name)) {
			disp_str161(value);
			return;
		}
		if ($disp_str162.equalsIgnoreCase(name)) {
			disp_str162(value);
			return;
		}
		if ($disp_str163.equalsIgnoreCase(name)) {
			disp_str163(value);
			return;
		}
		if ($disp_str164.equalsIgnoreCase(name)) {
			disp_str164(value);
			return;
		}
		if ($disp_str165.equalsIgnoreCase(name)) {
			disp_str165(value);
			return;
		}
		if ($disp_str166.equalsIgnoreCase(name)) {
			disp_str166(value);
			return;
		}
		if ($disp_str167.equalsIgnoreCase(name)) {
			disp_str167(value);
			return;
		}
		if ($disp_str168.equalsIgnoreCase(name)) {
			disp_str168(value);
			return;
		}
		if ($disp_str169.equalsIgnoreCase(name)) {
			disp_str169(value);
			return;
		}
		if ($disp_str170.equalsIgnoreCase(name)) {
			disp_str170(value);
			return;
		}
		if ($disp_str171.equalsIgnoreCase(name)) {
			disp_str171(value);
			return;
		}
		if ($disp_str172.equalsIgnoreCase(name)) {
			disp_str172(value);
			return;
		}
		if ($disp_str173.equalsIgnoreCase(name)) {
			disp_str173(value);
			return;
		}
		if ($disp_str174.equalsIgnoreCase(name)) {
			disp_str174(value);
			return;
		}
		if ($disp_str175.equalsIgnoreCase(name)) {
			disp_str175(value);
			return;
		}
		if ($disp_str176.equalsIgnoreCase(name)) {
			disp_str176(value);
			return;
		}
		if ($disp_str177.equalsIgnoreCase(name)) {
			disp_str177(value);
			return;
		}
		if ($disp_str178.equalsIgnoreCase(name)) {
			disp_str178(value);
			return;
		}
		if ($disp_str179.equalsIgnoreCase(name)) {
			disp_str179(value);
			return;
		}
		if ($disp_str180.equalsIgnoreCase(name)) {
			disp_str180(value);
			return;
		}
		if ($disp_str181.equalsIgnoreCase(name)) {
			disp_str181(value);
			return;
		}
		if ($disp_str182.equalsIgnoreCase(name)) {
			disp_str182(value);
			return;
		}
		if ($disp_str183.equalsIgnoreCase(name)) {
			disp_str183(value);
			return;
		}
		if ($disp_str184.equalsIgnoreCase(name)) {
			disp_str184(value);
			return;
		}
		if ($disp_str185.equalsIgnoreCase(name)) {
			disp_str185(value);
			return;
		}
		if ($disp_str186.equalsIgnoreCase(name)) {
			disp_str186(value);
			return;
		}
		if ($disp_str187.equalsIgnoreCase(name)) {
			disp_str187(value);
			return;
		}
		if ($disp_str188.equalsIgnoreCase(name)) {
			disp_str188(value);
			return;
		}
		if ($disp_str189.equalsIgnoreCase(name)) {
			disp_str189(value);
			return;
		}
		if ($disp_str190.equalsIgnoreCase(name)) {
			disp_str190(value);
			return;
		}
		if ($disp_str191.equalsIgnoreCase(name)) {
			disp_str191(value);
			return;
		}
		if ($disp_str192.equalsIgnoreCase(name)) {
			disp_str192(value);
			return;
		}
		if ($disp_str193.equalsIgnoreCase(name)) {
			disp_str193(value);
			return;
		}
		if ($disp_str194.equalsIgnoreCase(name)) {
			disp_str194(value);
			return;
		}
		if ($disp_str195.equalsIgnoreCase(name)) {
			disp_str195(value);
			return;
		}
		if ($disp_str196.equalsIgnoreCase(name)) {
			disp_str196(value);
			return;
		}
		if ($disp_str197.equalsIgnoreCase(name)) {
			disp_str197(value);
			return;
		}
		if ($disp_str198.equalsIgnoreCase(name)) {
			disp_str198(value);
			return;
		}
		if ($disp_str199.equalsIgnoreCase(name)) {
			disp_str199(value);
			return;
		}
		if ($disp_str200.equalsIgnoreCase(name)) {
			disp_str200(value);
			return;
		}
		if ($add_col_data.equalsIgnoreCase(name)) {
			add_col_data(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($disp_num001.equalsIgnoreCase(name)) {
			disp_num001(value);
			return;
		}
		if ($disp_num002.equalsIgnoreCase(name)) {
			disp_num002(value);
			return;
		}
		if ($disp_num003.equalsIgnoreCase(name)) {
			disp_num003(value);
			return;
		}
		if ($disp_num004.equalsIgnoreCase(name)) {
			disp_num004(value);
			return;
		}
		if ($disp_num005.equalsIgnoreCase(name)) {
			disp_num005(value);
			return;
		}
		if ($disp_num006.equalsIgnoreCase(name)) {
			disp_num006(value);
			return;
		}
		if ($disp_num007.equalsIgnoreCase(name)) {
			disp_num007(value);
			return;
		}
		if ($disp_num008.equalsIgnoreCase(name)) {
			disp_num008(value);
			return;
		}
		if ($disp_num009.equalsIgnoreCase(name)) {
			disp_num009(value);
			return;
		}
		if ($disp_num010.equalsIgnoreCase(name)) {
			disp_num010(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($disp_num001.equalsIgnoreCase(name)) {
			disp_num001(value);
			return;
		}
		if ($disp_num002.equalsIgnoreCase(name)) {
			disp_num002(value);
			return;
		}
		if ($disp_num003.equalsIgnoreCase(name)) {
			disp_num003(value);
			return;
		}
		if ($disp_num004.equalsIgnoreCase(name)) {
			disp_num004(value);
			return;
		}
		if ($disp_num005.equalsIgnoreCase(name)) {
			disp_num005(value);
			return;
		}
		if ($disp_num006.equalsIgnoreCase(name)) {
			disp_num006(value);
			return;
		}
		if ($disp_num007.equalsIgnoreCase(name)) {
			disp_num007(value);
			return;
		}
		if ($disp_num008.equalsIgnoreCase(name)) {
			disp_num008(value);
			return;
		}
		if ($disp_num009.equalsIgnoreCase(name)) {
			disp_num009(value);
			return;
		}
		if ($disp_num010.equalsIgnoreCase(name)) {
			disp_num010(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($disp_num001.equalsIgnoreCase(name)) {
			disp_num001(value);
			return;
		}
		if ($disp_num002.equalsIgnoreCase(name)) {
			disp_num002(value);
			return;
		}
		if ($disp_num003.equalsIgnoreCase(name)) {
			disp_num003(value);
			return;
		}
		if ($disp_num004.equalsIgnoreCase(name)) {
			disp_num004(value);
			return;
		}
		if ($disp_num005.equalsIgnoreCase(name)) {
			disp_num005(value);
			return;
		}
		if ($disp_num006.equalsIgnoreCase(name)) {
			disp_num006(value);
			return;
		}
		if ($disp_num007.equalsIgnoreCase(name)) {
			disp_num007(value);
			return;
		}
		if ($disp_num008.equalsIgnoreCase(name)) {
			disp_num008(value);
			return;
		}
		if ($disp_num009.equalsIgnoreCase(name)) {
			disp_num009(value);
			return;
		}
		if ($disp_num010.equalsIgnoreCase(name)) {
			disp_num010(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($disp_num001.equalsIgnoreCase(name)) {
			disp_num001(value);
			return;
		}
		if ($disp_num002.equalsIgnoreCase(name)) {
			disp_num002(value);
			return;
		}
		if ($disp_num003.equalsIgnoreCase(name)) {
			disp_num003(value);
			return;
		}
		if ($disp_num004.equalsIgnoreCase(name)) {
			disp_num004(value);
			return;
		}
		if ($disp_num005.equalsIgnoreCase(name)) {
			disp_num005(value);
			return;
		}
		if ($disp_num006.equalsIgnoreCase(name)) {
			disp_num006(value);
			return;
		}
		if ($disp_num007.equalsIgnoreCase(name)) {
			disp_num007(value);
			return;
		}
		if ($disp_num008.equalsIgnoreCase(name)) {
			disp_num008(value);
			return;
		}
		if ($disp_num009.equalsIgnoreCase(name)) {
			disp_num009(value);
			return;
		}
		if ($disp_num010.equalsIgnoreCase(name)) {
			disp_num010(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($disp_num001.equalsIgnoreCase(name)) {
			disp_num001(value);
			return;
		}
		if ($disp_num002.equalsIgnoreCase(name)) {
			disp_num002(value);
			return;
		}
		if ($disp_num003.equalsIgnoreCase(name)) {
			disp_num003(value);
			return;
		}
		if ($disp_num004.equalsIgnoreCase(name)) {
			disp_num004(value);
			return;
		}
		if ($disp_num005.equalsIgnoreCase(name)) {
			disp_num005(value);
			return;
		}
		if ($disp_num006.equalsIgnoreCase(name)) {
			disp_num006(value);
			return;
		}
		if ($disp_num007.equalsIgnoreCase(name)) {
			disp_num007(value);
			return;
		}
		if ($disp_num008.equalsIgnoreCase(name)) {
			disp_num008(value);
			return;
		}
		if ($disp_num009.equalsIgnoreCase(name)) {
			disp_num009(value);
			return;
		}
		if ($disp_num010.equalsIgnoreCase(name)) {
			disp_num010(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($disp_dt001.equalsIgnoreCase(name)) {
			disp_dt001(value);
			return;
		}
		if ($disp_dt002.equalsIgnoreCase(name)) {
			disp_dt002(value);
			return;
		}
		if ($disp_dt003.equalsIgnoreCase(name)) {
			disp_dt003(value);
			return;
		}
		if ($disp_dt004.equalsIgnoreCase(name)) {
			disp_dt004(value);
			return;
		}
		if ($disp_dt005.equalsIgnoreCase(name)) {
			disp_dt005(value);
			return;
		}
		if ($disp_dt006.equalsIgnoreCase(name)) {
			disp_dt006(value);
			return;
		}
		if ($disp_dt007.equalsIgnoreCase(name)) {
			disp_dt007(value);
			return;
		}
		if ($disp_dt008.equalsIgnoreCase(name)) {
			disp_dt008(value);
			return;
		}
		if ($disp_dt009.equalsIgnoreCase(name)) {
			disp_dt009(value);
			return;
		}
		if ($disp_dt010.equalsIgnoreCase(name)) {
			disp_dt010(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($disp_str001.equalsIgnoreCase(name)) {
			disp_str001(value);
			return;
		}
		if ($disp_str002.equalsIgnoreCase(name)) {
			disp_str002(value);
			return;
		}
		if ($disp_str003.equalsIgnoreCase(name)) {
			disp_str003(value);
			return;
		}
		if ($disp_str004.equalsIgnoreCase(name)) {
			disp_str004(value);
			return;
		}
		if ($disp_str005.equalsIgnoreCase(name)) {
			disp_str005(value);
			return;
		}
		if ($disp_str006.equalsIgnoreCase(name)) {
			disp_str006(value);
			return;
		}
		if ($disp_str007.equalsIgnoreCase(name)) {
			disp_str007(value);
			return;
		}
		if ($disp_str008.equalsIgnoreCase(name)) {
			disp_str008(value);
			return;
		}
		if ($disp_str009.equalsIgnoreCase(name)) {
			disp_str009(value);
			return;
		}
		if ($disp_str010.equalsIgnoreCase(name)) {
			disp_str010(value);
			return;
		}
		if ($disp_str011.equalsIgnoreCase(name)) {
			disp_str011(value);
			return;
		}
		if ($disp_str012.equalsIgnoreCase(name)) {
			disp_str012(value);
			return;
		}
		if ($disp_str013.equalsIgnoreCase(name)) {
			disp_str013(value);
			return;
		}
		if ($disp_str014.equalsIgnoreCase(name)) {
			disp_str014(value);
			return;
		}
		if ($disp_str015.equalsIgnoreCase(name)) {
			disp_str015(value);
			return;
		}
		if ($disp_str016.equalsIgnoreCase(name)) {
			disp_str016(value);
			return;
		}
		if ($disp_str017.equalsIgnoreCase(name)) {
			disp_str017(value);
			return;
		}
		if ($disp_str018.equalsIgnoreCase(name)) {
			disp_str018(value);
			return;
		}
		if ($disp_str019.equalsIgnoreCase(name)) {
			disp_str019(value);
			return;
		}
		if ($disp_str020.equalsIgnoreCase(name)) {
			disp_str020(value);
			return;
		}
		if ($disp_str021.equalsIgnoreCase(name)) {
			disp_str021(value);
			return;
		}
		if ($disp_str022.equalsIgnoreCase(name)) {
			disp_str022(value);
			return;
		}
		if ($disp_str023.equalsIgnoreCase(name)) {
			disp_str023(value);
			return;
		}
		if ($disp_str024.equalsIgnoreCase(name)) {
			disp_str024(value);
			return;
		}
		if ($disp_str025.equalsIgnoreCase(name)) {
			disp_str025(value);
			return;
		}
		if ($disp_str026.equalsIgnoreCase(name)) {
			disp_str026(value);
			return;
		}
		if ($disp_str027.equalsIgnoreCase(name)) {
			disp_str027(value);
			return;
		}
		if ($disp_str028.equalsIgnoreCase(name)) {
			disp_str028(value);
			return;
		}
		if ($disp_str029.equalsIgnoreCase(name)) {
			disp_str029(value);
			return;
		}
		if ($disp_str030.equalsIgnoreCase(name)) {
			disp_str030(value);
			return;
		}
		if ($disp_str031.equalsIgnoreCase(name)) {
			disp_str031(value);
			return;
		}
		if ($disp_str032.equalsIgnoreCase(name)) {
			disp_str032(value);
			return;
		}
		if ($disp_str033.equalsIgnoreCase(name)) {
			disp_str033(value);
			return;
		}
		if ($disp_str034.equalsIgnoreCase(name)) {
			disp_str034(value);
			return;
		}
		if ($disp_str035.equalsIgnoreCase(name)) {
			disp_str035(value);
			return;
		}
		if ($disp_str036.equalsIgnoreCase(name)) {
			disp_str036(value);
			return;
		}
		if ($disp_str037.equalsIgnoreCase(name)) {
			disp_str037(value);
			return;
		}
		if ($disp_str038.equalsIgnoreCase(name)) {
			disp_str038(value);
			return;
		}
		if ($disp_str039.equalsIgnoreCase(name)) {
			disp_str039(value);
			return;
		}
		if ($disp_str040.equalsIgnoreCase(name)) {
			disp_str040(value);
			return;
		}
		if ($disp_str041.equalsIgnoreCase(name)) {
			disp_str041(value);
			return;
		}
		if ($disp_str042.equalsIgnoreCase(name)) {
			disp_str042(value);
			return;
		}
		if ($disp_str043.equalsIgnoreCase(name)) {
			disp_str043(value);
			return;
		}
		if ($disp_str044.equalsIgnoreCase(name)) {
			disp_str044(value);
			return;
		}
		if ($disp_str045.equalsIgnoreCase(name)) {
			disp_str045(value);
			return;
		}
		if ($disp_str046.equalsIgnoreCase(name)) {
			disp_str046(value);
			return;
		}
		if ($disp_str047.equalsIgnoreCase(name)) {
			disp_str047(value);
			return;
		}
		if ($disp_str048.equalsIgnoreCase(name)) {
			disp_str048(value);
			return;
		}
		if ($disp_str049.equalsIgnoreCase(name)) {
			disp_str049(value);
			return;
		}
		if ($disp_str050.equalsIgnoreCase(name)) {
			disp_str050(value);
			return;
		}
		if ($disp_str051.equalsIgnoreCase(name)) {
			disp_str051(value);
			return;
		}
		if ($disp_str052.equalsIgnoreCase(name)) {
			disp_str052(value);
			return;
		}
		if ($disp_str053.equalsIgnoreCase(name)) {
			disp_str053(value);
			return;
		}
		if ($disp_str054.equalsIgnoreCase(name)) {
			disp_str054(value);
			return;
		}
		if ($disp_str055.equalsIgnoreCase(name)) {
			disp_str055(value);
			return;
		}
		if ($disp_str056.equalsIgnoreCase(name)) {
			disp_str056(value);
			return;
		}
		if ($disp_str057.equalsIgnoreCase(name)) {
			disp_str057(value);
			return;
		}
		if ($disp_str058.equalsIgnoreCase(name)) {
			disp_str058(value);
			return;
		}
		if ($disp_str059.equalsIgnoreCase(name)) {
			disp_str059(value);
			return;
		}
		if ($disp_str060.equalsIgnoreCase(name)) {
			disp_str060(value);
			return;
		}
		if ($disp_str061.equalsIgnoreCase(name)) {
			disp_str061(value);
			return;
		}
		if ($disp_str062.equalsIgnoreCase(name)) {
			disp_str062(value);
			return;
		}
		if ($disp_str063.equalsIgnoreCase(name)) {
			disp_str063(value);
			return;
		}
		if ($disp_str064.equalsIgnoreCase(name)) {
			disp_str064(value);
			return;
		}
		if ($disp_str065.equalsIgnoreCase(name)) {
			disp_str065(value);
			return;
		}
		if ($disp_str066.equalsIgnoreCase(name)) {
			disp_str066(value);
			return;
		}
		if ($disp_str067.equalsIgnoreCase(name)) {
			disp_str067(value);
			return;
		}
		if ($disp_str068.equalsIgnoreCase(name)) {
			disp_str068(value);
			return;
		}
		if ($disp_str069.equalsIgnoreCase(name)) {
			disp_str069(value);
			return;
		}
		if ($disp_str070.equalsIgnoreCase(name)) {
			disp_str070(value);
			return;
		}
		if ($disp_str071.equalsIgnoreCase(name)) {
			disp_str071(value);
			return;
		}
		if ($disp_str072.equalsIgnoreCase(name)) {
			disp_str072(value);
			return;
		}
		if ($disp_str073.equalsIgnoreCase(name)) {
			disp_str073(value);
			return;
		}
		if ($disp_str074.equalsIgnoreCase(name)) {
			disp_str074(value);
			return;
		}
		if ($disp_str075.equalsIgnoreCase(name)) {
			disp_str075(value);
			return;
		}
		if ($disp_str076.equalsIgnoreCase(name)) {
			disp_str076(value);
			return;
		}
		if ($disp_str077.equalsIgnoreCase(name)) {
			disp_str077(value);
			return;
		}
		if ($disp_str078.equalsIgnoreCase(name)) {
			disp_str078(value);
			return;
		}
		if ($disp_str079.equalsIgnoreCase(name)) {
			disp_str079(value);
			return;
		}
		if ($disp_str080.equalsIgnoreCase(name)) {
			disp_str080(value);
			return;
		}
		if ($disp_str081.equalsIgnoreCase(name)) {
			disp_str081(value);
			return;
		}
		if ($disp_str082.equalsIgnoreCase(name)) {
			disp_str082(value);
			return;
		}
		if ($disp_str083.equalsIgnoreCase(name)) {
			disp_str083(value);
			return;
		}
		if ($disp_str084.equalsIgnoreCase(name)) {
			disp_str084(value);
			return;
		}
		if ($disp_str085.equalsIgnoreCase(name)) {
			disp_str085(value);
			return;
		}
		if ($disp_str086.equalsIgnoreCase(name)) {
			disp_str086(value);
			return;
		}
		if ($disp_str087.equalsIgnoreCase(name)) {
			disp_str087(value);
			return;
		}
		if ($disp_str088.equalsIgnoreCase(name)) {
			disp_str088(value);
			return;
		}
		if ($disp_str089.equalsIgnoreCase(name)) {
			disp_str089(value);
			return;
		}
		if ($disp_str090.equalsIgnoreCase(name)) {
			disp_str090(value);
			return;
		}
		if ($disp_str091.equalsIgnoreCase(name)) {
			disp_str091(value);
			return;
		}
		if ($disp_str092.equalsIgnoreCase(name)) {
			disp_str092(value);
			return;
		}
		if ($disp_str093.equalsIgnoreCase(name)) {
			disp_str093(value);
			return;
		}
		if ($disp_str094.equalsIgnoreCase(name)) {
			disp_str094(value);
			return;
		}
		if ($disp_str095.equalsIgnoreCase(name)) {
			disp_str095(value);
			return;
		}
		if ($disp_str096.equalsIgnoreCase(name)) {
			disp_str096(value);
			return;
		}
		if ($disp_str097.equalsIgnoreCase(name)) {
			disp_str097(value);
			return;
		}
		if ($disp_str098.equalsIgnoreCase(name)) {
			disp_str098(value);
			return;
		}
		if ($disp_str099.equalsIgnoreCase(name)) {
			disp_str099(value);
			return;
		}
		if ($disp_str100.equalsIgnoreCase(name)) {
			disp_str100(value);
			return;
		}
		if ($disp_str101.equalsIgnoreCase(name)) {
			disp_str101(value);
			return;
		}
		if ($disp_str102.equalsIgnoreCase(name)) {
			disp_str102(value);
			return;
		}
		if ($disp_str103.equalsIgnoreCase(name)) {
			disp_str103(value);
			return;
		}
		if ($disp_str104.equalsIgnoreCase(name)) {
			disp_str104(value);
			return;
		}
		if ($disp_str105.equalsIgnoreCase(name)) {
			disp_str105(value);
			return;
		}
		if ($disp_str106.equalsIgnoreCase(name)) {
			disp_str106(value);
			return;
		}
		if ($disp_str107.equalsIgnoreCase(name)) {
			disp_str107(value);
			return;
		}
		if ($disp_str108.equalsIgnoreCase(name)) {
			disp_str108(value);
			return;
		}
		if ($disp_str109.equalsIgnoreCase(name)) {
			disp_str109(value);
			return;
		}
		if ($disp_str110.equalsIgnoreCase(name)) {
			disp_str110(value);
			return;
		}
		if ($disp_str111.equalsIgnoreCase(name)) {
			disp_str111(value);
			return;
		}
		if ($disp_str112.equalsIgnoreCase(name)) {
			disp_str112(value);
			return;
		}
		if ($disp_str113.equalsIgnoreCase(name)) {
			disp_str113(value);
			return;
		}
		if ($disp_str114.equalsIgnoreCase(name)) {
			disp_str114(value);
			return;
		}
		if ($disp_str115.equalsIgnoreCase(name)) {
			disp_str115(value);
			return;
		}
		if ($disp_str116.equalsIgnoreCase(name)) {
			disp_str116(value);
			return;
		}
		if ($disp_str117.equalsIgnoreCase(name)) {
			disp_str117(value);
			return;
		}
		if ($disp_str118.equalsIgnoreCase(name)) {
			disp_str118(value);
			return;
		}
		if ($disp_str119.equalsIgnoreCase(name)) {
			disp_str119(value);
			return;
		}
		if ($disp_str120.equalsIgnoreCase(name)) {
			disp_str120(value);
			return;
		}
		if ($disp_str121.equalsIgnoreCase(name)) {
			disp_str121(value);
			return;
		}
		if ($disp_str122.equalsIgnoreCase(name)) {
			disp_str122(value);
			return;
		}
		if ($disp_str123.equalsIgnoreCase(name)) {
			disp_str123(value);
			return;
		}
		if ($disp_str124.equalsIgnoreCase(name)) {
			disp_str124(value);
			return;
		}
		if ($disp_str125.equalsIgnoreCase(name)) {
			disp_str125(value);
			return;
		}
		if ($disp_str126.equalsIgnoreCase(name)) {
			disp_str126(value);
			return;
		}
		if ($disp_str127.equalsIgnoreCase(name)) {
			disp_str127(value);
			return;
		}
		if ($disp_str128.equalsIgnoreCase(name)) {
			disp_str128(value);
			return;
		}
		if ($disp_str129.equalsIgnoreCase(name)) {
			disp_str129(value);
			return;
		}
		if ($disp_str130.equalsIgnoreCase(name)) {
			disp_str130(value);
			return;
		}
		if ($disp_str131.equalsIgnoreCase(name)) {
			disp_str131(value);
			return;
		}
		if ($disp_str132.equalsIgnoreCase(name)) {
			disp_str132(value);
			return;
		}
		if ($disp_str133.equalsIgnoreCase(name)) {
			disp_str133(value);
			return;
		}
		if ($disp_str134.equalsIgnoreCase(name)) {
			disp_str134(value);
			return;
		}
		if ($disp_str135.equalsIgnoreCase(name)) {
			disp_str135(value);
			return;
		}
		if ($disp_str136.equalsIgnoreCase(name)) {
			disp_str136(value);
			return;
		}
		if ($disp_str137.equalsIgnoreCase(name)) {
			disp_str137(value);
			return;
		}
		if ($disp_str138.equalsIgnoreCase(name)) {
			disp_str138(value);
			return;
		}
		if ($disp_str139.equalsIgnoreCase(name)) {
			disp_str139(value);
			return;
		}
		if ($disp_str140.equalsIgnoreCase(name)) {
			disp_str140(value);
			return;
		}
		if ($disp_str141.equalsIgnoreCase(name)) {
			disp_str141(value);
			return;
		}
		if ($disp_str142.equalsIgnoreCase(name)) {
			disp_str142(value);
			return;
		}
		if ($disp_str143.equalsIgnoreCase(name)) {
			disp_str143(value);
			return;
		}
		if ($disp_str144.equalsIgnoreCase(name)) {
			disp_str144(value);
			return;
		}
		if ($disp_str145.equalsIgnoreCase(name)) {
			disp_str145(value);
			return;
		}
		if ($disp_str146.equalsIgnoreCase(name)) {
			disp_str146(value);
			return;
		}
		if ($disp_str147.equalsIgnoreCase(name)) {
			disp_str147(value);
			return;
		}
		if ($disp_str148.equalsIgnoreCase(name)) {
			disp_str148(value);
			return;
		}
		if ($disp_str149.equalsIgnoreCase(name)) {
			disp_str149(value);
			return;
		}
		if ($disp_str150.equalsIgnoreCase(name)) {
			disp_str150(value);
			return;
		}
		if ($disp_str151.equalsIgnoreCase(name)) {
			disp_str151(value);
			return;
		}
		if ($disp_str152.equalsIgnoreCase(name)) {
			disp_str152(value);
			return;
		}
		if ($disp_str153.equalsIgnoreCase(name)) {
			disp_str153(value);
			return;
		}
		if ($disp_str154.equalsIgnoreCase(name)) {
			disp_str154(value);
			return;
		}
		if ($disp_str155.equalsIgnoreCase(name)) {
			disp_str155(value);
			return;
		}
		if ($disp_str156.equalsIgnoreCase(name)) {
			disp_str156(value);
			return;
		}
		if ($disp_str157.equalsIgnoreCase(name)) {
			disp_str157(value);
			return;
		}
		if ($disp_str158.equalsIgnoreCase(name)) {
			disp_str158(value);
			return;
		}
		if ($disp_str159.equalsIgnoreCase(name)) {
			disp_str159(value);
			return;
		}
		if ($disp_str160.equalsIgnoreCase(name)) {
			disp_str160(value);
			return;
		}
		if ($disp_str161.equalsIgnoreCase(name)) {
			disp_str161(value);
			return;
		}
		if ($disp_str162.equalsIgnoreCase(name)) {
			disp_str162(value);
			return;
		}
		if ($disp_str163.equalsIgnoreCase(name)) {
			disp_str163(value);
			return;
		}
		if ($disp_str164.equalsIgnoreCase(name)) {
			disp_str164(value);
			return;
		}
		if ($disp_str165.equalsIgnoreCase(name)) {
			disp_str165(value);
			return;
		}
		if ($disp_str166.equalsIgnoreCase(name)) {
			disp_str166(value);
			return;
		}
		if ($disp_str167.equalsIgnoreCase(name)) {
			disp_str167(value);
			return;
		}
		if ($disp_str168.equalsIgnoreCase(name)) {
			disp_str168(value);
			return;
		}
		if ($disp_str169.equalsIgnoreCase(name)) {
			disp_str169(value);
			return;
		}
		if ($disp_str170.equalsIgnoreCase(name)) {
			disp_str170(value);
			return;
		}
		if ($disp_str171.equalsIgnoreCase(name)) {
			disp_str171(value);
			return;
		}
		if ($disp_str172.equalsIgnoreCase(name)) {
			disp_str172(value);
			return;
		}
		if ($disp_str173.equalsIgnoreCase(name)) {
			disp_str173(value);
			return;
		}
		if ($disp_str174.equalsIgnoreCase(name)) {
			disp_str174(value);
			return;
		}
		if ($disp_str175.equalsIgnoreCase(name)) {
			disp_str175(value);
			return;
		}
		if ($disp_str176.equalsIgnoreCase(name)) {
			disp_str176(value);
			return;
		}
		if ($disp_str177.equalsIgnoreCase(name)) {
			disp_str177(value);
			return;
		}
		if ($disp_str178.equalsIgnoreCase(name)) {
			disp_str178(value);
			return;
		}
		if ($disp_str179.equalsIgnoreCase(name)) {
			disp_str179(value);
			return;
		}
		if ($disp_str180.equalsIgnoreCase(name)) {
			disp_str180(value);
			return;
		}
		if ($disp_str181.equalsIgnoreCase(name)) {
			disp_str181(value);
			return;
		}
		if ($disp_str182.equalsIgnoreCase(name)) {
			disp_str182(value);
			return;
		}
		if ($disp_str183.equalsIgnoreCase(name)) {
			disp_str183(value);
			return;
		}
		if ($disp_str184.equalsIgnoreCase(name)) {
			disp_str184(value);
			return;
		}
		if ($disp_str185.equalsIgnoreCase(name)) {
			disp_str185(value);
			return;
		}
		if ($disp_str186.equalsIgnoreCase(name)) {
			disp_str186(value);
			return;
		}
		if ($disp_str187.equalsIgnoreCase(name)) {
			disp_str187(value);
			return;
		}
		if ($disp_str188.equalsIgnoreCase(name)) {
			disp_str188(value);
			return;
		}
		if ($disp_str189.equalsIgnoreCase(name)) {
			disp_str189(value);
			return;
		}
		if ($disp_str190.equalsIgnoreCase(name)) {
			disp_str190(value);
			return;
		}
		if ($disp_str191.equalsIgnoreCase(name)) {
			disp_str191(value);
			return;
		}
		if ($disp_str192.equalsIgnoreCase(name)) {
			disp_str192(value);
			return;
		}
		if ($disp_str193.equalsIgnoreCase(name)) {
			disp_str193(value);
			return;
		}
		if ($disp_str194.equalsIgnoreCase(name)) {
			disp_str194(value);
			return;
		}
		if ($disp_str195.equalsIgnoreCase(name)) {
			disp_str195(value);
			return;
		}
		if ($disp_str196.equalsIgnoreCase(name)) {
			disp_str196(value);
			return;
		}
		if ($disp_str197.equalsIgnoreCase(name)) {
			disp_str197(value);
			return;
		}
		if ($disp_str198.equalsIgnoreCase(name)) {
			disp_str198(value);
			return;
		}
		if ($disp_str199.equalsIgnoreCase(name)) {
			disp_str199(value);
			return;
		}
		if ($disp_str200.equalsIgnoreCase(name)) {
			disp_str200(value);
			return;
		}
		if ($add_col_data.equalsIgnoreCase(name)) {
			add_col_data(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($disp_num001.equalsIgnoreCase(name)) {
			disp_num001(value);
			return;
		}
		if ($disp_num002.equalsIgnoreCase(name)) {
			disp_num002(value);
			return;
		}
		if ($disp_num003.equalsIgnoreCase(name)) {
			disp_num003(value);
			return;
		}
		if ($disp_num004.equalsIgnoreCase(name)) {
			disp_num004(value);
			return;
		}
		if ($disp_num005.equalsIgnoreCase(name)) {
			disp_num005(value);
			return;
		}
		if ($disp_num006.equalsIgnoreCase(name)) {
			disp_num006(value);
			return;
		}
		if ($disp_num007.equalsIgnoreCase(name)) {
			disp_num007(value);
			return;
		}
		if ($disp_num008.equalsIgnoreCase(name)) {
			disp_num008(value);
			return;
		}
		if ($disp_num009.equalsIgnoreCase(name)) {
			disp_num009(value);
			return;
		}
		if ($disp_num010.equalsIgnoreCase(name)) {
			disp_num010(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($disp_num001.equalsIgnoreCase(name)) {
			disp_num001(value);
			return;
		}
		if ($disp_num002.equalsIgnoreCase(name)) {
			disp_num002(value);
			return;
		}
		if ($disp_num003.equalsIgnoreCase(name)) {
			disp_num003(value);
			return;
		}
		if ($disp_num004.equalsIgnoreCase(name)) {
			disp_num004(value);
			return;
		}
		if ($disp_num005.equalsIgnoreCase(name)) {
			disp_num005(value);
			return;
		}
		if ($disp_num006.equalsIgnoreCase(name)) {
			disp_num006(value);
			return;
		}
		if ($disp_num007.equalsIgnoreCase(name)) {
			disp_num007(value);
			return;
		}
		if ($disp_num008.equalsIgnoreCase(name)) {
			disp_num008(value);
			return;
		}
		if ($disp_num009.equalsIgnoreCase(name)) {
			disp_num009(value);
			return;
		}
		if ($disp_num010.equalsIgnoreCase(name)) {
			disp_num010(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($disp_num001.equalsIgnoreCase(name)) {
			disp_num001(value);
			return;
		}
		if ($disp_num002.equalsIgnoreCase(name)) {
			disp_num002(value);
			return;
		}
		if ($disp_num003.equalsIgnoreCase(name)) {
			disp_num003(value);
			return;
		}
		if ($disp_num004.equalsIgnoreCase(name)) {
			disp_num004(value);
			return;
		}
		if ($disp_num005.equalsIgnoreCase(name)) {
			disp_num005(value);
			return;
		}
		if ($disp_num006.equalsIgnoreCase(name)) {
			disp_num006(value);
			return;
		}
		if ($disp_num007.equalsIgnoreCase(name)) {
			disp_num007(value);
			return;
		}
		if ($disp_num008.equalsIgnoreCase(name)) {
			disp_num008(value);
			return;
		}
		if ($disp_num009.equalsIgnoreCase(name)) {
			disp_num009(value);
			return;
		}
		if ($disp_num010.equalsIgnoreCase(name)) {
			disp_num010(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($disp_num001.equalsIgnoreCase(name)) {
			disp_num001(value);
			return;
		}
		if ($disp_num002.equalsIgnoreCase(name)) {
			disp_num002(value);
			return;
		}
		if ($disp_num003.equalsIgnoreCase(name)) {
			disp_num003(value);
			return;
		}
		if ($disp_num004.equalsIgnoreCase(name)) {
			disp_num004(value);
			return;
		}
		if ($disp_num005.equalsIgnoreCase(name)) {
			disp_num005(value);
			return;
		}
		if ($disp_num006.equalsIgnoreCase(name)) {
			disp_num006(value);
			return;
		}
		if ($disp_num007.equalsIgnoreCase(name)) {
			disp_num007(value);
			return;
		}
		if ($disp_num008.equalsIgnoreCase(name)) {
			disp_num008(value);
			return;
		}
		if ($disp_num009.equalsIgnoreCase(name)) {
			disp_num009(value);
			return;
		}
		if ($disp_num010.equalsIgnoreCase(name)) {
			disp_num010(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($disp_num001.equalsIgnoreCase(name)) {
			disp_num001(value);
			return;
		}
		if ($disp_num002.equalsIgnoreCase(name)) {
			disp_num002(value);
			return;
		}
		if ($disp_num003.equalsIgnoreCase(name)) {
			disp_num003(value);
			return;
		}
		if ($disp_num004.equalsIgnoreCase(name)) {
			disp_num004(value);
			return;
		}
		if ($disp_num005.equalsIgnoreCase(name)) {
			disp_num005(value);
			return;
		}
		if ($disp_num006.equalsIgnoreCase(name)) {
			disp_num006(value);
			return;
		}
		if ($disp_num007.equalsIgnoreCase(name)) {
			disp_num007(value);
			return;
		}
		if ($disp_num008.equalsIgnoreCase(name)) {
			disp_num008(value);
			return;
		}
		if ($disp_num009.equalsIgnoreCase(name)) {
			disp_num009(value);
			return;
		}
		if ($disp_num010.equalsIgnoreCase(name)) {
			disp_num010(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($disp_dt001.equalsIgnoreCase(name)) {
			disp_dt001(value);
			return;
		}
		if ($disp_dt002.equalsIgnoreCase(name)) {
			disp_dt002(value);
			return;
		}
		if ($disp_dt003.equalsIgnoreCase(name)) {
			disp_dt003(value);
			return;
		}
		if ($disp_dt004.equalsIgnoreCase(name)) {
			disp_dt004(value);
			return;
		}
		if ($disp_dt005.equalsIgnoreCase(name)) {
			disp_dt005(value);
			return;
		}
		if ($disp_dt006.equalsIgnoreCase(name)) {
			disp_dt006(value);
			return;
		}
		if ($disp_dt007.equalsIgnoreCase(name)) {
			disp_dt007(value);
			return;
		}
		if ($disp_dt008.equalsIgnoreCase(name)) {
			disp_dt008(value);
			return;
		}
		if ($disp_dt009.equalsIgnoreCase(name)) {
			disp_dt009(value);
			return;
		}
		if ($disp_dt010.equalsIgnoreCase(name)) {
			disp_dt010(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

