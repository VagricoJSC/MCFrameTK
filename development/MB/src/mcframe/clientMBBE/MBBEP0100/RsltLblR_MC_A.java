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
 * ブロック"RsltLbl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltLblR_MC_A extends MCConstRow {

	public static final String $disp_str001_lbl = "disp_str001_lbl";
	public static final String $disp_str002_lbl = "disp_str002_lbl";
	public static final String $disp_str003_lbl = "disp_str003_lbl";
	public static final String $disp_str004_lbl = "disp_str004_lbl";
	public static final String $disp_str005_lbl = "disp_str005_lbl";
	public static final String $disp_str006_lbl = "disp_str006_lbl";
	public static final String $disp_str007_lbl = "disp_str007_lbl";
	public static final String $disp_str008_lbl = "disp_str008_lbl";
	public static final String $disp_str009_lbl = "disp_str009_lbl";
	public static final String $disp_str010_lbl = "disp_str010_lbl";
	public static final String $disp_str011_lbl = "disp_str011_lbl";
	public static final String $disp_str012_lbl = "disp_str012_lbl";
	public static final String $disp_str013_lbl = "disp_str013_lbl";
	public static final String $disp_str014_lbl = "disp_str014_lbl";
	public static final String $disp_str015_lbl = "disp_str015_lbl";
	public static final String $disp_str016_lbl = "disp_str016_lbl";
	public static final String $disp_str017_lbl = "disp_str017_lbl";
	public static final String $disp_str018_lbl = "disp_str018_lbl";
	public static final String $disp_str019_lbl = "disp_str019_lbl";
	public static final String $disp_str020_lbl = "disp_str020_lbl";
	public static final String $disp_str021_lbl = "disp_str021_lbl";
	public static final String $disp_str022_lbl = "disp_str022_lbl";
	public static final String $disp_str023_lbl = "disp_str023_lbl";
	public static final String $disp_str024_lbl = "disp_str024_lbl";
	public static final String $disp_str025_lbl = "disp_str025_lbl";
	public static final String $disp_str026_lbl = "disp_str026_lbl";
	public static final String $disp_str027_lbl = "disp_str027_lbl";
	public static final String $disp_str028_lbl = "disp_str028_lbl";
	public static final String $disp_str029_lbl = "disp_str029_lbl";
	public static final String $disp_str030_lbl = "disp_str030_lbl";
	public static final String $disp_str031_lbl = "disp_str031_lbl";
	public static final String $disp_str032_lbl = "disp_str032_lbl";
	public static final String $disp_str033_lbl = "disp_str033_lbl";
	public static final String $disp_str034_lbl = "disp_str034_lbl";
	public static final String $disp_str035_lbl = "disp_str035_lbl";
	public static final String $disp_str036_lbl = "disp_str036_lbl";
	public static final String $disp_str037_lbl = "disp_str037_lbl";
	public static final String $disp_str038_lbl = "disp_str038_lbl";
	public static final String $disp_str039_lbl = "disp_str039_lbl";
	public static final String $disp_str040_lbl = "disp_str040_lbl";
	public static final String $disp_str041_lbl = "disp_str041_lbl";
	public static final String $disp_str042_lbl = "disp_str042_lbl";
	public static final String $disp_str043_lbl = "disp_str043_lbl";
	public static final String $disp_str044_lbl = "disp_str044_lbl";
	public static final String $disp_str045_lbl = "disp_str045_lbl";
	public static final String $disp_str046_lbl = "disp_str046_lbl";
	public static final String $disp_str047_lbl = "disp_str047_lbl";
	public static final String $disp_str048_lbl = "disp_str048_lbl";
	public static final String $disp_str049_lbl = "disp_str049_lbl";
	public static final String $disp_str050_lbl = "disp_str050_lbl";
	public static final String $disp_str051_lbl = "disp_str051_lbl";
	public static final String $disp_str052_lbl = "disp_str052_lbl";
	public static final String $disp_str053_lbl = "disp_str053_lbl";
	public static final String $disp_str054_lbl = "disp_str054_lbl";
	public static final String $disp_str055_lbl = "disp_str055_lbl";
	public static final String $disp_str056_lbl = "disp_str056_lbl";
	public static final String $disp_str057_lbl = "disp_str057_lbl";
	public static final String $disp_str058_lbl = "disp_str058_lbl";
	public static final String $disp_str059_lbl = "disp_str059_lbl";
	public static final String $disp_str060_lbl = "disp_str060_lbl";
	public static final String $disp_str061_lbl = "disp_str061_lbl";
	public static final String $disp_str062_lbl = "disp_str062_lbl";
	public static final String $disp_str063_lbl = "disp_str063_lbl";
	public static final String $disp_str064_lbl = "disp_str064_lbl";
	public static final String $disp_str065_lbl = "disp_str065_lbl";
	public static final String $disp_str066_lbl = "disp_str066_lbl";
	public static final String $disp_str067_lbl = "disp_str067_lbl";
	public static final String $disp_str068_lbl = "disp_str068_lbl";
	public static final String $disp_str069_lbl = "disp_str069_lbl";
	public static final String $disp_str070_lbl = "disp_str070_lbl";
	public static final String $disp_str071_lbl = "disp_str071_lbl";
	public static final String $disp_str072_lbl = "disp_str072_lbl";
	public static final String $disp_str073_lbl = "disp_str073_lbl";
	public static final String $disp_str074_lbl = "disp_str074_lbl";
	public static final String $disp_str075_lbl = "disp_str075_lbl";
	public static final String $disp_str076_lbl = "disp_str076_lbl";
	public static final String $disp_str077_lbl = "disp_str077_lbl";
	public static final String $disp_str078_lbl = "disp_str078_lbl";
	public static final String $disp_str079_lbl = "disp_str079_lbl";
	public static final String $disp_str080_lbl = "disp_str080_lbl";
	public static final String $disp_str081_lbl = "disp_str081_lbl";
	public static final String $disp_str082_lbl = "disp_str082_lbl";
	public static final String $disp_str083_lbl = "disp_str083_lbl";
	public static final String $disp_str084_lbl = "disp_str084_lbl";
	public static final String $disp_str085_lbl = "disp_str085_lbl";
	public static final String $disp_str086_lbl = "disp_str086_lbl";
	public static final String $disp_str087_lbl = "disp_str087_lbl";
	public static final String $disp_str088_lbl = "disp_str088_lbl";
	public static final String $disp_str089_lbl = "disp_str089_lbl";
	public static final String $disp_str090_lbl = "disp_str090_lbl";
	public static final String $disp_str091_lbl = "disp_str091_lbl";
	public static final String $disp_str092_lbl = "disp_str092_lbl";
	public static final String $disp_str093_lbl = "disp_str093_lbl";
	public static final String $disp_str094_lbl = "disp_str094_lbl";
	public static final String $disp_str095_lbl = "disp_str095_lbl";
	public static final String $disp_str096_lbl = "disp_str096_lbl";
	public static final String $disp_str097_lbl = "disp_str097_lbl";
	public static final String $disp_str098_lbl = "disp_str098_lbl";
	public static final String $disp_str099_lbl = "disp_str099_lbl";
	public static final String $disp_str100_lbl = "disp_str100_lbl";
	public static final String $disp_str101_lbl = "disp_str101_lbl";
	public static final String $disp_str102_lbl = "disp_str102_lbl";
	public static final String $disp_str103_lbl = "disp_str103_lbl";
	public static final String $disp_str104_lbl = "disp_str104_lbl";
	public static final String $disp_str105_lbl = "disp_str105_lbl";
	public static final String $disp_str106_lbl = "disp_str106_lbl";
	public static final String $disp_str107_lbl = "disp_str107_lbl";
	public static final String $disp_str108_lbl = "disp_str108_lbl";
	public static final String $disp_str109_lbl = "disp_str109_lbl";
	public static final String $disp_str110_lbl = "disp_str110_lbl";
	public static final String $disp_str111_lbl = "disp_str111_lbl";
	public static final String $disp_str112_lbl = "disp_str112_lbl";
	public static final String $disp_str113_lbl = "disp_str113_lbl";
	public static final String $disp_str114_lbl = "disp_str114_lbl";
	public static final String $disp_str115_lbl = "disp_str115_lbl";
	public static final String $disp_str116_lbl = "disp_str116_lbl";
	public static final String $disp_str117_lbl = "disp_str117_lbl";
	public static final String $disp_str118_lbl = "disp_str118_lbl";
	public static final String $disp_str119_lbl = "disp_str119_lbl";
	public static final String $disp_str120_lbl = "disp_str120_lbl";
	public static final String $disp_str121_lbl = "disp_str121_lbl";
	public static final String $disp_str122_lbl = "disp_str122_lbl";
	public static final String $disp_str123_lbl = "disp_str123_lbl";
	public static final String $disp_str124_lbl = "disp_str124_lbl";
	public static final String $disp_str125_lbl = "disp_str125_lbl";
	public static final String $disp_str126_lbl = "disp_str126_lbl";
	public static final String $disp_str127_lbl = "disp_str127_lbl";
	public static final String $disp_str128_lbl = "disp_str128_lbl";
	public static final String $disp_str129_lbl = "disp_str129_lbl";
	public static final String $disp_str130_lbl = "disp_str130_lbl";
	public static final String $disp_str131_lbl = "disp_str131_lbl";
	public static final String $disp_str132_lbl = "disp_str132_lbl";
	public static final String $disp_str133_lbl = "disp_str133_lbl";
	public static final String $disp_str134_lbl = "disp_str134_lbl";
	public static final String $disp_str135_lbl = "disp_str135_lbl";
	public static final String $disp_str136_lbl = "disp_str136_lbl";
	public static final String $disp_str137_lbl = "disp_str137_lbl";
	public static final String $disp_str138_lbl = "disp_str138_lbl";
	public static final String $disp_str139_lbl = "disp_str139_lbl";
	public static final String $disp_str140_lbl = "disp_str140_lbl";
	public static final String $disp_str141_lbl = "disp_str141_lbl";
	public static final String $disp_str142_lbl = "disp_str142_lbl";
	public static final String $disp_str143_lbl = "disp_str143_lbl";
	public static final String $disp_str144_lbl = "disp_str144_lbl";
	public static final String $disp_str145_lbl = "disp_str145_lbl";
	public static final String $disp_str146_lbl = "disp_str146_lbl";
	public static final String $disp_str147_lbl = "disp_str147_lbl";
	public static final String $disp_str148_lbl = "disp_str148_lbl";
	public static final String $disp_str149_lbl = "disp_str149_lbl";
	public static final String $disp_str150_lbl = "disp_str150_lbl";
	public static final String $disp_str151_lbl = "disp_str151_lbl";
	public static final String $disp_str152_lbl = "disp_str152_lbl";
	public static final String $disp_str153_lbl = "disp_str153_lbl";
	public static final String $disp_str154_lbl = "disp_str154_lbl";
	public static final String $disp_str155_lbl = "disp_str155_lbl";
	public static final String $disp_str156_lbl = "disp_str156_lbl";
	public static final String $disp_str157_lbl = "disp_str157_lbl";
	public static final String $disp_str158_lbl = "disp_str158_lbl";
	public static final String $disp_str159_lbl = "disp_str159_lbl";
	public static final String $disp_str160_lbl = "disp_str160_lbl";
	public static final String $disp_str161_lbl = "disp_str161_lbl";
	public static final String $disp_str162_lbl = "disp_str162_lbl";
	public static final String $disp_str163_lbl = "disp_str163_lbl";
	public static final String $disp_str164_lbl = "disp_str164_lbl";
	public static final String $disp_str165_lbl = "disp_str165_lbl";
	public static final String $disp_str166_lbl = "disp_str166_lbl";
	public static final String $disp_str167_lbl = "disp_str167_lbl";
	public static final String $disp_str168_lbl = "disp_str168_lbl";
	public static final String $disp_str169_lbl = "disp_str169_lbl";
	public static final String $disp_str170_lbl = "disp_str170_lbl";
	public static final String $disp_str171_lbl = "disp_str171_lbl";
	public static final String $disp_str172_lbl = "disp_str172_lbl";
	public static final String $disp_str173_lbl = "disp_str173_lbl";
	public static final String $disp_str174_lbl = "disp_str174_lbl";
	public static final String $disp_str175_lbl = "disp_str175_lbl";
	public static final String $disp_str176_lbl = "disp_str176_lbl";
	public static final String $disp_str177_lbl = "disp_str177_lbl";
	public static final String $disp_str178_lbl = "disp_str178_lbl";
	public static final String $disp_str179_lbl = "disp_str179_lbl";
	public static final String $disp_str180_lbl = "disp_str180_lbl";
	public static final String $disp_str181_lbl = "disp_str181_lbl";
	public static final String $disp_str182_lbl = "disp_str182_lbl";
	public static final String $disp_str183_lbl = "disp_str183_lbl";
	public static final String $disp_str184_lbl = "disp_str184_lbl";
	public static final String $disp_str185_lbl = "disp_str185_lbl";
	public static final String $disp_str186_lbl = "disp_str186_lbl";
	public static final String $disp_str187_lbl = "disp_str187_lbl";
	public static final String $disp_str188_lbl = "disp_str188_lbl";
	public static final String $disp_str189_lbl = "disp_str189_lbl";
	public static final String $disp_str190_lbl = "disp_str190_lbl";
	public static final String $disp_str191_lbl = "disp_str191_lbl";
	public static final String $disp_str192_lbl = "disp_str192_lbl";
	public static final String $disp_str193_lbl = "disp_str193_lbl";
	public static final String $disp_str194_lbl = "disp_str194_lbl";
	public static final String $disp_str195_lbl = "disp_str195_lbl";
	public static final String $disp_str196_lbl = "disp_str196_lbl";
	public static final String $disp_str197_lbl = "disp_str197_lbl";
	public static final String $disp_str198_lbl = "disp_str198_lbl";
	public static final String $disp_str199_lbl = "disp_str199_lbl";
	public static final String $disp_str200_lbl = "disp_str200_lbl";
	public static final String $disp_dt001_lbl = "disp_dt001_lbl";
	public static final String $disp_dt002_lbl = "disp_dt002_lbl";
	public static final String $disp_dt003_lbl = "disp_dt003_lbl";
	public static final String $disp_dt004_lbl = "disp_dt004_lbl";
	public static final String $disp_dt005_lbl = "disp_dt005_lbl";
	public static final String $disp_dt006_lbl = "disp_dt006_lbl";
	public static final String $disp_dt007_lbl = "disp_dt007_lbl";
	public static final String $disp_dt008_lbl = "disp_dt008_lbl";
	public static final String $disp_dt009_lbl = "disp_dt009_lbl";
	public static final String $disp_dt010_lbl = "disp_dt010_lbl";
	public static final String $disp_num001_lbl = "disp_num001_lbl";
	public static final String $disp_num002_lbl = "disp_num002_lbl";
	public static final String $disp_num003_lbl = "disp_num003_lbl";
	public static final String $disp_num004_lbl = "disp_num004_lbl";
	public static final String $disp_num005_lbl = "disp_num005_lbl";
	public static final String $disp_num006_lbl = "disp_num006_lbl";
	public static final String $disp_num007_lbl = "disp_num007_lbl";
	public static final String $disp_num008_lbl = "disp_num008_lbl";
	public static final String $disp_num009_lbl = "disp_num009_lbl";
	public static final String $disp_num010_lbl = "disp_num010_lbl";
	public static final String $add_col_lbl = "add_col_lbl";
	public static final String $add_col_typ = "add_col_typ";
	public static final String $add_col_nm = "add_col_nm";
	public static final String $sort_info = "sort_info";


	public static final MCMeta disp_str001_lbl_META = createCommonMeta($disp_str001_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str002_lbl_META = createCommonMeta($disp_str002_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str003_lbl_META = createCommonMeta($disp_str003_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str004_lbl_META = createCommonMeta($disp_str004_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str005_lbl_META = createCommonMeta($disp_str005_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str006_lbl_META = createCommonMeta($disp_str006_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str007_lbl_META = createCommonMeta($disp_str007_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str008_lbl_META = createCommonMeta($disp_str008_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str009_lbl_META = createCommonMeta($disp_str009_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str010_lbl_META = createCommonMeta($disp_str010_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str011_lbl_META = createCommonMeta($disp_str011_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str012_lbl_META = createCommonMeta($disp_str012_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str013_lbl_META = createCommonMeta($disp_str013_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str014_lbl_META = createCommonMeta($disp_str014_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str015_lbl_META = createCommonMeta($disp_str015_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str016_lbl_META = createCommonMeta($disp_str016_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str017_lbl_META = createCommonMeta($disp_str017_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str018_lbl_META = createCommonMeta($disp_str018_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str019_lbl_META = createCommonMeta($disp_str019_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str020_lbl_META = createCommonMeta($disp_str020_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str021_lbl_META = createCommonMeta($disp_str021_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str022_lbl_META = createCommonMeta($disp_str022_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str023_lbl_META = createCommonMeta($disp_str023_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str024_lbl_META = createCommonMeta($disp_str024_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str025_lbl_META = createCommonMeta($disp_str025_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str026_lbl_META = createCommonMeta($disp_str026_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str027_lbl_META = createCommonMeta($disp_str027_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str028_lbl_META = createCommonMeta($disp_str028_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str029_lbl_META = createCommonMeta($disp_str029_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str030_lbl_META = createCommonMeta($disp_str030_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str031_lbl_META = createCommonMeta($disp_str031_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str032_lbl_META = createCommonMeta($disp_str032_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str033_lbl_META = createCommonMeta($disp_str033_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str034_lbl_META = createCommonMeta($disp_str034_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str035_lbl_META = createCommonMeta($disp_str035_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str036_lbl_META = createCommonMeta($disp_str036_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str037_lbl_META = createCommonMeta($disp_str037_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str038_lbl_META = createCommonMeta($disp_str038_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str039_lbl_META = createCommonMeta($disp_str039_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str040_lbl_META = createCommonMeta($disp_str040_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str041_lbl_META = createCommonMeta($disp_str041_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str042_lbl_META = createCommonMeta($disp_str042_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str043_lbl_META = createCommonMeta($disp_str043_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str044_lbl_META = createCommonMeta($disp_str044_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str045_lbl_META = createCommonMeta($disp_str045_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str046_lbl_META = createCommonMeta($disp_str046_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str047_lbl_META = createCommonMeta($disp_str047_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str048_lbl_META = createCommonMeta($disp_str048_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str049_lbl_META = createCommonMeta($disp_str049_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str050_lbl_META = createCommonMeta($disp_str050_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str051_lbl_META = createCommonMeta($disp_str051_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str052_lbl_META = createCommonMeta($disp_str052_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str053_lbl_META = createCommonMeta($disp_str053_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str054_lbl_META = createCommonMeta($disp_str054_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str055_lbl_META = createCommonMeta($disp_str055_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str056_lbl_META = createCommonMeta($disp_str056_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str057_lbl_META = createCommonMeta($disp_str057_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str058_lbl_META = createCommonMeta($disp_str058_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str059_lbl_META = createCommonMeta($disp_str059_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str060_lbl_META = createCommonMeta($disp_str060_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str061_lbl_META = createCommonMeta($disp_str061_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str062_lbl_META = createCommonMeta($disp_str062_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str063_lbl_META = createCommonMeta($disp_str063_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str064_lbl_META = createCommonMeta($disp_str064_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str065_lbl_META = createCommonMeta($disp_str065_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str066_lbl_META = createCommonMeta($disp_str066_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str067_lbl_META = createCommonMeta($disp_str067_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str068_lbl_META = createCommonMeta($disp_str068_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str069_lbl_META = createCommonMeta($disp_str069_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str070_lbl_META = createCommonMeta($disp_str070_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str071_lbl_META = createCommonMeta($disp_str071_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str072_lbl_META = createCommonMeta($disp_str072_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str073_lbl_META = createCommonMeta($disp_str073_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str074_lbl_META = createCommonMeta($disp_str074_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str075_lbl_META = createCommonMeta($disp_str075_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str076_lbl_META = createCommonMeta($disp_str076_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str077_lbl_META = createCommonMeta($disp_str077_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str078_lbl_META = createCommonMeta($disp_str078_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str079_lbl_META = createCommonMeta($disp_str079_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str080_lbl_META = createCommonMeta($disp_str080_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str081_lbl_META = createCommonMeta($disp_str081_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str082_lbl_META = createCommonMeta($disp_str082_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str083_lbl_META = createCommonMeta($disp_str083_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str084_lbl_META = createCommonMeta($disp_str084_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str085_lbl_META = createCommonMeta($disp_str085_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str086_lbl_META = createCommonMeta($disp_str086_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str087_lbl_META = createCommonMeta($disp_str087_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str088_lbl_META = createCommonMeta($disp_str088_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str089_lbl_META = createCommonMeta($disp_str089_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str090_lbl_META = createCommonMeta($disp_str090_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str091_lbl_META = createCommonMeta($disp_str091_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str092_lbl_META = createCommonMeta($disp_str092_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str093_lbl_META = createCommonMeta($disp_str093_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str094_lbl_META = createCommonMeta($disp_str094_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str095_lbl_META = createCommonMeta($disp_str095_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str096_lbl_META = createCommonMeta($disp_str096_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str097_lbl_META = createCommonMeta($disp_str097_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str098_lbl_META = createCommonMeta($disp_str098_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str099_lbl_META = createCommonMeta($disp_str099_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str100_lbl_META = createCommonMeta($disp_str100_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str101_lbl_META = createCommonMeta($disp_str101_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str102_lbl_META = createCommonMeta($disp_str102_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str103_lbl_META = createCommonMeta($disp_str103_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str104_lbl_META = createCommonMeta($disp_str104_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str105_lbl_META = createCommonMeta($disp_str105_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str106_lbl_META = createCommonMeta($disp_str106_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str107_lbl_META = createCommonMeta($disp_str107_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str108_lbl_META = createCommonMeta($disp_str108_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str109_lbl_META = createCommonMeta($disp_str109_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str110_lbl_META = createCommonMeta($disp_str110_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str111_lbl_META = createCommonMeta($disp_str111_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str112_lbl_META = createCommonMeta($disp_str112_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str113_lbl_META = createCommonMeta($disp_str113_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str114_lbl_META = createCommonMeta($disp_str114_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str115_lbl_META = createCommonMeta($disp_str115_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str116_lbl_META = createCommonMeta($disp_str116_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str117_lbl_META = createCommonMeta($disp_str117_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str118_lbl_META = createCommonMeta($disp_str118_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str119_lbl_META = createCommonMeta($disp_str119_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str120_lbl_META = createCommonMeta($disp_str120_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str121_lbl_META = createCommonMeta($disp_str121_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str122_lbl_META = createCommonMeta($disp_str122_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str123_lbl_META = createCommonMeta($disp_str123_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str124_lbl_META = createCommonMeta($disp_str124_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str125_lbl_META = createCommonMeta($disp_str125_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str126_lbl_META = createCommonMeta($disp_str126_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str127_lbl_META = createCommonMeta($disp_str127_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str128_lbl_META = createCommonMeta($disp_str128_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str129_lbl_META = createCommonMeta($disp_str129_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str130_lbl_META = createCommonMeta($disp_str130_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str131_lbl_META = createCommonMeta($disp_str131_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str132_lbl_META = createCommonMeta($disp_str132_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str133_lbl_META = createCommonMeta($disp_str133_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str134_lbl_META = createCommonMeta($disp_str134_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str135_lbl_META = createCommonMeta($disp_str135_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str136_lbl_META = createCommonMeta($disp_str136_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str137_lbl_META = createCommonMeta($disp_str137_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str138_lbl_META = createCommonMeta($disp_str138_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str139_lbl_META = createCommonMeta($disp_str139_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str140_lbl_META = createCommonMeta($disp_str140_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str141_lbl_META = createCommonMeta($disp_str141_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str142_lbl_META = createCommonMeta($disp_str142_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str143_lbl_META = createCommonMeta($disp_str143_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str144_lbl_META = createCommonMeta($disp_str144_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str145_lbl_META = createCommonMeta($disp_str145_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str146_lbl_META = createCommonMeta($disp_str146_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str147_lbl_META = createCommonMeta($disp_str147_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str148_lbl_META = createCommonMeta($disp_str148_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str149_lbl_META = createCommonMeta($disp_str149_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str150_lbl_META = createCommonMeta($disp_str150_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str151_lbl_META = createCommonMeta($disp_str151_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str152_lbl_META = createCommonMeta($disp_str152_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str153_lbl_META = createCommonMeta($disp_str153_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str154_lbl_META = createCommonMeta($disp_str154_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str155_lbl_META = createCommonMeta($disp_str155_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str156_lbl_META = createCommonMeta($disp_str156_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str157_lbl_META = createCommonMeta($disp_str157_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str158_lbl_META = createCommonMeta($disp_str158_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str159_lbl_META = createCommonMeta($disp_str159_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str160_lbl_META = createCommonMeta($disp_str160_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str161_lbl_META = createCommonMeta($disp_str161_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str162_lbl_META = createCommonMeta($disp_str162_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str163_lbl_META = createCommonMeta($disp_str163_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str164_lbl_META = createCommonMeta($disp_str164_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str165_lbl_META = createCommonMeta($disp_str165_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str166_lbl_META = createCommonMeta($disp_str166_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str167_lbl_META = createCommonMeta($disp_str167_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str168_lbl_META = createCommonMeta($disp_str168_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str169_lbl_META = createCommonMeta($disp_str169_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str170_lbl_META = createCommonMeta($disp_str170_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str171_lbl_META = createCommonMeta($disp_str171_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str172_lbl_META = createCommonMeta($disp_str172_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str173_lbl_META = createCommonMeta($disp_str173_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str174_lbl_META = createCommonMeta($disp_str174_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str175_lbl_META = createCommonMeta($disp_str175_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str176_lbl_META = createCommonMeta($disp_str176_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str177_lbl_META = createCommonMeta($disp_str177_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str178_lbl_META = createCommonMeta($disp_str178_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str179_lbl_META = createCommonMeta($disp_str179_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str180_lbl_META = createCommonMeta($disp_str180_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str181_lbl_META = createCommonMeta($disp_str181_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str182_lbl_META = createCommonMeta($disp_str182_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str183_lbl_META = createCommonMeta($disp_str183_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str184_lbl_META = createCommonMeta($disp_str184_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str185_lbl_META = createCommonMeta($disp_str185_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str186_lbl_META = createCommonMeta($disp_str186_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str187_lbl_META = createCommonMeta($disp_str187_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str188_lbl_META = createCommonMeta($disp_str188_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str189_lbl_META = createCommonMeta($disp_str189_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str190_lbl_META = createCommonMeta($disp_str190_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str191_lbl_META = createCommonMeta($disp_str191_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str192_lbl_META = createCommonMeta($disp_str192_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str193_lbl_META = createCommonMeta($disp_str193_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str194_lbl_META = createCommonMeta($disp_str194_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str195_lbl_META = createCommonMeta($disp_str195_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str196_lbl_META = createCommonMeta($disp_str196_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str197_lbl_META = createCommonMeta($disp_str197_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str198_lbl_META = createCommonMeta($disp_str198_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str199_lbl_META = createCommonMeta($disp_str199_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_str200_lbl_META = createCommonMeta($disp_str200_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_dt001_lbl_META = createCommonMeta($disp_dt001_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_dt002_lbl_META = createCommonMeta($disp_dt002_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_dt003_lbl_META = createCommonMeta($disp_dt003_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_dt004_lbl_META = createCommonMeta($disp_dt004_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_dt005_lbl_META = createCommonMeta($disp_dt005_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_dt006_lbl_META = createCommonMeta($disp_dt006_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_dt007_lbl_META = createCommonMeta($disp_dt007_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_dt008_lbl_META = createCommonMeta($disp_dt008_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_dt009_lbl_META = createCommonMeta($disp_dt009_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_dt010_lbl_META = createCommonMeta($disp_dt010_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_num001_lbl_META = createCommonMeta($disp_num001_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_num002_lbl_META = createCommonMeta($disp_num002_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_num003_lbl_META = createCommonMeta($disp_num003_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_num004_lbl_META = createCommonMeta($disp_num004_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_num005_lbl_META = createCommonMeta($disp_num005_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_num006_lbl_META = createCommonMeta($disp_num006_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_num007_lbl_META = createCommonMeta($disp_num007_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_num008_lbl_META = createCommonMeta($disp_num008_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_num009_lbl_META = createCommonMeta($disp_num009_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta disp_num010_lbl_META = createCommonMeta($disp_num010_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);
	public static final MCMeta add_col_lbl_META = createStringMeta($add_col_lbl);
	public static final MCMeta add_col_typ_META = createStringMeta($add_col_typ);
	public static final MCMeta add_col_nm_META = createStringMeta($add_col_nm);
	public static final MCMeta sort_info_META = createStringMeta($sort_info);

	protected static final ConstMetaList<RsltLblR> constMetas = new ConstMetaList<RsltLblR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			disp_str001_lbl_META,
			disp_str002_lbl_META,
			disp_str003_lbl_META,
			disp_str004_lbl_META,
			disp_str005_lbl_META,
			disp_str006_lbl_META,
			disp_str007_lbl_META,
			disp_str008_lbl_META,
			disp_str009_lbl_META,
			disp_str010_lbl_META,
			disp_str011_lbl_META,
			disp_str012_lbl_META,
			disp_str013_lbl_META,
			disp_str014_lbl_META,
			disp_str015_lbl_META,
			disp_str016_lbl_META,
			disp_str017_lbl_META,
			disp_str018_lbl_META,
			disp_str019_lbl_META,
			disp_str020_lbl_META,
			disp_str021_lbl_META,
			disp_str022_lbl_META,
			disp_str023_lbl_META,
			disp_str024_lbl_META,
			disp_str025_lbl_META,
			disp_str026_lbl_META,
			disp_str027_lbl_META,
			disp_str028_lbl_META,
			disp_str029_lbl_META,
			disp_str030_lbl_META,
			disp_str031_lbl_META,
			disp_str032_lbl_META,
			disp_str033_lbl_META,
			disp_str034_lbl_META,
			disp_str035_lbl_META,
			disp_str036_lbl_META,
			disp_str037_lbl_META,
			disp_str038_lbl_META,
			disp_str039_lbl_META,
			disp_str040_lbl_META,
			disp_str041_lbl_META,
			disp_str042_lbl_META,
			disp_str043_lbl_META,
			disp_str044_lbl_META,
			disp_str045_lbl_META,
			disp_str046_lbl_META,
			disp_str047_lbl_META,
			disp_str048_lbl_META,
			disp_str049_lbl_META,
			disp_str050_lbl_META,
			disp_str051_lbl_META,
			disp_str052_lbl_META,
			disp_str053_lbl_META,
			disp_str054_lbl_META,
			disp_str055_lbl_META,
			disp_str056_lbl_META,
			disp_str057_lbl_META,
			disp_str058_lbl_META,
			disp_str059_lbl_META,
			disp_str060_lbl_META,
			disp_str061_lbl_META,
			disp_str062_lbl_META,
			disp_str063_lbl_META,
			disp_str064_lbl_META,
			disp_str065_lbl_META,
			disp_str066_lbl_META,
			disp_str067_lbl_META,
			disp_str068_lbl_META,
			disp_str069_lbl_META,
			disp_str070_lbl_META,
			disp_str071_lbl_META,
			disp_str072_lbl_META,
			disp_str073_lbl_META,
			disp_str074_lbl_META,
			disp_str075_lbl_META,
			disp_str076_lbl_META,
			disp_str077_lbl_META,
			disp_str078_lbl_META,
			disp_str079_lbl_META,
			disp_str080_lbl_META,
			disp_str081_lbl_META,
			disp_str082_lbl_META,
			disp_str083_lbl_META,
			disp_str084_lbl_META,
			disp_str085_lbl_META,
			disp_str086_lbl_META,
			disp_str087_lbl_META,
			disp_str088_lbl_META,
			disp_str089_lbl_META,
			disp_str090_lbl_META,
			disp_str091_lbl_META,
			disp_str092_lbl_META,
			disp_str093_lbl_META,
			disp_str094_lbl_META,
			disp_str095_lbl_META,
			disp_str096_lbl_META,
			disp_str097_lbl_META,
			disp_str098_lbl_META,
			disp_str099_lbl_META,
			disp_str100_lbl_META,
			disp_str101_lbl_META,
			disp_str102_lbl_META,
			disp_str103_lbl_META,
			disp_str104_lbl_META,
			disp_str105_lbl_META,
			disp_str106_lbl_META,
			disp_str107_lbl_META,
			disp_str108_lbl_META,
			disp_str109_lbl_META,
			disp_str110_lbl_META,
			disp_str111_lbl_META,
			disp_str112_lbl_META,
			disp_str113_lbl_META,
			disp_str114_lbl_META,
			disp_str115_lbl_META,
			disp_str116_lbl_META,
			disp_str117_lbl_META,
			disp_str118_lbl_META,
			disp_str119_lbl_META,
			disp_str120_lbl_META,
			disp_str121_lbl_META,
			disp_str122_lbl_META,
			disp_str123_lbl_META,
			disp_str124_lbl_META,
			disp_str125_lbl_META,
			disp_str126_lbl_META,
			disp_str127_lbl_META,
			disp_str128_lbl_META,
			disp_str129_lbl_META,
			disp_str130_lbl_META,
			disp_str131_lbl_META,
			disp_str132_lbl_META,
			disp_str133_lbl_META,
			disp_str134_lbl_META,
			disp_str135_lbl_META,
			disp_str136_lbl_META,
			disp_str137_lbl_META,
			disp_str138_lbl_META,
			disp_str139_lbl_META,
			disp_str140_lbl_META,
			disp_str141_lbl_META,
			disp_str142_lbl_META,
			disp_str143_lbl_META,
			disp_str144_lbl_META,
			disp_str145_lbl_META,
			disp_str146_lbl_META,
			disp_str147_lbl_META,
			disp_str148_lbl_META,
			disp_str149_lbl_META,
			disp_str150_lbl_META,
			disp_str151_lbl_META,
			disp_str152_lbl_META,
			disp_str153_lbl_META,
			disp_str154_lbl_META,
			disp_str155_lbl_META,
			disp_str156_lbl_META,
			disp_str157_lbl_META,
			disp_str158_lbl_META,
			disp_str159_lbl_META,
			disp_str160_lbl_META,
			disp_str161_lbl_META,
			disp_str162_lbl_META,
			disp_str163_lbl_META,
			disp_str164_lbl_META,
			disp_str165_lbl_META,
			disp_str166_lbl_META,
			disp_str167_lbl_META,
			disp_str168_lbl_META,
			disp_str169_lbl_META,
			disp_str170_lbl_META,
			disp_str171_lbl_META,
			disp_str172_lbl_META,
			disp_str173_lbl_META,
			disp_str174_lbl_META,
			disp_str175_lbl_META,
			disp_str176_lbl_META,
			disp_str177_lbl_META,
			disp_str178_lbl_META,
			disp_str179_lbl_META,
			disp_str180_lbl_META,
			disp_str181_lbl_META,
			disp_str182_lbl_META,
			disp_str183_lbl_META,
			disp_str184_lbl_META,
			disp_str185_lbl_META,
			disp_str186_lbl_META,
			disp_str187_lbl_META,
			disp_str188_lbl_META,
			disp_str189_lbl_META,
			disp_str190_lbl_META,
			disp_str191_lbl_META,
			disp_str192_lbl_META,
			disp_str193_lbl_META,
			disp_str194_lbl_META,
			disp_str195_lbl_META,
			disp_str196_lbl_META,
			disp_str197_lbl_META,
			disp_str198_lbl_META,
			disp_str199_lbl_META,
			disp_str200_lbl_META,
			disp_dt001_lbl_META,
			disp_dt002_lbl_META,
			disp_dt003_lbl_META,
			disp_dt004_lbl_META,
			disp_dt005_lbl_META,
			disp_dt006_lbl_META,
			disp_dt007_lbl_META,
			disp_dt008_lbl_META,
			disp_dt009_lbl_META,
			disp_dt010_lbl_META,
			disp_num001_lbl_META,
			disp_num002_lbl_META,
			disp_num003_lbl_META,
			disp_num004_lbl_META,
			disp_num005_lbl_META,
			disp_num006_lbl_META,
			disp_num007_lbl_META,
			disp_num008_lbl_META,
			disp_num009_lbl_META,
			disp_num010_lbl_META,
			add_col_lbl_META,
			add_col_typ_META,
			add_col_nm_META,
			sort_info_META
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
	protected RsltLblR_MC_A(ConstMetaList<? extends RsltLblR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltLblR clone() {
		return (RsltLblR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltLblR createInstance() {
		return (RsltLblR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltLblR getValues(String... names) {
		return (RsltLblR) super.getValues(names);
	}



	public String disp_str001_lbl() {
		return getConstString(offset + 0, $disp_str001_lbl);
	}

	public void disp_str001_lbl(String value) {
		setConstString(offset + 0, $disp_str001_lbl, value);
	}


	public String disp_str002_lbl() {
		return getConstString(offset + 1, $disp_str002_lbl);
	}

	public void disp_str002_lbl(String value) {
		setConstString(offset + 1, $disp_str002_lbl, value);
	}


	public String disp_str003_lbl() {
		return getConstString(offset + 2, $disp_str003_lbl);
	}

	public void disp_str003_lbl(String value) {
		setConstString(offset + 2, $disp_str003_lbl, value);
	}


	public String disp_str004_lbl() {
		return getConstString(offset + 3, $disp_str004_lbl);
	}

	public void disp_str004_lbl(String value) {
		setConstString(offset + 3, $disp_str004_lbl, value);
	}


	public String disp_str005_lbl() {
		return getConstString(offset + 4, $disp_str005_lbl);
	}

	public void disp_str005_lbl(String value) {
		setConstString(offset + 4, $disp_str005_lbl, value);
	}


	public String disp_str006_lbl() {
		return getConstString(offset + 5, $disp_str006_lbl);
	}

	public void disp_str006_lbl(String value) {
		setConstString(offset + 5, $disp_str006_lbl, value);
	}


	public String disp_str007_lbl() {
		return getConstString(offset + 6, $disp_str007_lbl);
	}

	public void disp_str007_lbl(String value) {
		setConstString(offset + 6, $disp_str007_lbl, value);
	}


	public String disp_str008_lbl() {
		return getConstString(offset + 7, $disp_str008_lbl);
	}

	public void disp_str008_lbl(String value) {
		setConstString(offset + 7, $disp_str008_lbl, value);
	}


	public String disp_str009_lbl() {
		return getConstString(offset + 8, $disp_str009_lbl);
	}

	public void disp_str009_lbl(String value) {
		setConstString(offset + 8, $disp_str009_lbl, value);
	}


	public String disp_str010_lbl() {
		return getConstString(offset + 9, $disp_str010_lbl);
	}

	public void disp_str010_lbl(String value) {
		setConstString(offset + 9, $disp_str010_lbl, value);
	}


	public String disp_str011_lbl() {
		return getConstString(offset + 10, $disp_str011_lbl);
	}

	public void disp_str011_lbl(String value) {
		setConstString(offset + 10, $disp_str011_lbl, value);
	}


	public String disp_str012_lbl() {
		return getConstString(offset + 11, $disp_str012_lbl);
	}

	public void disp_str012_lbl(String value) {
		setConstString(offset + 11, $disp_str012_lbl, value);
	}


	public String disp_str013_lbl() {
		return getConstString(offset + 12, $disp_str013_lbl);
	}

	public void disp_str013_lbl(String value) {
		setConstString(offset + 12, $disp_str013_lbl, value);
	}


	public String disp_str014_lbl() {
		return getConstString(offset + 13, $disp_str014_lbl);
	}

	public void disp_str014_lbl(String value) {
		setConstString(offset + 13, $disp_str014_lbl, value);
	}


	public String disp_str015_lbl() {
		return getConstString(offset + 14, $disp_str015_lbl);
	}

	public void disp_str015_lbl(String value) {
		setConstString(offset + 14, $disp_str015_lbl, value);
	}


	public String disp_str016_lbl() {
		return getConstString(offset + 15, $disp_str016_lbl);
	}

	public void disp_str016_lbl(String value) {
		setConstString(offset + 15, $disp_str016_lbl, value);
	}


	public String disp_str017_lbl() {
		return getConstString(offset + 16, $disp_str017_lbl);
	}

	public void disp_str017_lbl(String value) {
		setConstString(offset + 16, $disp_str017_lbl, value);
	}


	public String disp_str018_lbl() {
		return getConstString(offset + 17, $disp_str018_lbl);
	}

	public void disp_str018_lbl(String value) {
		setConstString(offset + 17, $disp_str018_lbl, value);
	}


	public String disp_str019_lbl() {
		return getConstString(offset + 18, $disp_str019_lbl);
	}

	public void disp_str019_lbl(String value) {
		setConstString(offset + 18, $disp_str019_lbl, value);
	}


	public String disp_str020_lbl() {
		return getConstString(offset + 19, $disp_str020_lbl);
	}

	public void disp_str020_lbl(String value) {
		setConstString(offset + 19, $disp_str020_lbl, value);
	}


	public String disp_str021_lbl() {
		return getConstString(offset + 20, $disp_str021_lbl);
	}

	public void disp_str021_lbl(String value) {
		setConstString(offset + 20, $disp_str021_lbl, value);
	}


	public String disp_str022_lbl() {
		return getConstString(offset + 21, $disp_str022_lbl);
	}

	public void disp_str022_lbl(String value) {
		setConstString(offset + 21, $disp_str022_lbl, value);
	}


	public String disp_str023_lbl() {
		return getConstString(offset + 22, $disp_str023_lbl);
	}

	public void disp_str023_lbl(String value) {
		setConstString(offset + 22, $disp_str023_lbl, value);
	}


	public String disp_str024_lbl() {
		return getConstString(offset + 23, $disp_str024_lbl);
	}

	public void disp_str024_lbl(String value) {
		setConstString(offset + 23, $disp_str024_lbl, value);
	}


	public String disp_str025_lbl() {
		return getConstString(offset + 24, $disp_str025_lbl);
	}

	public void disp_str025_lbl(String value) {
		setConstString(offset + 24, $disp_str025_lbl, value);
	}


	public String disp_str026_lbl() {
		return getConstString(offset + 25, $disp_str026_lbl);
	}

	public void disp_str026_lbl(String value) {
		setConstString(offset + 25, $disp_str026_lbl, value);
	}


	public String disp_str027_lbl() {
		return getConstString(offset + 26, $disp_str027_lbl);
	}

	public void disp_str027_lbl(String value) {
		setConstString(offset + 26, $disp_str027_lbl, value);
	}


	public String disp_str028_lbl() {
		return getConstString(offset + 27, $disp_str028_lbl);
	}

	public void disp_str028_lbl(String value) {
		setConstString(offset + 27, $disp_str028_lbl, value);
	}


	public String disp_str029_lbl() {
		return getConstString(offset + 28, $disp_str029_lbl);
	}

	public void disp_str029_lbl(String value) {
		setConstString(offset + 28, $disp_str029_lbl, value);
	}


	public String disp_str030_lbl() {
		return getConstString(offset + 29, $disp_str030_lbl);
	}

	public void disp_str030_lbl(String value) {
		setConstString(offset + 29, $disp_str030_lbl, value);
	}


	public String disp_str031_lbl() {
		return getConstString(offset + 30, $disp_str031_lbl);
	}

	public void disp_str031_lbl(String value) {
		setConstString(offset + 30, $disp_str031_lbl, value);
	}


	public String disp_str032_lbl() {
		return getConstString(offset + 31, $disp_str032_lbl);
	}

	public void disp_str032_lbl(String value) {
		setConstString(offset + 31, $disp_str032_lbl, value);
	}


	public String disp_str033_lbl() {
		return getConstString(offset + 32, $disp_str033_lbl);
	}

	public void disp_str033_lbl(String value) {
		setConstString(offset + 32, $disp_str033_lbl, value);
	}


	public String disp_str034_lbl() {
		return getConstString(offset + 33, $disp_str034_lbl);
	}

	public void disp_str034_lbl(String value) {
		setConstString(offset + 33, $disp_str034_lbl, value);
	}


	public String disp_str035_lbl() {
		return getConstString(offset + 34, $disp_str035_lbl);
	}

	public void disp_str035_lbl(String value) {
		setConstString(offset + 34, $disp_str035_lbl, value);
	}


	public String disp_str036_lbl() {
		return getConstString(offset + 35, $disp_str036_lbl);
	}

	public void disp_str036_lbl(String value) {
		setConstString(offset + 35, $disp_str036_lbl, value);
	}


	public String disp_str037_lbl() {
		return getConstString(offset + 36, $disp_str037_lbl);
	}

	public void disp_str037_lbl(String value) {
		setConstString(offset + 36, $disp_str037_lbl, value);
	}


	public String disp_str038_lbl() {
		return getConstString(offset + 37, $disp_str038_lbl);
	}

	public void disp_str038_lbl(String value) {
		setConstString(offset + 37, $disp_str038_lbl, value);
	}


	public String disp_str039_lbl() {
		return getConstString(offset + 38, $disp_str039_lbl);
	}

	public void disp_str039_lbl(String value) {
		setConstString(offset + 38, $disp_str039_lbl, value);
	}


	public String disp_str040_lbl() {
		return getConstString(offset + 39, $disp_str040_lbl);
	}

	public void disp_str040_lbl(String value) {
		setConstString(offset + 39, $disp_str040_lbl, value);
	}


	public String disp_str041_lbl() {
		return getConstString(offset + 40, $disp_str041_lbl);
	}

	public void disp_str041_lbl(String value) {
		setConstString(offset + 40, $disp_str041_lbl, value);
	}


	public String disp_str042_lbl() {
		return getConstString(offset + 41, $disp_str042_lbl);
	}

	public void disp_str042_lbl(String value) {
		setConstString(offset + 41, $disp_str042_lbl, value);
	}


	public String disp_str043_lbl() {
		return getConstString(offset + 42, $disp_str043_lbl);
	}

	public void disp_str043_lbl(String value) {
		setConstString(offset + 42, $disp_str043_lbl, value);
	}


	public String disp_str044_lbl() {
		return getConstString(offset + 43, $disp_str044_lbl);
	}

	public void disp_str044_lbl(String value) {
		setConstString(offset + 43, $disp_str044_lbl, value);
	}


	public String disp_str045_lbl() {
		return getConstString(offset + 44, $disp_str045_lbl);
	}

	public void disp_str045_lbl(String value) {
		setConstString(offset + 44, $disp_str045_lbl, value);
	}


	public String disp_str046_lbl() {
		return getConstString(offset + 45, $disp_str046_lbl);
	}

	public void disp_str046_lbl(String value) {
		setConstString(offset + 45, $disp_str046_lbl, value);
	}


	public String disp_str047_lbl() {
		return getConstString(offset + 46, $disp_str047_lbl);
	}

	public void disp_str047_lbl(String value) {
		setConstString(offset + 46, $disp_str047_lbl, value);
	}


	public String disp_str048_lbl() {
		return getConstString(offset + 47, $disp_str048_lbl);
	}

	public void disp_str048_lbl(String value) {
		setConstString(offset + 47, $disp_str048_lbl, value);
	}


	public String disp_str049_lbl() {
		return getConstString(offset + 48, $disp_str049_lbl);
	}

	public void disp_str049_lbl(String value) {
		setConstString(offset + 48, $disp_str049_lbl, value);
	}


	public String disp_str050_lbl() {
		return getConstString(offset + 49, $disp_str050_lbl);
	}

	public void disp_str050_lbl(String value) {
		setConstString(offset + 49, $disp_str050_lbl, value);
	}


	public String disp_str051_lbl() {
		return getConstString(offset + 50, $disp_str051_lbl);
	}

	public void disp_str051_lbl(String value) {
		setConstString(offset + 50, $disp_str051_lbl, value);
	}


	public String disp_str052_lbl() {
		return getConstString(offset + 51, $disp_str052_lbl);
	}

	public void disp_str052_lbl(String value) {
		setConstString(offset + 51, $disp_str052_lbl, value);
	}


	public String disp_str053_lbl() {
		return getConstString(offset + 52, $disp_str053_lbl);
	}

	public void disp_str053_lbl(String value) {
		setConstString(offset + 52, $disp_str053_lbl, value);
	}


	public String disp_str054_lbl() {
		return getConstString(offset + 53, $disp_str054_lbl);
	}

	public void disp_str054_lbl(String value) {
		setConstString(offset + 53, $disp_str054_lbl, value);
	}


	public String disp_str055_lbl() {
		return getConstString(offset + 54, $disp_str055_lbl);
	}

	public void disp_str055_lbl(String value) {
		setConstString(offset + 54, $disp_str055_lbl, value);
	}


	public String disp_str056_lbl() {
		return getConstString(offset + 55, $disp_str056_lbl);
	}

	public void disp_str056_lbl(String value) {
		setConstString(offset + 55, $disp_str056_lbl, value);
	}


	public String disp_str057_lbl() {
		return getConstString(offset + 56, $disp_str057_lbl);
	}

	public void disp_str057_lbl(String value) {
		setConstString(offset + 56, $disp_str057_lbl, value);
	}


	public String disp_str058_lbl() {
		return getConstString(offset + 57, $disp_str058_lbl);
	}

	public void disp_str058_lbl(String value) {
		setConstString(offset + 57, $disp_str058_lbl, value);
	}


	public String disp_str059_lbl() {
		return getConstString(offset + 58, $disp_str059_lbl);
	}

	public void disp_str059_lbl(String value) {
		setConstString(offset + 58, $disp_str059_lbl, value);
	}


	public String disp_str060_lbl() {
		return getConstString(offset + 59, $disp_str060_lbl);
	}

	public void disp_str060_lbl(String value) {
		setConstString(offset + 59, $disp_str060_lbl, value);
	}


	public String disp_str061_lbl() {
		return getConstString(offset + 60, $disp_str061_lbl);
	}

	public void disp_str061_lbl(String value) {
		setConstString(offset + 60, $disp_str061_lbl, value);
	}


	public String disp_str062_lbl() {
		return getConstString(offset + 61, $disp_str062_lbl);
	}

	public void disp_str062_lbl(String value) {
		setConstString(offset + 61, $disp_str062_lbl, value);
	}


	public String disp_str063_lbl() {
		return getConstString(offset + 62, $disp_str063_lbl);
	}

	public void disp_str063_lbl(String value) {
		setConstString(offset + 62, $disp_str063_lbl, value);
	}


	public String disp_str064_lbl() {
		return getConstString(offset + 63, $disp_str064_lbl);
	}

	public void disp_str064_lbl(String value) {
		setConstString(offset + 63, $disp_str064_lbl, value);
	}


	public String disp_str065_lbl() {
		return getConstString(offset + 64, $disp_str065_lbl);
	}

	public void disp_str065_lbl(String value) {
		setConstString(offset + 64, $disp_str065_lbl, value);
	}


	public String disp_str066_lbl() {
		return getConstString(offset + 65, $disp_str066_lbl);
	}

	public void disp_str066_lbl(String value) {
		setConstString(offset + 65, $disp_str066_lbl, value);
	}


	public String disp_str067_lbl() {
		return getConstString(offset + 66, $disp_str067_lbl);
	}

	public void disp_str067_lbl(String value) {
		setConstString(offset + 66, $disp_str067_lbl, value);
	}


	public String disp_str068_lbl() {
		return getConstString(offset + 67, $disp_str068_lbl);
	}

	public void disp_str068_lbl(String value) {
		setConstString(offset + 67, $disp_str068_lbl, value);
	}


	public String disp_str069_lbl() {
		return getConstString(offset + 68, $disp_str069_lbl);
	}

	public void disp_str069_lbl(String value) {
		setConstString(offset + 68, $disp_str069_lbl, value);
	}


	public String disp_str070_lbl() {
		return getConstString(offset + 69, $disp_str070_lbl);
	}

	public void disp_str070_lbl(String value) {
		setConstString(offset + 69, $disp_str070_lbl, value);
	}


	public String disp_str071_lbl() {
		return getConstString(offset + 70, $disp_str071_lbl);
	}

	public void disp_str071_lbl(String value) {
		setConstString(offset + 70, $disp_str071_lbl, value);
	}


	public String disp_str072_lbl() {
		return getConstString(offset + 71, $disp_str072_lbl);
	}

	public void disp_str072_lbl(String value) {
		setConstString(offset + 71, $disp_str072_lbl, value);
	}


	public String disp_str073_lbl() {
		return getConstString(offset + 72, $disp_str073_lbl);
	}

	public void disp_str073_lbl(String value) {
		setConstString(offset + 72, $disp_str073_lbl, value);
	}


	public String disp_str074_lbl() {
		return getConstString(offset + 73, $disp_str074_lbl);
	}

	public void disp_str074_lbl(String value) {
		setConstString(offset + 73, $disp_str074_lbl, value);
	}


	public String disp_str075_lbl() {
		return getConstString(offset + 74, $disp_str075_lbl);
	}

	public void disp_str075_lbl(String value) {
		setConstString(offset + 74, $disp_str075_lbl, value);
	}


	public String disp_str076_lbl() {
		return getConstString(offset + 75, $disp_str076_lbl);
	}

	public void disp_str076_lbl(String value) {
		setConstString(offset + 75, $disp_str076_lbl, value);
	}


	public String disp_str077_lbl() {
		return getConstString(offset + 76, $disp_str077_lbl);
	}

	public void disp_str077_lbl(String value) {
		setConstString(offset + 76, $disp_str077_lbl, value);
	}


	public String disp_str078_lbl() {
		return getConstString(offset + 77, $disp_str078_lbl);
	}

	public void disp_str078_lbl(String value) {
		setConstString(offset + 77, $disp_str078_lbl, value);
	}


	public String disp_str079_lbl() {
		return getConstString(offset + 78, $disp_str079_lbl);
	}

	public void disp_str079_lbl(String value) {
		setConstString(offset + 78, $disp_str079_lbl, value);
	}


	public String disp_str080_lbl() {
		return getConstString(offset + 79, $disp_str080_lbl);
	}

	public void disp_str080_lbl(String value) {
		setConstString(offset + 79, $disp_str080_lbl, value);
	}


	public String disp_str081_lbl() {
		return getConstString(offset + 80, $disp_str081_lbl);
	}

	public void disp_str081_lbl(String value) {
		setConstString(offset + 80, $disp_str081_lbl, value);
	}


	public String disp_str082_lbl() {
		return getConstString(offset + 81, $disp_str082_lbl);
	}

	public void disp_str082_lbl(String value) {
		setConstString(offset + 81, $disp_str082_lbl, value);
	}


	public String disp_str083_lbl() {
		return getConstString(offset + 82, $disp_str083_lbl);
	}

	public void disp_str083_lbl(String value) {
		setConstString(offset + 82, $disp_str083_lbl, value);
	}


	public String disp_str084_lbl() {
		return getConstString(offset + 83, $disp_str084_lbl);
	}

	public void disp_str084_lbl(String value) {
		setConstString(offset + 83, $disp_str084_lbl, value);
	}


	public String disp_str085_lbl() {
		return getConstString(offset + 84, $disp_str085_lbl);
	}

	public void disp_str085_lbl(String value) {
		setConstString(offset + 84, $disp_str085_lbl, value);
	}


	public String disp_str086_lbl() {
		return getConstString(offset + 85, $disp_str086_lbl);
	}

	public void disp_str086_lbl(String value) {
		setConstString(offset + 85, $disp_str086_lbl, value);
	}


	public String disp_str087_lbl() {
		return getConstString(offset + 86, $disp_str087_lbl);
	}

	public void disp_str087_lbl(String value) {
		setConstString(offset + 86, $disp_str087_lbl, value);
	}


	public String disp_str088_lbl() {
		return getConstString(offset + 87, $disp_str088_lbl);
	}

	public void disp_str088_lbl(String value) {
		setConstString(offset + 87, $disp_str088_lbl, value);
	}


	public String disp_str089_lbl() {
		return getConstString(offset + 88, $disp_str089_lbl);
	}

	public void disp_str089_lbl(String value) {
		setConstString(offset + 88, $disp_str089_lbl, value);
	}


	public String disp_str090_lbl() {
		return getConstString(offset + 89, $disp_str090_lbl);
	}

	public void disp_str090_lbl(String value) {
		setConstString(offset + 89, $disp_str090_lbl, value);
	}


	public String disp_str091_lbl() {
		return getConstString(offset + 90, $disp_str091_lbl);
	}

	public void disp_str091_lbl(String value) {
		setConstString(offset + 90, $disp_str091_lbl, value);
	}


	public String disp_str092_lbl() {
		return getConstString(offset + 91, $disp_str092_lbl);
	}

	public void disp_str092_lbl(String value) {
		setConstString(offset + 91, $disp_str092_lbl, value);
	}


	public String disp_str093_lbl() {
		return getConstString(offset + 92, $disp_str093_lbl);
	}

	public void disp_str093_lbl(String value) {
		setConstString(offset + 92, $disp_str093_lbl, value);
	}


	public String disp_str094_lbl() {
		return getConstString(offset + 93, $disp_str094_lbl);
	}

	public void disp_str094_lbl(String value) {
		setConstString(offset + 93, $disp_str094_lbl, value);
	}


	public String disp_str095_lbl() {
		return getConstString(offset + 94, $disp_str095_lbl);
	}

	public void disp_str095_lbl(String value) {
		setConstString(offset + 94, $disp_str095_lbl, value);
	}


	public String disp_str096_lbl() {
		return getConstString(offset + 95, $disp_str096_lbl);
	}

	public void disp_str096_lbl(String value) {
		setConstString(offset + 95, $disp_str096_lbl, value);
	}


	public String disp_str097_lbl() {
		return getConstString(offset + 96, $disp_str097_lbl);
	}

	public void disp_str097_lbl(String value) {
		setConstString(offset + 96, $disp_str097_lbl, value);
	}


	public String disp_str098_lbl() {
		return getConstString(offset + 97, $disp_str098_lbl);
	}

	public void disp_str098_lbl(String value) {
		setConstString(offset + 97, $disp_str098_lbl, value);
	}


	public String disp_str099_lbl() {
		return getConstString(offset + 98, $disp_str099_lbl);
	}

	public void disp_str099_lbl(String value) {
		setConstString(offset + 98, $disp_str099_lbl, value);
	}


	public String disp_str100_lbl() {
		return getConstString(offset + 99, $disp_str100_lbl);
	}

	public void disp_str100_lbl(String value) {
		setConstString(offset + 99, $disp_str100_lbl, value);
	}


	public String disp_str101_lbl() {
		return getConstString(offset + 100, $disp_str101_lbl);
	}

	public void disp_str101_lbl(String value) {
		setConstString(offset + 100, $disp_str101_lbl, value);
	}


	public String disp_str102_lbl() {
		return getConstString(offset + 101, $disp_str102_lbl);
	}

	public void disp_str102_lbl(String value) {
		setConstString(offset + 101, $disp_str102_lbl, value);
	}


	public String disp_str103_lbl() {
		return getConstString(offset + 102, $disp_str103_lbl);
	}

	public void disp_str103_lbl(String value) {
		setConstString(offset + 102, $disp_str103_lbl, value);
	}


	public String disp_str104_lbl() {
		return getConstString(offset + 103, $disp_str104_lbl);
	}

	public void disp_str104_lbl(String value) {
		setConstString(offset + 103, $disp_str104_lbl, value);
	}


	public String disp_str105_lbl() {
		return getConstString(offset + 104, $disp_str105_lbl);
	}

	public void disp_str105_lbl(String value) {
		setConstString(offset + 104, $disp_str105_lbl, value);
	}


	public String disp_str106_lbl() {
		return getConstString(offset + 105, $disp_str106_lbl);
	}

	public void disp_str106_lbl(String value) {
		setConstString(offset + 105, $disp_str106_lbl, value);
	}


	public String disp_str107_lbl() {
		return getConstString(offset + 106, $disp_str107_lbl);
	}

	public void disp_str107_lbl(String value) {
		setConstString(offset + 106, $disp_str107_lbl, value);
	}


	public String disp_str108_lbl() {
		return getConstString(offset + 107, $disp_str108_lbl);
	}

	public void disp_str108_lbl(String value) {
		setConstString(offset + 107, $disp_str108_lbl, value);
	}


	public String disp_str109_lbl() {
		return getConstString(offset + 108, $disp_str109_lbl);
	}

	public void disp_str109_lbl(String value) {
		setConstString(offset + 108, $disp_str109_lbl, value);
	}


	public String disp_str110_lbl() {
		return getConstString(offset + 109, $disp_str110_lbl);
	}

	public void disp_str110_lbl(String value) {
		setConstString(offset + 109, $disp_str110_lbl, value);
	}


	public String disp_str111_lbl() {
		return getConstString(offset + 110, $disp_str111_lbl);
	}

	public void disp_str111_lbl(String value) {
		setConstString(offset + 110, $disp_str111_lbl, value);
	}


	public String disp_str112_lbl() {
		return getConstString(offset + 111, $disp_str112_lbl);
	}

	public void disp_str112_lbl(String value) {
		setConstString(offset + 111, $disp_str112_lbl, value);
	}


	public String disp_str113_lbl() {
		return getConstString(offset + 112, $disp_str113_lbl);
	}

	public void disp_str113_lbl(String value) {
		setConstString(offset + 112, $disp_str113_lbl, value);
	}


	public String disp_str114_lbl() {
		return getConstString(offset + 113, $disp_str114_lbl);
	}

	public void disp_str114_lbl(String value) {
		setConstString(offset + 113, $disp_str114_lbl, value);
	}


	public String disp_str115_lbl() {
		return getConstString(offset + 114, $disp_str115_lbl);
	}

	public void disp_str115_lbl(String value) {
		setConstString(offset + 114, $disp_str115_lbl, value);
	}


	public String disp_str116_lbl() {
		return getConstString(offset + 115, $disp_str116_lbl);
	}

	public void disp_str116_lbl(String value) {
		setConstString(offset + 115, $disp_str116_lbl, value);
	}


	public String disp_str117_lbl() {
		return getConstString(offset + 116, $disp_str117_lbl);
	}

	public void disp_str117_lbl(String value) {
		setConstString(offset + 116, $disp_str117_lbl, value);
	}


	public String disp_str118_lbl() {
		return getConstString(offset + 117, $disp_str118_lbl);
	}

	public void disp_str118_lbl(String value) {
		setConstString(offset + 117, $disp_str118_lbl, value);
	}


	public String disp_str119_lbl() {
		return getConstString(offset + 118, $disp_str119_lbl);
	}

	public void disp_str119_lbl(String value) {
		setConstString(offset + 118, $disp_str119_lbl, value);
	}


	public String disp_str120_lbl() {
		return getConstString(offset + 119, $disp_str120_lbl);
	}

	public void disp_str120_lbl(String value) {
		setConstString(offset + 119, $disp_str120_lbl, value);
	}


	public String disp_str121_lbl() {
		return getConstString(offset + 120, $disp_str121_lbl);
	}

	public void disp_str121_lbl(String value) {
		setConstString(offset + 120, $disp_str121_lbl, value);
	}


	public String disp_str122_lbl() {
		return getConstString(offset + 121, $disp_str122_lbl);
	}

	public void disp_str122_lbl(String value) {
		setConstString(offset + 121, $disp_str122_lbl, value);
	}


	public String disp_str123_lbl() {
		return getConstString(offset + 122, $disp_str123_lbl);
	}

	public void disp_str123_lbl(String value) {
		setConstString(offset + 122, $disp_str123_lbl, value);
	}


	public String disp_str124_lbl() {
		return getConstString(offset + 123, $disp_str124_lbl);
	}

	public void disp_str124_lbl(String value) {
		setConstString(offset + 123, $disp_str124_lbl, value);
	}


	public String disp_str125_lbl() {
		return getConstString(offset + 124, $disp_str125_lbl);
	}

	public void disp_str125_lbl(String value) {
		setConstString(offset + 124, $disp_str125_lbl, value);
	}


	public String disp_str126_lbl() {
		return getConstString(offset + 125, $disp_str126_lbl);
	}

	public void disp_str126_lbl(String value) {
		setConstString(offset + 125, $disp_str126_lbl, value);
	}


	public String disp_str127_lbl() {
		return getConstString(offset + 126, $disp_str127_lbl);
	}

	public void disp_str127_lbl(String value) {
		setConstString(offset + 126, $disp_str127_lbl, value);
	}


	public String disp_str128_lbl() {
		return getConstString(offset + 127, $disp_str128_lbl);
	}

	public void disp_str128_lbl(String value) {
		setConstString(offset + 127, $disp_str128_lbl, value);
	}


	public String disp_str129_lbl() {
		return getConstString(offset + 128, $disp_str129_lbl);
	}

	public void disp_str129_lbl(String value) {
		setConstString(offset + 128, $disp_str129_lbl, value);
	}


	public String disp_str130_lbl() {
		return getConstString(offset + 129, $disp_str130_lbl);
	}

	public void disp_str130_lbl(String value) {
		setConstString(offset + 129, $disp_str130_lbl, value);
	}


	public String disp_str131_lbl() {
		return getConstString(offset + 130, $disp_str131_lbl);
	}

	public void disp_str131_lbl(String value) {
		setConstString(offset + 130, $disp_str131_lbl, value);
	}


	public String disp_str132_lbl() {
		return getConstString(offset + 131, $disp_str132_lbl);
	}

	public void disp_str132_lbl(String value) {
		setConstString(offset + 131, $disp_str132_lbl, value);
	}


	public String disp_str133_lbl() {
		return getConstString(offset + 132, $disp_str133_lbl);
	}

	public void disp_str133_lbl(String value) {
		setConstString(offset + 132, $disp_str133_lbl, value);
	}


	public String disp_str134_lbl() {
		return getConstString(offset + 133, $disp_str134_lbl);
	}

	public void disp_str134_lbl(String value) {
		setConstString(offset + 133, $disp_str134_lbl, value);
	}


	public String disp_str135_lbl() {
		return getConstString(offset + 134, $disp_str135_lbl);
	}

	public void disp_str135_lbl(String value) {
		setConstString(offset + 134, $disp_str135_lbl, value);
	}


	public String disp_str136_lbl() {
		return getConstString(offset + 135, $disp_str136_lbl);
	}

	public void disp_str136_lbl(String value) {
		setConstString(offset + 135, $disp_str136_lbl, value);
	}


	public String disp_str137_lbl() {
		return getConstString(offset + 136, $disp_str137_lbl);
	}

	public void disp_str137_lbl(String value) {
		setConstString(offset + 136, $disp_str137_lbl, value);
	}


	public String disp_str138_lbl() {
		return getConstString(offset + 137, $disp_str138_lbl);
	}

	public void disp_str138_lbl(String value) {
		setConstString(offset + 137, $disp_str138_lbl, value);
	}


	public String disp_str139_lbl() {
		return getConstString(offset + 138, $disp_str139_lbl);
	}

	public void disp_str139_lbl(String value) {
		setConstString(offset + 138, $disp_str139_lbl, value);
	}


	public String disp_str140_lbl() {
		return getConstString(offset + 139, $disp_str140_lbl);
	}

	public void disp_str140_lbl(String value) {
		setConstString(offset + 139, $disp_str140_lbl, value);
	}


	public String disp_str141_lbl() {
		return getConstString(offset + 140, $disp_str141_lbl);
	}

	public void disp_str141_lbl(String value) {
		setConstString(offset + 140, $disp_str141_lbl, value);
	}


	public String disp_str142_lbl() {
		return getConstString(offset + 141, $disp_str142_lbl);
	}

	public void disp_str142_lbl(String value) {
		setConstString(offset + 141, $disp_str142_lbl, value);
	}


	public String disp_str143_lbl() {
		return getConstString(offset + 142, $disp_str143_lbl);
	}

	public void disp_str143_lbl(String value) {
		setConstString(offset + 142, $disp_str143_lbl, value);
	}


	public String disp_str144_lbl() {
		return getConstString(offset + 143, $disp_str144_lbl);
	}

	public void disp_str144_lbl(String value) {
		setConstString(offset + 143, $disp_str144_lbl, value);
	}


	public String disp_str145_lbl() {
		return getConstString(offset + 144, $disp_str145_lbl);
	}

	public void disp_str145_lbl(String value) {
		setConstString(offset + 144, $disp_str145_lbl, value);
	}


	public String disp_str146_lbl() {
		return getConstString(offset + 145, $disp_str146_lbl);
	}

	public void disp_str146_lbl(String value) {
		setConstString(offset + 145, $disp_str146_lbl, value);
	}


	public String disp_str147_lbl() {
		return getConstString(offset + 146, $disp_str147_lbl);
	}

	public void disp_str147_lbl(String value) {
		setConstString(offset + 146, $disp_str147_lbl, value);
	}


	public String disp_str148_lbl() {
		return getConstString(offset + 147, $disp_str148_lbl);
	}

	public void disp_str148_lbl(String value) {
		setConstString(offset + 147, $disp_str148_lbl, value);
	}


	public String disp_str149_lbl() {
		return getConstString(offset + 148, $disp_str149_lbl);
	}

	public void disp_str149_lbl(String value) {
		setConstString(offset + 148, $disp_str149_lbl, value);
	}


	public String disp_str150_lbl() {
		return getConstString(offset + 149, $disp_str150_lbl);
	}

	public void disp_str150_lbl(String value) {
		setConstString(offset + 149, $disp_str150_lbl, value);
	}


	public String disp_str151_lbl() {
		return getConstString(offset + 150, $disp_str151_lbl);
	}

	public void disp_str151_lbl(String value) {
		setConstString(offset + 150, $disp_str151_lbl, value);
	}


	public String disp_str152_lbl() {
		return getConstString(offset + 151, $disp_str152_lbl);
	}

	public void disp_str152_lbl(String value) {
		setConstString(offset + 151, $disp_str152_lbl, value);
	}


	public String disp_str153_lbl() {
		return getConstString(offset + 152, $disp_str153_lbl);
	}

	public void disp_str153_lbl(String value) {
		setConstString(offset + 152, $disp_str153_lbl, value);
	}


	public String disp_str154_lbl() {
		return getConstString(offset + 153, $disp_str154_lbl);
	}

	public void disp_str154_lbl(String value) {
		setConstString(offset + 153, $disp_str154_lbl, value);
	}


	public String disp_str155_lbl() {
		return getConstString(offset + 154, $disp_str155_lbl);
	}

	public void disp_str155_lbl(String value) {
		setConstString(offset + 154, $disp_str155_lbl, value);
	}


	public String disp_str156_lbl() {
		return getConstString(offset + 155, $disp_str156_lbl);
	}

	public void disp_str156_lbl(String value) {
		setConstString(offset + 155, $disp_str156_lbl, value);
	}


	public String disp_str157_lbl() {
		return getConstString(offset + 156, $disp_str157_lbl);
	}

	public void disp_str157_lbl(String value) {
		setConstString(offset + 156, $disp_str157_lbl, value);
	}


	public String disp_str158_lbl() {
		return getConstString(offset + 157, $disp_str158_lbl);
	}

	public void disp_str158_lbl(String value) {
		setConstString(offset + 157, $disp_str158_lbl, value);
	}


	public String disp_str159_lbl() {
		return getConstString(offset + 158, $disp_str159_lbl);
	}

	public void disp_str159_lbl(String value) {
		setConstString(offset + 158, $disp_str159_lbl, value);
	}


	public String disp_str160_lbl() {
		return getConstString(offset + 159, $disp_str160_lbl);
	}

	public void disp_str160_lbl(String value) {
		setConstString(offset + 159, $disp_str160_lbl, value);
	}


	public String disp_str161_lbl() {
		return getConstString(offset + 160, $disp_str161_lbl);
	}

	public void disp_str161_lbl(String value) {
		setConstString(offset + 160, $disp_str161_lbl, value);
	}


	public String disp_str162_lbl() {
		return getConstString(offset + 161, $disp_str162_lbl);
	}

	public void disp_str162_lbl(String value) {
		setConstString(offset + 161, $disp_str162_lbl, value);
	}


	public String disp_str163_lbl() {
		return getConstString(offset + 162, $disp_str163_lbl);
	}

	public void disp_str163_lbl(String value) {
		setConstString(offset + 162, $disp_str163_lbl, value);
	}


	public String disp_str164_lbl() {
		return getConstString(offset + 163, $disp_str164_lbl);
	}

	public void disp_str164_lbl(String value) {
		setConstString(offset + 163, $disp_str164_lbl, value);
	}


	public String disp_str165_lbl() {
		return getConstString(offset + 164, $disp_str165_lbl);
	}

	public void disp_str165_lbl(String value) {
		setConstString(offset + 164, $disp_str165_lbl, value);
	}


	public String disp_str166_lbl() {
		return getConstString(offset + 165, $disp_str166_lbl);
	}

	public void disp_str166_lbl(String value) {
		setConstString(offset + 165, $disp_str166_lbl, value);
	}


	public String disp_str167_lbl() {
		return getConstString(offset + 166, $disp_str167_lbl);
	}

	public void disp_str167_lbl(String value) {
		setConstString(offset + 166, $disp_str167_lbl, value);
	}


	public String disp_str168_lbl() {
		return getConstString(offset + 167, $disp_str168_lbl);
	}

	public void disp_str168_lbl(String value) {
		setConstString(offset + 167, $disp_str168_lbl, value);
	}


	public String disp_str169_lbl() {
		return getConstString(offset + 168, $disp_str169_lbl);
	}

	public void disp_str169_lbl(String value) {
		setConstString(offset + 168, $disp_str169_lbl, value);
	}


	public String disp_str170_lbl() {
		return getConstString(offset + 169, $disp_str170_lbl);
	}

	public void disp_str170_lbl(String value) {
		setConstString(offset + 169, $disp_str170_lbl, value);
	}


	public String disp_str171_lbl() {
		return getConstString(offset + 170, $disp_str171_lbl);
	}

	public void disp_str171_lbl(String value) {
		setConstString(offset + 170, $disp_str171_lbl, value);
	}


	public String disp_str172_lbl() {
		return getConstString(offset + 171, $disp_str172_lbl);
	}

	public void disp_str172_lbl(String value) {
		setConstString(offset + 171, $disp_str172_lbl, value);
	}


	public String disp_str173_lbl() {
		return getConstString(offset + 172, $disp_str173_lbl);
	}

	public void disp_str173_lbl(String value) {
		setConstString(offset + 172, $disp_str173_lbl, value);
	}


	public String disp_str174_lbl() {
		return getConstString(offset + 173, $disp_str174_lbl);
	}

	public void disp_str174_lbl(String value) {
		setConstString(offset + 173, $disp_str174_lbl, value);
	}


	public String disp_str175_lbl() {
		return getConstString(offset + 174, $disp_str175_lbl);
	}

	public void disp_str175_lbl(String value) {
		setConstString(offset + 174, $disp_str175_lbl, value);
	}


	public String disp_str176_lbl() {
		return getConstString(offset + 175, $disp_str176_lbl);
	}

	public void disp_str176_lbl(String value) {
		setConstString(offset + 175, $disp_str176_lbl, value);
	}


	public String disp_str177_lbl() {
		return getConstString(offset + 176, $disp_str177_lbl);
	}

	public void disp_str177_lbl(String value) {
		setConstString(offset + 176, $disp_str177_lbl, value);
	}


	public String disp_str178_lbl() {
		return getConstString(offset + 177, $disp_str178_lbl);
	}

	public void disp_str178_lbl(String value) {
		setConstString(offset + 177, $disp_str178_lbl, value);
	}


	public String disp_str179_lbl() {
		return getConstString(offset + 178, $disp_str179_lbl);
	}

	public void disp_str179_lbl(String value) {
		setConstString(offset + 178, $disp_str179_lbl, value);
	}


	public String disp_str180_lbl() {
		return getConstString(offset + 179, $disp_str180_lbl);
	}

	public void disp_str180_lbl(String value) {
		setConstString(offset + 179, $disp_str180_lbl, value);
	}


	public String disp_str181_lbl() {
		return getConstString(offset + 180, $disp_str181_lbl);
	}

	public void disp_str181_lbl(String value) {
		setConstString(offset + 180, $disp_str181_lbl, value);
	}


	public String disp_str182_lbl() {
		return getConstString(offset + 181, $disp_str182_lbl);
	}

	public void disp_str182_lbl(String value) {
		setConstString(offset + 181, $disp_str182_lbl, value);
	}


	public String disp_str183_lbl() {
		return getConstString(offset + 182, $disp_str183_lbl);
	}

	public void disp_str183_lbl(String value) {
		setConstString(offset + 182, $disp_str183_lbl, value);
	}


	public String disp_str184_lbl() {
		return getConstString(offset + 183, $disp_str184_lbl);
	}

	public void disp_str184_lbl(String value) {
		setConstString(offset + 183, $disp_str184_lbl, value);
	}


	public String disp_str185_lbl() {
		return getConstString(offset + 184, $disp_str185_lbl);
	}

	public void disp_str185_lbl(String value) {
		setConstString(offset + 184, $disp_str185_lbl, value);
	}


	public String disp_str186_lbl() {
		return getConstString(offset + 185, $disp_str186_lbl);
	}

	public void disp_str186_lbl(String value) {
		setConstString(offset + 185, $disp_str186_lbl, value);
	}


	public String disp_str187_lbl() {
		return getConstString(offset + 186, $disp_str187_lbl);
	}

	public void disp_str187_lbl(String value) {
		setConstString(offset + 186, $disp_str187_lbl, value);
	}


	public String disp_str188_lbl() {
		return getConstString(offset + 187, $disp_str188_lbl);
	}

	public void disp_str188_lbl(String value) {
		setConstString(offset + 187, $disp_str188_lbl, value);
	}


	public String disp_str189_lbl() {
		return getConstString(offset + 188, $disp_str189_lbl);
	}

	public void disp_str189_lbl(String value) {
		setConstString(offset + 188, $disp_str189_lbl, value);
	}


	public String disp_str190_lbl() {
		return getConstString(offset + 189, $disp_str190_lbl);
	}

	public void disp_str190_lbl(String value) {
		setConstString(offset + 189, $disp_str190_lbl, value);
	}


	public String disp_str191_lbl() {
		return getConstString(offset + 190, $disp_str191_lbl);
	}

	public void disp_str191_lbl(String value) {
		setConstString(offset + 190, $disp_str191_lbl, value);
	}


	public String disp_str192_lbl() {
		return getConstString(offset + 191, $disp_str192_lbl);
	}

	public void disp_str192_lbl(String value) {
		setConstString(offset + 191, $disp_str192_lbl, value);
	}


	public String disp_str193_lbl() {
		return getConstString(offset + 192, $disp_str193_lbl);
	}

	public void disp_str193_lbl(String value) {
		setConstString(offset + 192, $disp_str193_lbl, value);
	}


	public String disp_str194_lbl() {
		return getConstString(offset + 193, $disp_str194_lbl);
	}

	public void disp_str194_lbl(String value) {
		setConstString(offset + 193, $disp_str194_lbl, value);
	}


	public String disp_str195_lbl() {
		return getConstString(offset + 194, $disp_str195_lbl);
	}

	public void disp_str195_lbl(String value) {
		setConstString(offset + 194, $disp_str195_lbl, value);
	}


	public String disp_str196_lbl() {
		return getConstString(offset + 195, $disp_str196_lbl);
	}

	public void disp_str196_lbl(String value) {
		setConstString(offset + 195, $disp_str196_lbl, value);
	}


	public String disp_str197_lbl() {
		return getConstString(offset + 196, $disp_str197_lbl);
	}

	public void disp_str197_lbl(String value) {
		setConstString(offset + 196, $disp_str197_lbl, value);
	}


	public String disp_str198_lbl() {
		return getConstString(offset + 197, $disp_str198_lbl);
	}

	public void disp_str198_lbl(String value) {
		setConstString(offset + 197, $disp_str198_lbl, value);
	}


	public String disp_str199_lbl() {
		return getConstString(offset + 198, $disp_str199_lbl);
	}

	public void disp_str199_lbl(String value) {
		setConstString(offset + 198, $disp_str199_lbl, value);
	}


	public String disp_str200_lbl() {
		return getConstString(offset + 199, $disp_str200_lbl);
	}

	public void disp_str200_lbl(String value) {
		setConstString(offset + 199, $disp_str200_lbl, value);
	}


	public String disp_dt001_lbl() {
		return getConstString(offset + 200, $disp_dt001_lbl);
	}

	public void disp_dt001_lbl(String value) {
		setConstString(offset + 200, $disp_dt001_lbl, value);
	}


	public String disp_dt002_lbl() {
		return getConstString(offset + 201, $disp_dt002_lbl);
	}

	public void disp_dt002_lbl(String value) {
		setConstString(offset + 201, $disp_dt002_lbl, value);
	}


	public String disp_dt003_lbl() {
		return getConstString(offset + 202, $disp_dt003_lbl);
	}

	public void disp_dt003_lbl(String value) {
		setConstString(offset + 202, $disp_dt003_lbl, value);
	}


	public String disp_dt004_lbl() {
		return getConstString(offset + 203, $disp_dt004_lbl);
	}

	public void disp_dt004_lbl(String value) {
		setConstString(offset + 203, $disp_dt004_lbl, value);
	}


	public String disp_dt005_lbl() {
		return getConstString(offset + 204, $disp_dt005_lbl);
	}

	public void disp_dt005_lbl(String value) {
		setConstString(offset + 204, $disp_dt005_lbl, value);
	}


	public String disp_dt006_lbl() {
		return getConstString(offset + 205, $disp_dt006_lbl);
	}

	public void disp_dt006_lbl(String value) {
		setConstString(offset + 205, $disp_dt006_lbl, value);
	}


	public String disp_dt007_lbl() {
		return getConstString(offset + 206, $disp_dt007_lbl);
	}

	public void disp_dt007_lbl(String value) {
		setConstString(offset + 206, $disp_dt007_lbl, value);
	}


	public String disp_dt008_lbl() {
		return getConstString(offset + 207, $disp_dt008_lbl);
	}

	public void disp_dt008_lbl(String value) {
		setConstString(offset + 207, $disp_dt008_lbl, value);
	}


	public String disp_dt009_lbl() {
		return getConstString(offset + 208, $disp_dt009_lbl);
	}

	public void disp_dt009_lbl(String value) {
		setConstString(offset + 208, $disp_dt009_lbl, value);
	}


	public String disp_dt010_lbl() {
		return getConstString(offset + 209, $disp_dt010_lbl);
	}

	public void disp_dt010_lbl(String value) {
		setConstString(offset + 209, $disp_dt010_lbl, value);
	}


	public String disp_num001_lbl() {
		return getConstString(offset + 210, $disp_num001_lbl);
	}

	public void disp_num001_lbl(String value) {
		setConstString(offset + 210, $disp_num001_lbl, value);
	}


	public String disp_num002_lbl() {
		return getConstString(offset + 211, $disp_num002_lbl);
	}

	public void disp_num002_lbl(String value) {
		setConstString(offset + 211, $disp_num002_lbl, value);
	}


	public String disp_num003_lbl() {
		return getConstString(offset + 212, $disp_num003_lbl);
	}

	public void disp_num003_lbl(String value) {
		setConstString(offset + 212, $disp_num003_lbl, value);
	}


	public String disp_num004_lbl() {
		return getConstString(offset + 213, $disp_num004_lbl);
	}

	public void disp_num004_lbl(String value) {
		setConstString(offset + 213, $disp_num004_lbl, value);
	}


	public String disp_num005_lbl() {
		return getConstString(offset + 214, $disp_num005_lbl);
	}

	public void disp_num005_lbl(String value) {
		setConstString(offset + 214, $disp_num005_lbl, value);
	}


	public String disp_num006_lbl() {
		return getConstString(offset + 215, $disp_num006_lbl);
	}

	public void disp_num006_lbl(String value) {
		setConstString(offset + 215, $disp_num006_lbl, value);
	}


	public String disp_num007_lbl() {
		return getConstString(offset + 216, $disp_num007_lbl);
	}

	public void disp_num007_lbl(String value) {
		setConstString(offset + 216, $disp_num007_lbl, value);
	}


	public String disp_num008_lbl() {
		return getConstString(offset + 217, $disp_num008_lbl);
	}

	public void disp_num008_lbl(String value) {
		setConstString(offset + 217, $disp_num008_lbl, value);
	}


	public String disp_num009_lbl() {
		return getConstString(offset + 218, $disp_num009_lbl);
	}

	public void disp_num009_lbl(String value) {
		setConstString(offset + 218, $disp_num009_lbl, value);
	}


	public String disp_num010_lbl() {
		return getConstString(offset + 219, $disp_num010_lbl);
	}

	public void disp_num010_lbl(String value) {
		setConstString(offset + 219, $disp_num010_lbl, value);
	}


	public String add_col_lbl() {
		return getConstString(offset + 220, $add_col_lbl);
	}

	public void add_col_lbl(String value) {
		setConstString(offset + 220, $add_col_lbl, value);
	}


	public String add_col_typ() {
		return getConstString(offset + 221, $add_col_typ);
	}

	public void add_col_typ(String value) {
		setConstString(offset + 221, $add_col_typ, value);
	}


	public String add_col_nm() {
		return getConstString(offset + 222, $add_col_nm);
	}

	public void add_col_nm(String value) {
		setConstString(offset + 222, $add_col_nm, value);
	}


	public String sort_info() {
		return getConstString(offset + 223, $sort_info);
	}

	public void sort_info(String value) {
		setConstString(offset + 223, $sort_info, value);
	}


	public String getString(String name) {
		if ($disp_str001_lbl.equalsIgnoreCase(name)) {
			return disp_str001_lbl();
		}
		if ($disp_str002_lbl.equalsIgnoreCase(name)) {
			return disp_str002_lbl();
		}
		if ($disp_str003_lbl.equalsIgnoreCase(name)) {
			return disp_str003_lbl();
		}
		if ($disp_str004_lbl.equalsIgnoreCase(name)) {
			return disp_str004_lbl();
		}
		if ($disp_str005_lbl.equalsIgnoreCase(name)) {
			return disp_str005_lbl();
		}
		if ($disp_str006_lbl.equalsIgnoreCase(name)) {
			return disp_str006_lbl();
		}
		if ($disp_str007_lbl.equalsIgnoreCase(name)) {
			return disp_str007_lbl();
		}
		if ($disp_str008_lbl.equalsIgnoreCase(name)) {
			return disp_str008_lbl();
		}
		if ($disp_str009_lbl.equalsIgnoreCase(name)) {
			return disp_str009_lbl();
		}
		if ($disp_str010_lbl.equalsIgnoreCase(name)) {
			return disp_str010_lbl();
		}
		if ($disp_str011_lbl.equalsIgnoreCase(name)) {
			return disp_str011_lbl();
		}
		if ($disp_str012_lbl.equalsIgnoreCase(name)) {
			return disp_str012_lbl();
		}
		if ($disp_str013_lbl.equalsIgnoreCase(name)) {
			return disp_str013_lbl();
		}
		if ($disp_str014_lbl.equalsIgnoreCase(name)) {
			return disp_str014_lbl();
		}
		if ($disp_str015_lbl.equalsIgnoreCase(name)) {
			return disp_str015_lbl();
		}
		if ($disp_str016_lbl.equalsIgnoreCase(name)) {
			return disp_str016_lbl();
		}
		if ($disp_str017_lbl.equalsIgnoreCase(name)) {
			return disp_str017_lbl();
		}
		if ($disp_str018_lbl.equalsIgnoreCase(name)) {
			return disp_str018_lbl();
		}
		if ($disp_str019_lbl.equalsIgnoreCase(name)) {
			return disp_str019_lbl();
		}
		if ($disp_str020_lbl.equalsIgnoreCase(name)) {
			return disp_str020_lbl();
		}
		if ($disp_str021_lbl.equalsIgnoreCase(name)) {
			return disp_str021_lbl();
		}
		if ($disp_str022_lbl.equalsIgnoreCase(name)) {
			return disp_str022_lbl();
		}
		if ($disp_str023_lbl.equalsIgnoreCase(name)) {
			return disp_str023_lbl();
		}
		if ($disp_str024_lbl.equalsIgnoreCase(name)) {
			return disp_str024_lbl();
		}
		if ($disp_str025_lbl.equalsIgnoreCase(name)) {
			return disp_str025_lbl();
		}
		if ($disp_str026_lbl.equalsIgnoreCase(name)) {
			return disp_str026_lbl();
		}
		if ($disp_str027_lbl.equalsIgnoreCase(name)) {
			return disp_str027_lbl();
		}
		if ($disp_str028_lbl.equalsIgnoreCase(name)) {
			return disp_str028_lbl();
		}
		if ($disp_str029_lbl.equalsIgnoreCase(name)) {
			return disp_str029_lbl();
		}
		if ($disp_str030_lbl.equalsIgnoreCase(name)) {
			return disp_str030_lbl();
		}
		if ($disp_str031_lbl.equalsIgnoreCase(name)) {
			return disp_str031_lbl();
		}
		if ($disp_str032_lbl.equalsIgnoreCase(name)) {
			return disp_str032_lbl();
		}
		if ($disp_str033_lbl.equalsIgnoreCase(name)) {
			return disp_str033_lbl();
		}
		if ($disp_str034_lbl.equalsIgnoreCase(name)) {
			return disp_str034_lbl();
		}
		if ($disp_str035_lbl.equalsIgnoreCase(name)) {
			return disp_str035_lbl();
		}
		if ($disp_str036_lbl.equalsIgnoreCase(name)) {
			return disp_str036_lbl();
		}
		if ($disp_str037_lbl.equalsIgnoreCase(name)) {
			return disp_str037_lbl();
		}
		if ($disp_str038_lbl.equalsIgnoreCase(name)) {
			return disp_str038_lbl();
		}
		if ($disp_str039_lbl.equalsIgnoreCase(name)) {
			return disp_str039_lbl();
		}
		if ($disp_str040_lbl.equalsIgnoreCase(name)) {
			return disp_str040_lbl();
		}
		if ($disp_str041_lbl.equalsIgnoreCase(name)) {
			return disp_str041_lbl();
		}
		if ($disp_str042_lbl.equalsIgnoreCase(name)) {
			return disp_str042_lbl();
		}
		if ($disp_str043_lbl.equalsIgnoreCase(name)) {
			return disp_str043_lbl();
		}
		if ($disp_str044_lbl.equalsIgnoreCase(name)) {
			return disp_str044_lbl();
		}
		if ($disp_str045_lbl.equalsIgnoreCase(name)) {
			return disp_str045_lbl();
		}
		if ($disp_str046_lbl.equalsIgnoreCase(name)) {
			return disp_str046_lbl();
		}
		if ($disp_str047_lbl.equalsIgnoreCase(name)) {
			return disp_str047_lbl();
		}
		if ($disp_str048_lbl.equalsIgnoreCase(name)) {
			return disp_str048_lbl();
		}
		if ($disp_str049_lbl.equalsIgnoreCase(name)) {
			return disp_str049_lbl();
		}
		if ($disp_str050_lbl.equalsIgnoreCase(name)) {
			return disp_str050_lbl();
		}
		if ($disp_str051_lbl.equalsIgnoreCase(name)) {
			return disp_str051_lbl();
		}
		if ($disp_str052_lbl.equalsIgnoreCase(name)) {
			return disp_str052_lbl();
		}
		if ($disp_str053_lbl.equalsIgnoreCase(name)) {
			return disp_str053_lbl();
		}
		if ($disp_str054_lbl.equalsIgnoreCase(name)) {
			return disp_str054_lbl();
		}
		if ($disp_str055_lbl.equalsIgnoreCase(name)) {
			return disp_str055_lbl();
		}
		if ($disp_str056_lbl.equalsIgnoreCase(name)) {
			return disp_str056_lbl();
		}
		if ($disp_str057_lbl.equalsIgnoreCase(name)) {
			return disp_str057_lbl();
		}
		if ($disp_str058_lbl.equalsIgnoreCase(name)) {
			return disp_str058_lbl();
		}
		if ($disp_str059_lbl.equalsIgnoreCase(name)) {
			return disp_str059_lbl();
		}
		if ($disp_str060_lbl.equalsIgnoreCase(name)) {
			return disp_str060_lbl();
		}
		if ($disp_str061_lbl.equalsIgnoreCase(name)) {
			return disp_str061_lbl();
		}
		if ($disp_str062_lbl.equalsIgnoreCase(name)) {
			return disp_str062_lbl();
		}
		if ($disp_str063_lbl.equalsIgnoreCase(name)) {
			return disp_str063_lbl();
		}
		if ($disp_str064_lbl.equalsIgnoreCase(name)) {
			return disp_str064_lbl();
		}
		if ($disp_str065_lbl.equalsIgnoreCase(name)) {
			return disp_str065_lbl();
		}
		if ($disp_str066_lbl.equalsIgnoreCase(name)) {
			return disp_str066_lbl();
		}
		if ($disp_str067_lbl.equalsIgnoreCase(name)) {
			return disp_str067_lbl();
		}
		if ($disp_str068_lbl.equalsIgnoreCase(name)) {
			return disp_str068_lbl();
		}
		if ($disp_str069_lbl.equalsIgnoreCase(name)) {
			return disp_str069_lbl();
		}
		if ($disp_str070_lbl.equalsIgnoreCase(name)) {
			return disp_str070_lbl();
		}
		if ($disp_str071_lbl.equalsIgnoreCase(name)) {
			return disp_str071_lbl();
		}
		if ($disp_str072_lbl.equalsIgnoreCase(name)) {
			return disp_str072_lbl();
		}
		if ($disp_str073_lbl.equalsIgnoreCase(name)) {
			return disp_str073_lbl();
		}
		if ($disp_str074_lbl.equalsIgnoreCase(name)) {
			return disp_str074_lbl();
		}
		if ($disp_str075_lbl.equalsIgnoreCase(name)) {
			return disp_str075_lbl();
		}
		if ($disp_str076_lbl.equalsIgnoreCase(name)) {
			return disp_str076_lbl();
		}
		if ($disp_str077_lbl.equalsIgnoreCase(name)) {
			return disp_str077_lbl();
		}
		if ($disp_str078_lbl.equalsIgnoreCase(name)) {
			return disp_str078_lbl();
		}
		if ($disp_str079_lbl.equalsIgnoreCase(name)) {
			return disp_str079_lbl();
		}
		if ($disp_str080_lbl.equalsIgnoreCase(name)) {
			return disp_str080_lbl();
		}
		if ($disp_str081_lbl.equalsIgnoreCase(name)) {
			return disp_str081_lbl();
		}
		if ($disp_str082_lbl.equalsIgnoreCase(name)) {
			return disp_str082_lbl();
		}
		if ($disp_str083_lbl.equalsIgnoreCase(name)) {
			return disp_str083_lbl();
		}
		if ($disp_str084_lbl.equalsIgnoreCase(name)) {
			return disp_str084_lbl();
		}
		if ($disp_str085_lbl.equalsIgnoreCase(name)) {
			return disp_str085_lbl();
		}
		if ($disp_str086_lbl.equalsIgnoreCase(name)) {
			return disp_str086_lbl();
		}
		if ($disp_str087_lbl.equalsIgnoreCase(name)) {
			return disp_str087_lbl();
		}
		if ($disp_str088_lbl.equalsIgnoreCase(name)) {
			return disp_str088_lbl();
		}
		if ($disp_str089_lbl.equalsIgnoreCase(name)) {
			return disp_str089_lbl();
		}
		if ($disp_str090_lbl.equalsIgnoreCase(name)) {
			return disp_str090_lbl();
		}
		if ($disp_str091_lbl.equalsIgnoreCase(name)) {
			return disp_str091_lbl();
		}
		if ($disp_str092_lbl.equalsIgnoreCase(name)) {
			return disp_str092_lbl();
		}
		if ($disp_str093_lbl.equalsIgnoreCase(name)) {
			return disp_str093_lbl();
		}
		if ($disp_str094_lbl.equalsIgnoreCase(name)) {
			return disp_str094_lbl();
		}
		if ($disp_str095_lbl.equalsIgnoreCase(name)) {
			return disp_str095_lbl();
		}
		if ($disp_str096_lbl.equalsIgnoreCase(name)) {
			return disp_str096_lbl();
		}
		if ($disp_str097_lbl.equalsIgnoreCase(name)) {
			return disp_str097_lbl();
		}
		if ($disp_str098_lbl.equalsIgnoreCase(name)) {
			return disp_str098_lbl();
		}
		if ($disp_str099_lbl.equalsIgnoreCase(name)) {
			return disp_str099_lbl();
		}
		if ($disp_str100_lbl.equalsIgnoreCase(name)) {
			return disp_str100_lbl();
		}
		if ($disp_str101_lbl.equalsIgnoreCase(name)) {
			return disp_str101_lbl();
		}
		if ($disp_str102_lbl.equalsIgnoreCase(name)) {
			return disp_str102_lbl();
		}
		if ($disp_str103_lbl.equalsIgnoreCase(name)) {
			return disp_str103_lbl();
		}
		if ($disp_str104_lbl.equalsIgnoreCase(name)) {
			return disp_str104_lbl();
		}
		if ($disp_str105_lbl.equalsIgnoreCase(name)) {
			return disp_str105_lbl();
		}
		if ($disp_str106_lbl.equalsIgnoreCase(name)) {
			return disp_str106_lbl();
		}
		if ($disp_str107_lbl.equalsIgnoreCase(name)) {
			return disp_str107_lbl();
		}
		if ($disp_str108_lbl.equalsIgnoreCase(name)) {
			return disp_str108_lbl();
		}
		if ($disp_str109_lbl.equalsIgnoreCase(name)) {
			return disp_str109_lbl();
		}
		if ($disp_str110_lbl.equalsIgnoreCase(name)) {
			return disp_str110_lbl();
		}
		if ($disp_str111_lbl.equalsIgnoreCase(name)) {
			return disp_str111_lbl();
		}
		if ($disp_str112_lbl.equalsIgnoreCase(name)) {
			return disp_str112_lbl();
		}
		if ($disp_str113_lbl.equalsIgnoreCase(name)) {
			return disp_str113_lbl();
		}
		if ($disp_str114_lbl.equalsIgnoreCase(name)) {
			return disp_str114_lbl();
		}
		if ($disp_str115_lbl.equalsIgnoreCase(name)) {
			return disp_str115_lbl();
		}
		if ($disp_str116_lbl.equalsIgnoreCase(name)) {
			return disp_str116_lbl();
		}
		if ($disp_str117_lbl.equalsIgnoreCase(name)) {
			return disp_str117_lbl();
		}
		if ($disp_str118_lbl.equalsIgnoreCase(name)) {
			return disp_str118_lbl();
		}
		if ($disp_str119_lbl.equalsIgnoreCase(name)) {
			return disp_str119_lbl();
		}
		if ($disp_str120_lbl.equalsIgnoreCase(name)) {
			return disp_str120_lbl();
		}
		if ($disp_str121_lbl.equalsIgnoreCase(name)) {
			return disp_str121_lbl();
		}
		if ($disp_str122_lbl.equalsIgnoreCase(name)) {
			return disp_str122_lbl();
		}
		if ($disp_str123_lbl.equalsIgnoreCase(name)) {
			return disp_str123_lbl();
		}
		if ($disp_str124_lbl.equalsIgnoreCase(name)) {
			return disp_str124_lbl();
		}
		if ($disp_str125_lbl.equalsIgnoreCase(name)) {
			return disp_str125_lbl();
		}
		if ($disp_str126_lbl.equalsIgnoreCase(name)) {
			return disp_str126_lbl();
		}
		if ($disp_str127_lbl.equalsIgnoreCase(name)) {
			return disp_str127_lbl();
		}
		if ($disp_str128_lbl.equalsIgnoreCase(name)) {
			return disp_str128_lbl();
		}
		if ($disp_str129_lbl.equalsIgnoreCase(name)) {
			return disp_str129_lbl();
		}
		if ($disp_str130_lbl.equalsIgnoreCase(name)) {
			return disp_str130_lbl();
		}
		if ($disp_str131_lbl.equalsIgnoreCase(name)) {
			return disp_str131_lbl();
		}
		if ($disp_str132_lbl.equalsIgnoreCase(name)) {
			return disp_str132_lbl();
		}
		if ($disp_str133_lbl.equalsIgnoreCase(name)) {
			return disp_str133_lbl();
		}
		if ($disp_str134_lbl.equalsIgnoreCase(name)) {
			return disp_str134_lbl();
		}
		if ($disp_str135_lbl.equalsIgnoreCase(name)) {
			return disp_str135_lbl();
		}
		if ($disp_str136_lbl.equalsIgnoreCase(name)) {
			return disp_str136_lbl();
		}
		if ($disp_str137_lbl.equalsIgnoreCase(name)) {
			return disp_str137_lbl();
		}
		if ($disp_str138_lbl.equalsIgnoreCase(name)) {
			return disp_str138_lbl();
		}
		if ($disp_str139_lbl.equalsIgnoreCase(name)) {
			return disp_str139_lbl();
		}
		if ($disp_str140_lbl.equalsIgnoreCase(name)) {
			return disp_str140_lbl();
		}
		if ($disp_str141_lbl.equalsIgnoreCase(name)) {
			return disp_str141_lbl();
		}
		if ($disp_str142_lbl.equalsIgnoreCase(name)) {
			return disp_str142_lbl();
		}
		if ($disp_str143_lbl.equalsIgnoreCase(name)) {
			return disp_str143_lbl();
		}
		if ($disp_str144_lbl.equalsIgnoreCase(name)) {
			return disp_str144_lbl();
		}
		if ($disp_str145_lbl.equalsIgnoreCase(name)) {
			return disp_str145_lbl();
		}
		if ($disp_str146_lbl.equalsIgnoreCase(name)) {
			return disp_str146_lbl();
		}
		if ($disp_str147_lbl.equalsIgnoreCase(name)) {
			return disp_str147_lbl();
		}
		if ($disp_str148_lbl.equalsIgnoreCase(name)) {
			return disp_str148_lbl();
		}
		if ($disp_str149_lbl.equalsIgnoreCase(name)) {
			return disp_str149_lbl();
		}
		if ($disp_str150_lbl.equalsIgnoreCase(name)) {
			return disp_str150_lbl();
		}
		if ($disp_str151_lbl.equalsIgnoreCase(name)) {
			return disp_str151_lbl();
		}
		if ($disp_str152_lbl.equalsIgnoreCase(name)) {
			return disp_str152_lbl();
		}
		if ($disp_str153_lbl.equalsIgnoreCase(name)) {
			return disp_str153_lbl();
		}
		if ($disp_str154_lbl.equalsIgnoreCase(name)) {
			return disp_str154_lbl();
		}
		if ($disp_str155_lbl.equalsIgnoreCase(name)) {
			return disp_str155_lbl();
		}
		if ($disp_str156_lbl.equalsIgnoreCase(name)) {
			return disp_str156_lbl();
		}
		if ($disp_str157_lbl.equalsIgnoreCase(name)) {
			return disp_str157_lbl();
		}
		if ($disp_str158_lbl.equalsIgnoreCase(name)) {
			return disp_str158_lbl();
		}
		if ($disp_str159_lbl.equalsIgnoreCase(name)) {
			return disp_str159_lbl();
		}
		if ($disp_str160_lbl.equalsIgnoreCase(name)) {
			return disp_str160_lbl();
		}
		if ($disp_str161_lbl.equalsIgnoreCase(name)) {
			return disp_str161_lbl();
		}
		if ($disp_str162_lbl.equalsIgnoreCase(name)) {
			return disp_str162_lbl();
		}
		if ($disp_str163_lbl.equalsIgnoreCase(name)) {
			return disp_str163_lbl();
		}
		if ($disp_str164_lbl.equalsIgnoreCase(name)) {
			return disp_str164_lbl();
		}
		if ($disp_str165_lbl.equalsIgnoreCase(name)) {
			return disp_str165_lbl();
		}
		if ($disp_str166_lbl.equalsIgnoreCase(name)) {
			return disp_str166_lbl();
		}
		if ($disp_str167_lbl.equalsIgnoreCase(name)) {
			return disp_str167_lbl();
		}
		if ($disp_str168_lbl.equalsIgnoreCase(name)) {
			return disp_str168_lbl();
		}
		if ($disp_str169_lbl.equalsIgnoreCase(name)) {
			return disp_str169_lbl();
		}
		if ($disp_str170_lbl.equalsIgnoreCase(name)) {
			return disp_str170_lbl();
		}
		if ($disp_str171_lbl.equalsIgnoreCase(name)) {
			return disp_str171_lbl();
		}
		if ($disp_str172_lbl.equalsIgnoreCase(name)) {
			return disp_str172_lbl();
		}
		if ($disp_str173_lbl.equalsIgnoreCase(name)) {
			return disp_str173_lbl();
		}
		if ($disp_str174_lbl.equalsIgnoreCase(name)) {
			return disp_str174_lbl();
		}
		if ($disp_str175_lbl.equalsIgnoreCase(name)) {
			return disp_str175_lbl();
		}
		if ($disp_str176_lbl.equalsIgnoreCase(name)) {
			return disp_str176_lbl();
		}
		if ($disp_str177_lbl.equalsIgnoreCase(name)) {
			return disp_str177_lbl();
		}
		if ($disp_str178_lbl.equalsIgnoreCase(name)) {
			return disp_str178_lbl();
		}
		if ($disp_str179_lbl.equalsIgnoreCase(name)) {
			return disp_str179_lbl();
		}
		if ($disp_str180_lbl.equalsIgnoreCase(name)) {
			return disp_str180_lbl();
		}
		if ($disp_str181_lbl.equalsIgnoreCase(name)) {
			return disp_str181_lbl();
		}
		if ($disp_str182_lbl.equalsIgnoreCase(name)) {
			return disp_str182_lbl();
		}
		if ($disp_str183_lbl.equalsIgnoreCase(name)) {
			return disp_str183_lbl();
		}
		if ($disp_str184_lbl.equalsIgnoreCase(name)) {
			return disp_str184_lbl();
		}
		if ($disp_str185_lbl.equalsIgnoreCase(name)) {
			return disp_str185_lbl();
		}
		if ($disp_str186_lbl.equalsIgnoreCase(name)) {
			return disp_str186_lbl();
		}
		if ($disp_str187_lbl.equalsIgnoreCase(name)) {
			return disp_str187_lbl();
		}
		if ($disp_str188_lbl.equalsIgnoreCase(name)) {
			return disp_str188_lbl();
		}
		if ($disp_str189_lbl.equalsIgnoreCase(name)) {
			return disp_str189_lbl();
		}
		if ($disp_str190_lbl.equalsIgnoreCase(name)) {
			return disp_str190_lbl();
		}
		if ($disp_str191_lbl.equalsIgnoreCase(name)) {
			return disp_str191_lbl();
		}
		if ($disp_str192_lbl.equalsIgnoreCase(name)) {
			return disp_str192_lbl();
		}
		if ($disp_str193_lbl.equalsIgnoreCase(name)) {
			return disp_str193_lbl();
		}
		if ($disp_str194_lbl.equalsIgnoreCase(name)) {
			return disp_str194_lbl();
		}
		if ($disp_str195_lbl.equalsIgnoreCase(name)) {
			return disp_str195_lbl();
		}
		if ($disp_str196_lbl.equalsIgnoreCase(name)) {
			return disp_str196_lbl();
		}
		if ($disp_str197_lbl.equalsIgnoreCase(name)) {
			return disp_str197_lbl();
		}
		if ($disp_str198_lbl.equalsIgnoreCase(name)) {
			return disp_str198_lbl();
		}
		if ($disp_str199_lbl.equalsIgnoreCase(name)) {
			return disp_str199_lbl();
		}
		if ($disp_str200_lbl.equalsIgnoreCase(name)) {
			return disp_str200_lbl();
		}
		if ($disp_dt001_lbl.equalsIgnoreCase(name)) {
			return disp_dt001_lbl();
		}
		if ($disp_dt002_lbl.equalsIgnoreCase(name)) {
			return disp_dt002_lbl();
		}
		if ($disp_dt003_lbl.equalsIgnoreCase(name)) {
			return disp_dt003_lbl();
		}
		if ($disp_dt004_lbl.equalsIgnoreCase(name)) {
			return disp_dt004_lbl();
		}
		if ($disp_dt005_lbl.equalsIgnoreCase(name)) {
			return disp_dt005_lbl();
		}
		if ($disp_dt006_lbl.equalsIgnoreCase(name)) {
			return disp_dt006_lbl();
		}
		if ($disp_dt007_lbl.equalsIgnoreCase(name)) {
			return disp_dt007_lbl();
		}
		if ($disp_dt008_lbl.equalsIgnoreCase(name)) {
			return disp_dt008_lbl();
		}
		if ($disp_dt009_lbl.equalsIgnoreCase(name)) {
			return disp_dt009_lbl();
		}
		if ($disp_dt010_lbl.equalsIgnoreCase(name)) {
			return disp_dt010_lbl();
		}
		if ($disp_num001_lbl.equalsIgnoreCase(name)) {
			return disp_num001_lbl();
		}
		if ($disp_num002_lbl.equalsIgnoreCase(name)) {
			return disp_num002_lbl();
		}
		if ($disp_num003_lbl.equalsIgnoreCase(name)) {
			return disp_num003_lbl();
		}
		if ($disp_num004_lbl.equalsIgnoreCase(name)) {
			return disp_num004_lbl();
		}
		if ($disp_num005_lbl.equalsIgnoreCase(name)) {
			return disp_num005_lbl();
		}
		if ($disp_num006_lbl.equalsIgnoreCase(name)) {
			return disp_num006_lbl();
		}
		if ($disp_num007_lbl.equalsIgnoreCase(name)) {
			return disp_num007_lbl();
		}
		if ($disp_num008_lbl.equalsIgnoreCase(name)) {
			return disp_num008_lbl();
		}
		if ($disp_num009_lbl.equalsIgnoreCase(name)) {
			return disp_num009_lbl();
		}
		if ($disp_num010_lbl.equalsIgnoreCase(name)) {
			return disp_num010_lbl();
		}
		if ($add_col_lbl.equalsIgnoreCase(name)) {
			return add_col_lbl();
		}
		if ($add_col_typ.equalsIgnoreCase(name)) {
			return add_col_typ();
		}
		if ($add_col_nm.equalsIgnoreCase(name)) {
			return add_col_nm();
		}
		if ($sort_info.equalsIgnoreCase(name)) {
			return sort_info();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($disp_str001_lbl.equalsIgnoreCase(name)) {
			return disp_str001_lbl();
		}
		if ($disp_str002_lbl.equalsIgnoreCase(name)) {
			return disp_str002_lbl();
		}
		if ($disp_str003_lbl.equalsIgnoreCase(name)) {
			return disp_str003_lbl();
		}
		if ($disp_str004_lbl.equalsIgnoreCase(name)) {
			return disp_str004_lbl();
		}
		if ($disp_str005_lbl.equalsIgnoreCase(name)) {
			return disp_str005_lbl();
		}
		if ($disp_str006_lbl.equalsIgnoreCase(name)) {
			return disp_str006_lbl();
		}
		if ($disp_str007_lbl.equalsIgnoreCase(name)) {
			return disp_str007_lbl();
		}
		if ($disp_str008_lbl.equalsIgnoreCase(name)) {
			return disp_str008_lbl();
		}
		if ($disp_str009_lbl.equalsIgnoreCase(name)) {
			return disp_str009_lbl();
		}
		if ($disp_str010_lbl.equalsIgnoreCase(name)) {
			return disp_str010_lbl();
		}
		if ($disp_str011_lbl.equalsIgnoreCase(name)) {
			return disp_str011_lbl();
		}
		if ($disp_str012_lbl.equalsIgnoreCase(name)) {
			return disp_str012_lbl();
		}
		if ($disp_str013_lbl.equalsIgnoreCase(name)) {
			return disp_str013_lbl();
		}
		if ($disp_str014_lbl.equalsIgnoreCase(name)) {
			return disp_str014_lbl();
		}
		if ($disp_str015_lbl.equalsIgnoreCase(name)) {
			return disp_str015_lbl();
		}
		if ($disp_str016_lbl.equalsIgnoreCase(name)) {
			return disp_str016_lbl();
		}
		if ($disp_str017_lbl.equalsIgnoreCase(name)) {
			return disp_str017_lbl();
		}
		if ($disp_str018_lbl.equalsIgnoreCase(name)) {
			return disp_str018_lbl();
		}
		if ($disp_str019_lbl.equalsIgnoreCase(name)) {
			return disp_str019_lbl();
		}
		if ($disp_str020_lbl.equalsIgnoreCase(name)) {
			return disp_str020_lbl();
		}
		if ($disp_str021_lbl.equalsIgnoreCase(name)) {
			return disp_str021_lbl();
		}
		if ($disp_str022_lbl.equalsIgnoreCase(name)) {
			return disp_str022_lbl();
		}
		if ($disp_str023_lbl.equalsIgnoreCase(name)) {
			return disp_str023_lbl();
		}
		if ($disp_str024_lbl.equalsIgnoreCase(name)) {
			return disp_str024_lbl();
		}
		if ($disp_str025_lbl.equalsIgnoreCase(name)) {
			return disp_str025_lbl();
		}
		if ($disp_str026_lbl.equalsIgnoreCase(name)) {
			return disp_str026_lbl();
		}
		if ($disp_str027_lbl.equalsIgnoreCase(name)) {
			return disp_str027_lbl();
		}
		if ($disp_str028_lbl.equalsIgnoreCase(name)) {
			return disp_str028_lbl();
		}
		if ($disp_str029_lbl.equalsIgnoreCase(name)) {
			return disp_str029_lbl();
		}
		if ($disp_str030_lbl.equalsIgnoreCase(name)) {
			return disp_str030_lbl();
		}
		if ($disp_str031_lbl.equalsIgnoreCase(name)) {
			return disp_str031_lbl();
		}
		if ($disp_str032_lbl.equalsIgnoreCase(name)) {
			return disp_str032_lbl();
		}
		if ($disp_str033_lbl.equalsIgnoreCase(name)) {
			return disp_str033_lbl();
		}
		if ($disp_str034_lbl.equalsIgnoreCase(name)) {
			return disp_str034_lbl();
		}
		if ($disp_str035_lbl.equalsIgnoreCase(name)) {
			return disp_str035_lbl();
		}
		if ($disp_str036_lbl.equalsIgnoreCase(name)) {
			return disp_str036_lbl();
		}
		if ($disp_str037_lbl.equalsIgnoreCase(name)) {
			return disp_str037_lbl();
		}
		if ($disp_str038_lbl.equalsIgnoreCase(name)) {
			return disp_str038_lbl();
		}
		if ($disp_str039_lbl.equalsIgnoreCase(name)) {
			return disp_str039_lbl();
		}
		if ($disp_str040_lbl.equalsIgnoreCase(name)) {
			return disp_str040_lbl();
		}
		if ($disp_str041_lbl.equalsIgnoreCase(name)) {
			return disp_str041_lbl();
		}
		if ($disp_str042_lbl.equalsIgnoreCase(name)) {
			return disp_str042_lbl();
		}
		if ($disp_str043_lbl.equalsIgnoreCase(name)) {
			return disp_str043_lbl();
		}
		if ($disp_str044_lbl.equalsIgnoreCase(name)) {
			return disp_str044_lbl();
		}
		if ($disp_str045_lbl.equalsIgnoreCase(name)) {
			return disp_str045_lbl();
		}
		if ($disp_str046_lbl.equalsIgnoreCase(name)) {
			return disp_str046_lbl();
		}
		if ($disp_str047_lbl.equalsIgnoreCase(name)) {
			return disp_str047_lbl();
		}
		if ($disp_str048_lbl.equalsIgnoreCase(name)) {
			return disp_str048_lbl();
		}
		if ($disp_str049_lbl.equalsIgnoreCase(name)) {
			return disp_str049_lbl();
		}
		if ($disp_str050_lbl.equalsIgnoreCase(name)) {
			return disp_str050_lbl();
		}
		if ($disp_str051_lbl.equalsIgnoreCase(name)) {
			return disp_str051_lbl();
		}
		if ($disp_str052_lbl.equalsIgnoreCase(name)) {
			return disp_str052_lbl();
		}
		if ($disp_str053_lbl.equalsIgnoreCase(name)) {
			return disp_str053_lbl();
		}
		if ($disp_str054_lbl.equalsIgnoreCase(name)) {
			return disp_str054_lbl();
		}
		if ($disp_str055_lbl.equalsIgnoreCase(name)) {
			return disp_str055_lbl();
		}
		if ($disp_str056_lbl.equalsIgnoreCase(name)) {
			return disp_str056_lbl();
		}
		if ($disp_str057_lbl.equalsIgnoreCase(name)) {
			return disp_str057_lbl();
		}
		if ($disp_str058_lbl.equalsIgnoreCase(name)) {
			return disp_str058_lbl();
		}
		if ($disp_str059_lbl.equalsIgnoreCase(name)) {
			return disp_str059_lbl();
		}
		if ($disp_str060_lbl.equalsIgnoreCase(name)) {
			return disp_str060_lbl();
		}
		if ($disp_str061_lbl.equalsIgnoreCase(name)) {
			return disp_str061_lbl();
		}
		if ($disp_str062_lbl.equalsIgnoreCase(name)) {
			return disp_str062_lbl();
		}
		if ($disp_str063_lbl.equalsIgnoreCase(name)) {
			return disp_str063_lbl();
		}
		if ($disp_str064_lbl.equalsIgnoreCase(name)) {
			return disp_str064_lbl();
		}
		if ($disp_str065_lbl.equalsIgnoreCase(name)) {
			return disp_str065_lbl();
		}
		if ($disp_str066_lbl.equalsIgnoreCase(name)) {
			return disp_str066_lbl();
		}
		if ($disp_str067_lbl.equalsIgnoreCase(name)) {
			return disp_str067_lbl();
		}
		if ($disp_str068_lbl.equalsIgnoreCase(name)) {
			return disp_str068_lbl();
		}
		if ($disp_str069_lbl.equalsIgnoreCase(name)) {
			return disp_str069_lbl();
		}
		if ($disp_str070_lbl.equalsIgnoreCase(name)) {
			return disp_str070_lbl();
		}
		if ($disp_str071_lbl.equalsIgnoreCase(name)) {
			return disp_str071_lbl();
		}
		if ($disp_str072_lbl.equalsIgnoreCase(name)) {
			return disp_str072_lbl();
		}
		if ($disp_str073_lbl.equalsIgnoreCase(name)) {
			return disp_str073_lbl();
		}
		if ($disp_str074_lbl.equalsIgnoreCase(name)) {
			return disp_str074_lbl();
		}
		if ($disp_str075_lbl.equalsIgnoreCase(name)) {
			return disp_str075_lbl();
		}
		if ($disp_str076_lbl.equalsIgnoreCase(name)) {
			return disp_str076_lbl();
		}
		if ($disp_str077_lbl.equalsIgnoreCase(name)) {
			return disp_str077_lbl();
		}
		if ($disp_str078_lbl.equalsIgnoreCase(name)) {
			return disp_str078_lbl();
		}
		if ($disp_str079_lbl.equalsIgnoreCase(name)) {
			return disp_str079_lbl();
		}
		if ($disp_str080_lbl.equalsIgnoreCase(name)) {
			return disp_str080_lbl();
		}
		if ($disp_str081_lbl.equalsIgnoreCase(name)) {
			return disp_str081_lbl();
		}
		if ($disp_str082_lbl.equalsIgnoreCase(name)) {
			return disp_str082_lbl();
		}
		if ($disp_str083_lbl.equalsIgnoreCase(name)) {
			return disp_str083_lbl();
		}
		if ($disp_str084_lbl.equalsIgnoreCase(name)) {
			return disp_str084_lbl();
		}
		if ($disp_str085_lbl.equalsIgnoreCase(name)) {
			return disp_str085_lbl();
		}
		if ($disp_str086_lbl.equalsIgnoreCase(name)) {
			return disp_str086_lbl();
		}
		if ($disp_str087_lbl.equalsIgnoreCase(name)) {
			return disp_str087_lbl();
		}
		if ($disp_str088_lbl.equalsIgnoreCase(name)) {
			return disp_str088_lbl();
		}
		if ($disp_str089_lbl.equalsIgnoreCase(name)) {
			return disp_str089_lbl();
		}
		if ($disp_str090_lbl.equalsIgnoreCase(name)) {
			return disp_str090_lbl();
		}
		if ($disp_str091_lbl.equalsIgnoreCase(name)) {
			return disp_str091_lbl();
		}
		if ($disp_str092_lbl.equalsIgnoreCase(name)) {
			return disp_str092_lbl();
		}
		if ($disp_str093_lbl.equalsIgnoreCase(name)) {
			return disp_str093_lbl();
		}
		if ($disp_str094_lbl.equalsIgnoreCase(name)) {
			return disp_str094_lbl();
		}
		if ($disp_str095_lbl.equalsIgnoreCase(name)) {
			return disp_str095_lbl();
		}
		if ($disp_str096_lbl.equalsIgnoreCase(name)) {
			return disp_str096_lbl();
		}
		if ($disp_str097_lbl.equalsIgnoreCase(name)) {
			return disp_str097_lbl();
		}
		if ($disp_str098_lbl.equalsIgnoreCase(name)) {
			return disp_str098_lbl();
		}
		if ($disp_str099_lbl.equalsIgnoreCase(name)) {
			return disp_str099_lbl();
		}
		if ($disp_str100_lbl.equalsIgnoreCase(name)) {
			return disp_str100_lbl();
		}
		if ($disp_str101_lbl.equalsIgnoreCase(name)) {
			return disp_str101_lbl();
		}
		if ($disp_str102_lbl.equalsIgnoreCase(name)) {
			return disp_str102_lbl();
		}
		if ($disp_str103_lbl.equalsIgnoreCase(name)) {
			return disp_str103_lbl();
		}
		if ($disp_str104_lbl.equalsIgnoreCase(name)) {
			return disp_str104_lbl();
		}
		if ($disp_str105_lbl.equalsIgnoreCase(name)) {
			return disp_str105_lbl();
		}
		if ($disp_str106_lbl.equalsIgnoreCase(name)) {
			return disp_str106_lbl();
		}
		if ($disp_str107_lbl.equalsIgnoreCase(name)) {
			return disp_str107_lbl();
		}
		if ($disp_str108_lbl.equalsIgnoreCase(name)) {
			return disp_str108_lbl();
		}
		if ($disp_str109_lbl.equalsIgnoreCase(name)) {
			return disp_str109_lbl();
		}
		if ($disp_str110_lbl.equalsIgnoreCase(name)) {
			return disp_str110_lbl();
		}
		if ($disp_str111_lbl.equalsIgnoreCase(name)) {
			return disp_str111_lbl();
		}
		if ($disp_str112_lbl.equalsIgnoreCase(name)) {
			return disp_str112_lbl();
		}
		if ($disp_str113_lbl.equalsIgnoreCase(name)) {
			return disp_str113_lbl();
		}
		if ($disp_str114_lbl.equalsIgnoreCase(name)) {
			return disp_str114_lbl();
		}
		if ($disp_str115_lbl.equalsIgnoreCase(name)) {
			return disp_str115_lbl();
		}
		if ($disp_str116_lbl.equalsIgnoreCase(name)) {
			return disp_str116_lbl();
		}
		if ($disp_str117_lbl.equalsIgnoreCase(name)) {
			return disp_str117_lbl();
		}
		if ($disp_str118_lbl.equalsIgnoreCase(name)) {
			return disp_str118_lbl();
		}
		if ($disp_str119_lbl.equalsIgnoreCase(name)) {
			return disp_str119_lbl();
		}
		if ($disp_str120_lbl.equalsIgnoreCase(name)) {
			return disp_str120_lbl();
		}
		if ($disp_str121_lbl.equalsIgnoreCase(name)) {
			return disp_str121_lbl();
		}
		if ($disp_str122_lbl.equalsIgnoreCase(name)) {
			return disp_str122_lbl();
		}
		if ($disp_str123_lbl.equalsIgnoreCase(name)) {
			return disp_str123_lbl();
		}
		if ($disp_str124_lbl.equalsIgnoreCase(name)) {
			return disp_str124_lbl();
		}
		if ($disp_str125_lbl.equalsIgnoreCase(name)) {
			return disp_str125_lbl();
		}
		if ($disp_str126_lbl.equalsIgnoreCase(name)) {
			return disp_str126_lbl();
		}
		if ($disp_str127_lbl.equalsIgnoreCase(name)) {
			return disp_str127_lbl();
		}
		if ($disp_str128_lbl.equalsIgnoreCase(name)) {
			return disp_str128_lbl();
		}
		if ($disp_str129_lbl.equalsIgnoreCase(name)) {
			return disp_str129_lbl();
		}
		if ($disp_str130_lbl.equalsIgnoreCase(name)) {
			return disp_str130_lbl();
		}
		if ($disp_str131_lbl.equalsIgnoreCase(name)) {
			return disp_str131_lbl();
		}
		if ($disp_str132_lbl.equalsIgnoreCase(name)) {
			return disp_str132_lbl();
		}
		if ($disp_str133_lbl.equalsIgnoreCase(name)) {
			return disp_str133_lbl();
		}
		if ($disp_str134_lbl.equalsIgnoreCase(name)) {
			return disp_str134_lbl();
		}
		if ($disp_str135_lbl.equalsIgnoreCase(name)) {
			return disp_str135_lbl();
		}
		if ($disp_str136_lbl.equalsIgnoreCase(name)) {
			return disp_str136_lbl();
		}
		if ($disp_str137_lbl.equalsIgnoreCase(name)) {
			return disp_str137_lbl();
		}
		if ($disp_str138_lbl.equalsIgnoreCase(name)) {
			return disp_str138_lbl();
		}
		if ($disp_str139_lbl.equalsIgnoreCase(name)) {
			return disp_str139_lbl();
		}
		if ($disp_str140_lbl.equalsIgnoreCase(name)) {
			return disp_str140_lbl();
		}
		if ($disp_str141_lbl.equalsIgnoreCase(name)) {
			return disp_str141_lbl();
		}
		if ($disp_str142_lbl.equalsIgnoreCase(name)) {
			return disp_str142_lbl();
		}
		if ($disp_str143_lbl.equalsIgnoreCase(name)) {
			return disp_str143_lbl();
		}
		if ($disp_str144_lbl.equalsIgnoreCase(name)) {
			return disp_str144_lbl();
		}
		if ($disp_str145_lbl.equalsIgnoreCase(name)) {
			return disp_str145_lbl();
		}
		if ($disp_str146_lbl.equalsIgnoreCase(name)) {
			return disp_str146_lbl();
		}
		if ($disp_str147_lbl.equalsIgnoreCase(name)) {
			return disp_str147_lbl();
		}
		if ($disp_str148_lbl.equalsIgnoreCase(name)) {
			return disp_str148_lbl();
		}
		if ($disp_str149_lbl.equalsIgnoreCase(name)) {
			return disp_str149_lbl();
		}
		if ($disp_str150_lbl.equalsIgnoreCase(name)) {
			return disp_str150_lbl();
		}
		if ($disp_str151_lbl.equalsIgnoreCase(name)) {
			return disp_str151_lbl();
		}
		if ($disp_str152_lbl.equalsIgnoreCase(name)) {
			return disp_str152_lbl();
		}
		if ($disp_str153_lbl.equalsIgnoreCase(name)) {
			return disp_str153_lbl();
		}
		if ($disp_str154_lbl.equalsIgnoreCase(name)) {
			return disp_str154_lbl();
		}
		if ($disp_str155_lbl.equalsIgnoreCase(name)) {
			return disp_str155_lbl();
		}
		if ($disp_str156_lbl.equalsIgnoreCase(name)) {
			return disp_str156_lbl();
		}
		if ($disp_str157_lbl.equalsIgnoreCase(name)) {
			return disp_str157_lbl();
		}
		if ($disp_str158_lbl.equalsIgnoreCase(name)) {
			return disp_str158_lbl();
		}
		if ($disp_str159_lbl.equalsIgnoreCase(name)) {
			return disp_str159_lbl();
		}
		if ($disp_str160_lbl.equalsIgnoreCase(name)) {
			return disp_str160_lbl();
		}
		if ($disp_str161_lbl.equalsIgnoreCase(name)) {
			return disp_str161_lbl();
		}
		if ($disp_str162_lbl.equalsIgnoreCase(name)) {
			return disp_str162_lbl();
		}
		if ($disp_str163_lbl.equalsIgnoreCase(name)) {
			return disp_str163_lbl();
		}
		if ($disp_str164_lbl.equalsIgnoreCase(name)) {
			return disp_str164_lbl();
		}
		if ($disp_str165_lbl.equalsIgnoreCase(name)) {
			return disp_str165_lbl();
		}
		if ($disp_str166_lbl.equalsIgnoreCase(name)) {
			return disp_str166_lbl();
		}
		if ($disp_str167_lbl.equalsIgnoreCase(name)) {
			return disp_str167_lbl();
		}
		if ($disp_str168_lbl.equalsIgnoreCase(name)) {
			return disp_str168_lbl();
		}
		if ($disp_str169_lbl.equalsIgnoreCase(name)) {
			return disp_str169_lbl();
		}
		if ($disp_str170_lbl.equalsIgnoreCase(name)) {
			return disp_str170_lbl();
		}
		if ($disp_str171_lbl.equalsIgnoreCase(name)) {
			return disp_str171_lbl();
		}
		if ($disp_str172_lbl.equalsIgnoreCase(name)) {
			return disp_str172_lbl();
		}
		if ($disp_str173_lbl.equalsIgnoreCase(name)) {
			return disp_str173_lbl();
		}
		if ($disp_str174_lbl.equalsIgnoreCase(name)) {
			return disp_str174_lbl();
		}
		if ($disp_str175_lbl.equalsIgnoreCase(name)) {
			return disp_str175_lbl();
		}
		if ($disp_str176_lbl.equalsIgnoreCase(name)) {
			return disp_str176_lbl();
		}
		if ($disp_str177_lbl.equalsIgnoreCase(name)) {
			return disp_str177_lbl();
		}
		if ($disp_str178_lbl.equalsIgnoreCase(name)) {
			return disp_str178_lbl();
		}
		if ($disp_str179_lbl.equalsIgnoreCase(name)) {
			return disp_str179_lbl();
		}
		if ($disp_str180_lbl.equalsIgnoreCase(name)) {
			return disp_str180_lbl();
		}
		if ($disp_str181_lbl.equalsIgnoreCase(name)) {
			return disp_str181_lbl();
		}
		if ($disp_str182_lbl.equalsIgnoreCase(name)) {
			return disp_str182_lbl();
		}
		if ($disp_str183_lbl.equalsIgnoreCase(name)) {
			return disp_str183_lbl();
		}
		if ($disp_str184_lbl.equalsIgnoreCase(name)) {
			return disp_str184_lbl();
		}
		if ($disp_str185_lbl.equalsIgnoreCase(name)) {
			return disp_str185_lbl();
		}
		if ($disp_str186_lbl.equalsIgnoreCase(name)) {
			return disp_str186_lbl();
		}
		if ($disp_str187_lbl.equalsIgnoreCase(name)) {
			return disp_str187_lbl();
		}
		if ($disp_str188_lbl.equalsIgnoreCase(name)) {
			return disp_str188_lbl();
		}
		if ($disp_str189_lbl.equalsIgnoreCase(name)) {
			return disp_str189_lbl();
		}
		if ($disp_str190_lbl.equalsIgnoreCase(name)) {
			return disp_str190_lbl();
		}
		if ($disp_str191_lbl.equalsIgnoreCase(name)) {
			return disp_str191_lbl();
		}
		if ($disp_str192_lbl.equalsIgnoreCase(name)) {
			return disp_str192_lbl();
		}
		if ($disp_str193_lbl.equalsIgnoreCase(name)) {
			return disp_str193_lbl();
		}
		if ($disp_str194_lbl.equalsIgnoreCase(name)) {
			return disp_str194_lbl();
		}
		if ($disp_str195_lbl.equalsIgnoreCase(name)) {
			return disp_str195_lbl();
		}
		if ($disp_str196_lbl.equalsIgnoreCase(name)) {
			return disp_str196_lbl();
		}
		if ($disp_str197_lbl.equalsIgnoreCase(name)) {
			return disp_str197_lbl();
		}
		if ($disp_str198_lbl.equalsIgnoreCase(name)) {
			return disp_str198_lbl();
		}
		if ($disp_str199_lbl.equalsIgnoreCase(name)) {
			return disp_str199_lbl();
		}
		if ($disp_str200_lbl.equalsIgnoreCase(name)) {
			return disp_str200_lbl();
		}
		if ($disp_dt001_lbl.equalsIgnoreCase(name)) {
			return disp_dt001_lbl();
		}
		if ($disp_dt002_lbl.equalsIgnoreCase(name)) {
			return disp_dt002_lbl();
		}
		if ($disp_dt003_lbl.equalsIgnoreCase(name)) {
			return disp_dt003_lbl();
		}
		if ($disp_dt004_lbl.equalsIgnoreCase(name)) {
			return disp_dt004_lbl();
		}
		if ($disp_dt005_lbl.equalsIgnoreCase(name)) {
			return disp_dt005_lbl();
		}
		if ($disp_dt006_lbl.equalsIgnoreCase(name)) {
			return disp_dt006_lbl();
		}
		if ($disp_dt007_lbl.equalsIgnoreCase(name)) {
			return disp_dt007_lbl();
		}
		if ($disp_dt008_lbl.equalsIgnoreCase(name)) {
			return disp_dt008_lbl();
		}
		if ($disp_dt009_lbl.equalsIgnoreCase(name)) {
			return disp_dt009_lbl();
		}
		if ($disp_dt010_lbl.equalsIgnoreCase(name)) {
			return disp_dt010_lbl();
		}
		if ($disp_num001_lbl.equalsIgnoreCase(name)) {
			return disp_num001_lbl();
		}
		if ($disp_num002_lbl.equalsIgnoreCase(name)) {
			return disp_num002_lbl();
		}
		if ($disp_num003_lbl.equalsIgnoreCase(name)) {
			return disp_num003_lbl();
		}
		if ($disp_num004_lbl.equalsIgnoreCase(name)) {
			return disp_num004_lbl();
		}
		if ($disp_num005_lbl.equalsIgnoreCase(name)) {
			return disp_num005_lbl();
		}
		if ($disp_num006_lbl.equalsIgnoreCase(name)) {
			return disp_num006_lbl();
		}
		if ($disp_num007_lbl.equalsIgnoreCase(name)) {
			return disp_num007_lbl();
		}
		if ($disp_num008_lbl.equalsIgnoreCase(name)) {
			return disp_num008_lbl();
		}
		if ($disp_num009_lbl.equalsIgnoreCase(name)) {
			return disp_num009_lbl();
		}
		if ($disp_num010_lbl.equalsIgnoreCase(name)) {
			return disp_num010_lbl();
		}
		if ($add_col_lbl.equalsIgnoreCase(name)) {
			return add_col_lbl();
		}
		if ($add_col_typ.equalsIgnoreCase(name)) {
			return add_col_typ();
		}
		if ($add_col_nm.equalsIgnoreCase(name)) {
			return add_col_nm();
		}
		if ($sort_info.equalsIgnoreCase(name)) {
			return sort_info();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($disp_str001_lbl.equalsIgnoreCase(name)) {
			disp_str001_lbl(value);
			return;
		}
		if ($disp_str002_lbl.equalsIgnoreCase(name)) {
			disp_str002_lbl(value);
			return;
		}
		if ($disp_str003_lbl.equalsIgnoreCase(name)) {
			disp_str003_lbl(value);
			return;
		}
		if ($disp_str004_lbl.equalsIgnoreCase(name)) {
			disp_str004_lbl(value);
			return;
		}
		if ($disp_str005_lbl.equalsIgnoreCase(name)) {
			disp_str005_lbl(value);
			return;
		}
		if ($disp_str006_lbl.equalsIgnoreCase(name)) {
			disp_str006_lbl(value);
			return;
		}
		if ($disp_str007_lbl.equalsIgnoreCase(name)) {
			disp_str007_lbl(value);
			return;
		}
		if ($disp_str008_lbl.equalsIgnoreCase(name)) {
			disp_str008_lbl(value);
			return;
		}
		if ($disp_str009_lbl.equalsIgnoreCase(name)) {
			disp_str009_lbl(value);
			return;
		}
		if ($disp_str010_lbl.equalsIgnoreCase(name)) {
			disp_str010_lbl(value);
			return;
		}
		if ($disp_str011_lbl.equalsIgnoreCase(name)) {
			disp_str011_lbl(value);
			return;
		}
		if ($disp_str012_lbl.equalsIgnoreCase(name)) {
			disp_str012_lbl(value);
			return;
		}
		if ($disp_str013_lbl.equalsIgnoreCase(name)) {
			disp_str013_lbl(value);
			return;
		}
		if ($disp_str014_lbl.equalsIgnoreCase(name)) {
			disp_str014_lbl(value);
			return;
		}
		if ($disp_str015_lbl.equalsIgnoreCase(name)) {
			disp_str015_lbl(value);
			return;
		}
		if ($disp_str016_lbl.equalsIgnoreCase(name)) {
			disp_str016_lbl(value);
			return;
		}
		if ($disp_str017_lbl.equalsIgnoreCase(name)) {
			disp_str017_lbl(value);
			return;
		}
		if ($disp_str018_lbl.equalsIgnoreCase(name)) {
			disp_str018_lbl(value);
			return;
		}
		if ($disp_str019_lbl.equalsIgnoreCase(name)) {
			disp_str019_lbl(value);
			return;
		}
		if ($disp_str020_lbl.equalsIgnoreCase(name)) {
			disp_str020_lbl(value);
			return;
		}
		if ($disp_str021_lbl.equalsIgnoreCase(name)) {
			disp_str021_lbl(value);
			return;
		}
		if ($disp_str022_lbl.equalsIgnoreCase(name)) {
			disp_str022_lbl(value);
			return;
		}
		if ($disp_str023_lbl.equalsIgnoreCase(name)) {
			disp_str023_lbl(value);
			return;
		}
		if ($disp_str024_lbl.equalsIgnoreCase(name)) {
			disp_str024_lbl(value);
			return;
		}
		if ($disp_str025_lbl.equalsIgnoreCase(name)) {
			disp_str025_lbl(value);
			return;
		}
		if ($disp_str026_lbl.equalsIgnoreCase(name)) {
			disp_str026_lbl(value);
			return;
		}
		if ($disp_str027_lbl.equalsIgnoreCase(name)) {
			disp_str027_lbl(value);
			return;
		}
		if ($disp_str028_lbl.equalsIgnoreCase(name)) {
			disp_str028_lbl(value);
			return;
		}
		if ($disp_str029_lbl.equalsIgnoreCase(name)) {
			disp_str029_lbl(value);
			return;
		}
		if ($disp_str030_lbl.equalsIgnoreCase(name)) {
			disp_str030_lbl(value);
			return;
		}
		if ($disp_str031_lbl.equalsIgnoreCase(name)) {
			disp_str031_lbl(value);
			return;
		}
		if ($disp_str032_lbl.equalsIgnoreCase(name)) {
			disp_str032_lbl(value);
			return;
		}
		if ($disp_str033_lbl.equalsIgnoreCase(name)) {
			disp_str033_lbl(value);
			return;
		}
		if ($disp_str034_lbl.equalsIgnoreCase(name)) {
			disp_str034_lbl(value);
			return;
		}
		if ($disp_str035_lbl.equalsIgnoreCase(name)) {
			disp_str035_lbl(value);
			return;
		}
		if ($disp_str036_lbl.equalsIgnoreCase(name)) {
			disp_str036_lbl(value);
			return;
		}
		if ($disp_str037_lbl.equalsIgnoreCase(name)) {
			disp_str037_lbl(value);
			return;
		}
		if ($disp_str038_lbl.equalsIgnoreCase(name)) {
			disp_str038_lbl(value);
			return;
		}
		if ($disp_str039_lbl.equalsIgnoreCase(name)) {
			disp_str039_lbl(value);
			return;
		}
		if ($disp_str040_lbl.equalsIgnoreCase(name)) {
			disp_str040_lbl(value);
			return;
		}
		if ($disp_str041_lbl.equalsIgnoreCase(name)) {
			disp_str041_lbl(value);
			return;
		}
		if ($disp_str042_lbl.equalsIgnoreCase(name)) {
			disp_str042_lbl(value);
			return;
		}
		if ($disp_str043_lbl.equalsIgnoreCase(name)) {
			disp_str043_lbl(value);
			return;
		}
		if ($disp_str044_lbl.equalsIgnoreCase(name)) {
			disp_str044_lbl(value);
			return;
		}
		if ($disp_str045_lbl.equalsIgnoreCase(name)) {
			disp_str045_lbl(value);
			return;
		}
		if ($disp_str046_lbl.equalsIgnoreCase(name)) {
			disp_str046_lbl(value);
			return;
		}
		if ($disp_str047_lbl.equalsIgnoreCase(name)) {
			disp_str047_lbl(value);
			return;
		}
		if ($disp_str048_lbl.equalsIgnoreCase(name)) {
			disp_str048_lbl(value);
			return;
		}
		if ($disp_str049_lbl.equalsIgnoreCase(name)) {
			disp_str049_lbl(value);
			return;
		}
		if ($disp_str050_lbl.equalsIgnoreCase(name)) {
			disp_str050_lbl(value);
			return;
		}
		if ($disp_str051_lbl.equalsIgnoreCase(name)) {
			disp_str051_lbl(value);
			return;
		}
		if ($disp_str052_lbl.equalsIgnoreCase(name)) {
			disp_str052_lbl(value);
			return;
		}
		if ($disp_str053_lbl.equalsIgnoreCase(name)) {
			disp_str053_lbl(value);
			return;
		}
		if ($disp_str054_lbl.equalsIgnoreCase(name)) {
			disp_str054_lbl(value);
			return;
		}
		if ($disp_str055_lbl.equalsIgnoreCase(name)) {
			disp_str055_lbl(value);
			return;
		}
		if ($disp_str056_lbl.equalsIgnoreCase(name)) {
			disp_str056_lbl(value);
			return;
		}
		if ($disp_str057_lbl.equalsIgnoreCase(name)) {
			disp_str057_lbl(value);
			return;
		}
		if ($disp_str058_lbl.equalsIgnoreCase(name)) {
			disp_str058_lbl(value);
			return;
		}
		if ($disp_str059_lbl.equalsIgnoreCase(name)) {
			disp_str059_lbl(value);
			return;
		}
		if ($disp_str060_lbl.equalsIgnoreCase(name)) {
			disp_str060_lbl(value);
			return;
		}
		if ($disp_str061_lbl.equalsIgnoreCase(name)) {
			disp_str061_lbl(value);
			return;
		}
		if ($disp_str062_lbl.equalsIgnoreCase(name)) {
			disp_str062_lbl(value);
			return;
		}
		if ($disp_str063_lbl.equalsIgnoreCase(name)) {
			disp_str063_lbl(value);
			return;
		}
		if ($disp_str064_lbl.equalsIgnoreCase(name)) {
			disp_str064_lbl(value);
			return;
		}
		if ($disp_str065_lbl.equalsIgnoreCase(name)) {
			disp_str065_lbl(value);
			return;
		}
		if ($disp_str066_lbl.equalsIgnoreCase(name)) {
			disp_str066_lbl(value);
			return;
		}
		if ($disp_str067_lbl.equalsIgnoreCase(name)) {
			disp_str067_lbl(value);
			return;
		}
		if ($disp_str068_lbl.equalsIgnoreCase(name)) {
			disp_str068_lbl(value);
			return;
		}
		if ($disp_str069_lbl.equalsIgnoreCase(name)) {
			disp_str069_lbl(value);
			return;
		}
		if ($disp_str070_lbl.equalsIgnoreCase(name)) {
			disp_str070_lbl(value);
			return;
		}
		if ($disp_str071_lbl.equalsIgnoreCase(name)) {
			disp_str071_lbl(value);
			return;
		}
		if ($disp_str072_lbl.equalsIgnoreCase(name)) {
			disp_str072_lbl(value);
			return;
		}
		if ($disp_str073_lbl.equalsIgnoreCase(name)) {
			disp_str073_lbl(value);
			return;
		}
		if ($disp_str074_lbl.equalsIgnoreCase(name)) {
			disp_str074_lbl(value);
			return;
		}
		if ($disp_str075_lbl.equalsIgnoreCase(name)) {
			disp_str075_lbl(value);
			return;
		}
		if ($disp_str076_lbl.equalsIgnoreCase(name)) {
			disp_str076_lbl(value);
			return;
		}
		if ($disp_str077_lbl.equalsIgnoreCase(name)) {
			disp_str077_lbl(value);
			return;
		}
		if ($disp_str078_lbl.equalsIgnoreCase(name)) {
			disp_str078_lbl(value);
			return;
		}
		if ($disp_str079_lbl.equalsIgnoreCase(name)) {
			disp_str079_lbl(value);
			return;
		}
		if ($disp_str080_lbl.equalsIgnoreCase(name)) {
			disp_str080_lbl(value);
			return;
		}
		if ($disp_str081_lbl.equalsIgnoreCase(name)) {
			disp_str081_lbl(value);
			return;
		}
		if ($disp_str082_lbl.equalsIgnoreCase(name)) {
			disp_str082_lbl(value);
			return;
		}
		if ($disp_str083_lbl.equalsIgnoreCase(name)) {
			disp_str083_lbl(value);
			return;
		}
		if ($disp_str084_lbl.equalsIgnoreCase(name)) {
			disp_str084_lbl(value);
			return;
		}
		if ($disp_str085_lbl.equalsIgnoreCase(name)) {
			disp_str085_lbl(value);
			return;
		}
		if ($disp_str086_lbl.equalsIgnoreCase(name)) {
			disp_str086_lbl(value);
			return;
		}
		if ($disp_str087_lbl.equalsIgnoreCase(name)) {
			disp_str087_lbl(value);
			return;
		}
		if ($disp_str088_lbl.equalsIgnoreCase(name)) {
			disp_str088_lbl(value);
			return;
		}
		if ($disp_str089_lbl.equalsIgnoreCase(name)) {
			disp_str089_lbl(value);
			return;
		}
		if ($disp_str090_lbl.equalsIgnoreCase(name)) {
			disp_str090_lbl(value);
			return;
		}
		if ($disp_str091_lbl.equalsIgnoreCase(name)) {
			disp_str091_lbl(value);
			return;
		}
		if ($disp_str092_lbl.equalsIgnoreCase(name)) {
			disp_str092_lbl(value);
			return;
		}
		if ($disp_str093_lbl.equalsIgnoreCase(name)) {
			disp_str093_lbl(value);
			return;
		}
		if ($disp_str094_lbl.equalsIgnoreCase(name)) {
			disp_str094_lbl(value);
			return;
		}
		if ($disp_str095_lbl.equalsIgnoreCase(name)) {
			disp_str095_lbl(value);
			return;
		}
		if ($disp_str096_lbl.equalsIgnoreCase(name)) {
			disp_str096_lbl(value);
			return;
		}
		if ($disp_str097_lbl.equalsIgnoreCase(name)) {
			disp_str097_lbl(value);
			return;
		}
		if ($disp_str098_lbl.equalsIgnoreCase(name)) {
			disp_str098_lbl(value);
			return;
		}
		if ($disp_str099_lbl.equalsIgnoreCase(name)) {
			disp_str099_lbl(value);
			return;
		}
		if ($disp_str100_lbl.equalsIgnoreCase(name)) {
			disp_str100_lbl(value);
			return;
		}
		if ($disp_str101_lbl.equalsIgnoreCase(name)) {
			disp_str101_lbl(value);
			return;
		}
		if ($disp_str102_lbl.equalsIgnoreCase(name)) {
			disp_str102_lbl(value);
			return;
		}
		if ($disp_str103_lbl.equalsIgnoreCase(name)) {
			disp_str103_lbl(value);
			return;
		}
		if ($disp_str104_lbl.equalsIgnoreCase(name)) {
			disp_str104_lbl(value);
			return;
		}
		if ($disp_str105_lbl.equalsIgnoreCase(name)) {
			disp_str105_lbl(value);
			return;
		}
		if ($disp_str106_lbl.equalsIgnoreCase(name)) {
			disp_str106_lbl(value);
			return;
		}
		if ($disp_str107_lbl.equalsIgnoreCase(name)) {
			disp_str107_lbl(value);
			return;
		}
		if ($disp_str108_lbl.equalsIgnoreCase(name)) {
			disp_str108_lbl(value);
			return;
		}
		if ($disp_str109_lbl.equalsIgnoreCase(name)) {
			disp_str109_lbl(value);
			return;
		}
		if ($disp_str110_lbl.equalsIgnoreCase(name)) {
			disp_str110_lbl(value);
			return;
		}
		if ($disp_str111_lbl.equalsIgnoreCase(name)) {
			disp_str111_lbl(value);
			return;
		}
		if ($disp_str112_lbl.equalsIgnoreCase(name)) {
			disp_str112_lbl(value);
			return;
		}
		if ($disp_str113_lbl.equalsIgnoreCase(name)) {
			disp_str113_lbl(value);
			return;
		}
		if ($disp_str114_lbl.equalsIgnoreCase(name)) {
			disp_str114_lbl(value);
			return;
		}
		if ($disp_str115_lbl.equalsIgnoreCase(name)) {
			disp_str115_lbl(value);
			return;
		}
		if ($disp_str116_lbl.equalsIgnoreCase(name)) {
			disp_str116_lbl(value);
			return;
		}
		if ($disp_str117_lbl.equalsIgnoreCase(name)) {
			disp_str117_lbl(value);
			return;
		}
		if ($disp_str118_lbl.equalsIgnoreCase(name)) {
			disp_str118_lbl(value);
			return;
		}
		if ($disp_str119_lbl.equalsIgnoreCase(name)) {
			disp_str119_lbl(value);
			return;
		}
		if ($disp_str120_lbl.equalsIgnoreCase(name)) {
			disp_str120_lbl(value);
			return;
		}
		if ($disp_str121_lbl.equalsIgnoreCase(name)) {
			disp_str121_lbl(value);
			return;
		}
		if ($disp_str122_lbl.equalsIgnoreCase(name)) {
			disp_str122_lbl(value);
			return;
		}
		if ($disp_str123_lbl.equalsIgnoreCase(name)) {
			disp_str123_lbl(value);
			return;
		}
		if ($disp_str124_lbl.equalsIgnoreCase(name)) {
			disp_str124_lbl(value);
			return;
		}
		if ($disp_str125_lbl.equalsIgnoreCase(name)) {
			disp_str125_lbl(value);
			return;
		}
		if ($disp_str126_lbl.equalsIgnoreCase(name)) {
			disp_str126_lbl(value);
			return;
		}
		if ($disp_str127_lbl.equalsIgnoreCase(name)) {
			disp_str127_lbl(value);
			return;
		}
		if ($disp_str128_lbl.equalsIgnoreCase(name)) {
			disp_str128_lbl(value);
			return;
		}
		if ($disp_str129_lbl.equalsIgnoreCase(name)) {
			disp_str129_lbl(value);
			return;
		}
		if ($disp_str130_lbl.equalsIgnoreCase(name)) {
			disp_str130_lbl(value);
			return;
		}
		if ($disp_str131_lbl.equalsIgnoreCase(name)) {
			disp_str131_lbl(value);
			return;
		}
		if ($disp_str132_lbl.equalsIgnoreCase(name)) {
			disp_str132_lbl(value);
			return;
		}
		if ($disp_str133_lbl.equalsIgnoreCase(name)) {
			disp_str133_lbl(value);
			return;
		}
		if ($disp_str134_lbl.equalsIgnoreCase(name)) {
			disp_str134_lbl(value);
			return;
		}
		if ($disp_str135_lbl.equalsIgnoreCase(name)) {
			disp_str135_lbl(value);
			return;
		}
		if ($disp_str136_lbl.equalsIgnoreCase(name)) {
			disp_str136_lbl(value);
			return;
		}
		if ($disp_str137_lbl.equalsIgnoreCase(name)) {
			disp_str137_lbl(value);
			return;
		}
		if ($disp_str138_lbl.equalsIgnoreCase(name)) {
			disp_str138_lbl(value);
			return;
		}
		if ($disp_str139_lbl.equalsIgnoreCase(name)) {
			disp_str139_lbl(value);
			return;
		}
		if ($disp_str140_lbl.equalsIgnoreCase(name)) {
			disp_str140_lbl(value);
			return;
		}
		if ($disp_str141_lbl.equalsIgnoreCase(name)) {
			disp_str141_lbl(value);
			return;
		}
		if ($disp_str142_lbl.equalsIgnoreCase(name)) {
			disp_str142_lbl(value);
			return;
		}
		if ($disp_str143_lbl.equalsIgnoreCase(name)) {
			disp_str143_lbl(value);
			return;
		}
		if ($disp_str144_lbl.equalsIgnoreCase(name)) {
			disp_str144_lbl(value);
			return;
		}
		if ($disp_str145_lbl.equalsIgnoreCase(name)) {
			disp_str145_lbl(value);
			return;
		}
		if ($disp_str146_lbl.equalsIgnoreCase(name)) {
			disp_str146_lbl(value);
			return;
		}
		if ($disp_str147_lbl.equalsIgnoreCase(name)) {
			disp_str147_lbl(value);
			return;
		}
		if ($disp_str148_lbl.equalsIgnoreCase(name)) {
			disp_str148_lbl(value);
			return;
		}
		if ($disp_str149_lbl.equalsIgnoreCase(name)) {
			disp_str149_lbl(value);
			return;
		}
		if ($disp_str150_lbl.equalsIgnoreCase(name)) {
			disp_str150_lbl(value);
			return;
		}
		if ($disp_str151_lbl.equalsIgnoreCase(name)) {
			disp_str151_lbl(value);
			return;
		}
		if ($disp_str152_lbl.equalsIgnoreCase(name)) {
			disp_str152_lbl(value);
			return;
		}
		if ($disp_str153_lbl.equalsIgnoreCase(name)) {
			disp_str153_lbl(value);
			return;
		}
		if ($disp_str154_lbl.equalsIgnoreCase(name)) {
			disp_str154_lbl(value);
			return;
		}
		if ($disp_str155_lbl.equalsIgnoreCase(name)) {
			disp_str155_lbl(value);
			return;
		}
		if ($disp_str156_lbl.equalsIgnoreCase(name)) {
			disp_str156_lbl(value);
			return;
		}
		if ($disp_str157_lbl.equalsIgnoreCase(name)) {
			disp_str157_lbl(value);
			return;
		}
		if ($disp_str158_lbl.equalsIgnoreCase(name)) {
			disp_str158_lbl(value);
			return;
		}
		if ($disp_str159_lbl.equalsIgnoreCase(name)) {
			disp_str159_lbl(value);
			return;
		}
		if ($disp_str160_lbl.equalsIgnoreCase(name)) {
			disp_str160_lbl(value);
			return;
		}
		if ($disp_str161_lbl.equalsIgnoreCase(name)) {
			disp_str161_lbl(value);
			return;
		}
		if ($disp_str162_lbl.equalsIgnoreCase(name)) {
			disp_str162_lbl(value);
			return;
		}
		if ($disp_str163_lbl.equalsIgnoreCase(name)) {
			disp_str163_lbl(value);
			return;
		}
		if ($disp_str164_lbl.equalsIgnoreCase(name)) {
			disp_str164_lbl(value);
			return;
		}
		if ($disp_str165_lbl.equalsIgnoreCase(name)) {
			disp_str165_lbl(value);
			return;
		}
		if ($disp_str166_lbl.equalsIgnoreCase(name)) {
			disp_str166_lbl(value);
			return;
		}
		if ($disp_str167_lbl.equalsIgnoreCase(name)) {
			disp_str167_lbl(value);
			return;
		}
		if ($disp_str168_lbl.equalsIgnoreCase(name)) {
			disp_str168_lbl(value);
			return;
		}
		if ($disp_str169_lbl.equalsIgnoreCase(name)) {
			disp_str169_lbl(value);
			return;
		}
		if ($disp_str170_lbl.equalsIgnoreCase(name)) {
			disp_str170_lbl(value);
			return;
		}
		if ($disp_str171_lbl.equalsIgnoreCase(name)) {
			disp_str171_lbl(value);
			return;
		}
		if ($disp_str172_lbl.equalsIgnoreCase(name)) {
			disp_str172_lbl(value);
			return;
		}
		if ($disp_str173_lbl.equalsIgnoreCase(name)) {
			disp_str173_lbl(value);
			return;
		}
		if ($disp_str174_lbl.equalsIgnoreCase(name)) {
			disp_str174_lbl(value);
			return;
		}
		if ($disp_str175_lbl.equalsIgnoreCase(name)) {
			disp_str175_lbl(value);
			return;
		}
		if ($disp_str176_lbl.equalsIgnoreCase(name)) {
			disp_str176_lbl(value);
			return;
		}
		if ($disp_str177_lbl.equalsIgnoreCase(name)) {
			disp_str177_lbl(value);
			return;
		}
		if ($disp_str178_lbl.equalsIgnoreCase(name)) {
			disp_str178_lbl(value);
			return;
		}
		if ($disp_str179_lbl.equalsIgnoreCase(name)) {
			disp_str179_lbl(value);
			return;
		}
		if ($disp_str180_lbl.equalsIgnoreCase(name)) {
			disp_str180_lbl(value);
			return;
		}
		if ($disp_str181_lbl.equalsIgnoreCase(name)) {
			disp_str181_lbl(value);
			return;
		}
		if ($disp_str182_lbl.equalsIgnoreCase(name)) {
			disp_str182_lbl(value);
			return;
		}
		if ($disp_str183_lbl.equalsIgnoreCase(name)) {
			disp_str183_lbl(value);
			return;
		}
		if ($disp_str184_lbl.equalsIgnoreCase(name)) {
			disp_str184_lbl(value);
			return;
		}
		if ($disp_str185_lbl.equalsIgnoreCase(name)) {
			disp_str185_lbl(value);
			return;
		}
		if ($disp_str186_lbl.equalsIgnoreCase(name)) {
			disp_str186_lbl(value);
			return;
		}
		if ($disp_str187_lbl.equalsIgnoreCase(name)) {
			disp_str187_lbl(value);
			return;
		}
		if ($disp_str188_lbl.equalsIgnoreCase(name)) {
			disp_str188_lbl(value);
			return;
		}
		if ($disp_str189_lbl.equalsIgnoreCase(name)) {
			disp_str189_lbl(value);
			return;
		}
		if ($disp_str190_lbl.equalsIgnoreCase(name)) {
			disp_str190_lbl(value);
			return;
		}
		if ($disp_str191_lbl.equalsIgnoreCase(name)) {
			disp_str191_lbl(value);
			return;
		}
		if ($disp_str192_lbl.equalsIgnoreCase(name)) {
			disp_str192_lbl(value);
			return;
		}
		if ($disp_str193_lbl.equalsIgnoreCase(name)) {
			disp_str193_lbl(value);
			return;
		}
		if ($disp_str194_lbl.equalsIgnoreCase(name)) {
			disp_str194_lbl(value);
			return;
		}
		if ($disp_str195_lbl.equalsIgnoreCase(name)) {
			disp_str195_lbl(value);
			return;
		}
		if ($disp_str196_lbl.equalsIgnoreCase(name)) {
			disp_str196_lbl(value);
			return;
		}
		if ($disp_str197_lbl.equalsIgnoreCase(name)) {
			disp_str197_lbl(value);
			return;
		}
		if ($disp_str198_lbl.equalsIgnoreCase(name)) {
			disp_str198_lbl(value);
			return;
		}
		if ($disp_str199_lbl.equalsIgnoreCase(name)) {
			disp_str199_lbl(value);
			return;
		}
		if ($disp_str200_lbl.equalsIgnoreCase(name)) {
			disp_str200_lbl(value);
			return;
		}
		if ($disp_dt001_lbl.equalsIgnoreCase(name)) {
			disp_dt001_lbl(value);
			return;
		}
		if ($disp_dt002_lbl.equalsIgnoreCase(name)) {
			disp_dt002_lbl(value);
			return;
		}
		if ($disp_dt003_lbl.equalsIgnoreCase(name)) {
			disp_dt003_lbl(value);
			return;
		}
		if ($disp_dt004_lbl.equalsIgnoreCase(name)) {
			disp_dt004_lbl(value);
			return;
		}
		if ($disp_dt005_lbl.equalsIgnoreCase(name)) {
			disp_dt005_lbl(value);
			return;
		}
		if ($disp_dt006_lbl.equalsIgnoreCase(name)) {
			disp_dt006_lbl(value);
			return;
		}
		if ($disp_dt007_lbl.equalsIgnoreCase(name)) {
			disp_dt007_lbl(value);
			return;
		}
		if ($disp_dt008_lbl.equalsIgnoreCase(name)) {
			disp_dt008_lbl(value);
			return;
		}
		if ($disp_dt009_lbl.equalsIgnoreCase(name)) {
			disp_dt009_lbl(value);
			return;
		}
		if ($disp_dt010_lbl.equalsIgnoreCase(name)) {
			disp_dt010_lbl(value);
			return;
		}
		if ($disp_num001_lbl.equalsIgnoreCase(name)) {
			disp_num001_lbl(value);
			return;
		}
		if ($disp_num002_lbl.equalsIgnoreCase(name)) {
			disp_num002_lbl(value);
			return;
		}
		if ($disp_num003_lbl.equalsIgnoreCase(name)) {
			disp_num003_lbl(value);
			return;
		}
		if ($disp_num004_lbl.equalsIgnoreCase(name)) {
			disp_num004_lbl(value);
			return;
		}
		if ($disp_num005_lbl.equalsIgnoreCase(name)) {
			disp_num005_lbl(value);
			return;
		}
		if ($disp_num006_lbl.equalsIgnoreCase(name)) {
			disp_num006_lbl(value);
			return;
		}
		if ($disp_num007_lbl.equalsIgnoreCase(name)) {
			disp_num007_lbl(value);
			return;
		}
		if ($disp_num008_lbl.equalsIgnoreCase(name)) {
			disp_num008_lbl(value);
			return;
		}
		if ($disp_num009_lbl.equalsIgnoreCase(name)) {
			disp_num009_lbl(value);
			return;
		}
		if ($disp_num010_lbl.equalsIgnoreCase(name)) {
			disp_num010_lbl(value);
			return;
		}
		if ($add_col_lbl.equalsIgnoreCase(name)) {
			add_col_lbl(value);
			return;
		}
		if ($add_col_typ.equalsIgnoreCase(name)) {
			add_col_typ(value);
			return;
		}
		if ($add_col_nm.equalsIgnoreCase(name)) {
			add_col_nm(value);
			return;
		}
		if ($sort_info.equalsIgnoreCase(name)) {
			sort_info(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($disp_str001_lbl.equalsIgnoreCase(name)) {
			disp_str001_lbl(value);
			return;
		}
		if ($disp_str002_lbl.equalsIgnoreCase(name)) {
			disp_str002_lbl(value);
			return;
		}
		if ($disp_str003_lbl.equalsIgnoreCase(name)) {
			disp_str003_lbl(value);
			return;
		}
		if ($disp_str004_lbl.equalsIgnoreCase(name)) {
			disp_str004_lbl(value);
			return;
		}
		if ($disp_str005_lbl.equalsIgnoreCase(name)) {
			disp_str005_lbl(value);
			return;
		}
		if ($disp_str006_lbl.equalsIgnoreCase(name)) {
			disp_str006_lbl(value);
			return;
		}
		if ($disp_str007_lbl.equalsIgnoreCase(name)) {
			disp_str007_lbl(value);
			return;
		}
		if ($disp_str008_lbl.equalsIgnoreCase(name)) {
			disp_str008_lbl(value);
			return;
		}
		if ($disp_str009_lbl.equalsIgnoreCase(name)) {
			disp_str009_lbl(value);
			return;
		}
		if ($disp_str010_lbl.equalsIgnoreCase(name)) {
			disp_str010_lbl(value);
			return;
		}
		if ($disp_str011_lbl.equalsIgnoreCase(name)) {
			disp_str011_lbl(value);
			return;
		}
		if ($disp_str012_lbl.equalsIgnoreCase(name)) {
			disp_str012_lbl(value);
			return;
		}
		if ($disp_str013_lbl.equalsIgnoreCase(name)) {
			disp_str013_lbl(value);
			return;
		}
		if ($disp_str014_lbl.equalsIgnoreCase(name)) {
			disp_str014_lbl(value);
			return;
		}
		if ($disp_str015_lbl.equalsIgnoreCase(name)) {
			disp_str015_lbl(value);
			return;
		}
		if ($disp_str016_lbl.equalsIgnoreCase(name)) {
			disp_str016_lbl(value);
			return;
		}
		if ($disp_str017_lbl.equalsIgnoreCase(name)) {
			disp_str017_lbl(value);
			return;
		}
		if ($disp_str018_lbl.equalsIgnoreCase(name)) {
			disp_str018_lbl(value);
			return;
		}
		if ($disp_str019_lbl.equalsIgnoreCase(name)) {
			disp_str019_lbl(value);
			return;
		}
		if ($disp_str020_lbl.equalsIgnoreCase(name)) {
			disp_str020_lbl(value);
			return;
		}
		if ($disp_str021_lbl.equalsIgnoreCase(name)) {
			disp_str021_lbl(value);
			return;
		}
		if ($disp_str022_lbl.equalsIgnoreCase(name)) {
			disp_str022_lbl(value);
			return;
		}
		if ($disp_str023_lbl.equalsIgnoreCase(name)) {
			disp_str023_lbl(value);
			return;
		}
		if ($disp_str024_lbl.equalsIgnoreCase(name)) {
			disp_str024_lbl(value);
			return;
		}
		if ($disp_str025_lbl.equalsIgnoreCase(name)) {
			disp_str025_lbl(value);
			return;
		}
		if ($disp_str026_lbl.equalsIgnoreCase(name)) {
			disp_str026_lbl(value);
			return;
		}
		if ($disp_str027_lbl.equalsIgnoreCase(name)) {
			disp_str027_lbl(value);
			return;
		}
		if ($disp_str028_lbl.equalsIgnoreCase(name)) {
			disp_str028_lbl(value);
			return;
		}
		if ($disp_str029_lbl.equalsIgnoreCase(name)) {
			disp_str029_lbl(value);
			return;
		}
		if ($disp_str030_lbl.equalsIgnoreCase(name)) {
			disp_str030_lbl(value);
			return;
		}
		if ($disp_str031_lbl.equalsIgnoreCase(name)) {
			disp_str031_lbl(value);
			return;
		}
		if ($disp_str032_lbl.equalsIgnoreCase(name)) {
			disp_str032_lbl(value);
			return;
		}
		if ($disp_str033_lbl.equalsIgnoreCase(name)) {
			disp_str033_lbl(value);
			return;
		}
		if ($disp_str034_lbl.equalsIgnoreCase(name)) {
			disp_str034_lbl(value);
			return;
		}
		if ($disp_str035_lbl.equalsIgnoreCase(name)) {
			disp_str035_lbl(value);
			return;
		}
		if ($disp_str036_lbl.equalsIgnoreCase(name)) {
			disp_str036_lbl(value);
			return;
		}
		if ($disp_str037_lbl.equalsIgnoreCase(name)) {
			disp_str037_lbl(value);
			return;
		}
		if ($disp_str038_lbl.equalsIgnoreCase(name)) {
			disp_str038_lbl(value);
			return;
		}
		if ($disp_str039_lbl.equalsIgnoreCase(name)) {
			disp_str039_lbl(value);
			return;
		}
		if ($disp_str040_lbl.equalsIgnoreCase(name)) {
			disp_str040_lbl(value);
			return;
		}
		if ($disp_str041_lbl.equalsIgnoreCase(name)) {
			disp_str041_lbl(value);
			return;
		}
		if ($disp_str042_lbl.equalsIgnoreCase(name)) {
			disp_str042_lbl(value);
			return;
		}
		if ($disp_str043_lbl.equalsIgnoreCase(name)) {
			disp_str043_lbl(value);
			return;
		}
		if ($disp_str044_lbl.equalsIgnoreCase(name)) {
			disp_str044_lbl(value);
			return;
		}
		if ($disp_str045_lbl.equalsIgnoreCase(name)) {
			disp_str045_lbl(value);
			return;
		}
		if ($disp_str046_lbl.equalsIgnoreCase(name)) {
			disp_str046_lbl(value);
			return;
		}
		if ($disp_str047_lbl.equalsIgnoreCase(name)) {
			disp_str047_lbl(value);
			return;
		}
		if ($disp_str048_lbl.equalsIgnoreCase(name)) {
			disp_str048_lbl(value);
			return;
		}
		if ($disp_str049_lbl.equalsIgnoreCase(name)) {
			disp_str049_lbl(value);
			return;
		}
		if ($disp_str050_lbl.equalsIgnoreCase(name)) {
			disp_str050_lbl(value);
			return;
		}
		if ($disp_str051_lbl.equalsIgnoreCase(name)) {
			disp_str051_lbl(value);
			return;
		}
		if ($disp_str052_lbl.equalsIgnoreCase(name)) {
			disp_str052_lbl(value);
			return;
		}
		if ($disp_str053_lbl.equalsIgnoreCase(name)) {
			disp_str053_lbl(value);
			return;
		}
		if ($disp_str054_lbl.equalsIgnoreCase(name)) {
			disp_str054_lbl(value);
			return;
		}
		if ($disp_str055_lbl.equalsIgnoreCase(name)) {
			disp_str055_lbl(value);
			return;
		}
		if ($disp_str056_lbl.equalsIgnoreCase(name)) {
			disp_str056_lbl(value);
			return;
		}
		if ($disp_str057_lbl.equalsIgnoreCase(name)) {
			disp_str057_lbl(value);
			return;
		}
		if ($disp_str058_lbl.equalsIgnoreCase(name)) {
			disp_str058_lbl(value);
			return;
		}
		if ($disp_str059_lbl.equalsIgnoreCase(name)) {
			disp_str059_lbl(value);
			return;
		}
		if ($disp_str060_lbl.equalsIgnoreCase(name)) {
			disp_str060_lbl(value);
			return;
		}
		if ($disp_str061_lbl.equalsIgnoreCase(name)) {
			disp_str061_lbl(value);
			return;
		}
		if ($disp_str062_lbl.equalsIgnoreCase(name)) {
			disp_str062_lbl(value);
			return;
		}
		if ($disp_str063_lbl.equalsIgnoreCase(name)) {
			disp_str063_lbl(value);
			return;
		}
		if ($disp_str064_lbl.equalsIgnoreCase(name)) {
			disp_str064_lbl(value);
			return;
		}
		if ($disp_str065_lbl.equalsIgnoreCase(name)) {
			disp_str065_lbl(value);
			return;
		}
		if ($disp_str066_lbl.equalsIgnoreCase(name)) {
			disp_str066_lbl(value);
			return;
		}
		if ($disp_str067_lbl.equalsIgnoreCase(name)) {
			disp_str067_lbl(value);
			return;
		}
		if ($disp_str068_lbl.equalsIgnoreCase(name)) {
			disp_str068_lbl(value);
			return;
		}
		if ($disp_str069_lbl.equalsIgnoreCase(name)) {
			disp_str069_lbl(value);
			return;
		}
		if ($disp_str070_lbl.equalsIgnoreCase(name)) {
			disp_str070_lbl(value);
			return;
		}
		if ($disp_str071_lbl.equalsIgnoreCase(name)) {
			disp_str071_lbl(value);
			return;
		}
		if ($disp_str072_lbl.equalsIgnoreCase(name)) {
			disp_str072_lbl(value);
			return;
		}
		if ($disp_str073_lbl.equalsIgnoreCase(name)) {
			disp_str073_lbl(value);
			return;
		}
		if ($disp_str074_lbl.equalsIgnoreCase(name)) {
			disp_str074_lbl(value);
			return;
		}
		if ($disp_str075_lbl.equalsIgnoreCase(name)) {
			disp_str075_lbl(value);
			return;
		}
		if ($disp_str076_lbl.equalsIgnoreCase(name)) {
			disp_str076_lbl(value);
			return;
		}
		if ($disp_str077_lbl.equalsIgnoreCase(name)) {
			disp_str077_lbl(value);
			return;
		}
		if ($disp_str078_lbl.equalsIgnoreCase(name)) {
			disp_str078_lbl(value);
			return;
		}
		if ($disp_str079_lbl.equalsIgnoreCase(name)) {
			disp_str079_lbl(value);
			return;
		}
		if ($disp_str080_lbl.equalsIgnoreCase(name)) {
			disp_str080_lbl(value);
			return;
		}
		if ($disp_str081_lbl.equalsIgnoreCase(name)) {
			disp_str081_lbl(value);
			return;
		}
		if ($disp_str082_lbl.equalsIgnoreCase(name)) {
			disp_str082_lbl(value);
			return;
		}
		if ($disp_str083_lbl.equalsIgnoreCase(name)) {
			disp_str083_lbl(value);
			return;
		}
		if ($disp_str084_lbl.equalsIgnoreCase(name)) {
			disp_str084_lbl(value);
			return;
		}
		if ($disp_str085_lbl.equalsIgnoreCase(name)) {
			disp_str085_lbl(value);
			return;
		}
		if ($disp_str086_lbl.equalsIgnoreCase(name)) {
			disp_str086_lbl(value);
			return;
		}
		if ($disp_str087_lbl.equalsIgnoreCase(name)) {
			disp_str087_lbl(value);
			return;
		}
		if ($disp_str088_lbl.equalsIgnoreCase(name)) {
			disp_str088_lbl(value);
			return;
		}
		if ($disp_str089_lbl.equalsIgnoreCase(name)) {
			disp_str089_lbl(value);
			return;
		}
		if ($disp_str090_lbl.equalsIgnoreCase(name)) {
			disp_str090_lbl(value);
			return;
		}
		if ($disp_str091_lbl.equalsIgnoreCase(name)) {
			disp_str091_lbl(value);
			return;
		}
		if ($disp_str092_lbl.equalsIgnoreCase(name)) {
			disp_str092_lbl(value);
			return;
		}
		if ($disp_str093_lbl.equalsIgnoreCase(name)) {
			disp_str093_lbl(value);
			return;
		}
		if ($disp_str094_lbl.equalsIgnoreCase(name)) {
			disp_str094_lbl(value);
			return;
		}
		if ($disp_str095_lbl.equalsIgnoreCase(name)) {
			disp_str095_lbl(value);
			return;
		}
		if ($disp_str096_lbl.equalsIgnoreCase(name)) {
			disp_str096_lbl(value);
			return;
		}
		if ($disp_str097_lbl.equalsIgnoreCase(name)) {
			disp_str097_lbl(value);
			return;
		}
		if ($disp_str098_lbl.equalsIgnoreCase(name)) {
			disp_str098_lbl(value);
			return;
		}
		if ($disp_str099_lbl.equalsIgnoreCase(name)) {
			disp_str099_lbl(value);
			return;
		}
		if ($disp_str100_lbl.equalsIgnoreCase(name)) {
			disp_str100_lbl(value);
			return;
		}
		if ($disp_str101_lbl.equalsIgnoreCase(name)) {
			disp_str101_lbl(value);
			return;
		}
		if ($disp_str102_lbl.equalsIgnoreCase(name)) {
			disp_str102_lbl(value);
			return;
		}
		if ($disp_str103_lbl.equalsIgnoreCase(name)) {
			disp_str103_lbl(value);
			return;
		}
		if ($disp_str104_lbl.equalsIgnoreCase(name)) {
			disp_str104_lbl(value);
			return;
		}
		if ($disp_str105_lbl.equalsIgnoreCase(name)) {
			disp_str105_lbl(value);
			return;
		}
		if ($disp_str106_lbl.equalsIgnoreCase(name)) {
			disp_str106_lbl(value);
			return;
		}
		if ($disp_str107_lbl.equalsIgnoreCase(name)) {
			disp_str107_lbl(value);
			return;
		}
		if ($disp_str108_lbl.equalsIgnoreCase(name)) {
			disp_str108_lbl(value);
			return;
		}
		if ($disp_str109_lbl.equalsIgnoreCase(name)) {
			disp_str109_lbl(value);
			return;
		}
		if ($disp_str110_lbl.equalsIgnoreCase(name)) {
			disp_str110_lbl(value);
			return;
		}
		if ($disp_str111_lbl.equalsIgnoreCase(name)) {
			disp_str111_lbl(value);
			return;
		}
		if ($disp_str112_lbl.equalsIgnoreCase(name)) {
			disp_str112_lbl(value);
			return;
		}
		if ($disp_str113_lbl.equalsIgnoreCase(name)) {
			disp_str113_lbl(value);
			return;
		}
		if ($disp_str114_lbl.equalsIgnoreCase(name)) {
			disp_str114_lbl(value);
			return;
		}
		if ($disp_str115_lbl.equalsIgnoreCase(name)) {
			disp_str115_lbl(value);
			return;
		}
		if ($disp_str116_lbl.equalsIgnoreCase(name)) {
			disp_str116_lbl(value);
			return;
		}
		if ($disp_str117_lbl.equalsIgnoreCase(name)) {
			disp_str117_lbl(value);
			return;
		}
		if ($disp_str118_lbl.equalsIgnoreCase(name)) {
			disp_str118_lbl(value);
			return;
		}
		if ($disp_str119_lbl.equalsIgnoreCase(name)) {
			disp_str119_lbl(value);
			return;
		}
		if ($disp_str120_lbl.equalsIgnoreCase(name)) {
			disp_str120_lbl(value);
			return;
		}
		if ($disp_str121_lbl.equalsIgnoreCase(name)) {
			disp_str121_lbl(value);
			return;
		}
		if ($disp_str122_lbl.equalsIgnoreCase(name)) {
			disp_str122_lbl(value);
			return;
		}
		if ($disp_str123_lbl.equalsIgnoreCase(name)) {
			disp_str123_lbl(value);
			return;
		}
		if ($disp_str124_lbl.equalsIgnoreCase(name)) {
			disp_str124_lbl(value);
			return;
		}
		if ($disp_str125_lbl.equalsIgnoreCase(name)) {
			disp_str125_lbl(value);
			return;
		}
		if ($disp_str126_lbl.equalsIgnoreCase(name)) {
			disp_str126_lbl(value);
			return;
		}
		if ($disp_str127_lbl.equalsIgnoreCase(name)) {
			disp_str127_lbl(value);
			return;
		}
		if ($disp_str128_lbl.equalsIgnoreCase(name)) {
			disp_str128_lbl(value);
			return;
		}
		if ($disp_str129_lbl.equalsIgnoreCase(name)) {
			disp_str129_lbl(value);
			return;
		}
		if ($disp_str130_lbl.equalsIgnoreCase(name)) {
			disp_str130_lbl(value);
			return;
		}
		if ($disp_str131_lbl.equalsIgnoreCase(name)) {
			disp_str131_lbl(value);
			return;
		}
		if ($disp_str132_lbl.equalsIgnoreCase(name)) {
			disp_str132_lbl(value);
			return;
		}
		if ($disp_str133_lbl.equalsIgnoreCase(name)) {
			disp_str133_lbl(value);
			return;
		}
		if ($disp_str134_lbl.equalsIgnoreCase(name)) {
			disp_str134_lbl(value);
			return;
		}
		if ($disp_str135_lbl.equalsIgnoreCase(name)) {
			disp_str135_lbl(value);
			return;
		}
		if ($disp_str136_lbl.equalsIgnoreCase(name)) {
			disp_str136_lbl(value);
			return;
		}
		if ($disp_str137_lbl.equalsIgnoreCase(name)) {
			disp_str137_lbl(value);
			return;
		}
		if ($disp_str138_lbl.equalsIgnoreCase(name)) {
			disp_str138_lbl(value);
			return;
		}
		if ($disp_str139_lbl.equalsIgnoreCase(name)) {
			disp_str139_lbl(value);
			return;
		}
		if ($disp_str140_lbl.equalsIgnoreCase(name)) {
			disp_str140_lbl(value);
			return;
		}
		if ($disp_str141_lbl.equalsIgnoreCase(name)) {
			disp_str141_lbl(value);
			return;
		}
		if ($disp_str142_lbl.equalsIgnoreCase(name)) {
			disp_str142_lbl(value);
			return;
		}
		if ($disp_str143_lbl.equalsIgnoreCase(name)) {
			disp_str143_lbl(value);
			return;
		}
		if ($disp_str144_lbl.equalsIgnoreCase(name)) {
			disp_str144_lbl(value);
			return;
		}
		if ($disp_str145_lbl.equalsIgnoreCase(name)) {
			disp_str145_lbl(value);
			return;
		}
		if ($disp_str146_lbl.equalsIgnoreCase(name)) {
			disp_str146_lbl(value);
			return;
		}
		if ($disp_str147_lbl.equalsIgnoreCase(name)) {
			disp_str147_lbl(value);
			return;
		}
		if ($disp_str148_lbl.equalsIgnoreCase(name)) {
			disp_str148_lbl(value);
			return;
		}
		if ($disp_str149_lbl.equalsIgnoreCase(name)) {
			disp_str149_lbl(value);
			return;
		}
		if ($disp_str150_lbl.equalsIgnoreCase(name)) {
			disp_str150_lbl(value);
			return;
		}
		if ($disp_str151_lbl.equalsIgnoreCase(name)) {
			disp_str151_lbl(value);
			return;
		}
		if ($disp_str152_lbl.equalsIgnoreCase(name)) {
			disp_str152_lbl(value);
			return;
		}
		if ($disp_str153_lbl.equalsIgnoreCase(name)) {
			disp_str153_lbl(value);
			return;
		}
		if ($disp_str154_lbl.equalsIgnoreCase(name)) {
			disp_str154_lbl(value);
			return;
		}
		if ($disp_str155_lbl.equalsIgnoreCase(name)) {
			disp_str155_lbl(value);
			return;
		}
		if ($disp_str156_lbl.equalsIgnoreCase(name)) {
			disp_str156_lbl(value);
			return;
		}
		if ($disp_str157_lbl.equalsIgnoreCase(name)) {
			disp_str157_lbl(value);
			return;
		}
		if ($disp_str158_lbl.equalsIgnoreCase(name)) {
			disp_str158_lbl(value);
			return;
		}
		if ($disp_str159_lbl.equalsIgnoreCase(name)) {
			disp_str159_lbl(value);
			return;
		}
		if ($disp_str160_lbl.equalsIgnoreCase(name)) {
			disp_str160_lbl(value);
			return;
		}
		if ($disp_str161_lbl.equalsIgnoreCase(name)) {
			disp_str161_lbl(value);
			return;
		}
		if ($disp_str162_lbl.equalsIgnoreCase(name)) {
			disp_str162_lbl(value);
			return;
		}
		if ($disp_str163_lbl.equalsIgnoreCase(name)) {
			disp_str163_lbl(value);
			return;
		}
		if ($disp_str164_lbl.equalsIgnoreCase(name)) {
			disp_str164_lbl(value);
			return;
		}
		if ($disp_str165_lbl.equalsIgnoreCase(name)) {
			disp_str165_lbl(value);
			return;
		}
		if ($disp_str166_lbl.equalsIgnoreCase(name)) {
			disp_str166_lbl(value);
			return;
		}
		if ($disp_str167_lbl.equalsIgnoreCase(name)) {
			disp_str167_lbl(value);
			return;
		}
		if ($disp_str168_lbl.equalsIgnoreCase(name)) {
			disp_str168_lbl(value);
			return;
		}
		if ($disp_str169_lbl.equalsIgnoreCase(name)) {
			disp_str169_lbl(value);
			return;
		}
		if ($disp_str170_lbl.equalsIgnoreCase(name)) {
			disp_str170_lbl(value);
			return;
		}
		if ($disp_str171_lbl.equalsIgnoreCase(name)) {
			disp_str171_lbl(value);
			return;
		}
		if ($disp_str172_lbl.equalsIgnoreCase(name)) {
			disp_str172_lbl(value);
			return;
		}
		if ($disp_str173_lbl.equalsIgnoreCase(name)) {
			disp_str173_lbl(value);
			return;
		}
		if ($disp_str174_lbl.equalsIgnoreCase(name)) {
			disp_str174_lbl(value);
			return;
		}
		if ($disp_str175_lbl.equalsIgnoreCase(name)) {
			disp_str175_lbl(value);
			return;
		}
		if ($disp_str176_lbl.equalsIgnoreCase(name)) {
			disp_str176_lbl(value);
			return;
		}
		if ($disp_str177_lbl.equalsIgnoreCase(name)) {
			disp_str177_lbl(value);
			return;
		}
		if ($disp_str178_lbl.equalsIgnoreCase(name)) {
			disp_str178_lbl(value);
			return;
		}
		if ($disp_str179_lbl.equalsIgnoreCase(name)) {
			disp_str179_lbl(value);
			return;
		}
		if ($disp_str180_lbl.equalsIgnoreCase(name)) {
			disp_str180_lbl(value);
			return;
		}
		if ($disp_str181_lbl.equalsIgnoreCase(name)) {
			disp_str181_lbl(value);
			return;
		}
		if ($disp_str182_lbl.equalsIgnoreCase(name)) {
			disp_str182_lbl(value);
			return;
		}
		if ($disp_str183_lbl.equalsIgnoreCase(name)) {
			disp_str183_lbl(value);
			return;
		}
		if ($disp_str184_lbl.equalsIgnoreCase(name)) {
			disp_str184_lbl(value);
			return;
		}
		if ($disp_str185_lbl.equalsIgnoreCase(name)) {
			disp_str185_lbl(value);
			return;
		}
		if ($disp_str186_lbl.equalsIgnoreCase(name)) {
			disp_str186_lbl(value);
			return;
		}
		if ($disp_str187_lbl.equalsIgnoreCase(name)) {
			disp_str187_lbl(value);
			return;
		}
		if ($disp_str188_lbl.equalsIgnoreCase(name)) {
			disp_str188_lbl(value);
			return;
		}
		if ($disp_str189_lbl.equalsIgnoreCase(name)) {
			disp_str189_lbl(value);
			return;
		}
		if ($disp_str190_lbl.equalsIgnoreCase(name)) {
			disp_str190_lbl(value);
			return;
		}
		if ($disp_str191_lbl.equalsIgnoreCase(name)) {
			disp_str191_lbl(value);
			return;
		}
		if ($disp_str192_lbl.equalsIgnoreCase(name)) {
			disp_str192_lbl(value);
			return;
		}
		if ($disp_str193_lbl.equalsIgnoreCase(name)) {
			disp_str193_lbl(value);
			return;
		}
		if ($disp_str194_lbl.equalsIgnoreCase(name)) {
			disp_str194_lbl(value);
			return;
		}
		if ($disp_str195_lbl.equalsIgnoreCase(name)) {
			disp_str195_lbl(value);
			return;
		}
		if ($disp_str196_lbl.equalsIgnoreCase(name)) {
			disp_str196_lbl(value);
			return;
		}
		if ($disp_str197_lbl.equalsIgnoreCase(name)) {
			disp_str197_lbl(value);
			return;
		}
		if ($disp_str198_lbl.equalsIgnoreCase(name)) {
			disp_str198_lbl(value);
			return;
		}
		if ($disp_str199_lbl.equalsIgnoreCase(name)) {
			disp_str199_lbl(value);
			return;
		}
		if ($disp_str200_lbl.equalsIgnoreCase(name)) {
			disp_str200_lbl(value);
			return;
		}
		if ($disp_dt001_lbl.equalsIgnoreCase(name)) {
			disp_dt001_lbl(value);
			return;
		}
		if ($disp_dt002_lbl.equalsIgnoreCase(name)) {
			disp_dt002_lbl(value);
			return;
		}
		if ($disp_dt003_lbl.equalsIgnoreCase(name)) {
			disp_dt003_lbl(value);
			return;
		}
		if ($disp_dt004_lbl.equalsIgnoreCase(name)) {
			disp_dt004_lbl(value);
			return;
		}
		if ($disp_dt005_lbl.equalsIgnoreCase(name)) {
			disp_dt005_lbl(value);
			return;
		}
		if ($disp_dt006_lbl.equalsIgnoreCase(name)) {
			disp_dt006_lbl(value);
			return;
		}
		if ($disp_dt007_lbl.equalsIgnoreCase(name)) {
			disp_dt007_lbl(value);
			return;
		}
		if ($disp_dt008_lbl.equalsIgnoreCase(name)) {
			disp_dt008_lbl(value);
			return;
		}
		if ($disp_dt009_lbl.equalsIgnoreCase(name)) {
			disp_dt009_lbl(value);
			return;
		}
		if ($disp_dt010_lbl.equalsIgnoreCase(name)) {
			disp_dt010_lbl(value);
			return;
		}
		if ($disp_num001_lbl.equalsIgnoreCase(name)) {
			disp_num001_lbl(value);
			return;
		}
		if ($disp_num002_lbl.equalsIgnoreCase(name)) {
			disp_num002_lbl(value);
			return;
		}
		if ($disp_num003_lbl.equalsIgnoreCase(name)) {
			disp_num003_lbl(value);
			return;
		}
		if ($disp_num004_lbl.equalsIgnoreCase(name)) {
			disp_num004_lbl(value);
			return;
		}
		if ($disp_num005_lbl.equalsIgnoreCase(name)) {
			disp_num005_lbl(value);
			return;
		}
		if ($disp_num006_lbl.equalsIgnoreCase(name)) {
			disp_num006_lbl(value);
			return;
		}
		if ($disp_num007_lbl.equalsIgnoreCase(name)) {
			disp_num007_lbl(value);
			return;
		}
		if ($disp_num008_lbl.equalsIgnoreCase(name)) {
			disp_num008_lbl(value);
			return;
		}
		if ($disp_num009_lbl.equalsIgnoreCase(name)) {
			disp_num009_lbl(value);
			return;
		}
		if ($disp_num010_lbl.equalsIgnoreCase(name)) {
			disp_num010_lbl(value);
			return;
		}
		if ($add_col_lbl.equalsIgnoreCase(name)) {
			add_col_lbl(value);
			return;
		}
		if ($add_col_typ.equalsIgnoreCase(name)) {
			add_col_typ(value);
			return;
		}
		if ($add_col_nm.equalsIgnoreCase(name)) {
			add_col_nm(value);
			return;
		}
		if ($sort_info.equalsIgnoreCase(name)) {
			sort_info(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

