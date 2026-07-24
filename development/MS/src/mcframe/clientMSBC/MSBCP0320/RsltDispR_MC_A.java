package mcframe.clientMSBC.MSBCP0320;

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
 * ブロック"RsltDisp"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltDispR_MC_A extends MCConstRow {

	/**
	 * Label ラベル.<p>
	 *
	 */
	public static final String $label = "label";
	/**
	 * Cd. コード.<p>
	 *
	 */
	public static final String $code = "code";
	/**
	 * Name 名称.<p>
	 *
	 */
	public static final String $name = "name";
	/**
	 * Column type 項目区分.<p>
	 *
	 */
	public static final String $row_title_col = "row_title_col";
	/**
	 * Column 項目.<p>
	 *
	 */
	public static final String $row_title_nm = "row_title_nm";
	public static final String $qty01_p = "qty01_p";
	public static final String $qty02_p = "qty02_p";
	public static final String $qty03_p = "qty03_p";
	public static final String $qty04_p = "qty04_p";
	public static final String $qty05_p = "qty05_p";
	public static final String $qty06_p = "qty06_p";
	public static final String $qty07_p = "qty07_p";
	public static final String $qty08_p = "qty08_p";
	public static final String $qty09_p = "qty09_p";
	public static final String $qty10_p = "qty10_p";
	public static final String $qty11_p = "qty11_p";
	public static final String $qty12_p = "qty12_p";
	public static final String $qty13_p = "qty13_p";
	public static final String $qty14_p = "qty14_p";
	public static final String $qty15_p = "qty15_p";
	public static final String $qty16_p = "qty16_p";
	public static final String $qty17_p = "qty17_p";
	public static final String $qty18_p = "qty18_p";
	public static final String $qty19_p = "qty19_p";
	public static final String $qty20_p = "qty20_p";
	public static final String $qty21_p = "qty21_p";
	public static final String $qty22_p = "qty22_p";
	public static final String $qty23_p = "qty23_p";
	public static final String $qty24_p = "qty24_p";
	public static final String $qty25_p = "qty25_p";
	public static final String $qty26_p = "qty26_p";
	public static final String $qty27_p = "qty27_p";
	public static final String $qty28_p = "qty28_p";
	public static final String $qty29_p = "qty29_p";
	public static final String $qty30_p = "qty30_p";
	public static final String $qty31_p = "qty31_p";
	public static final String $qty32_p = "qty32_p";
	public static final String $qty33_p = "qty33_p";
	public static final String $qty34_p = "qty34_p";
	public static final String $qty35_p = "qty35_p";
	public static final String $qty36_p = "qty36_p";
	public static final String $qty37_p = "qty37_p";
	public static final String $qty38_p = "qty38_p";
	public static final String $qty39_p = "qty39_p";
	public static final String $qty40_p = "qty40_p";
	public static final String $qty41_p = "qty41_p";
	public static final String $qty42_p = "qty42_p";
	public static final String $qty43_p = "qty43_p";
	public static final String $qty44_p = "qty44_p";
	public static final String $qty45_p = "qty45_p";
	public static final String $qty46_p = "qty46_p";
	public static final String $qty47_p = "qty47_p";
	public static final String $qty48_p = "qty48_p";
	public static final String $qty49_p = "qty49_p";
	public static final String $qty50_p = "qty50_p";
	public static final String $qty51_p = "qty51_p";
	public static final String $qty52_p = "qty52_p";
	public static final String $qty53_p = "qty53_p";
	public static final String $qty54_p = "qty54_p";
	public static final String $qty55_p = "qty55_p";
	public static final String $qty56_p = "qty56_p";
	public static final String $qty57_p = "qty57_p";
	public static final String $qty58_p = "qty58_p";
	public static final String $qty59_p = "qty59_p";
	public static final String $qty60_p = "qty60_p";
	public static final String $qty61_p = "qty61_p";
	public static final String $qty62_p = "qty62_p";
	public static final String $qty63_p = "qty63_p";
	public static final String $qty64_p = "qty64_p";
	public static final String $qty65_p = "qty65_p";
	public static final String $qty66_p = "qty66_p";
	public static final String $qty67_p = "qty67_p";
	public static final String $qty68_p = "qty68_p";
	public static final String $qty69_p = "qty69_p";
	public static final String $qty70_p = "qty70_p";
	public static final String $qty71_p = "qty71_p";
	public static final String $qty72_p = "qty72_p";
	public static final String $qty73_p = "qty73_p";
	public static final String $qty74_p = "qty74_p";
	public static final String $qty75_p = "qty75_p";
	public static final String $qty76_p = "qty76_p";
	public static final String $qty77_p = "qty77_p";
	public static final String $qty78_p = "qty78_p";
	public static final String $qty79_p = "qty79_p";
	public static final String $qty80_p = "qty80_p";
	public static final String $qty81_p = "qty81_p";
	public static final String $qty82_p = "qty82_p";
	public static final String $qty83_p = "qty83_p";
	public static final String $qty84_p = "qty84_p";
	public static final String $qty85_p = "qty85_p";
	public static final String $qty86_p = "qty86_p";
	public static final String $qty87_p = "qty87_p";
	public static final String $qty88_p = "qty88_p";
	public static final String $qty89_p = "qty89_p";
	public static final String $qty90_p = "qty90_p";
	public static final String $qty91_p = "qty91_p";
	public static final String $qty92_p = "qty92_p";
	public static final String $qty93_p = "qty93_p";
	/**
	 * Holiday 01 休日０１.<p>
	 *
	 */
	public static final String $holiday01_flg = "holiday01_flg";
	/**
	 * Holiday 02 休日０２.<p>
	 *
	 */
	public static final String $holiday02_flg = "holiday02_flg";
	/**
	 * Holiday 03 休日０３.<p>
	 *
	 */
	public static final String $holiday03_flg = "holiday03_flg";
	/**
	 * Holiday 04 休日０４.<p>
	 *
	 */
	public static final String $holiday04_flg = "holiday04_flg";
	/**
	 * Holiday 05 休日０５.<p>
	 *
	 */
	public static final String $holiday05_flg = "holiday05_flg";
	/**
	 * Holiday 06 休日０６.<p>
	 *
	 */
	public static final String $holiday06_flg = "holiday06_flg";
	/**
	 * Holiday 07 休日０７.<p>
	 *
	 */
	public static final String $holiday07_flg = "holiday07_flg";
	/**
	 * Holiday 08 休日０８.<p>
	 *
	 */
	public static final String $holiday08_flg = "holiday08_flg";
	/**
	 * Holiday 09 休日０９.<p>
	 *
	 */
	public static final String $holiday09_flg = "holiday09_flg";
	/**
	 * Holiday 10 休日１０.<p>
	 *
	 */
	public static final String $holiday10_flg = "holiday10_flg";
	/**
	 * Holiday 11 休日１１.<p>
	 *
	 */
	public static final String $holiday11_flg = "holiday11_flg";
	/**
	 * Holiday 12 休日１２.<p>
	 *
	 */
	public static final String $holiday12_flg = "holiday12_flg";
	/**
	 * Holiday 13 休日１３.<p>
	 *
	 */
	public static final String $holiday13_flg = "holiday13_flg";
	/**
	 * Holiday 14 休日１４.<p>
	 *
	 */
	public static final String $holiday14_flg = "holiday14_flg";
	/**
	 * Holiday 15 休日１５.<p>
	 *
	 */
	public static final String $holiday15_flg = "holiday15_flg";
	/**
	 * Holiday 16 休日１６.<p>
	 *
	 */
	public static final String $holiday16_flg = "holiday16_flg";
	/**
	 * Holiday 17 休日１７.<p>
	 *
	 */
	public static final String $holiday17_flg = "holiday17_flg";
	/**
	 * Holiday 18 休日１８.<p>
	 *
	 */
	public static final String $holiday18_flg = "holiday18_flg";
	/**
	 * Holiday 19 休日１９.<p>
	 *
	 */
	public static final String $holiday19_flg = "holiday19_flg";
	/**
	 * Holiday 20 休日２０.<p>
	 *
	 */
	public static final String $holiday20_flg = "holiday20_flg";
	/**
	 * Holiday 21 休日２１.<p>
	 *
	 */
	public static final String $holiday21_flg = "holiday21_flg";
	/**
	 * Holiday 22 休日２２.<p>
	 *
	 */
	public static final String $holiday22_flg = "holiday22_flg";
	/**
	 * Holiday 23 休日２３.<p>
	 *
	 */
	public static final String $holiday23_flg = "holiday23_flg";
	/**
	 * Holiday 24 休日２４.<p>
	 *
	 */
	public static final String $holiday24_flg = "holiday24_flg";
	/**
	 * Holiday 25 休日２５.<p>
	 *
	 */
	public static final String $holiday25_flg = "holiday25_flg";
	/**
	 * Holiday 26 休日２６.<p>
	 *
	 */
	public static final String $holiday26_flg = "holiday26_flg";
	/**
	 * Holiday 27 休日２７.<p>
	 *
	 */
	public static final String $holiday27_flg = "holiday27_flg";
	/**
	 * Holiday 28 休日２８.<p>
	 *
	 */
	public static final String $holiday28_flg = "holiday28_flg";
	/**
	 * Holiday 29 休日２９.<p>
	 *
	 */
	public static final String $holiday29_flg = "holiday29_flg";
	/**
	 * Holiday 30 休日３０.<p>
	 *
	 */
	public static final String $holiday30_flg = "holiday30_flg";
	/**
	 * Holiday 31 休日３１.<p>
	 *
	 */
	public static final String $holiday31_flg = "holiday31_flg";
	/**
	 * Holiday 32 休日３２.<p>
	 *
	 */
	public static final String $holiday32_flg = "holiday32_flg";
	/**
	 * Holiday 33 休日３３.<p>
	 *
	 */
	public static final String $holiday33_flg = "holiday33_flg";
	/**
	 * Holiday 34 休日３４.<p>
	 *
	 */
	public static final String $holiday34_flg = "holiday34_flg";
	/**
	 * Holiday 35 休日３５.<p>
	 *
	 */
	public static final String $holiday35_flg = "holiday35_flg";
	/**
	 * Holiday 36 休日３６.<p>
	 *
	 */
	public static final String $holiday36_flg = "holiday36_flg";
	/**
	 * Holiday 37 休日３７.<p>
	 *
	 */
	public static final String $holiday37_flg = "holiday37_flg";
	/**
	 * Holiday 38 休日３８.<p>
	 *
	 */
	public static final String $holiday38_flg = "holiday38_flg";
	/**
	 * Holiday 39 休日３９.<p>
	 *
	 */
	public static final String $holiday39_flg = "holiday39_flg";
	/**
	 * Holiday 40 休日４０.<p>
	 *
	 */
	public static final String $holiday40_flg = "holiday40_flg";
	/**
	 * Holiday 41 休日４１.<p>
	 *
	 */
	public static final String $holiday41_flg = "holiday41_flg";
	/**
	 * Holiday 42 休日４２.<p>
	 *
	 */
	public static final String $holiday42_flg = "holiday42_flg";
	/**
	 * Holiday 43 休日４３.<p>
	 *
	 */
	public static final String $holiday43_flg = "holiday43_flg";
	/**
	 * Holiday 44 休日４４.<p>
	 *
	 */
	public static final String $holiday44_flg = "holiday44_flg";
	/**
	 * Holiday 45 休日４５.<p>
	 *
	 */
	public static final String $holiday45_flg = "holiday45_flg";
	/**
	 * Holiday 46 休日４６.<p>
	 *
	 */
	public static final String $holiday46_flg = "holiday46_flg";
	/**
	 * Holiday 47 休日４７.<p>
	 *
	 */
	public static final String $holiday47_flg = "holiday47_flg";
	/**
	 * Holiday 48 休日４８.<p>
	 *
	 */
	public static final String $holiday48_flg = "holiday48_flg";
	/**
	 * Holiday 49 休日４９.<p>
	 *
	 */
	public static final String $holiday49_flg = "holiday49_flg";
	/**
	 * Holiday 50 休日５０.<p>
	 *
	 */
	public static final String $holiday50_flg = "holiday50_flg";
	/**
	 * Holiday 51 休日５１.<p>
	 *
	 */
	public static final String $holiday51_flg = "holiday51_flg";
	/**
	 * Holiday 52 休日５２.<p>
	 *
	 */
	public static final String $holiday52_flg = "holiday52_flg";
	/**
	 * Holiday 53 休日５３.<p>
	 *
	 */
	public static final String $holiday53_flg = "holiday53_flg";
	/**
	 * Holiday 54 休日５４.<p>
	 *
	 */
	public static final String $holiday54_flg = "holiday54_flg";
	/**
	 * Holiday 55 休日５５.<p>
	 *
	 */
	public static final String $holiday55_flg = "holiday55_flg";
	/**
	 * Holiday 56 休日５６.<p>
	 *
	 */
	public static final String $holiday56_flg = "holiday56_flg";
	/**
	 * Holiday 57 休日５７.<p>
	 *
	 */
	public static final String $holiday57_flg = "holiday57_flg";
	/**
	 * Holiday 58 休日５８.<p>
	 *
	 */
	public static final String $holiday58_flg = "holiday58_flg";
	/**
	 * Holiday 59 休日５９.<p>
	 *
	 */
	public static final String $holiday59_flg = "holiday59_flg";
	/**
	 * Holiday 60 休日６０.<p>
	 *
	 */
	public static final String $holiday60_flg = "holiday60_flg";
	/**
	 * Holiday 61 休日６１.<p>
	 *
	 */
	public static final String $holiday61_flg = "holiday61_flg";
	/**
	 * Holiday 62 休日６２.<p>
	 *
	 */
	public static final String $holiday62_flg = "holiday62_flg";
	/**
	 * Holiday 63 休日６３.<p>
	 *
	 */
	public static final String $holiday63_flg = "holiday63_flg";
	/**
	 * Holiday 64 休日６４.<p>
	 *
	 */
	public static final String $holiday64_flg = "holiday64_flg";
	/**
	 * Holiday 65 休日６５.<p>
	 *
	 */
	public static final String $holiday65_flg = "holiday65_flg";
	/**
	 * Holiday 66 休日６６.<p>
	 *
	 */
	public static final String $holiday66_flg = "holiday66_flg";
	/**
	 * Holiday 67 休日６７.<p>
	 *
	 */
	public static final String $holiday67_flg = "holiday67_flg";
	/**
	 * Holiday 68 休日６８.<p>
	 *
	 */
	public static final String $holiday68_flg = "holiday68_flg";
	/**
	 * Holiday 69 休日６９.<p>
	 *
	 */
	public static final String $holiday69_flg = "holiday69_flg";
	/**
	 * Holiday 70 休日７０.<p>
	 *
	 */
	public static final String $holiday70_flg = "holiday70_flg";
	/**
	 * Holiday 71 休日７１.<p>
	 *
	 */
	public static final String $holiday71_flg = "holiday71_flg";
	/**
	 * Holiday 72 休日７２.<p>
	 *
	 */
	public static final String $holiday72_flg = "holiday72_flg";
	/**
	 * Holiday 73 休日７３.<p>
	 *
	 */
	public static final String $holiday73_flg = "holiday73_flg";
	/**
	 * Holiday 74 休日７４.<p>
	 *
	 */
	public static final String $holiday74_flg = "holiday74_flg";
	/**
	 * Holiday 75 休日７５.<p>
	 *
	 */
	public static final String $holiday75_flg = "holiday75_flg";
	/**
	 * Holiday 76 休日７６.<p>
	 *
	 */
	public static final String $holiday76_flg = "holiday76_flg";
	/**
	 * Holiday 77 休日７７.<p>
	 *
	 */
	public static final String $holiday77_flg = "holiday77_flg";
	/**
	 * Holiday 78 休日７８.<p>
	 *
	 */
	public static final String $holiday78_flg = "holiday78_flg";
	/**
	 * Holiday 79 休日７９.<p>
	 *
	 */
	public static final String $holiday79_flg = "holiday79_flg";
	/**
	 * Holiday 80 休日８０.<p>
	 *
	 */
	public static final String $holiday80_flg = "holiday80_flg";
	/**
	 * Holiday 81 休日８１.<p>
	 *
	 */
	public static final String $holiday81_flg = "holiday81_flg";
	/**
	 * Holiday 82 休日８２.<p>
	 *
	 */
	public static final String $holiday82_flg = "holiday82_flg";
	/**
	 * Holiday 83 休日８３.<p>
	 *
	 */
	public static final String $holiday83_flg = "holiday83_flg";
	/**
	 * Holiday 84 休日８４.<p>
	 *
	 */
	public static final String $holiday84_flg = "holiday84_flg";
	/**
	 * Holiday 85 休日８５.<p>
	 *
	 */
	public static final String $holiday85_flg = "holiday85_flg";
	/**
	 * Holiday 86 休日８６.<p>
	 *
	 */
	public static final String $holiday86_flg = "holiday86_flg";
	/**
	 * Holiday 87 休日８７.<p>
	 *
	 */
	public static final String $holiday87_flg = "holiday87_flg";
	/**
	 * Holiday 88 休日８８.<p>
	 *
	 */
	public static final String $holiday88_flg = "holiday88_flg";
	/**
	 * Holiday 89 休日８９.<p>
	 *
	 */
	public static final String $holiday89_flg = "holiday89_flg";
	/**
	 * Holiday 90 休日９０.<p>
	 *
	 */
	public static final String $holiday90_flg = "holiday90_flg";
	/**
	 * Holiday 91 休日９１.<p>
	 *
	 */
	public static final String $holiday91_flg = "holiday91_flg";
	/**
	 * Holiday 92 休日９２.<p>
	 *
	 */
	public static final String $holiday92_flg = "holiday92_flg";
	/**
	 * Holiday 93 休日９３.<p>
	 *
	 */
	public static final String $holiday93_flg = "holiday93_flg";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public static final String $rsrc_cd = "rsrc_cd";
	/**
	 * Resource name 資源名.<p>
	 *
	 */
	public static final String $rsrc_nm = "rsrc_nm";
	/**
	 * Resource unit cd. 資源単位ＣＤ.<p>
	 *
	 */
	public static final String $rsrc_unit_cd = "rsrc_unit_cd";
	/**
	 * Resource unit name 資源単位名.<p>
	 *
	 */
	public static final String $rsrc_unit_nm = "rsrc_unit_nm";
	/**
	 * Resource number of decimal places name 資源小数部有効桁数名.<p>
	 *
	 */
	public static final String $rsrc_dec_place = "rsrc_dec_place";
	/**
	 * Location resource display order 場所資源表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Location master label 場所ラベル.<p>
	 *
	 */
	public static final String $label_loc = "label_loc";
	/**
	 * Resource label 資源ラベル.<p>
	 *
	 */
	public static final String $label_rsrc = "label_rsrc";
	/**
	 * Unit label 単位ラベル.<p>
	 *
	 */
	public static final String $label_unit = "label_unit";
	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public static final String $record_id = "record_id";
	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public static final String $record_grp_id = "record_grp_id";

	public static final String $qty01 = $qty01_p + ".qty";
	public static final String $qty02 = $qty02_p + ".qty";
	public static final String $qty03 = $qty03_p + ".qty";
	public static final String $qty04 = $qty04_p + ".qty";
	public static final String $qty05 = $qty05_p + ".qty";
	public static final String $qty06 = $qty06_p + ".qty";
	public static final String $qty07 = $qty07_p + ".qty";
	public static final String $qty08 = $qty08_p + ".qty";
	public static final String $qty09 = $qty09_p + ".qty";
	public static final String $qty10 = $qty10_p + ".qty";
	public static final String $qty11 = $qty11_p + ".qty";
	public static final String $qty12 = $qty12_p + ".qty";
	public static final String $qty13 = $qty13_p + ".qty";
	public static final String $qty14 = $qty14_p + ".qty";
	public static final String $qty15 = $qty15_p + ".qty";
	public static final String $qty16 = $qty16_p + ".qty";
	public static final String $qty17 = $qty17_p + ".qty";
	public static final String $qty18 = $qty18_p + ".qty";
	public static final String $qty19 = $qty19_p + ".qty";
	public static final String $qty20 = $qty20_p + ".qty";
	public static final String $qty21 = $qty21_p + ".qty";
	public static final String $qty22 = $qty22_p + ".qty";
	public static final String $qty23 = $qty23_p + ".qty";
	public static final String $qty24 = $qty24_p + ".qty";
	public static final String $qty25 = $qty25_p + ".qty";
	public static final String $qty26 = $qty26_p + ".qty";
	public static final String $qty27 = $qty27_p + ".qty";
	public static final String $qty28 = $qty28_p + ".qty";
	public static final String $qty29 = $qty29_p + ".qty";
	public static final String $qty30 = $qty30_p + ".qty";
	public static final String $qty31 = $qty31_p + ".qty";
	public static final String $qty32 = $qty32_p + ".qty";
	public static final String $qty33 = $qty33_p + ".qty";
	public static final String $qty34 = $qty34_p + ".qty";
	public static final String $qty35 = $qty35_p + ".qty";
	public static final String $qty36 = $qty36_p + ".qty";
	public static final String $qty37 = $qty37_p + ".qty";
	public static final String $qty38 = $qty38_p + ".qty";
	public static final String $qty39 = $qty39_p + ".qty";
	public static final String $qty40 = $qty40_p + ".qty";
	public static final String $qty41 = $qty41_p + ".qty";
	public static final String $qty42 = $qty42_p + ".qty";
	public static final String $qty43 = $qty43_p + ".qty";
	public static final String $qty44 = $qty44_p + ".qty";
	public static final String $qty45 = $qty45_p + ".qty";
	public static final String $qty46 = $qty46_p + ".qty";
	public static final String $qty47 = $qty47_p + ".qty";
	public static final String $qty48 = $qty48_p + ".qty";
	public static final String $qty49 = $qty49_p + ".qty";
	public static final String $qty50 = $qty50_p + ".qty";
	public static final String $qty51 = $qty51_p + ".qty";
	public static final String $qty52 = $qty52_p + ".qty";
	public static final String $qty53 = $qty53_p + ".qty";
	public static final String $qty54 = $qty54_p + ".qty";
	public static final String $qty55 = $qty55_p + ".qty";
	public static final String $qty56 = $qty56_p + ".qty";
	public static final String $qty57 = $qty57_p + ".qty";
	public static final String $qty58 = $qty58_p + ".qty";
	public static final String $qty59 = $qty59_p + ".qty";
	public static final String $qty60 = $qty60_p + ".qty";
	public static final String $qty61 = $qty61_p + ".qty";
	public static final String $qty62 = $qty62_p + ".qty";
	public static final String $qty63 = $qty63_p + ".qty";
	public static final String $qty64 = $qty64_p + ".qty";
	public static final String $qty65 = $qty65_p + ".qty";
	public static final String $qty66 = $qty66_p + ".qty";
	public static final String $qty67 = $qty67_p + ".qty";
	public static final String $qty68 = $qty68_p + ".qty";
	public static final String $qty69 = $qty69_p + ".qty";
	public static final String $qty70 = $qty70_p + ".qty";
	public static final String $qty71 = $qty71_p + ".qty";
	public static final String $qty72 = $qty72_p + ".qty";
	public static final String $qty73 = $qty73_p + ".qty";
	public static final String $qty74 = $qty74_p + ".qty";
	public static final String $qty75 = $qty75_p + ".qty";
	public static final String $qty76 = $qty76_p + ".qty";
	public static final String $qty77 = $qty77_p + ".qty";
	public static final String $qty78 = $qty78_p + ".qty";
	public static final String $qty79 = $qty79_p + ".qty";
	public static final String $qty80 = $qty80_p + ".qty";
	public static final String $qty81 = $qty81_p + ".qty";
	public static final String $qty82 = $qty82_p + ".qty";
	public static final String $qty83 = $qty83_p + ".qty";
	public static final String $qty84 = $qty84_p + ".qty";
	public static final String $qty85 = $qty85_p + ".qty";
	public static final String $qty86 = $qty86_p + ".qty";
	public static final String $qty87 = $qty87_p + ".qty";
	public static final String $qty88 = $qty88_p + ".qty";
	public static final String $qty89 = $qty89_p + ".qty";
	public static final String $qty90 = $qty90_p + ".qty";
	public static final String $qty91 = $qty91_p + ".qty";
	public static final String $qty92 = $qty92_p + ".qty";
	public static final String $qty93 = $qty93_p + ".qty";

	public static final MCMeta label_META = createStringMeta($label);
	public static final MCMeta code_META = createStringMeta($code);
	public static final MCMeta name_META = createStringMeta($name);
	public static final MCMeta row_title_col_META = createCommonMeta($row_title_col, mcframe.commonMS.meta.MS_META.LD_DTL_TYP);
	public static final MCMeta row_title_nm_META = createCommonMeta($row_title_nm, mcframe.commonMS.meta.MS_META.LD_DTL_TYP_NM);
	public static final MCMeta qty01_p_META = createInnerRowMeta($qty01_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty02_p_META = createInnerRowMeta($qty02_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty03_p_META = createInnerRowMeta($qty03_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty04_p_META = createInnerRowMeta($qty04_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty05_p_META = createInnerRowMeta($qty05_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty06_p_META = createInnerRowMeta($qty06_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty07_p_META = createInnerRowMeta($qty07_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty08_p_META = createInnerRowMeta($qty08_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty09_p_META = createInnerRowMeta($qty09_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty10_p_META = createInnerRowMeta($qty10_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty11_p_META = createInnerRowMeta($qty11_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty12_p_META = createInnerRowMeta($qty12_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty13_p_META = createInnerRowMeta($qty13_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty14_p_META = createInnerRowMeta($qty14_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty15_p_META = createInnerRowMeta($qty15_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty16_p_META = createInnerRowMeta($qty16_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty17_p_META = createInnerRowMeta($qty17_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty18_p_META = createInnerRowMeta($qty18_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty19_p_META = createInnerRowMeta($qty19_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty20_p_META = createInnerRowMeta($qty20_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty21_p_META = createInnerRowMeta($qty21_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty22_p_META = createInnerRowMeta($qty22_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty23_p_META = createInnerRowMeta($qty23_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty24_p_META = createInnerRowMeta($qty24_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty25_p_META = createInnerRowMeta($qty25_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty26_p_META = createInnerRowMeta($qty26_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty27_p_META = createInnerRowMeta($qty27_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty28_p_META = createInnerRowMeta($qty28_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty29_p_META = createInnerRowMeta($qty29_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty30_p_META = createInnerRowMeta($qty30_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty31_p_META = createInnerRowMeta($qty31_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty32_p_META = createInnerRowMeta($qty32_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty33_p_META = createInnerRowMeta($qty33_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty34_p_META = createInnerRowMeta($qty34_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty35_p_META = createInnerRowMeta($qty35_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty36_p_META = createInnerRowMeta($qty36_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty37_p_META = createInnerRowMeta($qty37_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty38_p_META = createInnerRowMeta($qty38_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty39_p_META = createInnerRowMeta($qty39_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty40_p_META = createInnerRowMeta($qty40_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty41_p_META = createInnerRowMeta($qty41_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty42_p_META = createInnerRowMeta($qty42_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty43_p_META = createInnerRowMeta($qty43_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty44_p_META = createInnerRowMeta($qty44_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty45_p_META = createInnerRowMeta($qty45_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty46_p_META = createInnerRowMeta($qty46_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty47_p_META = createInnerRowMeta($qty47_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty48_p_META = createInnerRowMeta($qty48_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty49_p_META = createInnerRowMeta($qty49_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty50_p_META = createInnerRowMeta($qty50_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty51_p_META = createInnerRowMeta($qty51_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty52_p_META = createInnerRowMeta($qty52_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty53_p_META = createInnerRowMeta($qty53_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty54_p_META = createInnerRowMeta($qty54_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty55_p_META = createInnerRowMeta($qty55_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty56_p_META = createInnerRowMeta($qty56_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty57_p_META = createInnerRowMeta($qty57_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty58_p_META = createInnerRowMeta($qty58_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty59_p_META = createInnerRowMeta($qty59_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty60_p_META = createInnerRowMeta($qty60_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty61_p_META = createInnerRowMeta($qty61_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty62_p_META = createInnerRowMeta($qty62_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty63_p_META = createInnerRowMeta($qty63_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty64_p_META = createInnerRowMeta($qty64_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty65_p_META = createInnerRowMeta($qty65_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty66_p_META = createInnerRowMeta($qty66_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty67_p_META = createInnerRowMeta($qty67_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty68_p_META = createInnerRowMeta($qty68_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty69_p_META = createInnerRowMeta($qty69_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty70_p_META = createInnerRowMeta($qty70_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty71_p_META = createInnerRowMeta($qty71_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty72_p_META = createInnerRowMeta($qty72_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty73_p_META = createInnerRowMeta($qty73_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty74_p_META = createInnerRowMeta($qty74_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty75_p_META = createInnerRowMeta($qty75_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty76_p_META = createInnerRowMeta($qty76_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty77_p_META = createInnerRowMeta($qty77_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty78_p_META = createInnerRowMeta($qty78_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty79_p_META = createInnerRowMeta($qty79_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty80_p_META = createInnerRowMeta($qty80_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty81_p_META = createInnerRowMeta($qty81_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty82_p_META = createInnerRowMeta($qty82_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty83_p_META = createInnerRowMeta($qty83_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty84_p_META = createInnerRowMeta($qty84_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty85_p_META = createInnerRowMeta($qty85_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty86_p_META = createInnerRowMeta($qty86_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty87_p_META = createInnerRowMeta($qty87_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty88_p_META = createInnerRowMeta($qty88_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty89_p_META = createInnerRowMeta($qty89_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty90_p_META = createInnerRowMeta($qty90_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty91_p_META = createInnerRowMeta($qty91_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty92_p_META = createInnerRowMeta($qty92_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty93_p_META = createInnerRowMeta($qty93_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta holiday01_flg_META = createCommonMeta($holiday01_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday02_flg_META = createCommonMeta($holiday02_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday03_flg_META = createCommonMeta($holiday03_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday04_flg_META = createCommonMeta($holiday04_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday05_flg_META = createCommonMeta($holiday05_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday06_flg_META = createCommonMeta($holiday06_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday07_flg_META = createCommonMeta($holiday07_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday08_flg_META = createCommonMeta($holiday08_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday09_flg_META = createCommonMeta($holiday09_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday10_flg_META = createCommonMeta($holiday10_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday11_flg_META = createCommonMeta($holiday11_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday12_flg_META = createCommonMeta($holiday12_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday13_flg_META = createCommonMeta($holiday13_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday14_flg_META = createCommonMeta($holiday14_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday15_flg_META = createCommonMeta($holiday15_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday16_flg_META = createCommonMeta($holiday16_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday17_flg_META = createCommonMeta($holiday17_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday18_flg_META = createCommonMeta($holiday18_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday19_flg_META = createCommonMeta($holiday19_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday20_flg_META = createCommonMeta($holiday20_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday21_flg_META = createCommonMeta($holiday21_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday22_flg_META = createCommonMeta($holiday22_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday23_flg_META = createCommonMeta($holiday23_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday24_flg_META = createCommonMeta($holiday24_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday25_flg_META = createCommonMeta($holiday25_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday26_flg_META = createCommonMeta($holiday26_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday27_flg_META = createCommonMeta($holiday27_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday28_flg_META = createCommonMeta($holiday28_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday29_flg_META = createCommonMeta($holiday29_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday30_flg_META = createCommonMeta($holiday30_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday31_flg_META = createCommonMeta($holiday31_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday32_flg_META = createCommonMeta($holiday32_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday33_flg_META = createCommonMeta($holiday33_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday34_flg_META = createCommonMeta($holiday34_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday35_flg_META = createCommonMeta($holiday35_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday36_flg_META = createCommonMeta($holiday36_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday37_flg_META = createCommonMeta($holiday37_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday38_flg_META = createCommonMeta($holiday38_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday39_flg_META = createCommonMeta($holiday39_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday40_flg_META = createCommonMeta($holiday40_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday41_flg_META = createCommonMeta($holiday41_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday42_flg_META = createCommonMeta($holiday42_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday43_flg_META = createCommonMeta($holiday43_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday44_flg_META = createCommonMeta($holiday44_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday45_flg_META = createCommonMeta($holiday45_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday46_flg_META = createCommonMeta($holiday46_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday47_flg_META = createCommonMeta($holiday47_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday48_flg_META = createCommonMeta($holiday48_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday49_flg_META = createCommonMeta($holiday49_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday50_flg_META = createCommonMeta($holiday50_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday51_flg_META = createCommonMeta($holiday51_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday52_flg_META = createCommonMeta($holiday52_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday53_flg_META = createCommonMeta($holiday53_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday54_flg_META = createCommonMeta($holiday54_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday55_flg_META = createCommonMeta($holiday55_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday56_flg_META = createCommonMeta($holiday56_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday57_flg_META = createCommonMeta($holiday57_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday58_flg_META = createCommonMeta($holiday58_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday59_flg_META = createCommonMeta($holiday59_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday60_flg_META = createCommonMeta($holiday60_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday61_flg_META = createCommonMeta($holiday61_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday62_flg_META = createCommonMeta($holiday62_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday63_flg_META = createCommonMeta($holiday63_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday64_flg_META = createCommonMeta($holiday64_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday65_flg_META = createCommonMeta($holiday65_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday66_flg_META = createCommonMeta($holiday66_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday67_flg_META = createCommonMeta($holiday67_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday68_flg_META = createCommonMeta($holiday68_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday69_flg_META = createCommonMeta($holiday69_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday70_flg_META = createCommonMeta($holiday70_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday71_flg_META = createCommonMeta($holiday71_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday72_flg_META = createCommonMeta($holiday72_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday73_flg_META = createCommonMeta($holiday73_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday74_flg_META = createCommonMeta($holiday74_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday75_flg_META = createCommonMeta($holiday75_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday76_flg_META = createCommonMeta($holiday76_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday77_flg_META = createCommonMeta($holiday77_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday78_flg_META = createCommonMeta($holiday78_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday79_flg_META = createCommonMeta($holiday79_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday80_flg_META = createCommonMeta($holiday80_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday81_flg_META = createCommonMeta($holiday81_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday82_flg_META = createCommonMeta($holiday82_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday83_flg_META = createCommonMeta($holiday83_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday84_flg_META = createCommonMeta($holiday84_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday85_flg_META = createCommonMeta($holiday85_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday86_flg_META = createCommonMeta($holiday86_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday87_flg_META = createCommonMeta($holiday87_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday88_flg_META = createCommonMeta($holiday88_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday89_flg_META = createCommonMeta($holiday89_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday90_flg_META = createCommonMeta($holiday90_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday91_flg_META = createCommonMeta($holiday91_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday92_flg_META = createCommonMeta($holiday92_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta holiday93_flg_META = createCommonMeta($holiday93_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rsrc_cd_META = createCommonMeta($rsrc_cd, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta rsrc_nm_META = createCommonMeta($rsrc_nm, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_unit_cd_META = createCommonMeta($rsrc_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta rsrc_unit_nm_META = createCommonMeta($rsrc_unit_nm, mcframe.commonMA.meta.MA_META.RSRC_UNIT_NM);
	public static final MCMeta rsrc_dec_place_META = createCommonMeta($rsrc_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta label_loc_META = createStringMeta($label_loc);
	public static final MCMeta label_rsrc_META = createStringMeta($label_rsrc);
	public static final MCMeta label_unit_META = createStringMeta($label_unit);
	public static final MCMeta record_id_META = createNumberMeta($record_id);
	public static final MCMeta record_grp_id_META = createNumberMeta($record_grp_id);

	protected static final ConstMetaList<RsltDispR> constMetas = new ConstMetaList<RsltDispR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			label_META,
			code_META,
			name_META,
			row_title_col_META,
			row_title_nm_META,
			qty01_p_META,
			qty02_p_META,
			qty03_p_META,
			qty04_p_META,
			qty05_p_META,
			qty06_p_META,
			qty07_p_META,
			qty08_p_META,
			qty09_p_META,
			qty10_p_META,
			qty11_p_META,
			qty12_p_META,
			qty13_p_META,
			qty14_p_META,
			qty15_p_META,
			qty16_p_META,
			qty17_p_META,
			qty18_p_META,
			qty19_p_META,
			qty20_p_META,
			qty21_p_META,
			qty22_p_META,
			qty23_p_META,
			qty24_p_META,
			qty25_p_META,
			qty26_p_META,
			qty27_p_META,
			qty28_p_META,
			qty29_p_META,
			qty30_p_META,
			qty31_p_META,
			qty32_p_META,
			qty33_p_META,
			qty34_p_META,
			qty35_p_META,
			qty36_p_META,
			qty37_p_META,
			qty38_p_META,
			qty39_p_META,
			qty40_p_META,
			qty41_p_META,
			qty42_p_META,
			qty43_p_META,
			qty44_p_META,
			qty45_p_META,
			qty46_p_META,
			qty47_p_META,
			qty48_p_META,
			qty49_p_META,
			qty50_p_META,
			qty51_p_META,
			qty52_p_META,
			qty53_p_META,
			qty54_p_META,
			qty55_p_META,
			qty56_p_META,
			qty57_p_META,
			qty58_p_META,
			qty59_p_META,
			qty60_p_META,
			qty61_p_META,
			qty62_p_META,
			qty63_p_META,
			qty64_p_META,
			qty65_p_META,
			qty66_p_META,
			qty67_p_META,
			qty68_p_META,
			qty69_p_META,
			qty70_p_META,
			qty71_p_META,
			qty72_p_META,
			qty73_p_META,
			qty74_p_META,
			qty75_p_META,
			qty76_p_META,
			qty77_p_META,
			qty78_p_META,
			qty79_p_META,
			qty80_p_META,
			qty81_p_META,
			qty82_p_META,
			qty83_p_META,
			qty84_p_META,
			qty85_p_META,
			qty86_p_META,
			qty87_p_META,
			qty88_p_META,
			qty89_p_META,
			qty90_p_META,
			qty91_p_META,
			qty92_p_META,
			qty93_p_META,
			holiday01_flg_META,
			holiday02_flg_META,
			holiday03_flg_META,
			holiday04_flg_META,
			holiday05_flg_META,
			holiday06_flg_META,
			holiday07_flg_META,
			holiday08_flg_META,
			holiday09_flg_META,
			holiday10_flg_META,
			holiday11_flg_META,
			holiday12_flg_META,
			holiday13_flg_META,
			holiday14_flg_META,
			holiday15_flg_META,
			holiday16_flg_META,
			holiday17_flg_META,
			holiday18_flg_META,
			holiday19_flg_META,
			holiday20_flg_META,
			holiday21_flg_META,
			holiday22_flg_META,
			holiday23_flg_META,
			holiday24_flg_META,
			holiday25_flg_META,
			holiday26_flg_META,
			holiday27_flg_META,
			holiday28_flg_META,
			holiday29_flg_META,
			holiday30_flg_META,
			holiday31_flg_META,
			holiday32_flg_META,
			holiday33_flg_META,
			holiday34_flg_META,
			holiday35_flg_META,
			holiday36_flg_META,
			holiday37_flg_META,
			holiday38_flg_META,
			holiday39_flg_META,
			holiday40_flg_META,
			holiday41_flg_META,
			holiday42_flg_META,
			holiday43_flg_META,
			holiday44_flg_META,
			holiday45_flg_META,
			holiday46_flg_META,
			holiday47_flg_META,
			holiday48_flg_META,
			holiday49_flg_META,
			holiday50_flg_META,
			holiday51_flg_META,
			holiday52_flg_META,
			holiday53_flg_META,
			holiday54_flg_META,
			holiday55_flg_META,
			holiday56_flg_META,
			holiday57_flg_META,
			holiday58_flg_META,
			holiday59_flg_META,
			holiday60_flg_META,
			holiday61_flg_META,
			holiday62_flg_META,
			holiday63_flg_META,
			holiday64_flg_META,
			holiday65_flg_META,
			holiday66_flg_META,
			holiday67_flg_META,
			holiday68_flg_META,
			holiday69_flg_META,
			holiday70_flg_META,
			holiday71_flg_META,
			holiday72_flg_META,
			holiday73_flg_META,
			holiday74_flg_META,
			holiday75_flg_META,
			holiday76_flg_META,
			holiday77_flg_META,
			holiday78_flg_META,
			holiday79_flg_META,
			holiday80_flg_META,
			holiday81_flg_META,
			holiday82_flg_META,
			holiday83_flg_META,
			holiday84_flg_META,
			holiday85_flg_META,
			holiday86_flg_META,
			holiday87_flg_META,
			holiday88_flg_META,
			holiday89_flg_META,
			holiday90_flg_META,
			holiday91_flg_META,
			holiday92_flg_META,
			holiday93_flg_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			wg_cd_META,
			rsrc_cd_META,
			rsrc_nm_META,
			rsrc_unit_cd_META,
			rsrc_unit_nm_META,
			rsrc_dec_place_META,
			disp_seq_META,
			label_loc_META,
			label_rsrc_META,
			label_unit_META,
			record_id_META,
			record_grp_id_META
		},
		new String[][]{
			{
				"qty01",
				"qty02",
				"qty03",
				"qty04",
				"qty05",
				"qty06",
				"qty07",
				"qty08",
				"qty09",
				"qty10",
				"qty11",
				"qty12",
				"qty13",
				"qty14",
				"qty15",
				"qty16",
				"qty17",
				"qty18",
				"qty19",
				"qty20",
				"qty21",
				"qty22",
				"qty23",
				"qty24",
				"qty25",
				"qty26",
				"qty27",
				"qty28",
				"qty29",
				"qty30",
				"qty31",
				"qty32",
				"qty33",
				"qty34",
				"qty35",
				"qty36",
				"qty37",
				"qty38",
				"qty39",
				"qty40",
				"qty41",
				"qty42",
				"qty43",
				"qty44",
				"qty45",
				"qty46",
				"qty47",
				"qty48",
				"qty49",
				"qty50",
				"qty51",
				"qty52",
				"qty53",
				"qty54",
				"qty55",
				"qty56",
				"qty57",
				"qty58",
				"qty59",
				"qty60",
				"qty61",
				"qty62",
				"qty63",
				"qty64",
				"qty65",
				"qty66",
				"qty67",
				"qty68",
				"qty69",
				"qty70",
				"qty71",
				"qty72",
				"qty73",
				"qty74",
				"qty75",
				"qty76",
				"qty77",
				"qty78",
				"qty79",
				"qty80",
				"qty81",
				"qty82",
				"qty83",
				"qty84",
				"qty85",
				"qty86",
				"qty87",
				"qty88",
				"qty89",
				"qty90",
				"qty91",
				"qty92",
				"qty93"
			},
			{
				$qty01,
				$qty02,
				$qty03,
				$qty04,
				$qty05,
				$qty06,
				$qty07,
				$qty08,
				$qty09,
				$qty10,
				$qty11,
				$qty12,
				$qty13,
				$qty14,
				$qty15,
				$qty16,
				$qty17,
				$qty18,
				$qty19,
				$qty20,
				$qty21,
				$qty22,
				$qty23,
				$qty24,
				$qty25,
				$qty26,
				$qty27,
				$qty28,
				$qty29,
				$qty30,
				$qty31,
				$qty32,
				$qty33,
				$qty34,
				$qty35,
				$qty36,
				$qty37,
				$qty38,
				$qty39,
				$qty40,
				$qty41,
				$qty42,
				$qty43,
				$qty44,
				$qty45,
				$qty46,
				$qty47,
				$qty48,
				$qty49,
				$qty50,
				$qty51,
				$qty52,
				$qty53,
				$qty54,
				$qty55,
				$qty56,
				$qty57,
				$qty58,
				$qty59,
				$qty60,
				$qty61,
				$qty62,
				$qty63,
				$qty64,
				$qty65,
				$qty66,
				$qty67,
				$qty68,
				$qty69,
				$qty70,
				$qty71,
				$qty72,
				$qty73,
				$qty74,
				$qty75,
				$qty76,
				$qty77,
				$qty78,
				$qty79,
				$qty80,
				$qty81,
				$qty82,
				$qty83,
				$qty84,
				$qty85,
				$qty86,
				$qty87,
				$qty88,
				$qty89,
				$qty90,
				$qty91,
				$qty92,
				$qty93
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
	/** 項目属性情報のグループ[VH_KEY]のキー定数 */
	public static final String $$VH_KEY = "VH_KEY";
	/** 項目属性情報のグループ[VH_DISP_COL]のキー定数 */
	public static final String $$VH_DISP_COL = "VH_DISP_COL";
	/** 項目属性情報のグループ[VH_DISP_GRP]のキー定数 */
	public static final String $$VH_DISP_GRP = "VH_DISP_GRP";
	/** 項目属性情報のグループ[VH_DISP_IDX]のキー定数 */
	public static final String $$VH_DISP_IDX = "VH_DISP_IDX";
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
		new MCExtMap.Entry($$VH_KEY, new MCExtList(
			new String[][]{
				{$qty01_p + ".qty", "ELM"},	// qty01_p.qty
				{$qty02_p + ".qty", "ELM"},	// qty02_p.qty
				{$qty03_p + ".qty", "ELM"},	// qty03_p.qty
				{$qty04_p + ".qty", "ELM"},	// qty04_p.qty
				{$qty05_p + ".qty", "ELM"},	// qty05_p.qty
				{$qty06_p + ".qty", "ELM"},	// qty06_p.qty
				{$qty07_p + ".qty", "ELM"},	// qty07_p.qty
				{$qty08_p + ".qty", "ELM"},	// qty08_p.qty
				{$qty09_p + ".qty", "ELM"},	// qty09_p.qty
				{$qty10_p + ".qty", "ELM"},	// qty10_p.qty
				{$qty11_p + ".qty", "ELM"},	// qty11_p.qty
				{$qty12_p + ".qty", "ELM"},	// qty12_p.qty
				{$qty13_p + ".qty", "ELM"},	// qty13_p.qty
				{$qty14_p + ".qty", "ELM"},	// qty14_p.qty
				{$qty15_p + ".qty", "ELM"},	// qty15_p.qty
				{$qty16_p + ".qty", "ELM"},	// qty16_p.qty
				{$qty17_p + ".qty", "ELM"},	// qty17_p.qty
				{$qty18_p + ".qty", "ELM"},	// qty18_p.qty
				{$qty19_p + ".qty", "ELM"},	// qty19_p.qty
				{$qty20_p + ".qty", "ELM"},	// qty20_p.qty
				{$qty21_p + ".qty", "ELM"},	// qty21_p.qty
				{$qty22_p + ".qty", "ELM"},	// qty22_p.qty
				{$qty23_p + ".qty", "ELM"},	// qty23_p.qty
				{$qty24_p + ".qty", "ELM"},	// qty24_p.qty
				{$qty25_p + ".qty", "ELM"},	// qty25_p.qty
				{$qty26_p + ".qty", "ELM"},	// qty26_p.qty
				{$qty27_p + ".qty", "ELM"},	// qty27_p.qty
				{$qty28_p + ".qty", "ELM"},	// qty28_p.qty
				{$qty29_p + ".qty", "ELM"},	// qty29_p.qty
				{$qty30_p + ".qty", "ELM"},	// qty30_p.qty
				{$qty31_p + ".qty", "ELM"},	// qty31_p.qty
				{$qty32_p + ".qty", "ELM"},	// qty32_p.qty
				{$qty33_p + ".qty", "ELM"},	// qty33_p.qty
				{$qty34_p + ".qty", "ELM"},	// qty34_p.qty
				{$qty35_p + ".qty", "ELM"},	// qty35_p.qty
				{$qty36_p + ".qty", "ELM"},	// qty36_p.qty
				{$qty37_p + ".qty", "ELM"},	// qty37_p.qty
				{$qty38_p + ".qty", "ELM"},	// qty38_p.qty
				{$qty39_p + ".qty", "ELM"},	// qty39_p.qty
				{$qty40_p + ".qty", "ELM"},	// qty40_p.qty
				{$qty41_p + ".qty", "ELM"},	// qty41_p.qty
				{$qty42_p + ".qty", "ELM"},	// qty42_p.qty
				{$qty43_p + ".qty", "ELM"},	// qty43_p.qty
				{$qty44_p + ".qty", "ELM"},	// qty44_p.qty
				{$qty45_p + ".qty", "ELM"},	// qty45_p.qty
				{$qty46_p + ".qty", "ELM"},	// qty46_p.qty
				{$qty47_p + ".qty", "ELM"},	// qty47_p.qty
				{$qty48_p + ".qty", "ELM"},	// qty48_p.qty
				{$qty49_p + ".qty", "ELM"},	// qty49_p.qty
				{$qty50_p + ".qty", "ELM"},	// qty50_p.qty
				{$qty51_p + ".qty", "ELM"},	// qty51_p.qty
				{$qty52_p + ".qty", "ELM"},	// qty52_p.qty
				{$qty53_p + ".qty", "ELM"},	// qty53_p.qty
				{$qty54_p + ".qty", "ELM"},	// qty54_p.qty
				{$qty55_p + ".qty", "ELM"},	// qty55_p.qty
				{$qty56_p + ".qty", "ELM"},	// qty56_p.qty
				{$qty57_p + ".qty", "ELM"},	// qty57_p.qty
				{$qty58_p + ".qty", "ELM"},	// qty58_p.qty
				{$qty59_p + ".qty", "ELM"},	// qty59_p.qty
				{$qty60_p + ".qty", "ELM"},	// qty60_p.qty
				{$qty61_p + ".qty", "ELM"},	// qty61_p.qty
				{$qty62_p + ".qty", "ELM"},	// qty62_p.qty
				{$qty63_p + ".qty", "ELM"},	// qty63_p.qty
				{$qty64_p + ".qty", "ELM"},	// qty64_p.qty
				{$qty65_p + ".qty", "ELM"},	// qty65_p.qty
				{$qty66_p + ".qty", "ELM"},	// qty66_p.qty
				{$qty67_p + ".qty", "ELM"},	// qty67_p.qty
				{$qty68_p + ".qty", "ELM"},	// qty68_p.qty
				{$qty69_p + ".qty", "ELM"},	// qty69_p.qty
				{$qty70_p + ".qty", "ELM"},	// qty70_p.qty
				{$qty71_p + ".qty", "ELM"},	// qty71_p.qty
				{$qty72_p + ".qty", "ELM"},	// qty72_p.qty
				{$qty73_p + ".qty", "ELM"},	// qty73_p.qty
				{$qty74_p + ".qty", "ELM"},	// qty74_p.qty
				{$qty75_p + ".qty", "ELM"},	// qty75_p.qty
				{$qty76_p + ".qty", "ELM"},	// qty76_p.qty
				{$qty77_p + ".qty", "ELM"},	// qty77_p.qty
				{$qty78_p + ".qty", "ELM"},	// qty78_p.qty
				{$qty79_p + ".qty", "ELM"},	// qty79_p.qty
				{$qty80_p + ".qty", "ELM"},	// qty80_p.qty
				{$qty81_p + ".qty", "ELM"},	// qty81_p.qty
				{$qty82_p + ".qty", "ELM"},	// qty82_p.qty
				{$qty83_p + ".qty", "ELM"},	// qty83_p.qty
				{$qty84_p + ".qty", "ELM"},	// qty84_p.qty
				{$qty85_p + ".qty", "ELM"},	// qty85_p.qty
				{$qty86_p + ".qty", "ELM"},	// qty86_p.qty
				{$qty87_p + ".qty", "ELM"},	// qty87_p.qty
				{$qty88_p + ".qty", "ELM"},	// qty88_p.qty
				{$qty89_p + ".qty", "ELM"},	// qty89_p.qty
				{$qty90_p + ".qty", "ELM"},	// qty90_p.qty
				{$qty91_p + ".qty", "ELM"},	// qty91_p.qty
				{$qty92_p + ".qty", "ELM"},	// qty92_p.qty
				{$qty93_p + ".qty", "ELM"}	// qty93_p.qty
			}
		)),
		new MCExtMap.Entry($$VH_DISP_COL, new MCExtList(
			new String[][]{
				{$mfg_loc_cd, "code"},	// mfg_loc_cd
				{$mfg_loc_nm, "name"},	// mfg_loc_nm
				{$rsrc_cd, "code"},	// rsrc_cd
				{$rsrc_nm, "name"},	// rsrc_nm
				{$rsrc_unit_cd, "code"},	// rsrc_unit_cd
				{$rsrc_unit_nm, "name"},	// rsrc_unit_nm
				{$label_loc, "label"},	// label_loc
				{$label_rsrc, "label"},	// label_rsrc
				{$label_unit, "label"}	// label_unit
			}
		)),
		new MCExtMap.Entry($$VH_DISP_GRP, new MCExtList(
			new String[][]{
				{$mfg_loc_cd, "1"},	// mfg_loc_cd
				{$mfg_loc_nm, "1"},	// mfg_loc_nm
				{$rsrc_cd, "2"},	// rsrc_cd
				{$rsrc_nm, "2"},	// rsrc_nm
				{$rsrc_unit_cd, "3"},	// rsrc_unit_cd
				{$rsrc_unit_nm, "3"},	// rsrc_unit_nm
				{$label_loc, "1"},	// label_loc
				{$label_rsrc, "2"},	// label_rsrc
				{$label_unit, "3"}	// label_unit
			}
		)),
		new MCExtMap.Entry($$VH_DISP_IDX, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"}	// wg_cd
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
	protected RsltDispR_MC_A(ConstMetaList<? extends RsltDispR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltDispR clone() {
		return (RsltDispR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltDispR createInstance() {
		return (RsltDispR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltDispR getValues(String... names) {
		return (RsltDispR) super.getValues(names);
	}



	/**
	 * Label ラベル.<p>
	 *
	 */
	public String label() {
		return getConstString(offset + 0, $label);
	}

	/**
	 * Label ラベル.<p>
	 *
	 */
	public void label(String value) {
		setConstString(offset + 0, $label, value);
	}


	/**
	 * Cd. コード.<p>
	 *
	 */
	public String code() {
		return getConstString(offset + 1, $code);
	}

	/**
	 * Cd. コード.<p>
	 *
	 */
	public void code(String value) {
		setConstString(offset + 1, $code, value);
	}


	/**
	 * Name 名称.<p>
	 *
	 */
	public String name() {
		return getConstString(offset + 2, $name);
	}

	/**
	 * Name 名称.<p>
	 *
	 */
	public void name(String value) {
		setConstString(offset + 2, $name, value);
	}


	/**
	 * Column type 項目区分.<p>
	 *
	 */
	public String row_title_col() {
		return getConstString(offset + 3, $row_title_col);
	}

	/**
	 * Column type 項目区分.<p>
	 *
	 */
	public void row_title_col(String value) {
		setConstString(offset + 3, $row_title_col, value);
	}


	/**
	 * Column 項目.<p>
	 *
	 */
	public String row_title_nm() {
		return getConstString(offset + 4, $row_title_nm);
	}

	/**
	 * Column 項目.<p>
	 *
	 */
	public void row_title_nm(String value) {
		setConstString(offset + 4, $row_title_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty01_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 5, $qty01_p);
	}
	
	public void qty01_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 5, $qty01_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty02_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 6, $qty02_p);
	}
	
	public void qty02_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 6, $qty02_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty03_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 7, $qty03_p);
	}
	
	public void qty03_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 7, $qty03_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty04_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 8, $qty04_p);
	}
	
	public void qty04_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 8, $qty04_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty05_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 9, $qty05_p);
	}
	
	public void qty05_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 9, $qty05_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty06_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 10, $qty06_p);
	}
	
	public void qty06_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 10, $qty06_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty07_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 11, $qty07_p);
	}
	
	public void qty07_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 11, $qty07_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty08_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 12, $qty08_p);
	}
	
	public void qty08_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 12, $qty08_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty09_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 13, $qty09_p);
	}
	
	public void qty09_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 13, $qty09_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty10_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 14, $qty10_p);
	}
	
	public void qty10_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 14, $qty10_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty11_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 15, $qty11_p);
	}
	
	public void qty11_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 15, $qty11_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty12_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 16, $qty12_p);
	}
	
	public void qty12_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 16, $qty12_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty13_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 17, $qty13_p);
	}
	
	public void qty13_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 17, $qty13_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty14_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 18, $qty14_p);
	}
	
	public void qty14_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 18, $qty14_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty15_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 19, $qty15_p);
	}
	
	public void qty15_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 19, $qty15_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty16_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 20, $qty16_p);
	}
	
	public void qty16_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 20, $qty16_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty17_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 21, $qty17_p);
	}
	
	public void qty17_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 21, $qty17_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty18_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 22, $qty18_p);
	}
	
	public void qty18_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 22, $qty18_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty19_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 23, $qty19_p);
	}
	
	public void qty19_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 23, $qty19_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty20_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 24, $qty20_p);
	}
	
	public void qty20_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 24, $qty20_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty21_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 25, $qty21_p);
	}
	
	public void qty21_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 25, $qty21_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty22_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 26, $qty22_p);
	}
	
	public void qty22_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 26, $qty22_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty23_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 27, $qty23_p);
	}
	
	public void qty23_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 27, $qty23_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty24_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 28, $qty24_p);
	}
	
	public void qty24_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 28, $qty24_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty25_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 29, $qty25_p);
	}
	
	public void qty25_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 29, $qty25_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty26_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 30, $qty26_p);
	}
	
	public void qty26_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 30, $qty26_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty27_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 31, $qty27_p);
	}
	
	public void qty27_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 31, $qty27_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty28_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 32, $qty28_p);
	}
	
	public void qty28_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 32, $qty28_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty29_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 33, $qty29_p);
	}
	
	public void qty29_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 33, $qty29_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty30_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 34, $qty30_p);
	}
	
	public void qty30_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 34, $qty30_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty31_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 35, $qty31_p);
	}
	
	public void qty31_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 35, $qty31_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty32_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 36, $qty32_p);
	}
	
	public void qty32_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 36, $qty32_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty33_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 37, $qty33_p);
	}
	
	public void qty33_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 37, $qty33_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty34_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 38, $qty34_p);
	}
	
	public void qty34_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 38, $qty34_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty35_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 39, $qty35_p);
	}
	
	public void qty35_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 39, $qty35_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty36_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 40, $qty36_p);
	}
	
	public void qty36_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 40, $qty36_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty37_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 41, $qty37_p);
	}
	
	public void qty37_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 41, $qty37_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty38_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 42, $qty38_p);
	}
	
	public void qty38_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 42, $qty38_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty39_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 43, $qty39_p);
	}
	
	public void qty39_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 43, $qty39_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty40_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 44, $qty40_p);
	}
	
	public void qty40_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 44, $qty40_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty41_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 45, $qty41_p);
	}
	
	public void qty41_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 45, $qty41_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty42_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 46, $qty42_p);
	}
	
	public void qty42_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 46, $qty42_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty43_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 47, $qty43_p);
	}
	
	public void qty43_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 47, $qty43_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty44_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 48, $qty44_p);
	}
	
	public void qty44_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 48, $qty44_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty45_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 49, $qty45_p);
	}
	
	public void qty45_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 49, $qty45_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty46_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 50, $qty46_p);
	}
	
	public void qty46_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 50, $qty46_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty47_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 51, $qty47_p);
	}
	
	public void qty47_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 51, $qty47_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty48_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 52, $qty48_p);
	}
	
	public void qty48_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 52, $qty48_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty49_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 53, $qty49_p);
	}
	
	public void qty49_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 53, $qty49_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty50_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 54, $qty50_p);
	}
	
	public void qty50_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 54, $qty50_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty51_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 55, $qty51_p);
	}
	
	public void qty51_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 55, $qty51_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty52_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 56, $qty52_p);
	}
	
	public void qty52_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 56, $qty52_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty53_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 57, $qty53_p);
	}
	
	public void qty53_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 57, $qty53_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty54_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 58, $qty54_p);
	}
	
	public void qty54_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 58, $qty54_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty55_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 59, $qty55_p);
	}
	
	public void qty55_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 59, $qty55_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty56_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 60, $qty56_p);
	}
	
	public void qty56_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 60, $qty56_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty57_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 61, $qty57_p);
	}
	
	public void qty57_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 61, $qty57_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty58_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 62, $qty58_p);
	}
	
	public void qty58_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 62, $qty58_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty59_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 63, $qty59_p);
	}
	
	public void qty59_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 63, $qty59_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty60_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 64, $qty60_p);
	}
	
	public void qty60_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 64, $qty60_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty61_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 65, $qty61_p);
	}
	
	public void qty61_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 65, $qty61_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty62_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 66, $qty62_p);
	}
	
	public void qty62_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 66, $qty62_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty63_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 67, $qty63_p);
	}
	
	public void qty63_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 67, $qty63_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty64_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 68, $qty64_p);
	}
	
	public void qty64_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 68, $qty64_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty65_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 69, $qty65_p);
	}
	
	public void qty65_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 69, $qty65_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty66_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 70, $qty66_p);
	}
	
	public void qty66_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 70, $qty66_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty67_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 71, $qty67_p);
	}
	
	public void qty67_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 71, $qty67_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty68_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 72, $qty68_p);
	}
	
	public void qty68_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 72, $qty68_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty69_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 73, $qty69_p);
	}
	
	public void qty69_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 73, $qty69_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty70_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 74, $qty70_p);
	}
	
	public void qty70_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 74, $qty70_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty71_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 75, $qty71_p);
	}
	
	public void qty71_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 75, $qty71_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty72_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 76, $qty72_p);
	}
	
	public void qty72_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 76, $qty72_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty73_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 77, $qty73_p);
	}
	
	public void qty73_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 77, $qty73_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty74_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 78, $qty74_p);
	}
	
	public void qty74_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 78, $qty74_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty75_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 79, $qty75_p);
	}
	
	public void qty75_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 79, $qty75_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty76_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 80, $qty76_p);
	}
	
	public void qty76_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 80, $qty76_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty77_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 81, $qty77_p);
	}
	
	public void qty77_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 81, $qty77_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty78_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 82, $qty78_p);
	}
	
	public void qty78_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 82, $qty78_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty79_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 83, $qty79_p);
	}
	
	public void qty79_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 83, $qty79_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty80_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 84, $qty80_p);
	}
	
	public void qty80_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 84, $qty80_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty81_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 85, $qty81_p);
	}
	
	public void qty81_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 85, $qty81_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty82_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 86, $qty82_p);
	}
	
	public void qty82_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 86, $qty82_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty83_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 87, $qty83_p);
	}
	
	public void qty83_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 87, $qty83_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty84_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 88, $qty84_p);
	}
	
	public void qty84_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 88, $qty84_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty85_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 89, $qty85_p);
	}
	
	public void qty85_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 89, $qty85_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty86_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 90, $qty86_p);
	}
	
	public void qty86_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 90, $qty86_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty87_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 91, $qty87_p);
	}
	
	public void qty87_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 91, $qty87_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty88_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 92, $qty88_p);
	}
	
	public void qty88_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 92, $qty88_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty89_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 93, $qty89_p);
	}
	
	public void qty89_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 93, $qty89_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty90_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 94, $qty90_p);
	}
	
	public void qty90_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 94, $qty90_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty91_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 95, $qty91_p);
	}
	
	public void qty91_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 95, $qty91_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty92_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 96, $qty92_p);
	}
	
	public void qty92_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 96, $qty92_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty93_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 97, $qty93_p);
	}
	
	public void qty93_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 97, $qty93_p, row);
	}


	/**
	 * Holiday 01 休日０１.<p>
	 *
	 */
	public boolean holiday01_flg() {
		return getConstBoolean(offset + 98, $holiday01_flg);
	}

	/**
	 * Holiday 01 休日０１.<p>
	 *
	 */
	public void holiday01_flg(boolean value) {
		setConstBoolean(offset + 98, $holiday01_flg, value);
	}


	/**
	 * Holiday 02 休日０２.<p>
	 *
	 */
	public boolean holiday02_flg() {
		return getConstBoolean(offset + 99, $holiday02_flg);
	}

	/**
	 * Holiday 02 休日０２.<p>
	 *
	 */
	public void holiday02_flg(boolean value) {
		setConstBoolean(offset + 99, $holiday02_flg, value);
	}


	/**
	 * Holiday 03 休日０３.<p>
	 *
	 */
	public boolean holiday03_flg() {
		return getConstBoolean(offset + 100, $holiday03_flg);
	}

	/**
	 * Holiday 03 休日０３.<p>
	 *
	 */
	public void holiday03_flg(boolean value) {
		setConstBoolean(offset + 100, $holiday03_flg, value);
	}


	/**
	 * Holiday 04 休日０４.<p>
	 *
	 */
	public boolean holiday04_flg() {
		return getConstBoolean(offset + 101, $holiday04_flg);
	}

	/**
	 * Holiday 04 休日０４.<p>
	 *
	 */
	public void holiday04_flg(boolean value) {
		setConstBoolean(offset + 101, $holiday04_flg, value);
	}


	/**
	 * Holiday 05 休日０５.<p>
	 *
	 */
	public boolean holiday05_flg() {
		return getConstBoolean(offset + 102, $holiday05_flg);
	}

	/**
	 * Holiday 05 休日０５.<p>
	 *
	 */
	public void holiday05_flg(boolean value) {
		setConstBoolean(offset + 102, $holiday05_flg, value);
	}


	/**
	 * Holiday 06 休日０６.<p>
	 *
	 */
	public boolean holiday06_flg() {
		return getConstBoolean(offset + 103, $holiday06_flg);
	}

	/**
	 * Holiday 06 休日０６.<p>
	 *
	 */
	public void holiday06_flg(boolean value) {
		setConstBoolean(offset + 103, $holiday06_flg, value);
	}


	/**
	 * Holiday 07 休日０７.<p>
	 *
	 */
	public boolean holiday07_flg() {
		return getConstBoolean(offset + 104, $holiday07_flg);
	}

	/**
	 * Holiday 07 休日０７.<p>
	 *
	 */
	public void holiday07_flg(boolean value) {
		setConstBoolean(offset + 104, $holiday07_flg, value);
	}


	/**
	 * Holiday 08 休日０８.<p>
	 *
	 */
	public boolean holiday08_flg() {
		return getConstBoolean(offset + 105, $holiday08_flg);
	}

	/**
	 * Holiday 08 休日０８.<p>
	 *
	 */
	public void holiday08_flg(boolean value) {
		setConstBoolean(offset + 105, $holiday08_flg, value);
	}


	/**
	 * Holiday 09 休日０９.<p>
	 *
	 */
	public boolean holiday09_flg() {
		return getConstBoolean(offset + 106, $holiday09_flg);
	}

	/**
	 * Holiday 09 休日０９.<p>
	 *
	 */
	public void holiday09_flg(boolean value) {
		setConstBoolean(offset + 106, $holiday09_flg, value);
	}


	/**
	 * Holiday 10 休日１０.<p>
	 *
	 */
	public boolean holiday10_flg() {
		return getConstBoolean(offset + 107, $holiday10_flg);
	}

	/**
	 * Holiday 10 休日１０.<p>
	 *
	 */
	public void holiday10_flg(boolean value) {
		setConstBoolean(offset + 107, $holiday10_flg, value);
	}


	/**
	 * Holiday 11 休日１１.<p>
	 *
	 */
	public boolean holiday11_flg() {
		return getConstBoolean(offset + 108, $holiday11_flg);
	}

	/**
	 * Holiday 11 休日１１.<p>
	 *
	 */
	public void holiday11_flg(boolean value) {
		setConstBoolean(offset + 108, $holiday11_flg, value);
	}


	/**
	 * Holiday 12 休日１２.<p>
	 *
	 */
	public boolean holiday12_flg() {
		return getConstBoolean(offset + 109, $holiday12_flg);
	}

	/**
	 * Holiday 12 休日１２.<p>
	 *
	 */
	public void holiday12_flg(boolean value) {
		setConstBoolean(offset + 109, $holiday12_flg, value);
	}


	/**
	 * Holiday 13 休日１３.<p>
	 *
	 */
	public boolean holiday13_flg() {
		return getConstBoolean(offset + 110, $holiday13_flg);
	}

	/**
	 * Holiday 13 休日１３.<p>
	 *
	 */
	public void holiday13_flg(boolean value) {
		setConstBoolean(offset + 110, $holiday13_flg, value);
	}


	/**
	 * Holiday 14 休日１４.<p>
	 *
	 */
	public boolean holiday14_flg() {
		return getConstBoolean(offset + 111, $holiday14_flg);
	}

	/**
	 * Holiday 14 休日１４.<p>
	 *
	 */
	public void holiday14_flg(boolean value) {
		setConstBoolean(offset + 111, $holiday14_flg, value);
	}


	/**
	 * Holiday 15 休日１５.<p>
	 *
	 */
	public boolean holiday15_flg() {
		return getConstBoolean(offset + 112, $holiday15_flg);
	}

	/**
	 * Holiday 15 休日１５.<p>
	 *
	 */
	public void holiday15_flg(boolean value) {
		setConstBoolean(offset + 112, $holiday15_flg, value);
	}


	/**
	 * Holiday 16 休日１６.<p>
	 *
	 */
	public boolean holiday16_flg() {
		return getConstBoolean(offset + 113, $holiday16_flg);
	}

	/**
	 * Holiday 16 休日１６.<p>
	 *
	 */
	public void holiday16_flg(boolean value) {
		setConstBoolean(offset + 113, $holiday16_flg, value);
	}


	/**
	 * Holiday 17 休日１７.<p>
	 *
	 */
	public boolean holiday17_flg() {
		return getConstBoolean(offset + 114, $holiday17_flg);
	}

	/**
	 * Holiday 17 休日１７.<p>
	 *
	 */
	public void holiday17_flg(boolean value) {
		setConstBoolean(offset + 114, $holiday17_flg, value);
	}


	/**
	 * Holiday 18 休日１８.<p>
	 *
	 */
	public boolean holiday18_flg() {
		return getConstBoolean(offset + 115, $holiday18_flg);
	}

	/**
	 * Holiday 18 休日１８.<p>
	 *
	 */
	public void holiday18_flg(boolean value) {
		setConstBoolean(offset + 115, $holiday18_flg, value);
	}


	/**
	 * Holiday 19 休日１９.<p>
	 *
	 */
	public boolean holiday19_flg() {
		return getConstBoolean(offset + 116, $holiday19_flg);
	}

	/**
	 * Holiday 19 休日１９.<p>
	 *
	 */
	public void holiday19_flg(boolean value) {
		setConstBoolean(offset + 116, $holiday19_flg, value);
	}


	/**
	 * Holiday 20 休日２０.<p>
	 *
	 */
	public boolean holiday20_flg() {
		return getConstBoolean(offset + 117, $holiday20_flg);
	}

	/**
	 * Holiday 20 休日２０.<p>
	 *
	 */
	public void holiday20_flg(boolean value) {
		setConstBoolean(offset + 117, $holiday20_flg, value);
	}


	/**
	 * Holiday 21 休日２１.<p>
	 *
	 */
	public boolean holiday21_flg() {
		return getConstBoolean(offset + 118, $holiday21_flg);
	}

	/**
	 * Holiday 21 休日２１.<p>
	 *
	 */
	public void holiday21_flg(boolean value) {
		setConstBoolean(offset + 118, $holiday21_flg, value);
	}


	/**
	 * Holiday 22 休日２２.<p>
	 *
	 */
	public boolean holiday22_flg() {
		return getConstBoolean(offset + 119, $holiday22_flg);
	}

	/**
	 * Holiday 22 休日２２.<p>
	 *
	 */
	public void holiday22_flg(boolean value) {
		setConstBoolean(offset + 119, $holiday22_flg, value);
	}


	/**
	 * Holiday 23 休日２３.<p>
	 *
	 */
	public boolean holiday23_flg() {
		return getConstBoolean(offset + 120, $holiday23_flg);
	}

	/**
	 * Holiday 23 休日２３.<p>
	 *
	 */
	public void holiday23_flg(boolean value) {
		setConstBoolean(offset + 120, $holiday23_flg, value);
	}


	/**
	 * Holiday 24 休日２４.<p>
	 *
	 */
	public boolean holiday24_flg() {
		return getConstBoolean(offset + 121, $holiday24_flg);
	}

	/**
	 * Holiday 24 休日２４.<p>
	 *
	 */
	public void holiday24_flg(boolean value) {
		setConstBoolean(offset + 121, $holiday24_flg, value);
	}


	/**
	 * Holiday 25 休日２５.<p>
	 *
	 */
	public boolean holiday25_flg() {
		return getConstBoolean(offset + 122, $holiday25_flg);
	}

	/**
	 * Holiday 25 休日２５.<p>
	 *
	 */
	public void holiday25_flg(boolean value) {
		setConstBoolean(offset + 122, $holiday25_flg, value);
	}


	/**
	 * Holiday 26 休日２６.<p>
	 *
	 */
	public boolean holiday26_flg() {
		return getConstBoolean(offset + 123, $holiday26_flg);
	}

	/**
	 * Holiday 26 休日２６.<p>
	 *
	 */
	public void holiday26_flg(boolean value) {
		setConstBoolean(offset + 123, $holiday26_flg, value);
	}


	/**
	 * Holiday 27 休日２７.<p>
	 *
	 */
	public boolean holiday27_flg() {
		return getConstBoolean(offset + 124, $holiday27_flg);
	}

	/**
	 * Holiday 27 休日２７.<p>
	 *
	 */
	public void holiday27_flg(boolean value) {
		setConstBoolean(offset + 124, $holiday27_flg, value);
	}


	/**
	 * Holiday 28 休日２８.<p>
	 *
	 */
	public boolean holiday28_flg() {
		return getConstBoolean(offset + 125, $holiday28_flg);
	}

	/**
	 * Holiday 28 休日２８.<p>
	 *
	 */
	public void holiday28_flg(boolean value) {
		setConstBoolean(offset + 125, $holiday28_flg, value);
	}


	/**
	 * Holiday 29 休日２９.<p>
	 *
	 */
	public boolean holiday29_flg() {
		return getConstBoolean(offset + 126, $holiday29_flg);
	}

	/**
	 * Holiday 29 休日２９.<p>
	 *
	 */
	public void holiday29_flg(boolean value) {
		setConstBoolean(offset + 126, $holiday29_flg, value);
	}


	/**
	 * Holiday 30 休日３０.<p>
	 *
	 */
	public boolean holiday30_flg() {
		return getConstBoolean(offset + 127, $holiday30_flg);
	}

	/**
	 * Holiday 30 休日３０.<p>
	 *
	 */
	public void holiday30_flg(boolean value) {
		setConstBoolean(offset + 127, $holiday30_flg, value);
	}


	/**
	 * Holiday 31 休日３１.<p>
	 *
	 */
	public boolean holiday31_flg() {
		return getConstBoolean(offset + 128, $holiday31_flg);
	}

	/**
	 * Holiday 31 休日３１.<p>
	 *
	 */
	public void holiday31_flg(boolean value) {
		setConstBoolean(offset + 128, $holiday31_flg, value);
	}


	/**
	 * Holiday 32 休日３２.<p>
	 *
	 */
	public boolean holiday32_flg() {
		return getConstBoolean(offset + 129, $holiday32_flg);
	}

	/**
	 * Holiday 32 休日３２.<p>
	 *
	 */
	public void holiday32_flg(boolean value) {
		setConstBoolean(offset + 129, $holiday32_flg, value);
	}


	/**
	 * Holiday 33 休日３３.<p>
	 *
	 */
	public boolean holiday33_flg() {
		return getConstBoolean(offset + 130, $holiday33_flg);
	}

	/**
	 * Holiday 33 休日３３.<p>
	 *
	 */
	public void holiday33_flg(boolean value) {
		setConstBoolean(offset + 130, $holiday33_flg, value);
	}


	/**
	 * Holiday 34 休日３４.<p>
	 *
	 */
	public boolean holiday34_flg() {
		return getConstBoolean(offset + 131, $holiday34_flg);
	}

	/**
	 * Holiday 34 休日３４.<p>
	 *
	 */
	public void holiday34_flg(boolean value) {
		setConstBoolean(offset + 131, $holiday34_flg, value);
	}


	/**
	 * Holiday 35 休日３５.<p>
	 *
	 */
	public boolean holiday35_flg() {
		return getConstBoolean(offset + 132, $holiday35_flg);
	}

	/**
	 * Holiday 35 休日３５.<p>
	 *
	 */
	public void holiday35_flg(boolean value) {
		setConstBoolean(offset + 132, $holiday35_flg, value);
	}


	/**
	 * Holiday 36 休日３６.<p>
	 *
	 */
	public boolean holiday36_flg() {
		return getConstBoolean(offset + 133, $holiday36_flg);
	}

	/**
	 * Holiday 36 休日３６.<p>
	 *
	 */
	public void holiday36_flg(boolean value) {
		setConstBoolean(offset + 133, $holiday36_flg, value);
	}


	/**
	 * Holiday 37 休日３７.<p>
	 *
	 */
	public boolean holiday37_flg() {
		return getConstBoolean(offset + 134, $holiday37_flg);
	}

	/**
	 * Holiday 37 休日３７.<p>
	 *
	 */
	public void holiday37_flg(boolean value) {
		setConstBoolean(offset + 134, $holiday37_flg, value);
	}


	/**
	 * Holiday 38 休日３８.<p>
	 *
	 */
	public boolean holiday38_flg() {
		return getConstBoolean(offset + 135, $holiday38_flg);
	}

	/**
	 * Holiday 38 休日３８.<p>
	 *
	 */
	public void holiday38_flg(boolean value) {
		setConstBoolean(offset + 135, $holiday38_flg, value);
	}


	/**
	 * Holiday 39 休日３９.<p>
	 *
	 */
	public boolean holiday39_flg() {
		return getConstBoolean(offset + 136, $holiday39_flg);
	}

	/**
	 * Holiday 39 休日３９.<p>
	 *
	 */
	public void holiday39_flg(boolean value) {
		setConstBoolean(offset + 136, $holiday39_flg, value);
	}


	/**
	 * Holiday 40 休日４０.<p>
	 *
	 */
	public boolean holiday40_flg() {
		return getConstBoolean(offset + 137, $holiday40_flg);
	}

	/**
	 * Holiday 40 休日４０.<p>
	 *
	 */
	public void holiday40_flg(boolean value) {
		setConstBoolean(offset + 137, $holiday40_flg, value);
	}


	/**
	 * Holiday 41 休日４１.<p>
	 *
	 */
	public boolean holiday41_flg() {
		return getConstBoolean(offset + 138, $holiday41_flg);
	}

	/**
	 * Holiday 41 休日４１.<p>
	 *
	 */
	public void holiday41_flg(boolean value) {
		setConstBoolean(offset + 138, $holiday41_flg, value);
	}


	/**
	 * Holiday 42 休日４２.<p>
	 *
	 */
	public boolean holiday42_flg() {
		return getConstBoolean(offset + 139, $holiday42_flg);
	}

	/**
	 * Holiday 42 休日４２.<p>
	 *
	 */
	public void holiday42_flg(boolean value) {
		setConstBoolean(offset + 139, $holiday42_flg, value);
	}


	/**
	 * Holiday 43 休日４３.<p>
	 *
	 */
	public boolean holiday43_flg() {
		return getConstBoolean(offset + 140, $holiday43_flg);
	}

	/**
	 * Holiday 43 休日４３.<p>
	 *
	 */
	public void holiday43_flg(boolean value) {
		setConstBoolean(offset + 140, $holiday43_flg, value);
	}


	/**
	 * Holiday 44 休日４４.<p>
	 *
	 */
	public boolean holiday44_flg() {
		return getConstBoolean(offset + 141, $holiday44_flg);
	}

	/**
	 * Holiday 44 休日４４.<p>
	 *
	 */
	public void holiday44_flg(boolean value) {
		setConstBoolean(offset + 141, $holiday44_flg, value);
	}


	/**
	 * Holiday 45 休日４５.<p>
	 *
	 */
	public boolean holiday45_flg() {
		return getConstBoolean(offset + 142, $holiday45_flg);
	}

	/**
	 * Holiday 45 休日４５.<p>
	 *
	 */
	public void holiday45_flg(boolean value) {
		setConstBoolean(offset + 142, $holiday45_flg, value);
	}


	/**
	 * Holiday 46 休日４６.<p>
	 *
	 */
	public boolean holiday46_flg() {
		return getConstBoolean(offset + 143, $holiday46_flg);
	}

	/**
	 * Holiday 46 休日４６.<p>
	 *
	 */
	public void holiday46_flg(boolean value) {
		setConstBoolean(offset + 143, $holiday46_flg, value);
	}


	/**
	 * Holiday 47 休日４７.<p>
	 *
	 */
	public boolean holiday47_flg() {
		return getConstBoolean(offset + 144, $holiday47_flg);
	}

	/**
	 * Holiday 47 休日４７.<p>
	 *
	 */
	public void holiday47_flg(boolean value) {
		setConstBoolean(offset + 144, $holiday47_flg, value);
	}


	/**
	 * Holiday 48 休日４８.<p>
	 *
	 */
	public boolean holiday48_flg() {
		return getConstBoolean(offset + 145, $holiday48_flg);
	}

	/**
	 * Holiday 48 休日４８.<p>
	 *
	 */
	public void holiday48_flg(boolean value) {
		setConstBoolean(offset + 145, $holiday48_flg, value);
	}


	/**
	 * Holiday 49 休日４９.<p>
	 *
	 */
	public boolean holiday49_flg() {
		return getConstBoolean(offset + 146, $holiday49_flg);
	}

	/**
	 * Holiday 49 休日４９.<p>
	 *
	 */
	public void holiday49_flg(boolean value) {
		setConstBoolean(offset + 146, $holiday49_flg, value);
	}


	/**
	 * Holiday 50 休日５０.<p>
	 *
	 */
	public boolean holiday50_flg() {
		return getConstBoolean(offset + 147, $holiday50_flg);
	}

	/**
	 * Holiday 50 休日５０.<p>
	 *
	 */
	public void holiday50_flg(boolean value) {
		setConstBoolean(offset + 147, $holiday50_flg, value);
	}


	/**
	 * Holiday 51 休日５１.<p>
	 *
	 */
	public boolean holiday51_flg() {
		return getConstBoolean(offset + 148, $holiday51_flg);
	}

	/**
	 * Holiday 51 休日５１.<p>
	 *
	 */
	public void holiday51_flg(boolean value) {
		setConstBoolean(offset + 148, $holiday51_flg, value);
	}


	/**
	 * Holiday 52 休日５２.<p>
	 *
	 */
	public boolean holiday52_flg() {
		return getConstBoolean(offset + 149, $holiday52_flg);
	}

	/**
	 * Holiday 52 休日５２.<p>
	 *
	 */
	public void holiday52_flg(boolean value) {
		setConstBoolean(offset + 149, $holiday52_flg, value);
	}


	/**
	 * Holiday 53 休日５３.<p>
	 *
	 */
	public boolean holiday53_flg() {
		return getConstBoolean(offset + 150, $holiday53_flg);
	}

	/**
	 * Holiday 53 休日５３.<p>
	 *
	 */
	public void holiday53_flg(boolean value) {
		setConstBoolean(offset + 150, $holiday53_flg, value);
	}


	/**
	 * Holiday 54 休日５４.<p>
	 *
	 */
	public boolean holiday54_flg() {
		return getConstBoolean(offset + 151, $holiday54_flg);
	}

	/**
	 * Holiday 54 休日５４.<p>
	 *
	 */
	public void holiday54_flg(boolean value) {
		setConstBoolean(offset + 151, $holiday54_flg, value);
	}


	/**
	 * Holiday 55 休日５５.<p>
	 *
	 */
	public boolean holiday55_flg() {
		return getConstBoolean(offset + 152, $holiday55_flg);
	}

	/**
	 * Holiday 55 休日５５.<p>
	 *
	 */
	public void holiday55_flg(boolean value) {
		setConstBoolean(offset + 152, $holiday55_flg, value);
	}


	/**
	 * Holiday 56 休日５６.<p>
	 *
	 */
	public boolean holiday56_flg() {
		return getConstBoolean(offset + 153, $holiday56_flg);
	}

	/**
	 * Holiday 56 休日５６.<p>
	 *
	 */
	public void holiday56_flg(boolean value) {
		setConstBoolean(offset + 153, $holiday56_flg, value);
	}


	/**
	 * Holiday 57 休日５７.<p>
	 *
	 */
	public boolean holiday57_flg() {
		return getConstBoolean(offset + 154, $holiday57_flg);
	}

	/**
	 * Holiday 57 休日５７.<p>
	 *
	 */
	public void holiday57_flg(boolean value) {
		setConstBoolean(offset + 154, $holiday57_flg, value);
	}


	/**
	 * Holiday 58 休日５８.<p>
	 *
	 */
	public boolean holiday58_flg() {
		return getConstBoolean(offset + 155, $holiday58_flg);
	}

	/**
	 * Holiday 58 休日５８.<p>
	 *
	 */
	public void holiday58_flg(boolean value) {
		setConstBoolean(offset + 155, $holiday58_flg, value);
	}


	/**
	 * Holiday 59 休日５９.<p>
	 *
	 */
	public boolean holiday59_flg() {
		return getConstBoolean(offset + 156, $holiday59_flg);
	}

	/**
	 * Holiday 59 休日５９.<p>
	 *
	 */
	public void holiday59_flg(boolean value) {
		setConstBoolean(offset + 156, $holiday59_flg, value);
	}


	/**
	 * Holiday 60 休日６０.<p>
	 *
	 */
	public boolean holiday60_flg() {
		return getConstBoolean(offset + 157, $holiday60_flg);
	}

	/**
	 * Holiday 60 休日６０.<p>
	 *
	 */
	public void holiday60_flg(boolean value) {
		setConstBoolean(offset + 157, $holiday60_flg, value);
	}


	/**
	 * Holiday 61 休日６１.<p>
	 *
	 */
	public boolean holiday61_flg() {
		return getConstBoolean(offset + 158, $holiday61_flg);
	}

	/**
	 * Holiday 61 休日６１.<p>
	 *
	 */
	public void holiday61_flg(boolean value) {
		setConstBoolean(offset + 158, $holiday61_flg, value);
	}


	/**
	 * Holiday 62 休日６２.<p>
	 *
	 */
	public boolean holiday62_flg() {
		return getConstBoolean(offset + 159, $holiday62_flg);
	}

	/**
	 * Holiday 62 休日６２.<p>
	 *
	 */
	public void holiday62_flg(boolean value) {
		setConstBoolean(offset + 159, $holiday62_flg, value);
	}


	/**
	 * Holiday 63 休日６３.<p>
	 *
	 */
	public boolean holiday63_flg() {
		return getConstBoolean(offset + 160, $holiday63_flg);
	}

	/**
	 * Holiday 63 休日６３.<p>
	 *
	 */
	public void holiday63_flg(boolean value) {
		setConstBoolean(offset + 160, $holiday63_flg, value);
	}


	/**
	 * Holiday 64 休日６４.<p>
	 *
	 */
	public boolean holiday64_flg() {
		return getConstBoolean(offset + 161, $holiday64_flg);
	}

	/**
	 * Holiday 64 休日６４.<p>
	 *
	 */
	public void holiday64_flg(boolean value) {
		setConstBoolean(offset + 161, $holiday64_flg, value);
	}


	/**
	 * Holiday 65 休日６５.<p>
	 *
	 */
	public boolean holiday65_flg() {
		return getConstBoolean(offset + 162, $holiday65_flg);
	}

	/**
	 * Holiday 65 休日６５.<p>
	 *
	 */
	public void holiday65_flg(boolean value) {
		setConstBoolean(offset + 162, $holiday65_flg, value);
	}


	/**
	 * Holiday 66 休日６６.<p>
	 *
	 */
	public boolean holiday66_flg() {
		return getConstBoolean(offset + 163, $holiday66_flg);
	}

	/**
	 * Holiday 66 休日６６.<p>
	 *
	 */
	public void holiday66_flg(boolean value) {
		setConstBoolean(offset + 163, $holiday66_flg, value);
	}


	/**
	 * Holiday 67 休日６７.<p>
	 *
	 */
	public boolean holiday67_flg() {
		return getConstBoolean(offset + 164, $holiday67_flg);
	}

	/**
	 * Holiday 67 休日６７.<p>
	 *
	 */
	public void holiday67_flg(boolean value) {
		setConstBoolean(offset + 164, $holiday67_flg, value);
	}


	/**
	 * Holiday 68 休日６８.<p>
	 *
	 */
	public boolean holiday68_flg() {
		return getConstBoolean(offset + 165, $holiday68_flg);
	}

	/**
	 * Holiday 68 休日６８.<p>
	 *
	 */
	public void holiday68_flg(boolean value) {
		setConstBoolean(offset + 165, $holiday68_flg, value);
	}


	/**
	 * Holiday 69 休日６９.<p>
	 *
	 */
	public boolean holiday69_flg() {
		return getConstBoolean(offset + 166, $holiday69_flg);
	}

	/**
	 * Holiday 69 休日６９.<p>
	 *
	 */
	public void holiday69_flg(boolean value) {
		setConstBoolean(offset + 166, $holiday69_flg, value);
	}


	/**
	 * Holiday 70 休日７０.<p>
	 *
	 */
	public boolean holiday70_flg() {
		return getConstBoolean(offset + 167, $holiday70_flg);
	}

	/**
	 * Holiday 70 休日７０.<p>
	 *
	 */
	public void holiday70_flg(boolean value) {
		setConstBoolean(offset + 167, $holiday70_flg, value);
	}


	/**
	 * Holiday 71 休日７１.<p>
	 *
	 */
	public boolean holiday71_flg() {
		return getConstBoolean(offset + 168, $holiday71_flg);
	}

	/**
	 * Holiday 71 休日７１.<p>
	 *
	 */
	public void holiday71_flg(boolean value) {
		setConstBoolean(offset + 168, $holiday71_flg, value);
	}


	/**
	 * Holiday 72 休日７２.<p>
	 *
	 */
	public boolean holiday72_flg() {
		return getConstBoolean(offset + 169, $holiday72_flg);
	}

	/**
	 * Holiday 72 休日７２.<p>
	 *
	 */
	public void holiday72_flg(boolean value) {
		setConstBoolean(offset + 169, $holiday72_flg, value);
	}


	/**
	 * Holiday 73 休日７３.<p>
	 *
	 */
	public boolean holiday73_flg() {
		return getConstBoolean(offset + 170, $holiday73_flg);
	}

	/**
	 * Holiday 73 休日７３.<p>
	 *
	 */
	public void holiday73_flg(boolean value) {
		setConstBoolean(offset + 170, $holiday73_flg, value);
	}


	/**
	 * Holiday 74 休日７４.<p>
	 *
	 */
	public boolean holiday74_flg() {
		return getConstBoolean(offset + 171, $holiday74_flg);
	}

	/**
	 * Holiday 74 休日７４.<p>
	 *
	 */
	public void holiday74_flg(boolean value) {
		setConstBoolean(offset + 171, $holiday74_flg, value);
	}


	/**
	 * Holiday 75 休日７５.<p>
	 *
	 */
	public boolean holiday75_flg() {
		return getConstBoolean(offset + 172, $holiday75_flg);
	}

	/**
	 * Holiday 75 休日７５.<p>
	 *
	 */
	public void holiday75_flg(boolean value) {
		setConstBoolean(offset + 172, $holiday75_flg, value);
	}


	/**
	 * Holiday 76 休日７６.<p>
	 *
	 */
	public boolean holiday76_flg() {
		return getConstBoolean(offset + 173, $holiday76_flg);
	}

	/**
	 * Holiday 76 休日７６.<p>
	 *
	 */
	public void holiday76_flg(boolean value) {
		setConstBoolean(offset + 173, $holiday76_flg, value);
	}


	/**
	 * Holiday 77 休日７７.<p>
	 *
	 */
	public boolean holiday77_flg() {
		return getConstBoolean(offset + 174, $holiday77_flg);
	}

	/**
	 * Holiday 77 休日７７.<p>
	 *
	 */
	public void holiday77_flg(boolean value) {
		setConstBoolean(offset + 174, $holiday77_flg, value);
	}


	/**
	 * Holiday 78 休日７８.<p>
	 *
	 */
	public boolean holiday78_flg() {
		return getConstBoolean(offset + 175, $holiday78_flg);
	}

	/**
	 * Holiday 78 休日７８.<p>
	 *
	 */
	public void holiday78_flg(boolean value) {
		setConstBoolean(offset + 175, $holiday78_flg, value);
	}


	/**
	 * Holiday 79 休日７９.<p>
	 *
	 */
	public boolean holiday79_flg() {
		return getConstBoolean(offset + 176, $holiday79_flg);
	}

	/**
	 * Holiday 79 休日７９.<p>
	 *
	 */
	public void holiday79_flg(boolean value) {
		setConstBoolean(offset + 176, $holiday79_flg, value);
	}


	/**
	 * Holiday 80 休日８０.<p>
	 *
	 */
	public boolean holiday80_flg() {
		return getConstBoolean(offset + 177, $holiday80_flg);
	}

	/**
	 * Holiday 80 休日８０.<p>
	 *
	 */
	public void holiday80_flg(boolean value) {
		setConstBoolean(offset + 177, $holiday80_flg, value);
	}


	/**
	 * Holiday 81 休日８１.<p>
	 *
	 */
	public boolean holiday81_flg() {
		return getConstBoolean(offset + 178, $holiday81_flg);
	}

	/**
	 * Holiday 81 休日８１.<p>
	 *
	 */
	public void holiday81_flg(boolean value) {
		setConstBoolean(offset + 178, $holiday81_flg, value);
	}


	/**
	 * Holiday 82 休日８２.<p>
	 *
	 */
	public boolean holiday82_flg() {
		return getConstBoolean(offset + 179, $holiday82_flg);
	}

	/**
	 * Holiday 82 休日８２.<p>
	 *
	 */
	public void holiday82_flg(boolean value) {
		setConstBoolean(offset + 179, $holiday82_flg, value);
	}


	/**
	 * Holiday 83 休日８３.<p>
	 *
	 */
	public boolean holiday83_flg() {
		return getConstBoolean(offset + 180, $holiday83_flg);
	}

	/**
	 * Holiday 83 休日８３.<p>
	 *
	 */
	public void holiday83_flg(boolean value) {
		setConstBoolean(offset + 180, $holiday83_flg, value);
	}


	/**
	 * Holiday 84 休日８４.<p>
	 *
	 */
	public boolean holiday84_flg() {
		return getConstBoolean(offset + 181, $holiday84_flg);
	}

	/**
	 * Holiday 84 休日８４.<p>
	 *
	 */
	public void holiday84_flg(boolean value) {
		setConstBoolean(offset + 181, $holiday84_flg, value);
	}


	/**
	 * Holiday 85 休日８５.<p>
	 *
	 */
	public boolean holiday85_flg() {
		return getConstBoolean(offset + 182, $holiday85_flg);
	}

	/**
	 * Holiday 85 休日８５.<p>
	 *
	 */
	public void holiday85_flg(boolean value) {
		setConstBoolean(offset + 182, $holiday85_flg, value);
	}


	/**
	 * Holiday 86 休日８６.<p>
	 *
	 */
	public boolean holiday86_flg() {
		return getConstBoolean(offset + 183, $holiday86_flg);
	}

	/**
	 * Holiday 86 休日８６.<p>
	 *
	 */
	public void holiday86_flg(boolean value) {
		setConstBoolean(offset + 183, $holiday86_flg, value);
	}


	/**
	 * Holiday 87 休日８７.<p>
	 *
	 */
	public boolean holiday87_flg() {
		return getConstBoolean(offset + 184, $holiday87_flg);
	}

	/**
	 * Holiday 87 休日８７.<p>
	 *
	 */
	public void holiday87_flg(boolean value) {
		setConstBoolean(offset + 184, $holiday87_flg, value);
	}


	/**
	 * Holiday 88 休日８８.<p>
	 *
	 */
	public boolean holiday88_flg() {
		return getConstBoolean(offset + 185, $holiday88_flg);
	}

	/**
	 * Holiday 88 休日８８.<p>
	 *
	 */
	public void holiday88_flg(boolean value) {
		setConstBoolean(offset + 185, $holiday88_flg, value);
	}


	/**
	 * Holiday 89 休日８９.<p>
	 *
	 */
	public boolean holiday89_flg() {
		return getConstBoolean(offset + 186, $holiday89_flg);
	}

	/**
	 * Holiday 89 休日８９.<p>
	 *
	 */
	public void holiday89_flg(boolean value) {
		setConstBoolean(offset + 186, $holiday89_flg, value);
	}


	/**
	 * Holiday 90 休日９０.<p>
	 *
	 */
	public boolean holiday90_flg() {
		return getConstBoolean(offset + 187, $holiday90_flg);
	}

	/**
	 * Holiday 90 休日９０.<p>
	 *
	 */
	public void holiday90_flg(boolean value) {
		setConstBoolean(offset + 187, $holiday90_flg, value);
	}


	/**
	 * Holiday 91 休日９１.<p>
	 *
	 */
	public boolean holiday91_flg() {
		return getConstBoolean(offset + 188, $holiday91_flg);
	}

	/**
	 * Holiday 91 休日９１.<p>
	 *
	 */
	public void holiday91_flg(boolean value) {
		setConstBoolean(offset + 188, $holiday91_flg, value);
	}


	/**
	 * Holiday 92 休日９２.<p>
	 *
	 */
	public boolean holiday92_flg() {
		return getConstBoolean(offset + 189, $holiday92_flg);
	}

	/**
	 * Holiday 92 休日９２.<p>
	 *
	 */
	public void holiday92_flg(boolean value) {
		setConstBoolean(offset + 189, $holiday92_flg, value);
	}


	/**
	 * Holiday 93 休日９３.<p>
	 *
	 */
	public boolean holiday93_flg() {
		return getConstBoolean(offset + 190, $holiday93_flg);
	}

	/**
	 * Holiday 93 休日９３.<p>
	 *
	 */
	public void holiday93_flg(boolean value) {
		setConstBoolean(offset + 190, $holiday93_flg, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 191, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 191, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 192, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 192, $mfg_loc_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 193, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 193, $wg_cd, value);
	}


	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public String rsrc_cd() {
		return getConstString(offset + 194, $rsrc_cd);
	}

	/**
	 * Resource cd. 資源ＣＤ.<p>
	 *
	 */
	public void rsrc_cd(String value) {
		setConstString(offset + 194, $rsrc_cd, value);
	}


	/**
	 * Resource name 資源名.<p>
	 *
	 */
	public String rsrc_nm() {
		return getConstString(offset + 195, $rsrc_nm);
	}

	/**
	 * Resource name 資源名.<p>
	 *
	 */
	public void rsrc_nm(String value) {
		setConstString(offset + 195, $rsrc_nm, value);
	}


	/**
	 * Resource unit cd. 資源単位ＣＤ.<p>
	 *
	 */
	public String rsrc_unit_cd() {
		return getConstString(offset + 196, $rsrc_unit_cd);
	}

	/**
	 * Resource unit cd. 資源単位ＣＤ.<p>
	 *
	 */
	public void rsrc_unit_cd(String value) {
		setConstString(offset + 196, $rsrc_unit_cd, value);
	}


	/**
	 * Resource unit name 資源単位名.<p>
	 *
	 */
	public String rsrc_unit_nm() {
		return getConstString(offset + 197, $rsrc_unit_nm);
	}

	/**
	 * Resource unit name 資源単位名.<p>
	 *
	 */
	public void rsrc_unit_nm(String value) {
		setConstString(offset + 197, $rsrc_unit_nm, value);
	}


	/**
	 * Resource number of decimal places name 資源小数部有効桁数名.<p>
	 *
	 */
	public MCNumber rsrc_dec_place() {
		return getConstNumber(offset + 198, $rsrc_dec_place);
	}

	/**
	 * Resource number of decimal places name 資源小数部有効桁数名.<p>
	 *
	 */
	public void rsrc_dec_place(MCNumber value) {
		setConstNumber(offset + 198, $rsrc_dec_place, value);
	}

	/**
	 * Resource number of decimal places name 資源小数部有効桁数名.<p>
	 *
	 */
	public void rsrc_dec_place(int value) {
		setConstNumber(offset + 198, $rsrc_dec_place, value);
	}

	/**
	 * Resource number of decimal places name 資源小数部有効桁数名.<p>
	 *
	 */
	public void rsrc_dec_place(long value) {
		setConstNumber(offset + 198, $rsrc_dec_place, value);
	}

	/**
	 * Resource number of decimal places name 資源小数部有効桁数名.<p>
	 *
	 */
	public void rsrc_dec_place(float value) {
		setConstNumber(offset + 198, $rsrc_dec_place, value);
	}

	/**
	 * Resource number of decimal places name 資源小数部有効桁数名.<p>
	 *
	 */
	public void rsrc_dec_place(double value) {
		setConstNumber(offset + 198, $rsrc_dec_place, value);
	}


	/**
	 * Location resource display order 場所資源表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 199, $disp_seq);
	}

	/**
	 * Location resource display order 場所資源表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 199, $disp_seq, value);
	}

	/**
	 * Location resource display order 場所資源表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 199, $disp_seq, value);
	}

	/**
	 * Location resource display order 場所資源表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 199, $disp_seq, value);
	}

	/**
	 * Location resource display order 場所資源表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 199, $disp_seq, value);
	}

	/**
	 * Location resource display order 場所資源表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 199, $disp_seq, value);
	}


	/**
	 * Location master label 場所ラベル.<p>
	 *
	 */
	public String label_loc() {
		return getConstString(offset + 200, $label_loc);
	}

	/**
	 * Location master label 場所ラベル.<p>
	 *
	 */
	public void label_loc(String value) {
		setConstString(offset + 200, $label_loc, value);
	}


	/**
	 * Resource label 資源ラベル.<p>
	 *
	 */
	public String label_rsrc() {
		return getConstString(offset + 201, $label_rsrc);
	}

	/**
	 * Resource label 資源ラベル.<p>
	 *
	 */
	public void label_rsrc(String value) {
		setConstString(offset + 201, $label_rsrc, value);
	}


	/**
	 * Unit label 単位ラベル.<p>
	 *
	 */
	public String label_unit() {
		return getConstString(offset + 202, $label_unit);
	}

	/**
	 * Unit label 単位ラベル.<p>
	 *
	 */
	public void label_unit(String value) {
		setConstString(offset + 202, $label_unit, value);
	}


	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public MCNumber record_id() {
		return getConstNumber(offset + 203, $record_id);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void record_id(MCNumber value) {
		setConstNumber(offset + 203, $record_id, value);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void record_id(int value) {
		setConstNumber(offset + 203, $record_id, value);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void record_id(long value) {
		setConstNumber(offset + 203, $record_id, value);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void record_id(float value) {
		setConstNumber(offset + 203, $record_id, value);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void record_id(double value) {
		setConstNumber(offset + 203, $record_id, value);
	}


	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public MCNumber record_grp_id() {
		return getConstNumber(offset + 204, $record_grp_id);
	}

	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public void record_grp_id(MCNumber value) {
		setConstNumber(offset + 204, $record_grp_id, value);
	}

	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public void record_grp_id(int value) {
		setConstNumber(offset + 204, $record_grp_id, value);
	}

	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public void record_grp_id(long value) {
		setConstNumber(offset + 204, $record_grp_id, value);
	}

	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public void record_grp_id(float value) {
		setConstNumber(offset + 204, $record_grp_id, value);
	}

	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public void record_grp_id(double value) {
		setConstNumber(offset + 204, $record_grp_id, value);
	}


	public String getString(String name) {
		if ($label.equalsIgnoreCase(name)) {
			return label();
		}
		if ($code.equalsIgnoreCase(name)) {
			return code();
		}
		if ($name.equalsIgnoreCase(name)) {
			return name();
		}
		if ($row_title_col.equalsIgnoreCase(name)) {
			return row_title_col();
		}
		if ($row_title_nm.equalsIgnoreCase(name)) {
			return row_title_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			return rsrc_cd();
		}
		if ($rsrc_nm.equalsIgnoreCase(name)) {
			return rsrc_nm();
		}
		if ($rsrc_unit_cd.equalsIgnoreCase(name)) {
			return rsrc_unit_cd();
		}
		if ($rsrc_unit_nm.equalsIgnoreCase(name)) {
			return rsrc_unit_nm();
		}
		if ($label_loc.equalsIgnoreCase(name)) {
			return label_loc();
		}
		if ($label_rsrc.equalsIgnoreCase(name)) {
			return label_rsrc();
		}
		if ($label_unit.equalsIgnoreCase(name)) {
			return label_unit();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			return rsrc_dec_place();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($record_id.equalsIgnoreCase(name)) {
			return record_id();
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			return record_grp_id();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($holiday01_flg.equalsIgnoreCase(name)) {
			return holiday01_flg();
		}
		if ($holiday02_flg.equalsIgnoreCase(name)) {
			return holiday02_flg();
		}
		if ($holiday03_flg.equalsIgnoreCase(name)) {
			return holiday03_flg();
		}
		if ($holiday04_flg.equalsIgnoreCase(name)) {
			return holiday04_flg();
		}
		if ($holiday05_flg.equalsIgnoreCase(name)) {
			return holiday05_flg();
		}
		if ($holiday06_flg.equalsIgnoreCase(name)) {
			return holiday06_flg();
		}
		if ($holiday07_flg.equalsIgnoreCase(name)) {
			return holiday07_flg();
		}
		if ($holiday08_flg.equalsIgnoreCase(name)) {
			return holiday08_flg();
		}
		if ($holiday09_flg.equalsIgnoreCase(name)) {
			return holiday09_flg();
		}
		if ($holiday10_flg.equalsIgnoreCase(name)) {
			return holiday10_flg();
		}
		if ($holiday11_flg.equalsIgnoreCase(name)) {
			return holiday11_flg();
		}
		if ($holiday12_flg.equalsIgnoreCase(name)) {
			return holiday12_flg();
		}
		if ($holiday13_flg.equalsIgnoreCase(name)) {
			return holiday13_flg();
		}
		if ($holiday14_flg.equalsIgnoreCase(name)) {
			return holiday14_flg();
		}
		if ($holiday15_flg.equalsIgnoreCase(name)) {
			return holiday15_flg();
		}
		if ($holiday16_flg.equalsIgnoreCase(name)) {
			return holiday16_flg();
		}
		if ($holiday17_flg.equalsIgnoreCase(name)) {
			return holiday17_flg();
		}
		if ($holiday18_flg.equalsIgnoreCase(name)) {
			return holiday18_flg();
		}
		if ($holiday19_flg.equalsIgnoreCase(name)) {
			return holiday19_flg();
		}
		if ($holiday20_flg.equalsIgnoreCase(name)) {
			return holiday20_flg();
		}
		if ($holiday21_flg.equalsIgnoreCase(name)) {
			return holiday21_flg();
		}
		if ($holiday22_flg.equalsIgnoreCase(name)) {
			return holiday22_flg();
		}
		if ($holiday23_flg.equalsIgnoreCase(name)) {
			return holiday23_flg();
		}
		if ($holiday24_flg.equalsIgnoreCase(name)) {
			return holiday24_flg();
		}
		if ($holiday25_flg.equalsIgnoreCase(name)) {
			return holiday25_flg();
		}
		if ($holiday26_flg.equalsIgnoreCase(name)) {
			return holiday26_flg();
		}
		if ($holiday27_flg.equalsIgnoreCase(name)) {
			return holiday27_flg();
		}
		if ($holiday28_flg.equalsIgnoreCase(name)) {
			return holiday28_flg();
		}
		if ($holiday29_flg.equalsIgnoreCase(name)) {
			return holiday29_flg();
		}
		if ($holiday30_flg.equalsIgnoreCase(name)) {
			return holiday30_flg();
		}
		if ($holiday31_flg.equalsIgnoreCase(name)) {
			return holiday31_flg();
		}
		if ($holiday32_flg.equalsIgnoreCase(name)) {
			return holiday32_flg();
		}
		if ($holiday33_flg.equalsIgnoreCase(name)) {
			return holiday33_flg();
		}
		if ($holiday34_flg.equalsIgnoreCase(name)) {
			return holiday34_flg();
		}
		if ($holiday35_flg.equalsIgnoreCase(name)) {
			return holiday35_flg();
		}
		if ($holiday36_flg.equalsIgnoreCase(name)) {
			return holiday36_flg();
		}
		if ($holiday37_flg.equalsIgnoreCase(name)) {
			return holiday37_flg();
		}
		if ($holiday38_flg.equalsIgnoreCase(name)) {
			return holiday38_flg();
		}
		if ($holiday39_flg.equalsIgnoreCase(name)) {
			return holiday39_flg();
		}
		if ($holiday40_flg.equalsIgnoreCase(name)) {
			return holiday40_flg();
		}
		if ($holiday41_flg.equalsIgnoreCase(name)) {
			return holiday41_flg();
		}
		if ($holiday42_flg.equalsIgnoreCase(name)) {
			return holiday42_flg();
		}
		if ($holiday43_flg.equalsIgnoreCase(name)) {
			return holiday43_flg();
		}
		if ($holiday44_flg.equalsIgnoreCase(name)) {
			return holiday44_flg();
		}
		if ($holiday45_flg.equalsIgnoreCase(name)) {
			return holiday45_flg();
		}
		if ($holiday46_flg.equalsIgnoreCase(name)) {
			return holiday46_flg();
		}
		if ($holiday47_flg.equalsIgnoreCase(name)) {
			return holiday47_flg();
		}
		if ($holiday48_flg.equalsIgnoreCase(name)) {
			return holiday48_flg();
		}
		if ($holiday49_flg.equalsIgnoreCase(name)) {
			return holiday49_flg();
		}
		if ($holiday50_flg.equalsIgnoreCase(name)) {
			return holiday50_flg();
		}
		if ($holiday51_flg.equalsIgnoreCase(name)) {
			return holiday51_flg();
		}
		if ($holiday52_flg.equalsIgnoreCase(name)) {
			return holiday52_flg();
		}
		if ($holiday53_flg.equalsIgnoreCase(name)) {
			return holiday53_flg();
		}
		if ($holiday54_flg.equalsIgnoreCase(name)) {
			return holiday54_flg();
		}
		if ($holiday55_flg.equalsIgnoreCase(name)) {
			return holiday55_flg();
		}
		if ($holiday56_flg.equalsIgnoreCase(name)) {
			return holiday56_flg();
		}
		if ($holiday57_flg.equalsIgnoreCase(name)) {
			return holiday57_flg();
		}
		if ($holiday58_flg.equalsIgnoreCase(name)) {
			return holiday58_flg();
		}
		if ($holiday59_flg.equalsIgnoreCase(name)) {
			return holiday59_flg();
		}
		if ($holiday60_flg.equalsIgnoreCase(name)) {
			return holiday60_flg();
		}
		if ($holiday61_flg.equalsIgnoreCase(name)) {
			return holiday61_flg();
		}
		if ($holiday62_flg.equalsIgnoreCase(name)) {
			return holiday62_flg();
		}
		if ($holiday63_flg.equalsIgnoreCase(name)) {
			return holiday63_flg();
		}
		if ($holiday64_flg.equalsIgnoreCase(name)) {
			return holiday64_flg();
		}
		if ($holiday65_flg.equalsIgnoreCase(name)) {
			return holiday65_flg();
		}
		if ($holiday66_flg.equalsIgnoreCase(name)) {
			return holiday66_flg();
		}
		if ($holiday67_flg.equalsIgnoreCase(name)) {
			return holiday67_flg();
		}
		if ($holiday68_flg.equalsIgnoreCase(name)) {
			return holiday68_flg();
		}
		if ($holiday69_flg.equalsIgnoreCase(name)) {
			return holiday69_flg();
		}
		if ($holiday70_flg.equalsIgnoreCase(name)) {
			return holiday70_flg();
		}
		if ($holiday71_flg.equalsIgnoreCase(name)) {
			return holiday71_flg();
		}
		if ($holiday72_flg.equalsIgnoreCase(name)) {
			return holiday72_flg();
		}
		if ($holiday73_flg.equalsIgnoreCase(name)) {
			return holiday73_flg();
		}
		if ($holiday74_flg.equalsIgnoreCase(name)) {
			return holiday74_flg();
		}
		if ($holiday75_flg.equalsIgnoreCase(name)) {
			return holiday75_flg();
		}
		if ($holiday76_flg.equalsIgnoreCase(name)) {
			return holiday76_flg();
		}
		if ($holiday77_flg.equalsIgnoreCase(name)) {
			return holiday77_flg();
		}
		if ($holiday78_flg.equalsIgnoreCase(name)) {
			return holiday78_flg();
		}
		if ($holiday79_flg.equalsIgnoreCase(name)) {
			return holiday79_flg();
		}
		if ($holiday80_flg.equalsIgnoreCase(name)) {
			return holiday80_flg();
		}
		if ($holiday81_flg.equalsIgnoreCase(name)) {
			return holiday81_flg();
		}
		if ($holiday82_flg.equalsIgnoreCase(name)) {
			return holiday82_flg();
		}
		if ($holiday83_flg.equalsIgnoreCase(name)) {
			return holiday83_flg();
		}
		if ($holiday84_flg.equalsIgnoreCase(name)) {
			return holiday84_flg();
		}
		if ($holiday85_flg.equalsIgnoreCase(name)) {
			return holiday85_flg();
		}
		if ($holiday86_flg.equalsIgnoreCase(name)) {
			return holiday86_flg();
		}
		if ($holiday87_flg.equalsIgnoreCase(name)) {
			return holiday87_flg();
		}
		if ($holiday88_flg.equalsIgnoreCase(name)) {
			return holiday88_flg();
		}
		if ($holiday89_flg.equalsIgnoreCase(name)) {
			return holiday89_flg();
		}
		if ($holiday90_flg.equalsIgnoreCase(name)) {
			return holiday90_flg();
		}
		if ($holiday91_flg.equalsIgnoreCase(name)) {
			return holiday91_flg();
		}
		if ($holiday92_flg.equalsIgnoreCase(name)) {
			return holiday92_flg();
		}
		if ($holiday93_flg.equalsIgnoreCase(name)) {
			return holiday93_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($label.equalsIgnoreCase(name)) {
			return label();
		}
		if ($code.equalsIgnoreCase(name)) {
			return code();
		}
		if ($name.equalsIgnoreCase(name)) {
			return name();
		}
		if ($row_title_col.equalsIgnoreCase(name)) {
			return row_title_col();
		}
		if ($row_title_nm.equalsIgnoreCase(name)) {
			return row_title_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			return rsrc_cd();
		}
		if ($rsrc_nm.equalsIgnoreCase(name)) {
			return rsrc_nm();
		}
		if ($rsrc_unit_cd.equalsIgnoreCase(name)) {
			return rsrc_unit_cd();
		}
		if ($rsrc_unit_nm.equalsIgnoreCase(name)) {
			return rsrc_unit_nm();
		}
		if ($label_loc.equalsIgnoreCase(name)) {
			return label_loc();
		}
		if ($label_rsrc.equalsIgnoreCase(name)) {
			return label_rsrc();
		}
		if ($label_unit.equalsIgnoreCase(name)) {
			return label_unit();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			return rsrc_dec_place();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($record_id.equalsIgnoreCase(name)) {
			return record_id();
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			return record_grp_id();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($holiday01_flg.equalsIgnoreCase(name)) {
			return holiday01_flg();
		}
		if ($holiday02_flg.equalsIgnoreCase(name)) {
			return holiday02_flg();
		}
		if ($holiday03_flg.equalsIgnoreCase(name)) {
			return holiday03_flg();
		}
		if ($holiday04_flg.equalsIgnoreCase(name)) {
			return holiday04_flg();
		}
		if ($holiday05_flg.equalsIgnoreCase(name)) {
			return holiday05_flg();
		}
		if ($holiday06_flg.equalsIgnoreCase(name)) {
			return holiday06_flg();
		}
		if ($holiday07_flg.equalsIgnoreCase(name)) {
			return holiday07_flg();
		}
		if ($holiday08_flg.equalsIgnoreCase(name)) {
			return holiday08_flg();
		}
		if ($holiday09_flg.equalsIgnoreCase(name)) {
			return holiday09_flg();
		}
		if ($holiday10_flg.equalsIgnoreCase(name)) {
			return holiday10_flg();
		}
		if ($holiday11_flg.equalsIgnoreCase(name)) {
			return holiday11_flg();
		}
		if ($holiday12_flg.equalsIgnoreCase(name)) {
			return holiday12_flg();
		}
		if ($holiday13_flg.equalsIgnoreCase(name)) {
			return holiday13_flg();
		}
		if ($holiday14_flg.equalsIgnoreCase(name)) {
			return holiday14_flg();
		}
		if ($holiday15_flg.equalsIgnoreCase(name)) {
			return holiday15_flg();
		}
		if ($holiday16_flg.equalsIgnoreCase(name)) {
			return holiday16_flg();
		}
		if ($holiday17_flg.equalsIgnoreCase(name)) {
			return holiday17_flg();
		}
		if ($holiday18_flg.equalsIgnoreCase(name)) {
			return holiday18_flg();
		}
		if ($holiday19_flg.equalsIgnoreCase(name)) {
			return holiday19_flg();
		}
		if ($holiday20_flg.equalsIgnoreCase(name)) {
			return holiday20_flg();
		}
		if ($holiday21_flg.equalsIgnoreCase(name)) {
			return holiday21_flg();
		}
		if ($holiday22_flg.equalsIgnoreCase(name)) {
			return holiday22_flg();
		}
		if ($holiday23_flg.equalsIgnoreCase(name)) {
			return holiday23_flg();
		}
		if ($holiday24_flg.equalsIgnoreCase(name)) {
			return holiday24_flg();
		}
		if ($holiday25_flg.equalsIgnoreCase(name)) {
			return holiday25_flg();
		}
		if ($holiday26_flg.equalsIgnoreCase(name)) {
			return holiday26_flg();
		}
		if ($holiday27_flg.equalsIgnoreCase(name)) {
			return holiday27_flg();
		}
		if ($holiday28_flg.equalsIgnoreCase(name)) {
			return holiday28_flg();
		}
		if ($holiday29_flg.equalsIgnoreCase(name)) {
			return holiday29_flg();
		}
		if ($holiday30_flg.equalsIgnoreCase(name)) {
			return holiday30_flg();
		}
		if ($holiday31_flg.equalsIgnoreCase(name)) {
			return holiday31_flg();
		}
		if ($holiday32_flg.equalsIgnoreCase(name)) {
			return holiday32_flg();
		}
		if ($holiday33_flg.equalsIgnoreCase(name)) {
			return holiday33_flg();
		}
		if ($holiday34_flg.equalsIgnoreCase(name)) {
			return holiday34_flg();
		}
		if ($holiday35_flg.equalsIgnoreCase(name)) {
			return holiday35_flg();
		}
		if ($holiday36_flg.equalsIgnoreCase(name)) {
			return holiday36_flg();
		}
		if ($holiday37_flg.equalsIgnoreCase(name)) {
			return holiday37_flg();
		}
		if ($holiday38_flg.equalsIgnoreCase(name)) {
			return holiday38_flg();
		}
		if ($holiday39_flg.equalsIgnoreCase(name)) {
			return holiday39_flg();
		}
		if ($holiday40_flg.equalsIgnoreCase(name)) {
			return holiday40_flg();
		}
		if ($holiday41_flg.equalsIgnoreCase(name)) {
			return holiday41_flg();
		}
		if ($holiday42_flg.equalsIgnoreCase(name)) {
			return holiday42_flg();
		}
		if ($holiday43_flg.equalsIgnoreCase(name)) {
			return holiday43_flg();
		}
		if ($holiday44_flg.equalsIgnoreCase(name)) {
			return holiday44_flg();
		}
		if ($holiday45_flg.equalsIgnoreCase(name)) {
			return holiday45_flg();
		}
		if ($holiday46_flg.equalsIgnoreCase(name)) {
			return holiday46_flg();
		}
		if ($holiday47_flg.equalsIgnoreCase(name)) {
			return holiday47_flg();
		}
		if ($holiday48_flg.equalsIgnoreCase(name)) {
			return holiday48_flg();
		}
		if ($holiday49_flg.equalsIgnoreCase(name)) {
			return holiday49_flg();
		}
		if ($holiday50_flg.equalsIgnoreCase(name)) {
			return holiday50_flg();
		}
		if ($holiday51_flg.equalsIgnoreCase(name)) {
			return holiday51_flg();
		}
		if ($holiday52_flg.equalsIgnoreCase(name)) {
			return holiday52_flg();
		}
		if ($holiday53_flg.equalsIgnoreCase(name)) {
			return holiday53_flg();
		}
		if ($holiday54_flg.equalsIgnoreCase(name)) {
			return holiday54_flg();
		}
		if ($holiday55_flg.equalsIgnoreCase(name)) {
			return holiday55_flg();
		}
		if ($holiday56_flg.equalsIgnoreCase(name)) {
			return holiday56_flg();
		}
		if ($holiday57_flg.equalsIgnoreCase(name)) {
			return holiday57_flg();
		}
		if ($holiday58_flg.equalsIgnoreCase(name)) {
			return holiday58_flg();
		}
		if ($holiday59_flg.equalsIgnoreCase(name)) {
			return holiday59_flg();
		}
		if ($holiday60_flg.equalsIgnoreCase(name)) {
			return holiday60_flg();
		}
		if ($holiday61_flg.equalsIgnoreCase(name)) {
			return holiday61_flg();
		}
		if ($holiday62_flg.equalsIgnoreCase(name)) {
			return holiday62_flg();
		}
		if ($holiday63_flg.equalsIgnoreCase(name)) {
			return holiday63_flg();
		}
		if ($holiday64_flg.equalsIgnoreCase(name)) {
			return holiday64_flg();
		}
		if ($holiday65_flg.equalsIgnoreCase(name)) {
			return holiday65_flg();
		}
		if ($holiday66_flg.equalsIgnoreCase(name)) {
			return holiday66_flg();
		}
		if ($holiday67_flg.equalsIgnoreCase(name)) {
			return holiday67_flg();
		}
		if ($holiday68_flg.equalsIgnoreCase(name)) {
			return holiday68_flg();
		}
		if ($holiday69_flg.equalsIgnoreCase(name)) {
			return holiday69_flg();
		}
		if ($holiday70_flg.equalsIgnoreCase(name)) {
			return holiday70_flg();
		}
		if ($holiday71_flg.equalsIgnoreCase(name)) {
			return holiday71_flg();
		}
		if ($holiday72_flg.equalsIgnoreCase(name)) {
			return holiday72_flg();
		}
		if ($holiday73_flg.equalsIgnoreCase(name)) {
			return holiday73_flg();
		}
		if ($holiday74_flg.equalsIgnoreCase(name)) {
			return holiday74_flg();
		}
		if ($holiday75_flg.equalsIgnoreCase(name)) {
			return holiday75_flg();
		}
		if ($holiday76_flg.equalsIgnoreCase(name)) {
			return holiday76_flg();
		}
		if ($holiday77_flg.equalsIgnoreCase(name)) {
			return holiday77_flg();
		}
		if ($holiday78_flg.equalsIgnoreCase(name)) {
			return holiday78_flg();
		}
		if ($holiday79_flg.equalsIgnoreCase(name)) {
			return holiday79_flg();
		}
		if ($holiday80_flg.equalsIgnoreCase(name)) {
			return holiday80_flg();
		}
		if ($holiday81_flg.equalsIgnoreCase(name)) {
			return holiday81_flg();
		}
		if ($holiday82_flg.equalsIgnoreCase(name)) {
			return holiday82_flg();
		}
		if ($holiday83_flg.equalsIgnoreCase(name)) {
			return holiday83_flg();
		}
		if ($holiday84_flg.equalsIgnoreCase(name)) {
			return holiday84_flg();
		}
		if ($holiday85_flg.equalsIgnoreCase(name)) {
			return holiday85_flg();
		}
		if ($holiday86_flg.equalsIgnoreCase(name)) {
			return holiday86_flg();
		}
		if ($holiday87_flg.equalsIgnoreCase(name)) {
			return holiday87_flg();
		}
		if ($holiday88_flg.equalsIgnoreCase(name)) {
			return holiday88_flg();
		}
		if ($holiday89_flg.equalsIgnoreCase(name)) {
			return holiday89_flg();
		}
		if ($holiday90_flg.equalsIgnoreCase(name)) {
			return holiday90_flg();
		}
		if ($holiday91_flg.equalsIgnoreCase(name)) {
			return holiday91_flg();
		}
		if ($holiday92_flg.equalsIgnoreCase(name)) {
			return holiday92_flg();
		}
		if ($holiday93_flg.equalsIgnoreCase(name)) {
			return holiday93_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($label.equalsIgnoreCase(name)) {
			label(value);
			return;
		}
		if ($code.equalsIgnoreCase(name)) {
			code(value);
			return;
		}
		if ($name.equalsIgnoreCase(name)) {
			name(value);
			return;
		}
		if ($row_title_col.equalsIgnoreCase(name)) {
			row_title_col(value);
			return;
		}
		if ($row_title_nm.equalsIgnoreCase(name)) {
			row_title_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			rsrc_cd(value);
			return;
		}
		if ($rsrc_nm.equalsIgnoreCase(name)) {
			rsrc_nm(value);
			return;
		}
		if ($rsrc_unit_cd.equalsIgnoreCase(name)) {
			rsrc_unit_cd(value);
			return;
		}
		if ($rsrc_unit_nm.equalsIgnoreCase(name)) {
			rsrc_unit_nm(value);
			return;
		}
		if ($label_loc.equalsIgnoreCase(name)) {
			label_loc(value);
			return;
		}
		if ($label_rsrc.equalsIgnoreCase(name)) {
			label_rsrc(value);
			return;
		}
		if ($label_unit.equalsIgnoreCase(name)) {
			label_unit(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($holiday01_flg.equalsIgnoreCase(name)) {
			holiday01_flg(value);
			return;
		}
		if ($holiday02_flg.equalsIgnoreCase(name)) {
			holiday02_flg(value);
			return;
		}
		if ($holiday03_flg.equalsIgnoreCase(name)) {
			holiday03_flg(value);
			return;
		}
		if ($holiday04_flg.equalsIgnoreCase(name)) {
			holiday04_flg(value);
			return;
		}
		if ($holiday05_flg.equalsIgnoreCase(name)) {
			holiday05_flg(value);
			return;
		}
		if ($holiday06_flg.equalsIgnoreCase(name)) {
			holiday06_flg(value);
			return;
		}
		if ($holiday07_flg.equalsIgnoreCase(name)) {
			holiday07_flg(value);
			return;
		}
		if ($holiday08_flg.equalsIgnoreCase(name)) {
			holiday08_flg(value);
			return;
		}
		if ($holiday09_flg.equalsIgnoreCase(name)) {
			holiday09_flg(value);
			return;
		}
		if ($holiday10_flg.equalsIgnoreCase(name)) {
			holiday10_flg(value);
			return;
		}
		if ($holiday11_flg.equalsIgnoreCase(name)) {
			holiday11_flg(value);
			return;
		}
		if ($holiday12_flg.equalsIgnoreCase(name)) {
			holiday12_flg(value);
			return;
		}
		if ($holiday13_flg.equalsIgnoreCase(name)) {
			holiday13_flg(value);
			return;
		}
		if ($holiday14_flg.equalsIgnoreCase(name)) {
			holiday14_flg(value);
			return;
		}
		if ($holiday15_flg.equalsIgnoreCase(name)) {
			holiday15_flg(value);
			return;
		}
		if ($holiday16_flg.equalsIgnoreCase(name)) {
			holiday16_flg(value);
			return;
		}
		if ($holiday17_flg.equalsIgnoreCase(name)) {
			holiday17_flg(value);
			return;
		}
		if ($holiday18_flg.equalsIgnoreCase(name)) {
			holiday18_flg(value);
			return;
		}
		if ($holiday19_flg.equalsIgnoreCase(name)) {
			holiday19_flg(value);
			return;
		}
		if ($holiday20_flg.equalsIgnoreCase(name)) {
			holiday20_flg(value);
			return;
		}
		if ($holiday21_flg.equalsIgnoreCase(name)) {
			holiday21_flg(value);
			return;
		}
		if ($holiday22_flg.equalsIgnoreCase(name)) {
			holiday22_flg(value);
			return;
		}
		if ($holiday23_flg.equalsIgnoreCase(name)) {
			holiday23_flg(value);
			return;
		}
		if ($holiday24_flg.equalsIgnoreCase(name)) {
			holiday24_flg(value);
			return;
		}
		if ($holiday25_flg.equalsIgnoreCase(name)) {
			holiday25_flg(value);
			return;
		}
		if ($holiday26_flg.equalsIgnoreCase(name)) {
			holiday26_flg(value);
			return;
		}
		if ($holiday27_flg.equalsIgnoreCase(name)) {
			holiday27_flg(value);
			return;
		}
		if ($holiday28_flg.equalsIgnoreCase(name)) {
			holiday28_flg(value);
			return;
		}
		if ($holiday29_flg.equalsIgnoreCase(name)) {
			holiday29_flg(value);
			return;
		}
		if ($holiday30_flg.equalsIgnoreCase(name)) {
			holiday30_flg(value);
			return;
		}
		if ($holiday31_flg.equalsIgnoreCase(name)) {
			holiday31_flg(value);
			return;
		}
		if ($holiday32_flg.equalsIgnoreCase(name)) {
			holiday32_flg(value);
			return;
		}
		if ($holiday33_flg.equalsIgnoreCase(name)) {
			holiday33_flg(value);
			return;
		}
		if ($holiday34_flg.equalsIgnoreCase(name)) {
			holiday34_flg(value);
			return;
		}
		if ($holiday35_flg.equalsIgnoreCase(name)) {
			holiday35_flg(value);
			return;
		}
		if ($holiday36_flg.equalsIgnoreCase(name)) {
			holiday36_flg(value);
			return;
		}
		if ($holiday37_flg.equalsIgnoreCase(name)) {
			holiday37_flg(value);
			return;
		}
		if ($holiday38_flg.equalsIgnoreCase(name)) {
			holiday38_flg(value);
			return;
		}
		if ($holiday39_flg.equalsIgnoreCase(name)) {
			holiday39_flg(value);
			return;
		}
		if ($holiday40_flg.equalsIgnoreCase(name)) {
			holiday40_flg(value);
			return;
		}
		if ($holiday41_flg.equalsIgnoreCase(name)) {
			holiday41_flg(value);
			return;
		}
		if ($holiday42_flg.equalsIgnoreCase(name)) {
			holiday42_flg(value);
			return;
		}
		if ($holiday43_flg.equalsIgnoreCase(name)) {
			holiday43_flg(value);
			return;
		}
		if ($holiday44_flg.equalsIgnoreCase(name)) {
			holiday44_flg(value);
			return;
		}
		if ($holiday45_flg.equalsIgnoreCase(name)) {
			holiday45_flg(value);
			return;
		}
		if ($holiday46_flg.equalsIgnoreCase(name)) {
			holiday46_flg(value);
			return;
		}
		if ($holiday47_flg.equalsIgnoreCase(name)) {
			holiday47_flg(value);
			return;
		}
		if ($holiday48_flg.equalsIgnoreCase(name)) {
			holiday48_flg(value);
			return;
		}
		if ($holiday49_flg.equalsIgnoreCase(name)) {
			holiday49_flg(value);
			return;
		}
		if ($holiday50_flg.equalsIgnoreCase(name)) {
			holiday50_flg(value);
			return;
		}
		if ($holiday51_flg.equalsIgnoreCase(name)) {
			holiday51_flg(value);
			return;
		}
		if ($holiday52_flg.equalsIgnoreCase(name)) {
			holiday52_flg(value);
			return;
		}
		if ($holiday53_flg.equalsIgnoreCase(name)) {
			holiday53_flg(value);
			return;
		}
		if ($holiday54_flg.equalsIgnoreCase(name)) {
			holiday54_flg(value);
			return;
		}
		if ($holiday55_flg.equalsIgnoreCase(name)) {
			holiday55_flg(value);
			return;
		}
		if ($holiday56_flg.equalsIgnoreCase(name)) {
			holiday56_flg(value);
			return;
		}
		if ($holiday57_flg.equalsIgnoreCase(name)) {
			holiday57_flg(value);
			return;
		}
		if ($holiday58_flg.equalsIgnoreCase(name)) {
			holiday58_flg(value);
			return;
		}
		if ($holiday59_flg.equalsIgnoreCase(name)) {
			holiday59_flg(value);
			return;
		}
		if ($holiday60_flg.equalsIgnoreCase(name)) {
			holiday60_flg(value);
			return;
		}
		if ($holiday61_flg.equalsIgnoreCase(name)) {
			holiday61_flg(value);
			return;
		}
		if ($holiday62_flg.equalsIgnoreCase(name)) {
			holiday62_flg(value);
			return;
		}
		if ($holiday63_flg.equalsIgnoreCase(name)) {
			holiday63_flg(value);
			return;
		}
		if ($holiday64_flg.equalsIgnoreCase(name)) {
			holiday64_flg(value);
			return;
		}
		if ($holiday65_flg.equalsIgnoreCase(name)) {
			holiday65_flg(value);
			return;
		}
		if ($holiday66_flg.equalsIgnoreCase(name)) {
			holiday66_flg(value);
			return;
		}
		if ($holiday67_flg.equalsIgnoreCase(name)) {
			holiday67_flg(value);
			return;
		}
		if ($holiday68_flg.equalsIgnoreCase(name)) {
			holiday68_flg(value);
			return;
		}
		if ($holiday69_flg.equalsIgnoreCase(name)) {
			holiday69_flg(value);
			return;
		}
		if ($holiday70_flg.equalsIgnoreCase(name)) {
			holiday70_flg(value);
			return;
		}
		if ($holiday71_flg.equalsIgnoreCase(name)) {
			holiday71_flg(value);
			return;
		}
		if ($holiday72_flg.equalsIgnoreCase(name)) {
			holiday72_flg(value);
			return;
		}
		if ($holiday73_flg.equalsIgnoreCase(name)) {
			holiday73_flg(value);
			return;
		}
		if ($holiday74_flg.equalsIgnoreCase(name)) {
			holiday74_flg(value);
			return;
		}
		if ($holiday75_flg.equalsIgnoreCase(name)) {
			holiday75_flg(value);
			return;
		}
		if ($holiday76_flg.equalsIgnoreCase(name)) {
			holiday76_flg(value);
			return;
		}
		if ($holiday77_flg.equalsIgnoreCase(name)) {
			holiday77_flg(value);
			return;
		}
		if ($holiday78_flg.equalsIgnoreCase(name)) {
			holiday78_flg(value);
			return;
		}
		if ($holiday79_flg.equalsIgnoreCase(name)) {
			holiday79_flg(value);
			return;
		}
		if ($holiday80_flg.equalsIgnoreCase(name)) {
			holiday80_flg(value);
			return;
		}
		if ($holiday81_flg.equalsIgnoreCase(name)) {
			holiday81_flg(value);
			return;
		}
		if ($holiday82_flg.equalsIgnoreCase(name)) {
			holiday82_flg(value);
			return;
		}
		if ($holiday83_flg.equalsIgnoreCase(name)) {
			holiday83_flg(value);
			return;
		}
		if ($holiday84_flg.equalsIgnoreCase(name)) {
			holiday84_flg(value);
			return;
		}
		if ($holiday85_flg.equalsIgnoreCase(name)) {
			holiday85_flg(value);
			return;
		}
		if ($holiday86_flg.equalsIgnoreCase(name)) {
			holiday86_flg(value);
			return;
		}
		if ($holiday87_flg.equalsIgnoreCase(name)) {
			holiday87_flg(value);
			return;
		}
		if ($holiday88_flg.equalsIgnoreCase(name)) {
			holiday88_flg(value);
			return;
		}
		if ($holiday89_flg.equalsIgnoreCase(name)) {
			holiday89_flg(value);
			return;
		}
		if ($holiday90_flg.equalsIgnoreCase(name)) {
			holiday90_flg(value);
			return;
		}
		if ($holiday91_flg.equalsIgnoreCase(name)) {
			holiday91_flg(value);
			return;
		}
		if ($holiday92_flg.equalsIgnoreCase(name)) {
			holiday92_flg(value);
			return;
		}
		if ($holiday93_flg.equalsIgnoreCase(name)) {
			holiday93_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($label.equalsIgnoreCase(name)) {
			label(value);
			return;
		}
		if ($code.equalsIgnoreCase(name)) {
			code(value);
			return;
		}
		if ($name.equalsIgnoreCase(name)) {
			name(value);
			return;
		}
		if ($row_title_col.equalsIgnoreCase(name)) {
			row_title_col(value);
			return;
		}
		if ($row_title_nm.equalsIgnoreCase(name)) {
			row_title_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($rsrc_cd.equalsIgnoreCase(name)) {
			rsrc_cd(value);
			return;
		}
		if ($rsrc_nm.equalsIgnoreCase(name)) {
			rsrc_nm(value);
			return;
		}
		if ($rsrc_unit_cd.equalsIgnoreCase(name)) {
			rsrc_unit_cd(value);
			return;
		}
		if ($rsrc_unit_nm.equalsIgnoreCase(name)) {
			rsrc_unit_nm(value);
			return;
		}
		if ($label_loc.equalsIgnoreCase(name)) {
			label_loc(value);
			return;
		}
		if ($label_rsrc.equalsIgnoreCase(name)) {
			label_rsrc(value);
			return;
		}
		if ($label_unit.equalsIgnoreCase(name)) {
			label_unit(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rsrc_dec_place.equalsIgnoreCase(name)) {
			rsrc_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($holiday01_flg.equalsIgnoreCase(name)) {
			holiday01_flg(value);
			return;
		}
		if ($holiday02_flg.equalsIgnoreCase(name)) {
			holiday02_flg(value);
			return;
		}
		if ($holiday03_flg.equalsIgnoreCase(name)) {
			holiday03_flg(value);
			return;
		}
		if ($holiday04_flg.equalsIgnoreCase(name)) {
			holiday04_flg(value);
			return;
		}
		if ($holiday05_flg.equalsIgnoreCase(name)) {
			holiday05_flg(value);
			return;
		}
		if ($holiday06_flg.equalsIgnoreCase(name)) {
			holiday06_flg(value);
			return;
		}
		if ($holiday07_flg.equalsIgnoreCase(name)) {
			holiday07_flg(value);
			return;
		}
		if ($holiday08_flg.equalsIgnoreCase(name)) {
			holiday08_flg(value);
			return;
		}
		if ($holiday09_flg.equalsIgnoreCase(name)) {
			holiday09_flg(value);
			return;
		}
		if ($holiday10_flg.equalsIgnoreCase(name)) {
			holiday10_flg(value);
			return;
		}
		if ($holiday11_flg.equalsIgnoreCase(name)) {
			holiday11_flg(value);
			return;
		}
		if ($holiday12_flg.equalsIgnoreCase(name)) {
			holiday12_flg(value);
			return;
		}
		if ($holiday13_flg.equalsIgnoreCase(name)) {
			holiday13_flg(value);
			return;
		}
		if ($holiday14_flg.equalsIgnoreCase(name)) {
			holiday14_flg(value);
			return;
		}
		if ($holiday15_flg.equalsIgnoreCase(name)) {
			holiday15_flg(value);
			return;
		}
		if ($holiday16_flg.equalsIgnoreCase(name)) {
			holiday16_flg(value);
			return;
		}
		if ($holiday17_flg.equalsIgnoreCase(name)) {
			holiday17_flg(value);
			return;
		}
		if ($holiday18_flg.equalsIgnoreCase(name)) {
			holiday18_flg(value);
			return;
		}
		if ($holiday19_flg.equalsIgnoreCase(name)) {
			holiday19_flg(value);
			return;
		}
		if ($holiday20_flg.equalsIgnoreCase(name)) {
			holiday20_flg(value);
			return;
		}
		if ($holiday21_flg.equalsIgnoreCase(name)) {
			holiday21_flg(value);
			return;
		}
		if ($holiday22_flg.equalsIgnoreCase(name)) {
			holiday22_flg(value);
			return;
		}
		if ($holiday23_flg.equalsIgnoreCase(name)) {
			holiday23_flg(value);
			return;
		}
		if ($holiday24_flg.equalsIgnoreCase(name)) {
			holiday24_flg(value);
			return;
		}
		if ($holiday25_flg.equalsIgnoreCase(name)) {
			holiday25_flg(value);
			return;
		}
		if ($holiday26_flg.equalsIgnoreCase(name)) {
			holiday26_flg(value);
			return;
		}
		if ($holiday27_flg.equalsIgnoreCase(name)) {
			holiday27_flg(value);
			return;
		}
		if ($holiday28_flg.equalsIgnoreCase(name)) {
			holiday28_flg(value);
			return;
		}
		if ($holiday29_flg.equalsIgnoreCase(name)) {
			holiday29_flg(value);
			return;
		}
		if ($holiday30_flg.equalsIgnoreCase(name)) {
			holiday30_flg(value);
			return;
		}
		if ($holiday31_flg.equalsIgnoreCase(name)) {
			holiday31_flg(value);
			return;
		}
		if ($holiday32_flg.equalsIgnoreCase(name)) {
			holiday32_flg(value);
			return;
		}
		if ($holiday33_flg.equalsIgnoreCase(name)) {
			holiday33_flg(value);
			return;
		}
		if ($holiday34_flg.equalsIgnoreCase(name)) {
			holiday34_flg(value);
			return;
		}
		if ($holiday35_flg.equalsIgnoreCase(name)) {
			holiday35_flg(value);
			return;
		}
		if ($holiday36_flg.equalsIgnoreCase(name)) {
			holiday36_flg(value);
			return;
		}
		if ($holiday37_flg.equalsIgnoreCase(name)) {
			holiday37_flg(value);
			return;
		}
		if ($holiday38_flg.equalsIgnoreCase(name)) {
			holiday38_flg(value);
			return;
		}
		if ($holiday39_flg.equalsIgnoreCase(name)) {
			holiday39_flg(value);
			return;
		}
		if ($holiday40_flg.equalsIgnoreCase(name)) {
			holiday40_flg(value);
			return;
		}
		if ($holiday41_flg.equalsIgnoreCase(name)) {
			holiday41_flg(value);
			return;
		}
		if ($holiday42_flg.equalsIgnoreCase(name)) {
			holiday42_flg(value);
			return;
		}
		if ($holiday43_flg.equalsIgnoreCase(name)) {
			holiday43_flg(value);
			return;
		}
		if ($holiday44_flg.equalsIgnoreCase(name)) {
			holiday44_flg(value);
			return;
		}
		if ($holiday45_flg.equalsIgnoreCase(name)) {
			holiday45_flg(value);
			return;
		}
		if ($holiday46_flg.equalsIgnoreCase(name)) {
			holiday46_flg(value);
			return;
		}
		if ($holiday47_flg.equalsIgnoreCase(name)) {
			holiday47_flg(value);
			return;
		}
		if ($holiday48_flg.equalsIgnoreCase(name)) {
			holiday48_flg(value);
			return;
		}
		if ($holiday49_flg.equalsIgnoreCase(name)) {
			holiday49_flg(value);
			return;
		}
		if ($holiday50_flg.equalsIgnoreCase(name)) {
			holiday50_flg(value);
			return;
		}
		if ($holiday51_flg.equalsIgnoreCase(name)) {
			holiday51_flg(value);
			return;
		}
		if ($holiday52_flg.equalsIgnoreCase(name)) {
			holiday52_flg(value);
			return;
		}
		if ($holiday53_flg.equalsIgnoreCase(name)) {
			holiday53_flg(value);
			return;
		}
		if ($holiday54_flg.equalsIgnoreCase(name)) {
			holiday54_flg(value);
			return;
		}
		if ($holiday55_flg.equalsIgnoreCase(name)) {
			holiday55_flg(value);
			return;
		}
		if ($holiday56_flg.equalsIgnoreCase(name)) {
			holiday56_flg(value);
			return;
		}
		if ($holiday57_flg.equalsIgnoreCase(name)) {
			holiday57_flg(value);
			return;
		}
		if ($holiday58_flg.equalsIgnoreCase(name)) {
			holiday58_flg(value);
			return;
		}
		if ($holiday59_flg.equalsIgnoreCase(name)) {
			holiday59_flg(value);
			return;
		}
		if ($holiday60_flg.equalsIgnoreCase(name)) {
			holiday60_flg(value);
			return;
		}
		if ($holiday61_flg.equalsIgnoreCase(name)) {
			holiday61_flg(value);
			return;
		}
		if ($holiday62_flg.equalsIgnoreCase(name)) {
			holiday62_flg(value);
			return;
		}
		if ($holiday63_flg.equalsIgnoreCase(name)) {
			holiday63_flg(value);
			return;
		}
		if ($holiday64_flg.equalsIgnoreCase(name)) {
			holiday64_flg(value);
			return;
		}
		if ($holiday65_flg.equalsIgnoreCase(name)) {
			holiday65_flg(value);
			return;
		}
		if ($holiday66_flg.equalsIgnoreCase(name)) {
			holiday66_flg(value);
			return;
		}
		if ($holiday67_flg.equalsIgnoreCase(name)) {
			holiday67_flg(value);
			return;
		}
		if ($holiday68_flg.equalsIgnoreCase(name)) {
			holiday68_flg(value);
			return;
		}
		if ($holiday69_flg.equalsIgnoreCase(name)) {
			holiday69_flg(value);
			return;
		}
		if ($holiday70_flg.equalsIgnoreCase(name)) {
			holiday70_flg(value);
			return;
		}
		if ($holiday71_flg.equalsIgnoreCase(name)) {
			holiday71_flg(value);
			return;
		}
		if ($holiday72_flg.equalsIgnoreCase(name)) {
			holiday72_flg(value);
			return;
		}
		if ($holiday73_flg.equalsIgnoreCase(name)) {
			holiday73_flg(value);
			return;
		}
		if ($holiday74_flg.equalsIgnoreCase(name)) {
			holiday74_flg(value);
			return;
		}
		if ($holiday75_flg.equalsIgnoreCase(name)) {
			holiday75_flg(value);
			return;
		}
		if ($holiday76_flg.equalsIgnoreCase(name)) {
			holiday76_flg(value);
			return;
		}
		if ($holiday77_flg.equalsIgnoreCase(name)) {
			holiday77_flg(value);
			return;
		}
		if ($holiday78_flg.equalsIgnoreCase(name)) {
			holiday78_flg(value);
			return;
		}
		if ($holiday79_flg.equalsIgnoreCase(name)) {
			holiday79_flg(value);
			return;
		}
		if ($holiday80_flg.equalsIgnoreCase(name)) {
			holiday80_flg(value);
			return;
		}
		if ($holiday81_flg.equalsIgnoreCase(name)) {
			holiday81_flg(value);
			return;
		}
		if ($holiday82_flg.equalsIgnoreCase(name)) {
			holiday82_flg(value);
			return;
		}
		if ($holiday83_flg.equalsIgnoreCase(name)) {
			holiday83_flg(value);
			return;
		}
		if ($holiday84_flg.equalsIgnoreCase(name)) {
			holiday84_flg(value);
			return;
		}
		if ($holiday85_flg.equalsIgnoreCase(name)) {
			holiday85_flg(value);
			return;
		}
		if ($holiday86_flg.equalsIgnoreCase(name)) {
			holiday86_flg(value);
			return;
		}
		if ($holiday87_flg.equalsIgnoreCase(name)) {
			holiday87_flg(value);
			return;
		}
		if ($holiday88_flg.equalsIgnoreCase(name)) {
			holiday88_flg(value);
			return;
		}
		if ($holiday89_flg.equalsIgnoreCase(name)) {
			holiday89_flg(value);
			return;
		}
		if ($holiday90_flg.equalsIgnoreCase(name)) {
			holiday90_flg(value);
			return;
		}
		if ($holiday91_flg.equalsIgnoreCase(name)) {
			holiday91_flg(value);
			return;
		}
		if ($holiday92_flg.equalsIgnoreCase(name)) {
			holiday92_flg(value);
			return;
		}
		if ($holiday93_flg.equalsIgnoreCase(name)) {
			holiday93_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($qty01_p.equalsIgnoreCase(name)) {
			return qty01_p();
		}
		if ($qty02_p.equalsIgnoreCase(name)) {
			return qty02_p();
		}
		if ($qty03_p.equalsIgnoreCase(name)) {
			return qty03_p();
		}
		if ($qty04_p.equalsIgnoreCase(name)) {
			return qty04_p();
		}
		if ($qty05_p.equalsIgnoreCase(name)) {
			return qty05_p();
		}
		if ($qty06_p.equalsIgnoreCase(name)) {
			return qty06_p();
		}
		if ($qty07_p.equalsIgnoreCase(name)) {
			return qty07_p();
		}
		if ($qty08_p.equalsIgnoreCase(name)) {
			return qty08_p();
		}
		if ($qty09_p.equalsIgnoreCase(name)) {
			return qty09_p();
		}
		if ($qty10_p.equalsIgnoreCase(name)) {
			return qty10_p();
		}
		if ($qty11_p.equalsIgnoreCase(name)) {
			return qty11_p();
		}
		if ($qty12_p.equalsIgnoreCase(name)) {
			return qty12_p();
		}
		if ($qty13_p.equalsIgnoreCase(name)) {
			return qty13_p();
		}
		if ($qty14_p.equalsIgnoreCase(name)) {
			return qty14_p();
		}
		if ($qty15_p.equalsIgnoreCase(name)) {
			return qty15_p();
		}
		if ($qty16_p.equalsIgnoreCase(name)) {
			return qty16_p();
		}
		if ($qty17_p.equalsIgnoreCase(name)) {
			return qty17_p();
		}
		if ($qty18_p.equalsIgnoreCase(name)) {
			return qty18_p();
		}
		if ($qty19_p.equalsIgnoreCase(name)) {
			return qty19_p();
		}
		if ($qty20_p.equalsIgnoreCase(name)) {
			return qty20_p();
		}
		if ($qty21_p.equalsIgnoreCase(name)) {
			return qty21_p();
		}
		if ($qty22_p.equalsIgnoreCase(name)) {
			return qty22_p();
		}
		if ($qty23_p.equalsIgnoreCase(name)) {
			return qty23_p();
		}
		if ($qty24_p.equalsIgnoreCase(name)) {
			return qty24_p();
		}
		if ($qty25_p.equalsIgnoreCase(name)) {
			return qty25_p();
		}
		if ($qty26_p.equalsIgnoreCase(name)) {
			return qty26_p();
		}
		if ($qty27_p.equalsIgnoreCase(name)) {
			return qty27_p();
		}
		if ($qty28_p.equalsIgnoreCase(name)) {
			return qty28_p();
		}
		if ($qty29_p.equalsIgnoreCase(name)) {
			return qty29_p();
		}
		if ($qty30_p.equalsIgnoreCase(name)) {
			return qty30_p();
		}
		if ($qty31_p.equalsIgnoreCase(name)) {
			return qty31_p();
		}
		if ($qty32_p.equalsIgnoreCase(name)) {
			return qty32_p();
		}
		if ($qty33_p.equalsIgnoreCase(name)) {
			return qty33_p();
		}
		if ($qty34_p.equalsIgnoreCase(name)) {
			return qty34_p();
		}
		if ($qty35_p.equalsIgnoreCase(name)) {
			return qty35_p();
		}
		if ($qty36_p.equalsIgnoreCase(name)) {
			return qty36_p();
		}
		if ($qty37_p.equalsIgnoreCase(name)) {
			return qty37_p();
		}
		if ($qty38_p.equalsIgnoreCase(name)) {
			return qty38_p();
		}
		if ($qty39_p.equalsIgnoreCase(name)) {
			return qty39_p();
		}
		if ($qty40_p.equalsIgnoreCase(name)) {
			return qty40_p();
		}
		if ($qty41_p.equalsIgnoreCase(name)) {
			return qty41_p();
		}
		if ($qty42_p.equalsIgnoreCase(name)) {
			return qty42_p();
		}
		if ($qty43_p.equalsIgnoreCase(name)) {
			return qty43_p();
		}
		if ($qty44_p.equalsIgnoreCase(name)) {
			return qty44_p();
		}
		if ($qty45_p.equalsIgnoreCase(name)) {
			return qty45_p();
		}
		if ($qty46_p.equalsIgnoreCase(name)) {
			return qty46_p();
		}
		if ($qty47_p.equalsIgnoreCase(name)) {
			return qty47_p();
		}
		if ($qty48_p.equalsIgnoreCase(name)) {
			return qty48_p();
		}
		if ($qty49_p.equalsIgnoreCase(name)) {
			return qty49_p();
		}
		if ($qty50_p.equalsIgnoreCase(name)) {
			return qty50_p();
		}
		if ($qty51_p.equalsIgnoreCase(name)) {
			return qty51_p();
		}
		if ($qty52_p.equalsIgnoreCase(name)) {
			return qty52_p();
		}
		if ($qty53_p.equalsIgnoreCase(name)) {
			return qty53_p();
		}
		if ($qty54_p.equalsIgnoreCase(name)) {
			return qty54_p();
		}
		if ($qty55_p.equalsIgnoreCase(name)) {
			return qty55_p();
		}
		if ($qty56_p.equalsIgnoreCase(name)) {
			return qty56_p();
		}
		if ($qty57_p.equalsIgnoreCase(name)) {
			return qty57_p();
		}
		if ($qty58_p.equalsIgnoreCase(name)) {
			return qty58_p();
		}
		if ($qty59_p.equalsIgnoreCase(name)) {
			return qty59_p();
		}
		if ($qty60_p.equalsIgnoreCase(name)) {
			return qty60_p();
		}
		if ($qty61_p.equalsIgnoreCase(name)) {
			return qty61_p();
		}
		if ($qty62_p.equalsIgnoreCase(name)) {
			return qty62_p();
		}
		if ($qty63_p.equalsIgnoreCase(name)) {
			return qty63_p();
		}
		if ($qty64_p.equalsIgnoreCase(name)) {
			return qty64_p();
		}
		if ($qty65_p.equalsIgnoreCase(name)) {
			return qty65_p();
		}
		if ($qty66_p.equalsIgnoreCase(name)) {
			return qty66_p();
		}
		if ($qty67_p.equalsIgnoreCase(name)) {
			return qty67_p();
		}
		if ($qty68_p.equalsIgnoreCase(name)) {
			return qty68_p();
		}
		if ($qty69_p.equalsIgnoreCase(name)) {
			return qty69_p();
		}
		if ($qty70_p.equalsIgnoreCase(name)) {
			return qty70_p();
		}
		if ($qty71_p.equalsIgnoreCase(name)) {
			return qty71_p();
		}
		if ($qty72_p.equalsIgnoreCase(name)) {
			return qty72_p();
		}
		if ($qty73_p.equalsIgnoreCase(name)) {
			return qty73_p();
		}
		if ($qty74_p.equalsIgnoreCase(name)) {
			return qty74_p();
		}
		if ($qty75_p.equalsIgnoreCase(name)) {
			return qty75_p();
		}
		if ($qty76_p.equalsIgnoreCase(name)) {
			return qty76_p();
		}
		if ($qty77_p.equalsIgnoreCase(name)) {
			return qty77_p();
		}
		if ($qty78_p.equalsIgnoreCase(name)) {
			return qty78_p();
		}
		if ($qty79_p.equalsIgnoreCase(name)) {
			return qty79_p();
		}
		if ($qty80_p.equalsIgnoreCase(name)) {
			return qty80_p();
		}
		if ($qty81_p.equalsIgnoreCase(name)) {
			return qty81_p();
		}
		if ($qty82_p.equalsIgnoreCase(name)) {
			return qty82_p();
		}
		if ($qty83_p.equalsIgnoreCase(name)) {
			return qty83_p();
		}
		if ($qty84_p.equalsIgnoreCase(name)) {
			return qty84_p();
		}
		if ($qty85_p.equalsIgnoreCase(name)) {
			return qty85_p();
		}
		if ($qty86_p.equalsIgnoreCase(name)) {
			return qty86_p();
		}
		if ($qty87_p.equalsIgnoreCase(name)) {
			return qty87_p();
		}
		if ($qty88_p.equalsIgnoreCase(name)) {
			return qty88_p();
		}
		if ($qty89_p.equalsIgnoreCase(name)) {
			return qty89_p();
		}
		if ($qty90_p.equalsIgnoreCase(name)) {
			return qty90_p();
		}
		if ($qty91_p.equalsIgnoreCase(name)) {
			return qty91_p();
		}
		if ($qty92_p.equalsIgnoreCase(name)) {
			return qty92_p();
		}
		if ($qty93_p.equalsIgnoreCase(name)) {
			return qty93_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($qty01_p.equalsIgnoreCase(name)) {
			qty01_p(
				((MCContainerMeta) qty01_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty02_p.equalsIgnoreCase(name)) {
			qty02_p(
				((MCContainerMeta) qty02_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty03_p.equalsIgnoreCase(name)) {
			qty03_p(
				((MCContainerMeta) qty03_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty04_p.equalsIgnoreCase(name)) {
			qty04_p(
				((MCContainerMeta) qty04_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty05_p.equalsIgnoreCase(name)) {
			qty05_p(
				((MCContainerMeta) qty05_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty06_p.equalsIgnoreCase(name)) {
			qty06_p(
				((MCContainerMeta) qty06_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty07_p.equalsIgnoreCase(name)) {
			qty07_p(
				((MCContainerMeta) qty07_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty08_p.equalsIgnoreCase(name)) {
			qty08_p(
				((MCContainerMeta) qty08_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty09_p.equalsIgnoreCase(name)) {
			qty09_p(
				((MCContainerMeta) qty09_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty10_p.equalsIgnoreCase(name)) {
			qty10_p(
				((MCContainerMeta) qty10_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty11_p.equalsIgnoreCase(name)) {
			qty11_p(
				((MCContainerMeta) qty11_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty12_p.equalsIgnoreCase(name)) {
			qty12_p(
				((MCContainerMeta) qty12_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty13_p.equalsIgnoreCase(name)) {
			qty13_p(
				((MCContainerMeta) qty13_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty14_p.equalsIgnoreCase(name)) {
			qty14_p(
				((MCContainerMeta) qty14_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty15_p.equalsIgnoreCase(name)) {
			qty15_p(
				((MCContainerMeta) qty15_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty16_p.equalsIgnoreCase(name)) {
			qty16_p(
				((MCContainerMeta) qty16_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty17_p.equalsIgnoreCase(name)) {
			qty17_p(
				((MCContainerMeta) qty17_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty18_p.equalsIgnoreCase(name)) {
			qty18_p(
				((MCContainerMeta) qty18_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty19_p.equalsIgnoreCase(name)) {
			qty19_p(
				((MCContainerMeta) qty19_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty20_p.equalsIgnoreCase(name)) {
			qty20_p(
				((MCContainerMeta) qty20_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty21_p.equalsIgnoreCase(name)) {
			qty21_p(
				((MCContainerMeta) qty21_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty22_p.equalsIgnoreCase(name)) {
			qty22_p(
				((MCContainerMeta) qty22_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty23_p.equalsIgnoreCase(name)) {
			qty23_p(
				((MCContainerMeta) qty23_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty24_p.equalsIgnoreCase(name)) {
			qty24_p(
				((MCContainerMeta) qty24_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty25_p.equalsIgnoreCase(name)) {
			qty25_p(
				((MCContainerMeta) qty25_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty26_p.equalsIgnoreCase(name)) {
			qty26_p(
				((MCContainerMeta) qty26_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty27_p.equalsIgnoreCase(name)) {
			qty27_p(
				((MCContainerMeta) qty27_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty28_p.equalsIgnoreCase(name)) {
			qty28_p(
				((MCContainerMeta) qty28_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty29_p.equalsIgnoreCase(name)) {
			qty29_p(
				((MCContainerMeta) qty29_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty30_p.equalsIgnoreCase(name)) {
			qty30_p(
				((MCContainerMeta) qty30_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty31_p.equalsIgnoreCase(name)) {
			qty31_p(
				((MCContainerMeta) qty31_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty32_p.equalsIgnoreCase(name)) {
			qty32_p(
				((MCContainerMeta) qty32_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty33_p.equalsIgnoreCase(name)) {
			qty33_p(
				((MCContainerMeta) qty33_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty34_p.equalsIgnoreCase(name)) {
			qty34_p(
				((MCContainerMeta) qty34_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty35_p.equalsIgnoreCase(name)) {
			qty35_p(
				((MCContainerMeta) qty35_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty36_p.equalsIgnoreCase(name)) {
			qty36_p(
				((MCContainerMeta) qty36_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty37_p.equalsIgnoreCase(name)) {
			qty37_p(
				((MCContainerMeta) qty37_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty38_p.equalsIgnoreCase(name)) {
			qty38_p(
				((MCContainerMeta) qty38_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty39_p.equalsIgnoreCase(name)) {
			qty39_p(
				((MCContainerMeta) qty39_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty40_p.equalsIgnoreCase(name)) {
			qty40_p(
				((MCContainerMeta) qty40_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty41_p.equalsIgnoreCase(name)) {
			qty41_p(
				((MCContainerMeta) qty41_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty42_p.equalsIgnoreCase(name)) {
			qty42_p(
				((MCContainerMeta) qty42_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty43_p.equalsIgnoreCase(name)) {
			qty43_p(
				((MCContainerMeta) qty43_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty44_p.equalsIgnoreCase(name)) {
			qty44_p(
				((MCContainerMeta) qty44_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty45_p.equalsIgnoreCase(name)) {
			qty45_p(
				((MCContainerMeta) qty45_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty46_p.equalsIgnoreCase(name)) {
			qty46_p(
				((MCContainerMeta) qty46_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty47_p.equalsIgnoreCase(name)) {
			qty47_p(
				((MCContainerMeta) qty47_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty48_p.equalsIgnoreCase(name)) {
			qty48_p(
				((MCContainerMeta) qty48_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty49_p.equalsIgnoreCase(name)) {
			qty49_p(
				((MCContainerMeta) qty49_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty50_p.equalsIgnoreCase(name)) {
			qty50_p(
				((MCContainerMeta) qty50_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty51_p.equalsIgnoreCase(name)) {
			qty51_p(
				((MCContainerMeta) qty51_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty52_p.equalsIgnoreCase(name)) {
			qty52_p(
				((MCContainerMeta) qty52_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty53_p.equalsIgnoreCase(name)) {
			qty53_p(
				((MCContainerMeta) qty53_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty54_p.equalsIgnoreCase(name)) {
			qty54_p(
				((MCContainerMeta) qty54_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty55_p.equalsIgnoreCase(name)) {
			qty55_p(
				((MCContainerMeta) qty55_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty56_p.equalsIgnoreCase(name)) {
			qty56_p(
				((MCContainerMeta) qty56_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty57_p.equalsIgnoreCase(name)) {
			qty57_p(
				((MCContainerMeta) qty57_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty58_p.equalsIgnoreCase(name)) {
			qty58_p(
				((MCContainerMeta) qty58_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty59_p.equalsIgnoreCase(name)) {
			qty59_p(
				((MCContainerMeta) qty59_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty60_p.equalsIgnoreCase(name)) {
			qty60_p(
				((MCContainerMeta) qty60_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty61_p.equalsIgnoreCase(name)) {
			qty61_p(
				((MCContainerMeta) qty61_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty62_p.equalsIgnoreCase(name)) {
			qty62_p(
				((MCContainerMeta) qty62_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty63_p.equalsIgnoreCase(name)) {
			qty63_p(
				((MCContainerMeta) qty63_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty64_p.equalsIgnoreCase(name)) {
			qty64_p(
				((MCContainerMeta) qty64_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty65_p.equalsIgnoreCase(name)) {
			qty65_p(
				((MCContainerMeta) qty65_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty66_p.equalsIgnoreCase(name)) {
			qty66_p(
				((MCContainerMeta) qty66_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty67_p.equalsIgnoreCase(name)) {
			qty67_p(
				((MCContainerMeta) qty67_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty68_p.equalsIgnoreCase(name)) {
			qty68_p(
				((MCContainerMeta) qty68_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty69_p.equalsIgnoreCase(name)) {
			qty69_p(
				((MCContainerMeta) qty69_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty70_p.equalsIgnoreCase(name)) {
			qty70_p(
				((MCContainerMeta) qty70_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty71_p.equalsIgnoreCase(name)) {
			qty71_p(
				((MCContainerMeta) qty71_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty72_p.equalsIgnoreCase(name)) {
			qty72_p(
				((MCContainerMeta) qty72_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty73_p.equalsIgnoreCase(name)) {
			qty73_p(
				((MCContainerMeta) qty73_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty74_p.equalsIgnoreCase(name)) {
			qty74_p(
				((MCContainerMeta) qty74_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty75_p.equalsIgnoreCase(name)) {
			qty75_p(
				((MCContainerMeta) qty75_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty76_p.equalsIgnoreCase(name)) {
			qty76_p(
				((MCContainerMeta) qty76_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty77_p.equalsIgnoreCase(name)) {
			qty77_p(
				((MCContainerMeta) qty77_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty78_p.equalsIgnoreCase(name)) {
			qty78_p(
				((MCContainerMeta) qty78_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty79_p.equalsIgnoreCase(name)) {
			qty79_p(
				((MCContainerMeta) qty79_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty80_p.equalsIgnoreCase(name)) {
			qty80_p(
				((MCContainerMeta) qty80_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty81_p.equalsIgnoreCase(name)) {
			qty81_p(
				((MCContainerMeta) qty81_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty82_p.equalsIgnoreCase(name)) {
			qty82_p(
				((MCContainerMeta) qty82_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty83_p.equalsIgnoreCase(name)) {
			qty83_p(
				((MCContainerMeta) qty83_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty84_p.equalsIgnoreCase(name)) {
			qty84_p(
				((MCContainerMeta) qty84_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty85_p.equalsIgnoreCase(name)) {
			qty85_p(
				((MCContainerMeta) qty85_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty86_p.equalsIgnoreCase(name)) {
			qty86_p(
				((MCContainerMeta) qty86_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty87_p.equalsIgnoreCase(name)) {
			qty87_p(
				((MCContainerMeta) qty87_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty88_p.equalsIgnoreCase(name)) {
			qty88_p(
				((MCContainerMeta) qty88_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty89_p.equalsIgnoreCase(name)) {
			qty89_p(
				((MCContainerMeta) qty89_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty90_p.equalsIgnoreCase(name)) {
			qty90_p(
				((MCContainerMeta) qty90_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty91_p.equalsIgnoreCase(name)) {
			qty91_p(
				((MCContainerMeta) qty91_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty92_p.equalsIgnoreCase(name)) {
			qty92_p(
				((MCContainerMeta) qty92_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty93_p.equalsIgnoreCase(name)) {
			qty93_p(
				((MCContainerMeta) qty93_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Date 01 年月日０１.<p>
	 *
	 */
	public MCNumber qty01() {
		return qty01_p().qty();
	}

	/**
	 * Date 01 年月日０１.<p>
	 *
	 */
	public void qty01(MCNumber value) {
		qty01_p().qty(value);
	}

	/**
	 * Date 01 年月日０１.<p>
	 *
	 */
	public void qty01(int value) {
		qty01_p().qty(value);
	}

	/**
	 * Date 01 年月日０１.<p>
	 *
	 */
	public void qty01(long value) {
		qty01_p().qty(value);
	}

	/**
	 * Date 01 年月日０１.<p>
	 *
	 */
	public void qty01(float value) {
		qty01_p().qty(value);
	}

	/**
	 * Date 01 年月日０１.<p>
	 *
	 */
	public void qty01(double value) {
		qty01_p().qty(value);
	}

	/**
	 * Date 02 年月日０２.<p>
	 *
	 */
	public MCNumber qty02() {
		return qty02_p().qty();
	}

	/**
	 * Date 02 年月日０２.<p>
	 *
	 */
	public void qty02(MCNumber value) {
		qty02_p().qty(value);
	}

	/**
	 * Date 02 年月日０２.<p>
	 *
	 */
	public void qty02(int value) {
		qty02_p().qty(value);
	}

	/**
	 * Date 02 年月日０２.<p>
	 *
	 */
	public void qty02(long value) {
		qty02_p().qty(value);
	}

	/**
	 * Date 02 年月日０２.<p>
	 *
	 */
	public void qty02(float value) {
		qty02_p().qty(value);
	}

	/**
	 * Date 02 年月日０２.<p>
	 *
	 */
	public void qty02(double value) {
		qty02_p().qty(value);
	}

	/**
	 * Date 03 年月日０３.<p>
	 *
	 */
	public MCNumber qty03() {
		return qty03_p().qty();
	}

	/**
	 * Date 03 年月日０３.<p>
	 *
	 */
	public void qty03(MCNumber value) {
		qty03_p().qty(value);
	}

	/**
	 * Date 03 年月日０３.<p>
	 *
	 */
	public void qty03(int value) {
		qty03_p().qty(value);
	}

	/**
	 * Date 03 年月日０３.<p>
	 *
	 */
	public void qty03(long value) {
		qty03_p().qty(value);
	}

	/**
	 * Date 03 年月日０３.<p>
	 *
	 */
	public void qty03(float value) {
		qty03_p().qty(value);
	}

	/**
	 * Date 03 年月日０３.<p>
	 *
	 */
	public void qty03(double value) {
		qty03_p().qty(value);
	}

	/**
	 * Date 04 年月日０４.<p>
	 *
	 */
	public MCNumber qty04() {
		return qty04_p().qty();
	}

	/**
	 * Date 04 年月日０４.<p>
	 *
	 */
	public void qty04(MCNumber value) {
		qty04_p().qty(value);
	}

	/**
	 * Date 04 年月日０４.<p>
	 *
	 */
	public void qty04(int value) {
		qty04_p().qty(value);
	}

	/**
	 * Date 04 年月日０４.<p>
	 *
	 */
	public void qty04(long value) {
		qty04_p().qty(value);
	}

	/**
	 * Date 04 年月日０４.<p>
	 *
	 */
	public void qty04(float value) {
		qty04_p().qty(value);
	}

	/**
	 * Date 04 年月日０４.<p>
	 *
	 */
	public void qty04(double value) {
		qty04_p().qty(value);
	}

	/**
	 * Date 05 年月日０５.<p>
	 *
	 */
	public MCNumber qty05() {
		return qty05_p().qty();
	}

	/**
	 * Date 05 年月日０５.<p>
	 *
	 */
	public void qty05(MCNumber value) {
		qty05_p().qty(value);
	}

	/**
	 * Date 05 年月日０５.<p>
	 *
	 */
	public void qty05(int value) {
		qty05_p().qty(value);
	}

	/**
	 * Date 05 年月日０５.<p>
	 *
	 */
	public void qty05(long value) {
		qty05_p().qty(value);
	}

	/**
	 * Date 05 年月日０５.<p>
	 *
	 */
	public void qty05(float value) {
		qty05_p().qty(value);
	}

	/**
	 * Date 05 年月日０５.<p>
	 *
	 */
	public void qty05(double value) {
		qty05_p().qty(value);
	}

	/**
	 * Date 06 年月日０６.<p>
	 *
	 */
	public MCNumber qty06() {
		return qty06_p().qty();
	}

	/**
	 * Date 06 年月日０６.<p>
	 *
	 */
	public void qty06(MCNumber value) {
		qty06_p().qty(value);
	}

	/**
	 * Date 06 年月日０６.<p>
	 *
	 */
	public void qty06(int value) {
		qty06_p().qty(value);
	}

	/**
	 * Date 06 年月日０６.<p>
	 *
	 */
	public void qty06(long value) {
		qty06_p().qty(value);
	}

	/**
	 * Date 06 年月日０６.<p>
	 *
	 */
	public void qty06(float value) {
		qty06_p().qty(value);
	}

	/**
	 * Date 06 年月日０６.<p>
	 *
	 */
	public void qty06(double value) {
		qty06_p().qty(value);
	}

	/**
	 * Date 07 年月日０７.<p>
	 *
	 */
	public MCNumber qty07() {
		return qty07_p().qty();
	}

	/**
	 * Date 07 年月日０７.<p>
	 *
	 */
	public void qty07(MCNumber value) {
		qty07_p().qty(value);
	}

	/**
	 * Date 07 年月日０７.<p>
	 *
	 */
	public void qty07(int value) {
		qty07_p().qty(value);
	}

	/**
	 * Date 07 年月日０７.<p>
	 *
	 */
	public void qty07(long value) {
		qty07_p().qty(value);
	}

	/**
	 * Date 07 年月日０７.<p>
	 *
	 */
	public void qty07(float value) {
		qty07_p().qty(value);
	}

	/**
	 * Date 07 年月日０７.<p>
	 *
	 */
	public void qty07(double value) {
		qty07_p().qty(value);
	}

	/**
	 * Date 08 年月日０８.<p>
	 *
	 */
	public MCNumber qty08() {
		return qty08_p().qty();
	}

	/**
	 * Date 08 年月日０８.<p>
	 *
	 */
	public void qty08(MCNumber value) {
		qty08_p().qty(value);
	}

	/**
	 * Date 08 年月日０８.<p>
	 *
	 */
	public void qty08(int value) {
		qty08_p().qty(value);
	}

	/**
	 * Date 08 年月日０８.<p>
	 *
	 */
	public void qty08(long value) {
		qty08_p().qty(value);
	}

	/**
	 * Date 08 年月日０８.<p>
	 *
	 */
	public void qty08(float value) {
		qty08_p().qty(value);
	}

	/**
	 * Date 08 年月日０８.<p>
	 *
	 */
	public void qty08(double value) {
		qty08_p().qty(value);
	}

	/**
	 * Date 09 年月日０９.<p>
	 *
	 */
	public MCNumber qty09() {
		return qty09_p().qty();
	}

	/**
	 * Date 09 年月日０９.<p>
	 *
	 */
	public void qty09(MCNumber value) {
		qty09_p().qty(value);
	}

	/**
	 * Date 09 年月日０９.<p>
	 *
	 */
	public void qty09(int value) {
		qty09_p().qty(value);
	}

	/**
	 * Date 09 年月日０９.<p>
	 *
	 */
	public void qty09(long value) {
		qty09_p().qty(value);
	}

	/**
	 * Date 09 年月日０９.<p>
	 *
	 */
	public void qty09(float value) {
		qty09_p().qty(value);
	}

	/**
	 * Date 09 年月日０９.<p>
	 *
	 */
	public void qty09(double value) {
		qty09_p().qty(value);
	}

	/**
	 * Date 10 年月日１０.<p>
	 *
	 */
	public MCNumber qty10() {
		return qty10_p().qty();
	}

	/**
	 * Date 10 年月日１０.<p>
	 *
	 */
	public void qty10(MCNumber value) {
		qty10_p().qty(value);
	}

	/**
	 * Date 10 年月日１０.<p>
	 *
	 */
	public void qty10(int value) {
		qty10_p().qty(value);
	}

	/**
	 * Date 10 年月日１０.<p>
	 *
	 */
	public void qty10(long value) {
		qty10_p().qty(value);
	}

	/**
	 * Date 10 年月日１０.<p>
	 *
	 */
	public void qty10(float value) {
		qty10_p().qty(value);
	}

	/**
	 * Date 10 年月日１０.<p>
	 *
	 */
	public void qty10(double value) {
		qty10_p().qty(value);
	}

	/**
	 * Date 11 年月日１１.<p>
	 *
	 */
	public MCNumber qty11() {
		return qty11_p().qty();
	}

	/**
	 * Date 11 年月日１１.<p>
	 *
	 */
	public void qty11(MCNumber value) {
		qty11_p().qty(value);
	}

	/**
	 * Date 11 年月日１１.<p>
	 *
	 */
	public void qty11(int value) {
		qty11_p().qty(value);
	}

	/**
	 * Date 11 年月日１１.<p>
	 *
	 */
	public void qty11(long value) {
		qty11_p().qty(value);
	}

	/**
	 * Date 11 年月日１１.<p>
	 *
	 */
	public void qty11(float value) {
		qty11_p().qty(value);
	}

	/**
	 * Date 11 年月日１１.<p>
	 *
	 */
	public void qty11(double value) {
		qty11_p().qty(value);
	}

	/**
	 * Date 12 年月日１２.<p>
	 *
	 */
	public MCNumber qty12() {
		return qty12_p().qty();
	}

	/**
	 * Date 12 年月日１２.<p>
	 *
	 */
	public void qty12(MCNumber value) {
		qty12_p().qty(value);
	}

	/**
	 * Date 12 年月日１２.<p>
	 *
	 */
	public void qty12(int value) {
		qty12_p().qty(value);
	}

	/**
	 * Date 12 年月日１２.<p>
	 *
	 */
	public void qty12(long value) {
		qty12_p().qty(value);
	}

	/**
	 * Date 12 年月日１２.<p>
	 *
	 */
	public void qty12(float value) {
		qty12_p().qty(value);
	}

	/**
	 * Date 12 年月日１２.<p>
	 *
	 */
	public void qty12(double value) {
		qty12_p().qty(value);
	}

	/**
	 * Date 13 年月日１３.<p>
	 *
	 */
	public MCNumber qty13() {
		return qty13_p().qty();
	}

	/**
	 * Date 13 年月日１３.<p>
	 *
	 */
	public void qty13(MCNumber value) {
		qty13_p().qty(value);
	}

	/**
	 * Date 13 年月日１３.<p>
	 *
	 */
	public void qty13(int value) {
		qty13_p().qty(value);
	}

	/**
	 * Date 13 年月日１３.<p>
	 *
	 */
	public void qty13(long value) {
		qty13_p().qty(value);
	}

	/**
	 * Date 13 年月日１３.<p>
	 *
	 */
	public void qty13(float value) {
		qty13_p().qty(value);
	}

	/**
	 * Date 13 年月日１３.<p>
	 *
	 */
	public void qty13(double value) {
		qty13_p().qty(value);
	}

	/**
	 * Date 14 年月日１４.<p>
	 *
	 */
	public MCNumber qty14() {
		return qty14_p().qty();
	}

	/**
	 * Date 14 年月日１４.<p>
	 *
	 */
	public void qty14(MCNumber value) {
		qty14_p().qty(value);
	}

	/**
	 * Date 14 年月日１４.<p>
	 *
	 */
	public void qty14(int value) {
		qty14_p().qty(value);
	}

	/**
	 * Date 14 年月日１４.<p>
	 *
	 */
	public void qty14(long value) {
		qty14_p().qty(value);
	}

	/**
	 * Date 14 年月日１４.<p>
	 *
	 */
	public void qty14(float value) {
		qty14_p().qty(value);
	}

	/**
	 * Date 14 年月日１４.<p>
	 *
	 */
	public void qty14(double value) {
		qty14_p().qty(value);
	}

	/**
	 * Date 15 年月日１５.<p>
	 *
	 */
	public MCNumber qty15() {
		return qty15_p().qty();
	}

	/**
	 * Date 15 年月日１５.<p>
	 *
	 */
	public void qty15(MCNumber value) {
		qty15_p().qty(value);
	}

	/**
	 * Date 15 年月日１５.<p>
	 *
	 */
	public void qty15(int value) {
		qty15_p().qty(value);
	}

	/**
	 * Date 15 年月日１５.<p>
	 *
	 */
	public void qty15(long value) {
		qty15_p().qty(value);
	}

	/**
	 * Date 15 年月日１５.<p>
	 *
	 */
	public void qty15(float value) {
		qty15_p().qty(value);
	}

	/**
	 * Date 15 年月日１５.<p>
	 *
	 */
	public void qty15(double value) {
		qty15_p().qty(value);
	}

	/**
	 * Date 16 年月日１６.<p>
	 *
	 */
	public MCNumber qty16() {
		return qty16_p().qty();
	}

	/**
	 * Date 16 年月日１６.<p>
	 *
	 */
	public void qty16(MCNumber value) {
		qty16_p().qty(value);
	}

	/**
	 * Date 16 年月日１６.<p>
	 *
	 */
	public void qty16(int value) {
		qty16_p().qty(value);
	}

	/**
	 * Date 16 年月日１６.<p>
	 *
	 */
	public void qty16(long value) {
		qty16_p().qty(value);
	}

	/**
	 * Date 16 年月日１６.<p>
	 *
	 */
	public void qty16(float value) {
		qty16_p().qty(value);
	}

	/**
	 * Date 16 年月日１６.<p>
	 *
	 */
	public void qty16(double value) {
		qty16_p().qty(value);
	}

	/**
	 * Date 17 年月日１７.<p>
	 *
	 */
	public MCNumber qty17() {
		return qty17_p().qty();
	}

	/**
	 * Date 17 年月日１７.<p>
	 *
	 */
	public void qty17(MCNumber value) {
		qty17_p().qty(value);
	}

	/**
	 * Date 17 年月日１７.<p>
	 *
	 */
	public void qty17(int value) {
		qty17_p().qty(value);
	}

	/**
	 * Date 17 年月日１７.<p>
	 *
	 */
	public void qty17(long value) {
		qty17_p().qty(value);
	}

	/**
	 * Date 17 年月日１７.<p>
	 *
	 */
	public void qty17(float value) {
		qty17_p().qty(value);
	}

	/**
	 * Date 17 年月日１７.<p>
	 *
	 */
	public void qty17(double value) {
		qty17_p().qty(value);
	}

	/**
	 * Date 18 年月日１８.<p>
	 *
	 */
	public MCNumber qty18() {
		return qty18_p().qty();
	}

	/**
	 * Date 18 年月日１８.<p>
	 *
	 */
	public void qty18(MCNumber value) {
		qty18_p().qty(value);
	}

	/**
	 * Date 18 年月日１８.<p>
	 *
	 */
	public void qty18(int value) {
		qty18_p().qty(value);
	}

	/**
	 * Date 18 年月日１８.<p>
	 *
	 */
	public void qty18(long value) {
		qty18_p().qty(value);
	}

	/**
	 * Date 18 年月日１８.<p>
	 *
	 */
	public void qty18(float value) {
		qty18_p().qty(value);
	}

	/**
	 * Date 18 年月日１８.<p>
	 *
	 */
	public void qty18(double value) {
		qty18_p().qty(value);
	}

	/**
	 * Date 19 年月日１９.<p>
	 *
	 */
	public MCNumber qty19() {
		return qty19_p().qty();
	}

	/**
	 * Date 19 年月日１９.<p>
	 *
	 */
	public void qty19(MCNumber value) {
		qty19_p().qty(value);
	}

	/**
	 * Date 19 年月日１９.<p>
	 *
	 */
	public void qty19(int value) {
		qty19_p().qty(value);
	}

	/**
	 * Date 19 年月日１９.<p>
	 *
	 */
	public void qty19(long value) {
		qty19_p().qty(value);
	}

	/**
	 * Date 19 年月日１９.<p>
	 *
	 */
	public void qty19(float value) {
		qty19_p().qty(value);
	}

	/**
	 * Date 19 年月日１９.<p>
	 *
	 */
	public void qty19(double value) {
		qty19_p().qty(value);
	}

	/**
	 * Date 20 年月日２０.<p>
	 *
	 */
	public MCNumber qty20() {
		return qty20_p().qty();
	}

	/**
	 * Date 20 年月日２０.<p>
	 *
	 */
	public void qty20(MCNumber value) {
		qty20_p().qty(value);
	}

	/**
	 * Date 20 年月日２０.<p>
	 *
	 */
	public void qty20(int value) {
		qty20_p().qty(value);
	}

	/**
	 * Date 20 年月日２０.<p>
	 *
	 */
	public void qty20(long value) {
		qty20_p().qty(value);
	}

	/**
	 * Date 20 年月日２０.<p>
	 *
	 */
	public void qty20(float value) {
		qty20_p().qty(value);
	}

	/**
	 * Date 20 年月日２０.<p>
	 *
	 */
	public void qty20(double value) {
		qty20_p().qty(value);
	}

	/**
	 * Date 21 年月日２１.<p>
	 *
	 */
	public MCNumber qty21() {
		return qty21_p().qty();
	}

	/**
	 * Date 21 年月日２１.<p>
	 *
	 */
	public void qty21(MCNumber value) {
		qty21_p().qty(value);
	}

	/**
	 * Date 21 年月日２１.<p>
	 *
	 */
	public void qty21(int value) {
		qty21_p().qty(value);
	}

	/**
	 * Date 21 年月日２１.<p>
	 *
	 */
	public void qty21(long value) {
		qty21_p().qty(value);
	}

	/**
	 * Date 21 年月日２１.<p>
	 *
	 */
	public void qty21(float value) {
		qty21_p().qty(value);
	}

	/**
	 * Date 21 年月日２１.<p>
	 *
	 */
	public void qty21(double value) {
		qty21_p().qty(value);
	}

	/**
	 * Date 22 年月日２２.<p>
	 *
	 */
	public MCNumber qty22() {
		return qty22_p().qty();
	}

	/**
	 * Date 22 年月日２２.<p>
	 *
	 */
	public void qty22(MCNumber value) {
		qty22_p().qty(value);
	}

	/**
	 * Date 22 年月日２２.<p>
	 *
	 */
	public void qty22(int value) {
		qty22_p().qty(value);
	}

	/**
	 * Date 22 年月日２２.<p>
	 *
	 */
	public void qty22(long value) {
		qty22_p().qty(value);
	}

	/**
	 * Date 22 年月日２２.<p>
	 *
	 */
	public void qty22(float value) {
		qty22_p().qty(value);
	}

	/**
	 * Date 22 年月日２２.<p>
	 *
	 */
	public void qty22(double value) {
		qty22_p().qty(value);
	}

	/**
	 * Date 23 年月日２３.<p>
	 *
	 */
	public MCNumber qty23() {
		return qty23_p().qty();
	}

	/**
	 * Date 23 年月日２３.<p>
	 *
	 */
	public void qty23(MCNumber value) {
		qty23_p().qty(value);
	}

	/**
	 * Date 23 年月日２３.<p>
	 *
	 */
	public void qty23(int value) {
		qty23_p().qty(value);
	}

	/**
	 * Date 23 年月日２３.<p>
	 *
	 */
	public void qty23(long value) {
		qty23_p().qty(value);
	}

	/**
	 * Date 23 年月日２３.<p>
	 *
	 */
	public void qty23(float value) {
		qty23_p().qty(value);
	}

	/**
	 * Date 23 年月日２３.<p>
	 *
	 */
	public void qty23(double value) {
		qty23_p().qty(value);
	}

	/**
	 * Date 24 年月日２４.<p>
	 *
	 */
	public MCNumber qty24() {
		return qty24_p().qty();
	}

	/**
	 * Date 24 年月日２４.<p>
	 *
	 */
	public void qty24(MCNumber value) {
		qty24_p().qty(value);
	}

	/**
	 * Date 24 年月日２４.<p>
	 *
	 */
	public void qty24(int value) {
		qty24_p().qty(value);
	}

	/**
	 * Date 24 年月日２４.<p>
	 *
	 */
	public void qty24(long value) {
		qty24_p().qty(value);
	}

	/**
	 * Date 24 年月日２４.<p>
	 *
	 */
	public void qty24(float value) {
		qty24_p().qty(value);
	}

	/**
	 * Date 24 年月日２４.<p>
	 *
	 */
	public void qty24(double value) {
		qty24_p().qty(value);
	}

	/**
	 * Date 25 年月日２５.<p>
	 *
	 */
	public MCNumber qty25() {
		return qty25_p().qty();
	}

	/**
	 * Date 25 年月日２５.<p>
	 *
	 */
	public void qty25(MCNumber value) {
		qty25_p().qty(value);
	}

	/**
	 * Date 25 年月日２５.<p>
	 *
	 */
	public void qty25(int value) {
		qty25_p().qty(value);
	}

	/**
	 * Date 25 年月日２５.<p>
	 *
	 */
	public void qty25(long value) {
		qty25_p().qty(value);
	}

	/**
	 * Date 25 年月日２５.<p>
	 *
	 */
	public void qty25(float value) {
		qty25_p().qty(value);
	}

	/**
	 * Date 25 年月日２５.<p>
	 *
	 */
	public void qty25(double value) {
		qty25_p().qty(value);
	}

	/**
	 * Date 26 年月日２６.<p>
	 *
	 */
	public MCNumber qty26() {
		return qty26_p().qty();
	}

	/**
	 * Date 26 年月日２６.<p>
	 *
	 */
	public void qty26(MCNumber value) {
		qty26_p().qty(value);
	}

	/**
	 * Date 26 年月日２６.<p>
	 *
	 */
	public void qty26(int value) {
		qty26_p().qty(value);
	}

	/**
	 * Date 26 年月日２６.<p>
	 *
	 */
	public void qty26(long value) {
		qty26_p().qty(value);
	}

	/**
	 * Date 26 年月日２６.<p>
	 *
	 */
	public void qty26(float value) {
		qty26_p().qty(value);
	}

	/**
	 * Date 26 年月日２６.<p>
	 *
	 */
	public void qty26(double value) {
		qty26_p().qty(value);
	}

	/**
	 * Date 27 年月日２７.<p>
	 *
	 */
	public MCNumber qty27() {
		return qty27_p().qty();
	}

	/**
	 * Date 27 年月日２７.<p>
	 *
	 */
	public void qty27(MCNumber value) {
		qty27_p().qty(value);
	}

	/**
	 * Date 27 年月日２７.<p>
	 *
	 */
	public void qty27(int value) {
		qty27_p().qty(value);
	}

	/**
	 * Date 27 年月日２７.<p>
	 *
	 */
	public void qty27(long value) {
		qty27_p().qty(value);
	}

	/**
	 * Date 27 年月日２７.<p>
	 *
	 */
	public void qty27(float value) {
		qty27_p().qty(value);
	}

	/**
	 * Date 27 年月日２７.<p>
	 *
	 */
	public void qty27(double value) {
		qty27_p().qty(value);
	}

	/**
	 * Date 28 年月日２８.<p>
	 *
	 */
	public MCNumber qty28() {
		return qty28_p().qty();
	}

	/**
	 * Date 28 年月日２８.<p>
	 *
	 */
	public void qty28(MCNumber value) {
		qty28_p().qty(value);
	}

	/**
	 * Date 28 年月日２８.<p>
	 *
	 */
	public void qty28(int value) {
		qty28_p().qty(value);
	}

	/**
	 * Date 28 年月日２８.<p>
	 *
	 */
	public void qty28(long value) {
		qty28_p().qty(value);
	}

	/**
	 * Date 28 年月日２８.<p>
	 *
	 */
	public void qty28(float value) {
		qty28_p().qty(value);
	}

	/**
	 * Date 28 年月日２８.<p>
	 *
	 */
	public void qty28(double value) {
		qty28_p().qty(value);
	}

	/**
	 * Date 29 年月日２９.<p>
	 *
	 */
	public MCNumber qty29() {
		return qty29_p().qty();
	}

	/**
	 * Date 29 年月日２９.<p>
	 *
	 */
	public void qty29(MCNumber value) {
		qty29_p().qty(value);
	}

	/**
	 * Date 29 年月日２９.<p>
	 *
	 */
	public void qty29(int value) {
		qty29_p().qty(value);
	}

	/**
	 * Date 29 年月日２９.<p>
	 *
	 */
	public void qty29(long value) {
		qty29_p().qty(value);
	}

	/**
	 * Date 29 年月日２９.<p>
	 *
	 */
	public void qty29(float value) {
		qty29_p().qty(value);
	}

	/**
	 * Date 29 年月日２９.<p>
	 *
	 */
	public void qty29(double value) {
		qty29_p().qty(value);
	}

	/**
	 * Date 30 年月日３０.<p>
	 *
	 */
	public MCNumber qty30() {
		return qty30_p().qty();
	}

	/**
	 * Date 30 年月日３０.<p>
	 *
	 */
	public void qty30(MCNumber value) {
		qty30_p().qty(value);
	}

	/**
	 * Date 30 年月日３０.<p>
	 *
	 */
	public void qty30(int value) {
		qty30_p().qty(value);
	}

	/**
	 * Date 30 年月日３０.<p>
	 *
	 */
	public void qty30(long value) {
		qty30_p().qty(value);
	}

	/**
	 * Date 30 年月日３０.<p>
	 *
	 */
	public void qty30(float value) {
		qty30_p().qty(value);
	}

	/**
	 * Date 30 年月日３０.<p>
	 *
	 */
	public void qty30(double value) {
		qty30_p().qty(value);
	}

	/**
	 * Date 31 年月日３１.<p>
	 *
	 */
	public MCNumber qty31() {
		return qty31_p().qty();
	}

	/**
	 * Date 31 年月日３１.<p>
	 *
	 */
	public void qty31(MCNumber value) {
		qty31_p().qty(value);
	}

	/**
	 * Date 31 年月日３１.<p>
	 *
	 */
	public void qty31(int value) {
		qty31_p().qty(value);
	}

	/**
	 * Date 31 年月日３１.<p>
	 *
	 */
	public void qty31(long value) {
		qty31_p().qty(value);
	}

	/**
	 * Date 31 年月日３１.<p>
	 *
	 */
	public void qty31(float value) {
		qty31_p().qty(value);
	}

	/**
	 * Date 31 年月日３１.<p>
	 *
	 */
	public void qty31(double value) {
		qty31_p().qty(value);
	}

	/**
	 * Date 32 年月日３２.<p>
	 *
	 */
	public MCNumber qty32() {
		return qty32_p().qty();
	}

	/**
	 * Date 32 年月日３２.<p>
	 *
	 */
	public void qty32(MCNumber value) {
		qty32_p().qty(value);
	}

	/**
	 * Date 32 年月日３２.<p>
	 *
	 */
	public void qty32(int value) {
		qty32_p().qty(value);
	}

	/**
	 * Date 32 年月日３２.<p>
	 *
	 */
	public void qty32(long value) {
		qty32_p().qty(value);
	}

	/**
	 * Date 32 年月日３２.<p>
	 *
	 */
	public void qty32(float value) {
		qty32_p().qty(value);
	}

	/**
	 * Date 32 年月日３２.<p>
	 *
	 */
	public void qty32(double value) {
		qty32_p().qty(value);
	}

	/**
	 * Date 33 年月日３３.<p>
	 *
	 */
	public MCNumber qty33() {
		return qty33_p().qty();
	}

	/**
	 * Date 33 年月日３３.<p>
	 *
	 */
	public void qty33(MCNumber value) {
		qty33_p().qty(value);
	}

	/**
	 * Date 33 年月日３３.<p>
	 *
	 */
	public void qty33(int value) {
		qty33_p().qty(value);
	}

	/**
	 * Date 33 年月日３３.<p>
	 *
	 */
	public void qty33(long value) {
		qty33_p().qty(value);
	}

	/**
	 * Date 33 年月日３３.<p>
	 *
	 */
	public void qty33(float value) {
		qty33_p().qty(value);
	}

	/**
	 * Date 33 年月日３３.<p>
	 *
	 */
	public void qty33(double value) {
		qty33_p().qty(value);
	}

	/**
	 * Date 34 年月日３４.<p>
	 *
	 */
	public MCNumber qty34() {
		return qty34_p().qty();
	}

	/**
	 * Date 34 年月日３４.<p>
	 *
	 */
	public void qty34(MCNumber value) {
		qty34_p().qty(value);
	}

	/**
	 * Date 34 年月日３４.<p>
	 *
	 */
	public void qty34(int value) {
		qty34_p().qty(value);
	}

	/**
	 * Date 34 年月日３４.<p>
	 *
	 */
	public void qty34(long value) {
		qty34_p().qty(value);
	}

	/**
	 * Date 34 年月日３４.<p>
	 *
	 */
	public void qty34(float value) {
		qty34_p().qty(value);
	}

	/**
	 * Date 34 年月日３４.<p>
	 *
	 */
	public void qty34(double value) {
		qty34_p().qty(value);
	}

	/**
	 * Date 35 年月日３５.<p>
	 *
	 */
	public MCNumber qty35() {
		return qty35_p().qty();
	}

	/**
	 * Date 35 年月日３５.<p>
	 *
	 */
	public void qty35(MCNumber value) {
		qty35_p().qty(value);
	}

	/**
	 * Date 35 年月日３５.<p>
	 *
	 */
	public void qty35(int value) {
		qty35_p().qty(value);
	}

	/**
	 * Date 35 年月日３５.<p>
	 *
	 */
	public void qty35(long value) {
		qty35_p().qty(value);
	}

	/**
	 * Date 35 年月日３５.<p>
	 *
	 */
	public void qty35(float value) {
		qty35_p().qty(value);
	}

	/**
	 * Date 35 年月日３５.<p>
	 *
	 */
	public void qty35(double value) {
		qty35_p().qty(value);
	}

	/**
	 * Date 36 年月日３６.<p>
	 *
	 */
	public MCNumber qty36() {
		return qty36_p().qty();
	}

	/**
	 * Date 36 年月日３６.<p>
	 *
	 */
	public void qty36(MCNumber value) {
		qty36_p().qty(value);
	}

	/**
	 * Date 36 年月日３６.<p>
	 *
	 */
	public void qty36(int value) {
		qty36_p().qty(value);
	}

	/**
	 * Date 36 年月日３６.<p>
	 *
	 */
	public void qty36(long value) {
		qty36_p().qty(value);
	}

	/**
	 * Date 36 年月日３６.<p>
	 *
	 */
	public void qty36(float value) {
		qty36_p().qty(value);
	}

	/**
	 * Date 36 年月日３６.<p>
	 *
	 */
	public void qty36(double value) {
		qty36_p().qty(value);
	}

	/**
	 * Date 37 年月日３７.<p>
	 *
	 */
	public MCNumber qty37() {
		return qty37_p().qty();
	}

	/**
	 * Date 37 年月日３７.<p>
	 *
	 */
	public void qty37(MCNumber value) {
		qty37_p().qty(value);
	}

	/**
	 * Date 37 年月日３７.<p>
	 *
	 */
	public void qty37(int value) {
		qty37_p().qty(value);
	}

	/**
	 * Date 37 年月日３７.<p>
	 *
	 */
	public void qty37(long value) {
		qty37_p().qty(value);
	}

	/**
	 * Date 37 年月日３７.<p>
	 *
	 */
	public void qty37(float value) {
		qty37_p().qty(value);
	}

	/**
	 * Date 37 年月日３７.<p>
	 *
	 */
	public void qty37(double value) {
		qty37_p().qty(value);
	}

	/**
	 * Date 38 年月日３８.<p>
	 *
	 */
	public MCNumber qty38() {
		return qty38_p().qty();
	}

	/**
	 * Date 38 年月日３８.<p>
	 *
	 */
	public void qty38(MCNumber value) {
		qty38_p().qty(value);
	}

	/**
	 * Date 38 年月日３８.<p>
	 *
	 */
	public void qty38(int value) {
		qty38_p().qty(value);
	}

	/**
	 * Date 38 年月日３８.<p>
	 *
	 */
	public void qty38(long value) {
		qty38_p().qty(value);
	}

	/**
	 * Date 38 年月日３８.<p>
	 *
	 */
	public void qty38(float value) {
		qty38_p().qty(value);
	}

	/**
	 * Date 38 年月日３８.<p>
	 *
	 */
	public void qty38(double value) {
		qty38_p().qty(value);
	}

	/**
	 * Date 39 年月日３９.<p>
	 *
	 */
	public MCNumber qty39() {
		return qty39_p().qty();
	}

	/**
	 * Date 39 年月日３９.<p>
	 *
	 */
	public void qty39(MCNumber value) {
		qty39_p().qty(value);
	}

	/**
	 * Date 39 年月日３９.<p>
	 *
	 */
	public void qty39(int value) {
		qty39_p().qty(value);
	}

	/**
	 * Date 39 年月日３９.<p>
	 *
	 */
	public void qty39(long value) {
		qty39_p().qty(value);
	}

	/**
	 * Date 39 年月日３９.<p>
	 *
	 */
	public void qty39(float value) {
		qty39_p().qty(value);
	}

	/**
	 * Date 39 年月日３９.<p>
	 *
	 */
	public void qty39(double value) {
		qty39_p().qty(value);
	}

	/**
	 * Date 40 年月日４０.<p>
	 *
	 */
	public MCNumber qty40() {
		return qty40_p().qty();
	}

	/**
	 * Date 40 年月日４０.<p>
	 *
	 */
	public void qty40(MCNumber value) {
		qty40_p().qty(value);
	}

	/**
	 * Date 40 年月日４０.<p>
	 *
	 */
	public void qty40(int value) {
		qty40_p().qty(value);
	}

	/**
	 * Date 40 年月日４０.<p>
	 *
	 */
	public void qty40(long value) {
		qty40_p().qty(value);
	}

	/**
	 * Date 40 年月日４０.<p>
	 *
	 */
	public void qty40(float value) {
		qty40_p().qty(value);
	}

	/**
	 * Date 40 年月日４０.<p>
	 *
	 */
	public void qty40(double value) {
		qty40_p().qty(value);
	}

	/**
	 * Date 41 年月日４１.<p>
	 *
	 */
	public MCNumber qty41() {
		return qty41_p().qty();
	}

	/**
	 * Date 41 年月日４１.<p>
	 *
	 */
	public void qty41(MCNumber value) {
		qty41_p().qty(value);
	}

	/**
	 * Date 41 年月日４１.<p>
	 *
	 */
	public void qty41(int value) {
		qty41_p().qty(value);
	}

	/**
	 * Date 41 年月日４１.<p>
	 *
	 */
	public void qty41(long value) {
		qty41_p().qty(value);
	}

	/**
	 * Date 41 年月日４１.<p>
	 *
	 */
	public void qty41(float value) {
		qty41_p().qty(value);
	}

	/**
	 * Date 41 年月日４１.<p>
	 *
	 */
	public void qty41(double value) {
		qty41_p().qty(value);
	}

	/**
	 * Date 42 年月日４２.<p>
	 *
	 */
	public MCNumber qty42() {
		return qty42_p().qty();
	}

	/**
	 * Date 42 年月日４２.<p>
	 *
	 */
	public void qty42(MCNumber value) {
		qty42_p().qty(value);
	}

	/**
	 * Date 42 年月日４２.<p>
	 *
	 */
	public void qty42(int value) {
		qty42_p().qty(value);
	}

	/**
	 * Date 42 年月日４２.<p>
	 *
	 */
	public void qty42(long value) {
		qty42_p().qty(value);
	}

	/**
	 * Date 42 年月日４２.<p>
	 *
	 */
	public void qty42(float value) {
		qty42_p().qty(value);
	}

	/**
	 * Date 42 年月日４２.<p>
	 *
	 */
	public void qty42(double value) {
		qty42_p().qty(value);
	}

	/**
	 * Date 43 年月日４３.<p>
	 *
	 */
	public MCNumber qty43() {
		return qty43_p().qty();
	}

	/**
	 * Date 43 年月日４３.<p>
	 *
	 */
	public void qty43(MCNumber value) {
		qty43_p().qty(value);
	}

	/**
	 * Date 43 年月日４３.<p>
	 *
	 */
	public void qty43(int value) {
		qty43_p().qty(value);
	}

	/**
	 * Date 43 年月日４３.<p>
	 *
	 */
	public void qty43(long value) {
		qty43_p().qty(value);
	}

	/**
	 * Date 43 年月日４３.<p>
	 *
	 */
	public void qty43(float value) {
		qty43_p().qty(value);
	}

	/**
	 * Date 43 年月日４３.<p>
	 *
	 */
	public void qty43(double value) {
		qty43_p().qty(value);
	}

	/**
	 * Date 44 年月日４４.<p>
	 *
	 */
	public MCNumber qty44() {
		return qty44_p().qty();
	}

	/**
	 * Date 44 年月日４４.<p>
	 *
	 */
	public void qty44(MCNumber value) {
		qty44_p().qty(value);
	}

	/**
	 * Date 44 年月日４４.<p>
	 *
	 */
	public void qty44(int value) {
		qty44_p().qty(value);
	}

	/**
	 * Date 44 年月日４４.<p>
	 *
	 */
	public void qty44(long value) {
		qty44_p().qty(value);
	}

	/**
	 * Date 44 年月日４４.<p>
	 *
	 */
	public void qty44(float value) {
		qty44_p().qty(value);
	}

	/**
	 * Date 44 年月日４４.<p>
	 *
	 */
	public void qty44(double value) {
		qty44_p().qty(value);
	}

	/**
	 * Date 45 年月日４５.<p>
	 *
	 */
	public MCNumber qty45() {
		return qty45_p().qty();
	}

	/**
	 * Date 45 年月日４５.<p>
	 *
	 */
	public void qty45(MCNumber value) {
		qty45_p().qty(value);
	}

	/**
	 * Date 45 年月日４５.<p>
	 *
	 */
	public void qty45(int value) {
		qty45_p().qty(value);
	}

	/**
	 * Date 45 年月日４５.<p>
	 *
	 */
	public void qty45(long value) {
		qty45_p().qty(value);
	}

	/**
	 * Date 45 年月日４５.<p>
	 *
	 */
	public void qty45(float value) {
		qty45_p().qty(value);
	}

	/**
	 * Date 45 年月日４５.<p>
	 *
	 */
	public void qty45(double value) {
		qty45_p().qty(value);
	}

	/**
	 * Date 46 年月日４６.<p>
	 *
	 */
	public MCNumber qty46() {
		return qty46_p().qty();
	}

	/**
	 * Date 46 年月日４６.<p>
	 *
	 */
	public void qty46(MCNumber value) {
		qty46_p().qty(value);
	}

	/**
	 * Date 46 年月日４６.<p>
	 *
	 */
	public void qty46(int value) {
		qty46_p().qty(value);
	}

	/**
	 * Date 46 年月日４６.<p>
	 *
	 */
	public void qty46(long value) {
		qty46_p().qty(value);
	}

	/**
	 * Date 46 年月日４６.<p>
	 *
	 */
	public void qty46(float value) {
		qty46_p().qty(value);
	}

	/**
	 * Date 46 年月日４６.<p>
	 *
	 */
	public void qty46(double value) {
		qty46_p().qty(value);
	}

	/**
	 * Date 47 年月日４７.<p>
	 *
	 */
	public MCNumber qty47() {
		return qty47_p().qty();
	}

	/**
	 * Date 47 年月日４７.<p>
	 *
	 */
	public void qty47(MCNumber value) {
		qty47_p().qty(value);
	}

	/**
	 * Date 47 年月日４７.<p>
	 *
	 */
	public void qty47(int value) {
		qty47_p().qty(value);
	}

	/**
	 * Date 47 年月日４７.<p>
	 *
	 */
	public void qty47(long value) {
		qty47_p().qty(value);
	}

	/**
	 * Date 47 年月日４７.<p>
	 *
	 */
	public void qty47(float value) {
		qty47_p().qty(value);
	}

	/**
	 * Date 47 年月日４７.<p>
	 *
	 */
	public void qty47(double value) {
		qty47_p().qty(value);
	}

	/**
	 * Date 48 年月日４８.<p>
	 *
	 */
	public MCNumber qty48() {
		return qty48_p().qty();
	}

	/**
	 * Date 48 年月日４８.<p>
	 *
	 */
	public void qty48(MCNumber value) {
		qty48_p().qty(value);
	}

	/**
	 * Date 48 年月日４８.<p>
	 *
	 */
	public void qty48(int value) {
		qty48_p().qty(value);
	}

	/**
	 * Date 48 年月日４８.<p>
	 *
	 */
	public void qty48(long value) {
		qty48_p().qty(value);
	}

	/**
	 * Date 48 年月日４８.<p>
	 *
	 */
	public void qty48(float value) {
		qty48_p().qty(value);
	}

	/**
	 * Date 48 年月日４８.<p>
	 *
	 */
	public void qty48(double value) {
		qty48_p().qty(value);
	}

	/**
	 * Date 49 年月日４９.<p>
	 *
	 */
	public MCNumber qty49() {
		return qty49_p().qty();
	}

	/**
	 * Date 49 年月日４９.<p>
	 *
	 */
	public void qty49(MCNumber value) {
		qty49_p().qty(value);
	}

	/**
	 * Date 49 年月日４９.<p>
	 *
	 */
	public void qty49(int value) {
		qty49_p().qty(value);
	}

	/**
	 * Date 49 年月日４９.<p>
	 *
	 */
	public void qty49(long value) {
		qty49_p().qty(value);
	}

	/**
	 * Date 49 年月日４９.<p>
	 *
	 */
	public void qty49(float value) {
		qty49_p().qty(value);
	}

	/**
	 * Date 49 年月日４９.<p>
	 *
	 */
	public void qty49(double value) {
		qty49_p().qty(value);
	}

	/**
	 * Date 50 年月日５０.<p>
	 *
	 */
	public MCNumber qty50() {
		return qty50_p().qty();
	}

	/**
	 * Date 50 年月日５０.<p>
	 *
	 */
	public void qty50(MCNumber value) {
		qty50_p().qty(value);
	}

	/**
	 * Date 50 年月日５０.<p>
	 *
	 */
	public void qty50(int value) {
		qty50_p().qty(value);
	}

	/**
	 * Date 50 年月日５０.<p>
	 *
	 */
	public void qty50(long value) {
		qty50_p().qty(value);
	}

	/**
	 * Date 50 年月日５０.<p>
	 *
	 */
	public void qty50(float value) {
		qty50_p().qty(value);
	}

	/**
	 * Date 50 年月日５０.<p>
	 *
	 */
	public void qty50(double value) {
		qty50_p().qty(value);
	}

	/**
	 * Date 51 年月日５１.<p>
	 *
	 */
	public MCNumber qty51() {
		return qty51_p().qty();
	}

	/**
	 * Date 51 年月日５１.<p>
	 *
	 */
	public void qty51(MCNumber value) {
		qty51_p().qty(value);
	}

	/**
	 * Date 51 年月日５１.<p>
	 *
	 */
	public void qty51(int value) {
		qty51_p().qty(value);
	}

	/**
	 * Date 51 年月日５１.<p>
	 *
	 */
	public void qty51(long value) {
		qty51_p().qty(value);
	}

	/**
	 * Date 51 年月日５１.<p>
	 *
	 */
	public void qty51(float value) {
		qty51_p().qty(value);
	}

	/**
	 * Date 51 年月日５１.<p>
	 *
	 */
	public void qty51(double value) {
		qty51_p().qty(value);
	}

	/**
	 * Date 52 年月日５２.<p>
	 *
	 */
	public MCNumber qty52() {
		return qty52_p().qty();
	}

	/**
	 * Date 52 年月日５２.<p>
	 *
	 */
	public void qty52(MCNumber value) {
		qty52_p().qty(value);
	}

	/**
	 * Date 52 年月日５２.<p>
	 *
	 */
	public void qty52(int value) {
		qty52_p().qty(value);
	}

	/**
	 * Date 52 年月日５２.<p>
	 *
	 */
	public void qty52(long value) {
		qty52_p().qty(value);
	}

	/**
	 * Date 52 年月日５２.<p>
	 *
	 */
	public void qty52(float value) {
		qty52_p().qty(value);
	}

	/**
	 * Date 52 年月日５２.<p>
	 *
	 */
	public void qty52(double value) {
		qty52_p().qty(value);
	}

	/**
	 * Date 53 年月日５３.<p>
	 *
	 */
	public MCNumber qty53() {
		return qty53_p().qty();
	}

	/**
	 * Date 53 年月日５３.<p>
	 *
	 */
	public void qty53(MCNumber value) {
		qty53_p().qty(value);
	}

	/**
	 * Date 53 年月日５３.<p>
	 *
	 */
	public void qty53(int value) {
		qty53_p().qty(value);
	}

	/**
	 * Date 53 年月日５３.<p>
	 *
	 */
	public void qty53(long value) {
		qty53_p().qty(value);
	}

	/**
	 * Date 53 年月日５３.<p>
	 *
	 */
	public void qty53(float value) {
		qty53_p().qty(value);
	}

	/**
	 * Date 53 年月日５３.<p>
	 *
	 */
	public void qty53(double value) {
		qty53_p().qty(value);
	}

	/**
	 * Date 54 年月日５４.<p>
	 *
	 */
	public MCNumber qty54() {
		return qty54_p().qty();
	}

	/**
	 * Date 54 年月日５４.<p>
	 *
	 */
	public void qty54(MCNumber value) {
		qty54_p().qty(value);
	}

	/**
	 * Date 54 年月日５４.<p>
	 *
	 */
	public void qty54(int value) {
		qty54_p().qty(value);
	}

	/**
	 * Date 54 年月日５４.<p>
	 *
	 */
	public void qty54(long value) {
		qty54_p().qty(value);
	}

	/**
	 * Date 54 年月日５４.<p>
	 *
	 */
	public void qty54(float value) {
		qty54_p().qty(value);
	}

	/**
	 * Date 54 年月日５４.<p>
	 *
	 */
	public void qty54(double value) {
		qty54_p().qty(value);
	}

	/**
	 * Date 55 年月日５５.<p>
	 *
	 */
	public MCNumber qty55() {
		return qty55_p().qty();
	}

	/**
	 * Date 55 年月日５５.<p>
	 *
	 */
	public void qty55(MCNumber value) {
		qty55_p().qty(value);
	}

	/**
	 * Date 55 年月日５５.<p>
	 *
	 */
	public void qty55(int value) {
		qty55_p().qty(value);
	}

	/**
	 * Date 55 年月日５５.<p>
	 *
	 */
	public void qty55(long value) {
		qty55_p().qty(value);
	}

	/**
	 * Date 55 年月日５５.<p>
	 *
	 */
	public void qty55(float value) {
		qty55_p().qty(value);
	}

	/**
	 * Date 55 年月日５５.<p>
	 *
	 */
	public void qty55(double value) {
		qty55_p().qty(value);
	}

	/**
	 * Date 56 年月日５６.<p>
	 *
	 */
	public MCNumber qty56() {
		return qty56_p().qty();
	}

	/**
	 * Date 56 年月日５６.<p>
	 *
	 */
	public void qty56(MCNumber value) {
		qty56_p().qty(value);
	}

	/**
	 * Date 56 年月日５６.<p>
	 *
	 */
	public void qty56(int value) {
		qty56_p().qty(value);
	}

	/**
	 * Date 56 年月日５６.<p>
	 *
	 */
	public void qty56(long value) {
		qty56_p().qty(value);
	}

	/**
	 * Date 56 年月日５６.<p>
	 *
	 */
	public void qty56(float value) {
		qty56_p().qty(value);
	}

	/**
	 * Date 56 年月日５６.<p>
	 *
	 */
	public void qty56(double value) {
		qty56_p().qty(value);
	}

	/**
	 * Date 57 年月日５７.<p>
	 *
	 */
	public MCNumber qty57() {
		return qty57_p().qty();
	}

	/**
	 * Date 57 年月日５７.<p>
	 *
	 */
	public void qty57(MCNumber value) {
		qty57_p().qty(value);
	}

	/**
	 * Date 57 年月日５７.<p>
	 *
	 */
	public void qty57(int value) {
		qty57_p().qty(value);
	}

	/**
	 * Date 57 年月日５７.<p>
	 *
	 */
	public void qty57(long value) {
		qty57_p().qty(value);
	}

	/**
	 * Date 57 年月日５７.<p>
	 *
	 */
	public void qty57(float value) {
		qty57_p().qty(value);
	}

	/**
	 * Date 57 年月日５７.<p>
	 *
	 */
	public void qty57(double value) {
		qty57_p().qty(value);
	}

	/**
	 * Date 58 年月日５８.<p>
	 *
	 */
	public MCNumber qty58() {
		return qty58_p().qty();
	}

	/**
	 * Date 58 年月日５８.<p>
	 *
	 */
	public void qty58(MCNumber value) {
		qty58_p().qty(value);
	}

	/**
	 * Date 58 年月日５８.<p>
	 *
	 */
	public void qty58(int value) {
		qty58_p().qty(value);
	}

	/**
	 * Date 58 年月日５８.<p>
	 *
	 */
	public void qty58(long value) {
		qty58_p().qty(value);
	}

	/**
	 * Date 58 年月日５８.<p>
	 *
	 */
	public void qty58(float value) {
		qty58_p().qty(value);
	}

	/**
	 * Date 58 年月日５８.<p>
	 *
	 */
	public void qty58(double value) {
		qty58_p().qty(value);
	}

	/**
	 * Date 59 年月日５９.<p>
	 *
	 */
	public MCNumber qty59() {
		return qty59_p().qty();
	}

	/**
	 * Date 59 年月日５９.<p>
	 *
	 */
	public void qty59(MCNumber value) {
		qty59_p().qty(value);
	}

	/**
	 * Date 59 年月日５９.<p>
	 *
	 */
	public void qty59(int value) {
		qty59_p().qty(value);
	}

	/**
	 * Date 59 年月日５９.<p>
	 *
	 */
	public void qty59(long value) {
		qty59_p().qty(value);
	}

	/**
	 * Date 59 年月日５９.<p>
	 *
	 */
	public void qty59(float value) {
		qty59_p().qty(value);
	}

	/**
	 * Date 59 年月日５９.<p>
	 *
	 */
	public void qty59(double value) {
		qty59_p().qty(value);
	}

	/**
	 * Date 60 年月日６０.<p>
	 *
	 */
	public MCNumber qty60() {
		return qty60_p().qty();
	}

	/**
	 * Date 60 年月日６０.<p>
	 *
	 */
	public void qty60(MCNumber value) {
		qty60_p().qty(value);
	}

	/**
	 * Date 60 年月日６０.<p>
	 *
	 */
	public void qty60(int value) {
		qty60_p().qty(value);
	}

	/**
	 * Date 60 年月日６０.<p>
	 *
	 */
	public void qty60(long value) {
		qty60_p().qty(value);
	}

	/**
	 * Date 60 年月日６０.<p>
	 *
	 */
	public void qty60(float value) {
		qty60_p().qty(value);
	}

	/**
	 * Date 60 年月日６０.<p>
	 *
	 */
	public void qty60(double value) {
		qty60_p().qty(value);
	}

	/**
	 * Date 61 年月日６１.<p>
	 *
	 */
	public MCNumber qty61() {
		return qty61_p().qty();
	}

	/**
	 * Date 61 年月日６１.<p>
	 *
	 */
	public void qty61(MCNumber value) {
		qty61_p().qty(value);
	}

	/**
	 * Date 61 年月日６１.<p>
	 *
	 */
	public void qty61(int value) {
		qty61_p().qty(value);
	}

	/**
	 * Date 61 年月日６１.<p>
	 *
	 */
	public void qty61(long value) {
		qty61_p().qty(value);
	}

	/**
	 * Date 61 年月日６１.<p>
	 *
	 */
	public void qty61(float value) {
		qty61_p().qty(value);
	}

	/**
	 * Date 61 年月日６１.<p>
	 *
	 */
	public void qty61(double value) {
		qty61_p().qty(value);
	}

	/**
	 * Date 62 年月日６２.<p>
	 *
	 */
	public MCNumber qty62() {
		return qty62_p().qty();
	}

	/**
	 * Date 62 年月日６２.<p>
	 *
	 */
	public void qty62(MCNumber value) {
		qty62_p().qty(value);
	}

	/**
	 * Date 62 年月日６２.<p>
	 *
	 */
	public void qty62(int value) {
		qty62_p().qty(value);
	}

	/**
	 * Date 62 年月日６２.<p>
	 *
	 */
	public void qty62(long value) {
		qty62_p().qty(value);
	}

	/**
	 * Date 62 年月日６２.<p>
	 *
	 */
	public void qty62(float value) {
		qty62_p().qty(value);
	}

	/**
	 * Date 62 年月日６２.<p>
	 *
	 */
	public void qty62(double value) {
		qty62_p().qty(value);
	}

	/**
	 * Date 63 年月日６３.<p>
	 *
	 */
	public MCNumber qty63() {
		return qty63_p().qty();
	}

	/**
	 * Date 63 年月日６３.<p>
	 *
	 */
	public void qty63(MCNumber value) {
		qty63_p().qty(value);
	}

	/**
	 * Date 63 年月日６３.<p>
	 *
	 */
	public void qty63(int value) {
		qty63_p().qty(value);
	}

	/**
	 * Date 63 年月日６３.<p>
	 *
	 */
	public void qty63(long value) {
		qty63_p().qty(value);
	}

	/**
	 * Date 63 年月日６３.<p>
	 *
	 */
	public void qty63(float value) {
		qty63_p().qty(value);
	}

	/**
	 * Date 63 年月日６３.<p>
	 *
	 */
	public void qty63(double value) {
		qty63_p().qty(value);
	}

	/**
	 * Date 64 年月日６４.<p>
	 *
	 */
	public MCNumber qty64() {
		return qty64_p().qty();
	}

	/**
	 * Date 64 年月日６４.<p>
	 *
	 */
	public void qty64(MCNumber value) {
		qty64_p().qty(value);
	}

	/**
	 * Date 64 年月日６４.<p>
	 *
	 */
	public void qty64(int value) {
		qty64_p().qty(value);
	}

	/**
	 * Date 64 年月日６４.<p>
	 *
	 */
	public void qty64(long value) {
		qty64_p().qty(value);
	}

	/**
	 * Date 64 年月日６４.<p>
	 *
	 */
	public void qty64(float value) {
		qty64_p().qty(value);
	}

	/**
	 * Date 64 年月日６４.<p>
	 *
	 */
	public void qty64(double value) {
		qty64_p().qty(value);
	}

	/**
	 * Date 65 年月日６５.<p>
	 *
	 */
	public MCNumber qty65() {
		return qty65_p().qty();
	}

	/**
	 * Date 65 年月日６５.<p>
	 *
	 */
	public void qty65(MCNumber value) {
		qty65_p().qty(value);
	}

	/**
	 * Date 65 年月日６５.<p>
	 *
	 */
	public void qty65(int value) {
		qty65_p().qty(value);
	}

	/**
	 * Date 65 年月日６５.<p>
	 *
	 */
	public void qty65(long value) {
		qty65_p().qty(value);
	}

	/**
	 * Date 65 年月日６５.<p>
	 *
	 */
	public void qty65(float value) {
		qty65_p().qty(value);
	}

	/**
	 * Date 65 年月日６５.<p>
	 *
	 */
	public void qty65(double value) {
		qty65_p().qty(value);
	}

	/**
	 * Date 66 年月日６６.<p>
	 *
	 */
	public MCNumber qty66() {
		return qty66_p().qty();
	}

	/**
	 * Date 66 年月日６６.<p>
	 *
	 */
	public void qty66(MCNumber value) {
		qty66_p().qty(value);
	}

	/**
	 * Date 66 年月日６６.<p>
	 *
	 */
	public void qty66(int value) {
		qty66_p().qty(value);
	}

	/**
	 * Date 66 年月日６６.<p>
	 *
	 */
	public void qty66(long value) {
		qty66_p().qty(value);
	}

	/**
	 * Date 66 年月日６６.<p>
	 *
	 */
	public void qty66(float value) {
		qty66_p().qty(value);
	}

	/**
	 * Date 66 年月日６６.<p>
	 *
	 */
	public void qty66(double value) {
		qty66_p().qty(value);
	}

	/**
	 * Date 67 年月日６７.<p>
	 *
	 */
	public MCNumber qty67() {
		return qty67_p().qty();
	}

	/**
	 * Date 67 年月日６７.<p>
	 *
	 */
	public void qty67(MCNumber value) {
		qty67_p().qty(value);
	}

	/**
	 * Date 67 年月日６７.<p>
	 *
	 */
	public void qty67(int value) {
		qty67_p().qty(value);
	}

	/**
	 * Date 67 年月日６７.<p>
	 *
	 */
	public void qty67(long value) {
		qty67_p().qty(value);
	}

	/**
	 * Date 67 年月日６７.<p>
	 *
	 */
	public void qty67(float value) {
		qty67_p().qty(value);
	}

	/**
	 * Date 67 年月日６７.<p>
	 *
	 */
	public void qty67(double value) {
		qty67_p().qty(value);
	}

	/**
	 * Date 68 年月日６８.<p>
	 *
	 */
	public MCNumber qty68() {
		return qty68_p().qty();
	}

	/**
	 * Date 68 年月日６８.<p>
	 *
	 */
	public void qty68(MCNumber value) {
		qty68_p().qty(value);
	}

	/**
	 * Date 68 年月日６８.<p>
	 *
	 */
	public void qty68(int value) {
		qty68_p().qty(value);
	}

	/**
	 * Date 68 年月日６８.<p>
	 *
	 */
	public void qty68(long value) {
		qty68_p().qty(value);
	}

	/**
	 * Date 68 年月日６８.<p>
	 *
	 */
	public void qty68(float value) {
		qty68_p().qty(value);
	}

	/**
	 * Date 68 年月日６８.<p>
	 *
	 */
	public void qty68(double value) {
		qty68_p().qty(value);
	}

	/**
	 * Date 69 年月日６９.<p>
	 *
	 */
	public MCNumber qty69() {
		return qty69_p().qty();
	}

	/**
	 * Date 69 年月日６９.<p>
	 *
	 */
	public void qty69(MCNumber value) {
		qty69_p().qty(value);
	}

	/**
	 * Date 69 年月日６９.<p>
	 *
	 */
	public void qty69(int value) {
		qty69_p().qty(value);
	}

	/**
	 * Date 69 年月日６９.<p>
	 *
	 */
	public void qty69(long value) {
		qty69_p().qty(value);
	}

	/**
	 * Date 69 年月日６９.<p>
	 *
	 */
	public void qty69(float value) {
		qty69_p().qty(value);
	}

	/**
	 * Date 69 年月日６９.<p>
	 *
	 */
	public void qty69(double value) {
		qty69_p().qty(value);
	}

	/**
	 * Date 70 年月日７０.<p>
	 *
	 */
	public MCNumber qty70() {
		return qty70_p().qty();
	}

	/**
	 * Date 70 年月日７０.<p>
	 *
	 */
	public void qty70(MCNumber value) {
		qty70_p().qty(value);
	}

	/**
	 * Date 70 年月日７０.<p>
	 *
	 */
	public void qty70(int value) {
		qty70_p().qty(value);
	}

	/**
	 * Date 70 年月日７０.<p>
	 *
	 */
	public void qty70(long value) {
		qty70_p().qty(value);
	}

	/**
	 * Date 70 年月日７０.<p>
	 *
	 */
	public void qty70(float value) {
		qty70_p().qty(value);
	}

	/**
	 * Date 70 年月日７０.<p>
	 *
	 */
	public void qty70(double value) {
		qty70_p().qty(value);
	}

	/**
	 * Date 71 年月日７１.<p>
	 *
	 */
	public MCNumber qty71() {
		return qty71_p().qty();
	}

	/**
	 * Date 71 年月日７１.<p>
	 *
	 */
	public void qty71(MCNumber value) {
		qty71_p().qty(value);
	}

	/**
	 * Date 71 年月日７１.<p>
	 *
	 */
	public void qty71(int value) {
		qty71_p().qty(value);
	}

	/**
	 * Date 71 年月日７１.<p>
	 *
	 */
	public void qty71(long value) {
		qty71_p().qty(value);
	}

	/**
	 * Date 71 年月日７１.<p>
	 *
	 */
	public void qty71(float value) {
		qty71_p().qty(value);
	}

	/**
	 * Date 71 年月日７１.<p>
	 *
	 */
	public void qty71(double value) {
		qty71_p().qty(value);
	}

	/**
	 * Date 72 年月日７２.<p>
	 *
	 */
	public MCNumber qty72() {
		return qty72_p().qty();
	}

	/**
	 * Date 72 年月日７２.<p>
	 *
	 */
	public void qty72(MCNumber value) {
		qty72_p().qty(value);
	}

	/**
	 * Date 72 年月日７２.<p>
	 *
	 */
	public void qty72(int value) {
		qty72_p().qty(value);
	}

	/**
	 * Date 72 年月日７２.<p>
	 *
	 */
	public void qty72(long value) {
		qty72_p().qty(value);
	}

	/**
	 * Date 72 年月日７２.<p>
	 *
	 */
	public void qty72(float value) {
		qty72_p().qty(value);
	}

	/**
	 * Date 72 年月日７２.<p>
	 *
	 */
	public void qty72(double value) {
		qty72_p().qty(value);
	}

	/**
	 * Date 73 年月日７３.<p>
	 *
	 */
	public MCNumber qty73() {
		return qty73_p().qty();
	}

	/**
	 * Date 73 年月日７３.<p>
	 *
	 */
	public void qty73(MCNumber value) {
		qty73_p().qty(value);
	}

	/**
	 * Date 73 年月日７３.<p>
	 *
	 */
	public void qty73(int value) {
		qty73_p().qty(value);
	}

	/**
	 * Date 73 年月日７３.<p>
	 *
	 */
	public void qty73(long value) {
		qty73_p().qty(value);
	}

	/**
	 * Date 73 年月日７３.<p>
	 *
	 */
	public void qty73(float value) {
		qty73_p().qty(value);
	}

	/**
	 * Date 73 年月日７３.<p>
	 *
	 */
	public void qty73(double value) {
		qty73_p().qty(value);
	}

	/**
	 * Date 74 年月日７４.<p>
	 *
	 */
	public MCNumber qty74() {
		return qty74_p().qty();
	}

	/**
	 * Date 74 年月日７４.<p>
	 *
	 */
	public void qty74(MCNumber value) {
		qty74_p().qty(value);
	}

	/**
	 * Date 74 年月日７４.<p>
	 *
	 */
	public void qty74(int value) {
		qty74_p().qty(value);
	}

	/**
	 * Date 74 年月日７４.<p>
	 *
	 */
	public void qty74(long value) {
		qty74_p().qty(value);
	}

	/**
	 * Date 74 年月日７４.<p>
	 *
	 */
	public void qty74(float value) {
		qty74_p().qty(value);
	}

	/**
	 * Date 74 年月日７４.<p>
	 *
	 */
	public void qty74(double value) {
		qty74_p().qty(value);
	}

	/**
	 * Date 75 年月日７５.<p>
	 *
	 */
	public MCNumber qty75() {
		return qty75_p().qty();
	}

	/**
	 * Date 75 年月日７５.<p>
	 *
	 */
	public void qty75(MCNumber value) {
		qty75_p().qty(value);
	}

	/**
	 * Date 75 年月日７５.<p>
	 *
	 */
	public void qty75(int value) {
		qty75_p().qty(value);
	}

	/**
	 * Date 75 年月日７５.<p>
	 *
	 */
	public void qty75(long value) {
		qty75_p().qty(value);
	}

	/**
	 * Date 75 年月日７５.<p>
	 *
	 */
	public void qty75(float value) {
		qty75_p().qty(value);
	}

	/**
	 * Date 75 年月日７５.<p>
	 *
	 */
	public void qty75(double value) {
		qty75_p().qty(value);
	}

	/**
	 * Date 76 年月日７６.<p>
	 *
	 */
	public MCNumber qty76() {
		return qty76_p().qty();
	}

	/**
	 * Date 76 年月日７６.<p>
	 *
	 */
	public void qty76(MCNumber value) {
		qty76_p().qty(value);
	}

	/**
	 * Date 76 年月日７６.<p>
	 *
	 */
	public void qty76(int value) {
		qty76_p().qty(value);
	}

	/**
	 * Date 76 年月日７６.<p>
	 *
	 */
	public void qty76(long value) {
		qty76_p().qty(value);
	}

	/**
	 * Date 76 年月日７６.<p>
	 *
	 */
	public void qty76(float value) {
		qty76_p().qty(value);
	}

	/**
	 * Date 76 年月日７６.<p>
	 *
	 */
	public void qty76(double value) {
		qty76_p().qty(value);
	}

	/**
	 * Date 77 年月日７７.<p>
	 *
	 */
	public MCNumber qty77() {
		return qty77_p().qty();
	}

	/**
	 * Date 77 年月日７７.<p>
	 *
	 */
	public void qty77(MCNumber value) {
		qty77_p().qty(value);
	}

	/**
	 * Date 77 年月日７７.<p>
	 *
	 */
	public void qty77(int value) {
		qty77_p().qty(value);
	}

	/**
	 * Date 77 年月日７７.<p>
	 *
	 */
	public void qty77(long value) {
		qty77_p().qty(value);
	}

	/**
	 * Date 77 年月日７７.<p>
	 *
	 */
	public void qty77(float value) {
		qty77_p().qty(value);
	}

	/**
	 * Date 77 年月日７７.<p>
	 *
	 */
	public void qty77(double value) {
		qty77_p().qty(value);
	}

	/**
	 * Date 78 年月日７８.<p>
	 *
	 */
	public MCNumber qty78() {
		return qty78_p().qty();
	}

	/**
	 * Date 78 年月日７８.<p>
	 *
	 */
	public void qty78(MCNumber value) {
		qty78_p().qty(value);
	}

	/**
	 * Date 78 年月日７８.<p>
	 *
	 */
	public void qty78(int value) {
		qty78_p().qty(value);
	}

	/**
	 * Date 78 年月日７８.<p>
	 *
	 */
	public void qty78(long value) {
		qty78_p().qty(value);
	}

	/**
	 * Date 78 年月日７８.<p>
	 *
	 */
	public void qty78(float value) {
		qty78_p().qty(value);
	}

	/**
	 * Date 78 年月日７８.<p>
	 *
	 */
	public void qty78(double value) {
		qty78_p().qty(value);
	}

	/**
	 * Date 79 年月日７９.<p>
	 *
	 */
	public MCNumber qty79() {
		return qty79_p().qty();
	}

	/**
	 * Date 79 年月日７９.<p>
	 *
	 */
	public void qty79(MCNumber value) {
		qty79_p().qty(value);
	}

	/**
	 * Date 79 年月日７９.<p>
	 *
	 */
	public void qty79(int value) {
		qty79_p().qty(value);
	}

	/**
	 * Date 79 年月日７９.<p>
	 *
	 */
	public void qty79(long value) {
		qty79_p().qty(value);
	}

	/**
	 * Date 79 年月日７９.<p>
	 *
	 */
	public void qty79(float value) {
		qty79_p().qty(value);
	}

	/**
	 * Date 79 年月日７９.<p>
	 *
	 */
	public void qty79(double value) {
		qty79_p().qty(value);
	}

	/**
	 * Date 80 年月日８０.<p>
	 *
	 */
	public MCNumber qty80() {
		return qty80_p().qty();
	}

	/**
	 * Date 80 年月日８０.<p>
	 *
	 */
	public void qty80(MCNumber value) {
		qty80_p().qty(value);
	}

	/**
	 * Date 80 年月日８０.<p>
	 *
	 */
	public void qty80(int value) {
		qty80_p().qty(value);
	}

	/**
	 * Date 80 年月日８０.<p>
	 *
	 */
	public void qty80(long value) {
		qty80_p().qty(value);
	}

	/**
	 * Date 80 年月日８０.<p>
	 *
	 */
	public void qty80(float value) {
		qty80_p().qty(value);
	}

	/**
	 * Date 80 年月日８０.<p>
	 *
	 */
	public void qty80(double value) {
		qty80_p().qty(value);
	}

	/**
	 * Date 81 年月日８１.<p>
	 *
	 */
	public MCNumber qty81() {
		return qty81_p().qty();
	}

	/**
	 * Date 81 年月日８１.<p>
	 *
	 */
	public void qty81(MCNumber value) {
		qty81_p().qty(value);
	}

	/**
	 * Date 81 年月日８１.<p>
	 *
	 */
	public void qty81(int value) {
		qty81_p().qty(value);
	}

	/**
	 * Date 81 年月日８１.<p>
	 *
	 */
	public void qty81(long value) {
		qty81_p().qty(value);
	}

	/**
	 * Date 81 年月日８１.<p>
	 *
	 */
	public void qty81(float value) {
		qty81_p().qty(value);
	}

	/**
	 * Date 81 年月日８１.<p>
	 *
	 */
	public void qty81(double value) {
		qty81_p().qty(value);
	}

	/**
	 * Date 82 年月日８２.<p>
	 *
	 */
	public MCNumber qty82() {
		return qty82_p().qty();
	}

	/**
	 * Date 82 年月日８２.<p>
	 *
	 */
	public void qty82(MCNumber value) {
		qty82_p().qty(value);
	}

	/**
	 * Date 82 年月日８２.<p>
	 *
	 */
	public void qty82(int value) {
		qty82_p().qty(value);
	}

	/**
	 * Date 82 年月日８２.<p>
	 *
	 */
	public void qty82(long value) {
		qty82_p().qty(value);
	}

	/**
	 * Date 82 年月日８２.<p>
	 *
	 */
	public void qty82(float value) {
		qty82_p().qty(value);
	}

	/**
	 * Date 82 年月日８２.<p>
	 *
	 */
	public void qty82(double value) {
		qty82_p().qty(value);
	}

	/**
	 * Date 83 年月日８３.<p>
	 *
	 */
	public MCNumber qty83() {
		return qty83_p().qty();
	}

	/**
	 * Date 83 年月日８３.<p>
	 *
	 */
	public void qty83(MCNumber value) {
		qty83_p().qty(value);
	}

	/**
	 * Date 83 年月日８３.<p>
	 *
	 */
	public void qty83(int value) {
		qty83_p().qty(value);
	}

	/**
	 * Date 83 年月日８３.<p>
	 *
	 */
	public void qty83(long value) {
		qty83_p().qty(value);
	}

	/**
	 * Date 83 年月日８３.<p>
	 *
	 */
	public void qty83(float value) {
		qty83_p().qty(value);
	}

	/**
	 * Date 83 年月日８３.<p>
	 *
	 */
	public void qty83(double value) {
		qty83_p().qty(value);
	}

	/**
	 * Date 84 年月日８４.<p>
	 *
	 */
	public MCNumber qty84() {
		return qty84_p().qty();
	}

	/**
	 * Date 84 年月日８４.<p>
	 *
	 */
	public void qty84(MCNumber value) {
		qty84_p().qty(value);
	}

	/**
	 * Date 84 年月日８４.<p>
	 *
	 */
	public void qty84(int value) {
		qty84_p().qty(value);
	}

	/**
	 * Date 84 年月日８４.<p>
	 *
	 */
	public void qty84(long value) {
		qty84_p().qty(value);
	}

	/**
	 * Date 84 年月日８４.<p>
	 *
	 */
	public void qty84(float value) {
		qty84_p().qty(value);
	}

	/**
	 * Date 84 年月日８４.<p>
	 *
	 */
	public void qty84(double value) {
		qty84_p().qty(value);
	}

	/**
	 * Date 85 年月日８５.<p>
	 *
	 */
	public MCNumber qty85() {
		return qty85_p().qty();
	}

	/**
	 * Date 85 年月日８５.<p>
	 *
	 */
	public void qty85(MCNumber value) {
		qty85_p().qty(value);
	}

	/**
	 * Date 85 年月日８５.<p>
	 *
	 */
	public void qty85(int value) {
		qty85_p().qty(value);
	}

	/**
	 * Date 85 年月日８５.<p>
	 *
	 */
	public void qty85(long value) {
		qty85_p().qty(value);
	}

	/**
	 * Date 85 年月日８５.<p>
	 *
	 */
	public void qty85(float value) {
		qty85_p().qty(value);
	}

	/**
	 * Date 85 年月日８５.<p>
	 *
	 */
	public void qty85(double value) {
		qty85_p().qty(value);
	}

	/**
	 * Date 86 年月日８６.<p>
	 *
	 */
	public MCNumber qty86() {
		return qty86_p().qty();
	}

	/**
	 * Date 86 年月日８６.<p>
	 *
	 */
	public void qty86(MCNumber value) {
		qty86_p().qty(value);
	}

	/**
	 * Date 86 年月日８６.<p>
	 *
	 */
	public void qty86(int value) {
		qty86_p().qty(value);
	}

	/**
	 * Date 86 年月日８６.<p>
	 *
	 */
	public void qty86(long value) {
		qty86_p().qty(value);
	}

	/**
	 * Date 86 年月日８６.<p>
	 *
	 */
	public void qty86(float value) {
		qty86_p().qty(value);
	}

	/**
	 * Date 86 年月日８６.<p>
	 *
	 */
	public void qty86(double value) {
		qty86_p().qty(value);
	}

	/**
	 * Date 87 年月日８７.<p>
	 *
	 */
	public MCNumber qty87() {
		return qty87_p().qty();
	}

	/**
	 * Date 87 年月日８７.<p>
	 *
	 */
	public void qty87(MCNumber value) {
		qty87_p().qty(value);
	}

	/**
	 * Date 87 年月日８７.<p>
	 *
	 */
	public void qty87(int value) {
		qty87_p().qty(value);
	}

	/**
	 * Date 87 年月日８７.<p>
	 *
	 */
	public void qty87(long value) {
		qty87_p().qty(value);
	}

	/**
	 * Date 87 年月日８７.<p>
	 *
	 */
	public void qty87(float value) {
		qty87_p().qty(value);
	}

	/**
	 * Date 87 年月日８７.<p>
	 *
	 */
	public void qty87(double value) {
		qty87_p().qty(value);
	}

	/**
	 * Date 88 年月日８８.<p>
	 *
	 */
	public MCNumber qty88() {
		return qty88_p().qty();
	}

	/**
	 * Date 88 年月日８８.<p>
	 *
	 */
	public void qty88(MCNumber value) {
		qty88_p().qty(value);
	}

	/**
	 * Date 88 年月日８８.<p>
	 *
	 */
	public void qty88(int value) {
		qty88_p().qty(value);
	}

	/**
	 * Date 88 年月日８８.<p>
	 *
	 */
	public void qty88(long value) {
		qty88_p().qty(value);
	}

	/**
	 * Date 88 年月日８８.<p>
	 *
	 */
	public void qty88(float value) {
		qty88_p().qty(value);
	}

	/**
	 * Date 88 年月日８８.<p>
	 *
	 */
	public void qty88(double value) {
		qty88_p().qty(value);
	}

	/**
	 * Date 89 年月日８９.<p>
	 *
	 */
	public MCNumber qty89() {
		return qty89_p().qty();
	}

	/**
	 * Date 89 年月日８９.<p>
	 *
	 */
	public void qty89(MCNumber value) {
		qty89_p().qty(value);
	}

	/**
	 * Date 89 年月日８９.<p>
	 *
	 */
	public void qty89(int value) {
		qty89_p().qty(value);
	}

	/**
	 * Date 89 年月日８９.<p>
	 *
	 */
	public void qty89(long value) {
		qty89_p().qty(value);
	}

	/**
	 * Date 89 年月日８９.<p>
	 *
	 */
	public void qty89(float value) {
		qty89_p().qty(value);
	}

	/**
	 * Date 89 年月日８９.<p>
	 *
	 */
	public void qty89(double value) {
		qty89_p().qty(value);
	}

	/**
	 * Date 90 年月日９０.<p>
	 *
	 */
	public MCNumber qty90() {
		return qty90_p().qty();
	}

	/**
	 * Date 90 年月日９０.<p>
	 *
	 */
	public void qty90(MCNumber value) {
		qty90_p().qty(value);
	}

	/**
	 * Date 90 年月日９０.<p>
	 *
	 */
	public void qty90(int value) {
		qty90_p().qty(value);
	}

	/**
	 * Date 90 年月日９０.<p>
	 *
	 */
	public void qty90(long value) {
		qty90_p().qty(value);
	}

	/**
	 * Date 90 年月日９０.<p>
	 *
	 */
	public void qty90(float value) {
		qty90_p().qty(value);
	}

	/**
	 * Date 90 年月日９０.<p>
	 *
	 */
	public void qty90(double value) {
		qty90_p().qty(value);
	}

	/**
	 * Date 91 年月日９１.<p>
	 *
	 */
	public MCNumber qty91() {
		return qty91_p().qty();
	}

	/**
	 * Date 91 年月日９１.<p>
	 *
	 */
	public void qty91(MCNumber value) {
		qty91_p().qty(value);
	}

	/**
	 * Date 91 年月日９１.<p>
	 *
	 */
	public void qty91(int value) {
		qty91_p().qty(value);
	}

	/**
	 * Date 91 年月日９１.<p>
	 *
	 */
	public void qty91(long value) {
		qty91_p().qty(value);
	}

	/**
	 * Date 91 年月日９１.<p>
	 *
	 */
	public void qty91(float value) {
		qty91_p().qty(value);
	}

	/**
	 * Date 91 年月日９１.<p>
	 *
	 */
	public void qty91(double value) {
		qty91_p().qty(value);
	}

	/**
	 * Date 92 年月日９２.<p>
	 *
	 */
	public MCNumber qty92() {
		return qty92_p().qty();
	}

	/**
	 * Date 92 年月日９２.<p>
	 *
	 */
	public void qty92(MCNumber value) {
		qty92_p().qty(value);
	}

	/**
	 * Date 92 年月日９２.<p>
	 *
	 */
	public void qty92(int value) {
		qty92_p().qty(value);
	}

	/**
	 * Date 92 年月日９２.<p>
	 *
	 */
	public void qty92(long value) {
		qty92_p().qty(value);
	}

	/**
	 * Date 92 年月日９２.<p>
	 *
	 */
	public void qty92(float value) {
		qty92_p().qty(value);
	}

	/**
	 * Date 92 年月日９２.<p>
	 *
	 */
	public void qty92(double value) {
		qty92_p().qty(value);
	}

	/**
	 * Date 93 年月日９３.<p>
	 *
	 */
	public MCNumber qty93() {
		return qty93_p().qty();
	}

	/**
	 * Date 93 年月日９３.<p>
	 *
	 */
	public void qty93(MCNumber value) {
		qty93_p().qty(value);
	}

	/**
	 * Date 93 年月日９３.<p>
	 *
	 */
	public void qty93(int value) {
		qty93_p().qty(value);
	}

	/**
	 * Date 93 年月日９３.<p>
	 *
	 */
	public void qty93(long value) {
		qty93_p().qty(value);
	}

	/**
	 * Date 93 年月日９３.<p>
	 *
	 */
	public void qty93(float value) {
		qty93_p().qty(value);
	}

	/**
	 * Date 93 年月日９３.<p>
	 *
	 */
	public void qty93(double value) {
		qty93_p().qty(value);
	}

}

