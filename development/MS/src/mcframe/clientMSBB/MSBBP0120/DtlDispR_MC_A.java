package mcframe.clientMSBB.MSBBP0120;

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
 * ブロック"DtlDisp"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlDispR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Plan item 計画品目.<p>
	 *
	 */
	public static final String $disp_spln_itm = "disp_spln_itm";
	/**
	 * Item 品目.<p>
	 *
	 */
	public static final String $disp_itm = "disp_itm";
	/**
	 * Details cd. 明細ＣＤ.<p>
	 *
	 */
	public static final String $row_title_col = "row_title_col";
	/**
	 * Details 明細.<p>
	 *
	 */
	public static final String $row_title_nm = "row_title_nm";
	/**
	 * Details 明細.<p>
	 *
	 */
	public static final String $disp_row_title_nm = "disp_row_title_nm";
	/**
	 * Unit cd. (Currency cd.) 単位ＣＤ（通貨ＣＤ）.<p>
	 *
	 */
	public static final String $disp_unit_cd = "disp_unit_cd";
	/**
	 * Unit name (Currency name) 単位名（通貨名）.<p>
	 *
	 */
	public static final String $disp_unit_nm = "disp_unit_nm";
	/**
	 * Enter 入力.<p>
	 *
	 */
	public static final String $spln_set_typ_flg = "spln_set_typ_flg";
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
	/**
	 * Possible input month 01 入力可能年月０１.<p>
	 *
	 */
	public static final String $editable_qty01_flg = "editable_qty01_flg";
	/**
	 * Possible input month 02 入力可能年月０２.<p>
	 *
	 */
	public static final String $editable_qty02_flg = "editable_qty02_flg";
	/**
	 * Possible input month 03 入力可能年月０３.<p>
	 *
	 */
	public static final String $editable_qty03_flg = "editable_qty03_flg";
	/**
	 * Possible input month 04 入力可能年月０４.<p>
	 *
	 */
	public static final String $editable_qty04_flg = "editable_qty04_flg";
	/**
	 * Possible input month 05 入力可能年月０５.<p>
	 *
	 */
	public static final String $editable_qty05_flg = "editable_qty05_flg";
	/**
	 * Possible input month 06 入力可能年月０６.<p>
	 *
	 */
	public static final String $editable_qty06_flg = "editable_qty06_flg";
	/**
	 * Possible input month 07 入力可能年月０７.<p>
	 *
	 */
	public static final String $editable_qty07_flg = "editable_qty07_flg";
	/**
	 * Possible input month 08 入力可能年月０８.<p>
	 *
	 */
	public static final String $editable_qty08_flg = "editable_qty08_flg";
	/**
	 * Possible input month 09 入力可能年月０９.<p>
	 *
	 */
	public static final String $editable_qty09_flg = "editable_qty09_flg";
	/**
	 * Possible input month 10 入力可能年月１０.<p>
	 *
	 */
	public static final String $editable_qty10_flg = "editable_qty10_flg";
	/**
	 * Possible input month 11 入力可能年月１１.<p>
	 *
	 */
	public static final String $editable_qty11_flg = "editable_qty11_flg";
	/**
	 * Possible input month 12 入力可能年月１２.<p>
	 *
	 */
	public static final String $editable_qty12_flg = "editable_qty12_flg";
	/**
	 * Possible input month 13 入力可能年月１３.<p>
	 *
	 */
	public static final String $editable_qty13_flg = "editable_qty13_flg";
	/**
	 * Possible input month 14 入力可能年月１４.<p>
	 *
	 */
	public static final String $editable_qty14_flg = "editable_qty14_flg";
	/**
	 * Possible input month 15 入力可能年月１５.<p>
	 *
	 */
	public static final String $editable_qty15_flg = "editable_qty15_flg";
	/**
	 * Possible input month 16 入力可能年月１６.<p>
	 *
	 */
	public static final String $editable_qty16_flg = "editable_qty16_flg";
	/**
	 * Possible input month 17 入力可能年月１７.<p>
	 *
	 */
	public static final String $editable_qty17_flg = "editable_qty17_flg";
	/**
	 * Possible input month 18 入力可能年月１８.<p>
	 *
	 */
	public static final String $editable_qty18_flg = "editable_qty18_flg";
	/**
	 * Possible input month 19 入力可能年月１９.<p>
	 *
	 */
	public static final String $editable_qty19_flg = "editable_qty19_flg";
	/**
	 * Possible input month 20 入力可能年月２０.<p>
	 *
	 */
	public static final String $editable_qty20_flg = "editable_qty20_flg";
	/**
	 * Possible input month 21 入力可能年月２１.<p>
	 *
	 */
	public static final String $editable_qty21_flg = "editable_qty21_flg";
	/**
	 * Possible input month 22 入力可能年月２２.<p>
	 *
	 */
	public static final String $editable_qty22_flg = "editable_qty22_flg";
	/**
	 * Possible input month 23 入力可能年月２３.<p>
	 *
	 */
	public static final String $editable_qty23_flg = "editable_qty23_flg";
	/**
	 * Possible input month 24 入力可能年月２４.<p>
	 *
	 */
	public static final String $editable_qty24_flg = "editable_qty24_flg";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public static final String $spln_itm_cd = "spln_itm_cd";
	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public static final String $spln_itm_nm = "spln_itm_nm";
	public static final String $itm_p = "itm_p";
	/**
	 * Sales plan setting classification 販売計画設定区分.<p>
	 *
	 */
	public static final String $spln_set_typ = "spln_set_typ";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
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
	 * Plan items display order 計画品目表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $old_fix_flg = "old_fix_flg";
	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public static final String $grp_peg_no = "grp_peg_no";
	/**
	 * Plan item row 計画品目行.<p>
	 *
	 */
	public static final String $spln_itm_flg = "spln_itm_flg";
	/**
	 * Quantity row 数量行.<p>
	 *
	 */
	public static final String $qty_flg = "qty_flg";
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
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_spln_itm_META = createCommonMeta($disp_spln_itm, mcframe.commonMA.meta.MA_META.SPLN_ITM_NM);
	public static final MCMeta disp_itm_META = createCommonMeta($disp_itm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta row_title_col_META = createCommonMeta($row_title_col, mcframe.commonMS.meta.MS_META.SPLN_DTL_TYP);
	public static final MCMeta row_title_nm_META = createCommonMeta($row_title_nm, mcframe.commonMS.meta.MS_META.SPLN_DTL_TYP_NM);
	public static final MCMeta disp_row_title_nm_META = createCommonMeta($disp_row_title_nm, mcframe.commonMS.meta.MS_META.SPLN_DTL_TYP_NM);
	public static final MCMeta disp_unit_cd_META = createCommonMeta($disp_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta disp_unit_nm_META = createCommonMeta($disp_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta spln_set_typ_flg_META = createCommonMeta($spln_set_typ_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta editable_qty01_flg_META = createCommonMeta($editable_qty01_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty02_flg_META = createCommonMeta($editable_qty02_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty03_flg_META = createCommonMeta($editable_qty03_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty04_flg_META = createCommonMeta($editable_qty04_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty05_flg_META = createCommonMeta($editable_qty05_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty06_flg_META = createCommonMeta($editable_qty06_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty07_flg_META = createCommonMeta($editable_qty07_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty08_flg_META = createCommonMeta($editable_qty08_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty09_flg_META = createCommonMeta($editable_qty09_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty10_flg_META = createCommonMeta($editable_qty10_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty11_flg_META = createCommonMeta($editable_qty11_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty12_flg_META = createCommonMeta($editable_qty12_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty13_flg_META = createCommonMeta($editable_qty13_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty14_flg_META = createCommonMeta($editable_qty14_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty15_flg_META = createCommonMeta($editable_qty15_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty16_flg_META = createCommonMeta($editable_qty16_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty17_flg_META = createCommonMeta($editable_qty17_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty18_flg_META = createCommonMeta($editable_qty18_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty19_flg_META = createCommonMeta($editable_qty19_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty20_flg_META = createCommonMeta($editable_qty20_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty21_flg_META = createCommonMeta($editable_qty21_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty22_flg_META = createCommonMeta($editable_qty22_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty23_flg_META = createCommonMeta($editable_qty23_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta editable_qty24_flg_META = createCommonMeta($editable_qty24_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta spln_itm_cd_META = createCommonMeta($spln_itm_cd, mcframe.commonMA.meta.MA_META.SPLN_ITM_CD);
	public static final MCMeta spln_itm_nm_META = createCommonMeta($spln_itm_nm, mcframe.commonMA.meta.MA_META.SPLN_ITM_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta spln_set_typ_META = createCommonMeta($spln_set_typ, mcframe.commonMA.meta.MA_META.SPLN_SET_TYP);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta old_fix_flg_META = createCommonMeta($old_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta grp_peg_no_META = createCommonMeta($grp_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta spln_itm_flg_META = createCommonMeta($spln_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qty_flg_META = createCommonMeta($qty_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta record_id_META = createNumberMeta($record_id);
	public static final MCMeta record_grp_id_META = createNumberMeta($record_grp_id);

	protected static final ConstMetaList<DtlDispR> constMetas = new ConstMetaList<DtlDispR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			fix_flg_META,
			disp_spln_itm_META,
			disp_itm_META,
			row_title_col_META,
			row_title_nm_META,
			disp_row_title_nm_META,
			disp_unit_cd_META,
			disp_unit_nm_META,
			spln_set_typ_flg_META,
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
			editable_qty01_flg_META,
			editable_qty02_flg_META,
			editable_qty03_flg_META,
			editable_qty04_flg_META,
			editable_qty05_flg_META,
			editable_qty06_flg_META,
			editable_qty07_flg_META,
			editable_qty08_flg_META,
			editable_qty09_flg_META,
			editable_qty10_flg_META,
			editable_qty11_flg_META,
			editable_qty12_flg_META,
			editable_qty13_flg_META,
			editable_qty14_flg_META,
			editable_qty15_flg_META,
			editable_qty16_flg_META,
			editable_qty17_flg_META,
			editable_qty18_flg_META,
			editable_qty19_flg_META,
			editable_qty20_flg_META,
			editable_qty21_flg_META,
			editable_qty22_flg_META,
			editable_qty23_flg_META,
			editable_qty24_flg_META,
			dec_place_META,
			amt_dec_place_META,
			spln_itm_cd_META,
			spln_itm_nm_META,
			itm_p_META,
			spln_set_typ_META,
			cur_cd_META,
			cur_nm_META,
			unit_cd_META,
			unit_nm_META,
			disp_seq_META,
			old_fix_flg_META,
			grp_peg_no_META,
			spln_itm_flg_META,
			qty_flg_META,
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
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm"
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
	/** 項目属性情報のグループ[VH_KEY]のキー定数 */
	public static final String $$VH_KEY = "VH_KEY";
	/** 項目属性情報のグループ[VH_DISP_COL]のキー定数 */
	public static final String $$VH_DISP_COL = "VH_DISP_COL";
	/** 項目属性情報のグループ[VH_DISP_GRP]のキー定数 */
	public static final String $$VH_DISP_GRP = "VH_DISP_GRP";
	/** 項目属性情報のグループ[VH_DISP_IDX]のキー定数 */
	public static final String $$VH_DISP_IDX = "VH_DISP_IDX";

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
				{$qty24_p + ".qty", "ELM"}	// qty24_p.qty
			}
		)),
		new MCExtMap.Entry($$VH_DISP_COL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_GRP, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VH_DISP_IDX, new MCExtList(
			new String[][]{
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
	protected DtlDispR_MC_A(ConstMetaList<? extends DtlDispR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlDispR clone() {
		return (DtlDispR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlDispR createInstance() {
		return (DtlDispR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlDispR getValues(String... names) {
		return (DtlDispR) super.getValues(names);
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
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 1, $fix_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 1, $fix_flg, value);
	}


	/**
	 * Plan item 計画品目.<p>
	 *
	 */
	public String disp_spln_itm() {
		return getConstString(offset + 2, $disp_spln_itm);
	}

	/**
	 * Plan item 計画品目.<p>
	 *
	 */
	public void disp_spln_itm(String value) {
		setConstString(offset + 2, $disp_spln_itm, value);
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public String disp_itm() {
		return getConstString(offset + 3, $disp_itm);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void disp_itm(String value) {
		setConstString(offset + 3, $disp_itm, value);
	}


	/**
	 * Details cd. 明細ＣＤ.<p>
	 *
	 */
	public String row_title_col() {
		return getConstString(offset + 4, $row_title_col);
	}

	/**
	 * Details cd. 明細ＣＤ.<p>
	 *
	 */
	public void row_title_col(String value) {
		setConstString(offset + 4, $row_title_col, value);
	}


	/**
	 * Details 明細.<p>
	 *
	 */
	public String row_title_nm() {
		return getConstString(offset + 5, $row_title_nm);
	}

	/**
	 * Details 明細.<p>
	 *
	 */
	public void row_title_nm(String value) {
		setConstString(offset + 5, $row_title_nm, value);
	}


	/**
	 * Details 明細.<p>
	 *
	 */
	public String disp_row_title_nm() {
		return getConstString(offset + 6, $disp_row_title_nm);
	}

	/**
	 * Details 明細.<p>
	 *
	 */
	public void disp_row_title_nm(String value) {
		setConstString(offset + 6, $disp_row_title_nm, value);
	}


	/**
	 * Unit cd. (Currency cd.) 単位ＣＤ（通貨ＣＤ）.<p>
	 *
	 */
	public String disp_unit_cd() {
		return getConstString(offset + 7, $disp_unit_cd);
	}

	/**
	 * Unit cd. (Currency cd.) 単位ＣＤ（通貨ＣＤ）.<p>
	 *
	 */
	public void disp_unit_cd(String value) {
		setConstString(offset + 7, $disp_unit_cd, value);
	}


	/**
	 * Unit name (Currency name) 単位名（通貨名）.<p>
	 *
	 */
	public String disp_unit_nm() {
		return getConstString(offset + 8, $disp_unit_nm);
	}

	/**
	 * Unit name (Currency name) 単位名（通貨名）.<p>
	 *
	 */
	public void disp_unit_nm(String value) {
		setConstString(offset + 8, $disp_unit_nm, value);
	}


	/**
	 * Enter 入力.<p>
	 *
	 */
	public boolean spln_set_typ_flg() {
		return getConstBoolean(offset + 9, $spln_set_typ_flg);
	}

	/**
	 * Enter 入力.<p>
	 *
	 */
	public void spln_set_typ_flg(boolean value) {
		setConstBoolean(offset + 9, $spln_set_typ_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty01_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 10, $qty01_p);
	}
	
	public void qty01_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 10, $qty01_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty02_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 11, $qty02_p);
	}
	
	public void qty02_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 11, $qty02_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty03_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 12, $qty03_p);
	}
	
	public void qty03_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 12, $qty03_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty04_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 13, $qty04_p);
	}
	
	public void qty04_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 13, $qty04_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty05_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 14, $qty05_p);
	}
	
	public void qty05_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 14, $qty05_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty06_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 15, $qty06_p);
	}
	
	public void qty06_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 15, $qty06_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty07_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 16, $qty07_p);
	}
	
	public void qty07_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 16, $qty07_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty08_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 17, $qty08_p);
	}
	
	public void qty08_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 17, $qty08_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty09_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 18, $qty09_p);
	}
	
	public void qty09_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 18, $qty09_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty10_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 19, $qty10_p);
	}
	
	public void qty10_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 19, $qty10_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty11_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 20, $qty11_p);
	}
	
	public void qty11_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 20, $qty11_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty12_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 21, $qty12_p);
	}
	
	public void qty12_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 21, $qty12_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty13_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 22, $qty13_p);
	}
	
	public void qty13_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 22, $qty13_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty14_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 23, $qty14_p);
	}
	
	public void qty14_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 23, $qty14_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty15_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 24, $qty15_p);
	}
	
	public void qty15_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 24, $qty15_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty16_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 25, $qty16_p);
	}
	
	public void qty16_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 25, $qty16_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty17_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 26, $qty17_p);
	}
	
	public void qty17_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 26, $qty17_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty18_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 27, $qty18_p);
	}
	
	public void qty18_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 27, $qty18_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty19_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 28, $qty19_p);
	}
	
	public void qty19_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 28, $qty19_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty20_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 29, $qty20_p);
	}
	
	public void qty20_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 29, $qty20_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty21_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 30, $qty21_p);
	}
	
	public void qty21_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 30, $qty21_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty22_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 31, $qty22_p);
	}
	
	public void qty22_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 31, $qty22_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty23_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 32, $qty23_p);
	}
	
	public void qty23_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 32, $qty23_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty24_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 33, $qty24_p);
	}
	
	public void qty24_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 33, $qty24_p, row);
	}


	/**
	 * Possible input month 01 入力可能年月０１.<p>
	 *
	 */
	public boolean editable_qty01_flg() {
		return getConstBoolean(offset + 34, $editable_qty01_flg);
	}

	/**
	 * Possible input month 01 入力可能年月０１.<p>
	 *
	 */
	public void editable_qty01_flg(boolean value) {
		setConstBoolean(offset + 34, $editable_qty01_flg, value);
	}


	/**
	 * Possible input month 02 入力可能年月０２.<p>
	 *
	 */
	public boolean editable_qty02_flg() {
		return getConstBoolean(offset + 35, $editable_qty02_flg);
	}

	/**
	 * Possible input month 02 入力可能年月０２.<p>
	 *
	 */
	public void editable_qty02_flg(boolean value) {
		setConstBoolean(offset + 35, $editable_qty02_flg, value);
	}


	/**
	 * Possible input month 03 入力可能年月０３.<p>
	 *
	 */
	public boolean editable_qty03_flg() {
		return getConstBoolean(offset + 36, $editable_qty03_flg);
	}

	/**
	 * Possible input month 03 入力可能年月０３.<p>
	 *
	 */
	public void editable_qty03_flg(boolean value) {
		setConstBoolean(offset + 36, $editable_qty03_flg, value);
	}


	/**
	 * Possible input month 04 入力可能年月０４.<p>
	 *
	 */
	public boolean editable_qty04_flg() {
		return getConstBoolean(offset + 37, $editable_qty04_flg);
	}

	/**
	 * Possible input month 04 入力可能年月０４.<p>
	 *
	 */
	public void editable_qty04_flg(boolean value) {
		setConstBoolean(offset + 37, $editable_qty04_flg, value);
	}


	/**
	 * Possible input month 05 入力可能年月０５.<p>
	 *
	 */
	public boolean editable_qty05_flg() {
		return getConstBoolean(offset + 38, $editable_qty05_flg);
	}

	/**
	 * Possible input month 05 入力可能年月０５.<p>
	 *
	 */
	public void editable_qty05_flg(boolean value) {
		setConstBoolean(offset + 38, $editable_qty05_flg, value);
	}


	/**
	 * Possible input month 06 入力可能年月０６.<p>
	 *
	 */
	public boolean editable_qty06_flg() {
		return getConstBoolean(offset + 39, $editable_qty06_flg);
	}

	/**
	 * Possible input month 06 入力可能年月０６.<p>
	 *
	 */
	public void editable_qty06_flg(boolean value) {
		setConstBoolean(offset + 39, $editable_qty06_flg, value);
	}


	/**
	 * Possible input month 07 入力可能年月０７.<p>
	 *
	 */
	public boolean editable_qty07_flg() {
		return getConstBoolean(offset + 40, $editable_qty07_flg);
	}

	/**
	 * Possible input month 07 入力可能年月０７.<p>
	 *
	 */
	public void editable_qty07_flg(boolean value) {
		setConstBoolean(offset + 40, $editable_qty07_flg, value);
	}


	/**
	 * Possible input month 08 入力可能年月０８.<p>
	 *
	 */
	public boolean editable_qty08_flg() {
		return getConstBoolean(offset + 41, $editable_qty08_flg);
	}

	/**
	 * Possible input month 08 入力可能年月０８.<p>
	 *
	 */
	public void editable_qty08_flg(boolean value) {
		setConstBoolean(offset + 41, $editable_qty08_flg, value);
	}


	/**
	 * Possible input month 09 入力可能年月０９.<p>
	 *
	 */
	public boolean editable_qty09_flg() {
		return getConstBoolean(offset + 42, $editable_qty09_flg);
	}

	/**
	 * Possible input month 09 入力可能年月０９.<p>
	 *
	 */
	public void editable_qty09_flg(boolean value) {
		setConstBoolean(offset + 42, $editable_qty09_flg, value);
	}


	/**
	 * Possible input month 10 入力可能年月１０.<p>
	 *
	 */
	public boolean editable_qty10_flg() {
		return getConstBoolean(offset + 43, $editable_qty10_flg);
	}

	/**
	 * Possible input month 10 入力可能年月１０.<p>
	 *
	 */
	public void editable_qty10_flg(boolean value) {
		setConstBoolean(offset + 43, $editable_qty10_flg, value);
	}


	/**
	 * Possible input month 11 入力可能年月１１.<p>
	 *
	 */
	public boolean editable_qty11_flg() {
		return getConstBoolean(offset + 44, $editable_qty11_flg);
	}

	/**
	 * Possible input month 11 入力可能年月１１.<p>
	 *
	 */
	public void editable_qty11_flg(boolean value) {
		setConstBoolean(offset + 44, $editable_qty11_flg, value);
	}


	/**
	 * Possible input month 12 入力可能年月１２.<p>
	 *
	 */
	public boolean editable_qty12_flg() {
		return getConstBoolean(offset + 45, $editable_qty12_flg);
	}

	/**
	 * Possible input month 12 入力可能年月１２.<p>
	 *
	 */
	public void editable_qty12_flg(boolean value) {
		setConstBoolean(offset + 45, $editable_qty12_flg, value);
	}


	/**
	 * Possible input month 13 入力可能年月１３.<p>
	 *
	 */
	public boolean editable_qty13_flg() {
		return getConstBoolean(offset + 46, $editable_qty13_flg);
	}

	/**
	 * Possible input month 13 入力可能年月１３.<p>
	 *
	 */
	public void editable_qty13_flg(boolean value) {
		setConstBoolean(offset + 46, $editable_qty13_flg, value);
	}


	/**
	 * Possible input month 14 入力可能年月１４.<p>
	 *
	 */
	public boolean editable_qty14_flg() {
		return getConstBoolean(offset + 47, $editable_qty14_flg);
	}

	/**
	 * Possible input month 14 入力可能年月１４.<p>
	 *
	 */
	public void editable_qty14_flg(boolean value) {
		setConstBoolean(offset + 47, $editable_qty14_flg, value);
	}


	/**
	 * Possible input month 15 入力可能年月１５.<p>
	 *
	 */
	public boolean editable_qty15_flg() {
		return getConstBoolean(offset + 48, $editable_qty15_flg);
	}

	/**
	 * Possible input month 15 入力可能年月１５.<p>
	 *
	 */
	public void editable_qty15_flg(boolean value) {
		setConstBoolean(offset + 48, $editable_qty15_flg, value);
	}


	/**
	 * Possible input month 16 入力可能年月１６.<p>
	 *
	 */
	public boolean editable_qty16_flg() {
		return getConstBoolean(offset + 49, $editable_qty16_flg);
	}

	/**
	 * Possible input month 16 入力可能年月１６.<p>
	 *
	 */
	public void editable_qty16_flg(boolean value) {
		setConstBoolean(offset + 49, $editable_qty16_flg, value);
	}


	/**
	 * Possible input month 17 入力可能年月１７.<p>
	 *
	 */
	public boolean editable_qty17_flg() {
		return getConstBoolean(offset + 50, $editable_qty17_flg);
	}

	/**
	 * Possible input month 17 入力可能年月１７.<p>
	 *
	 */
	public void editable_qty17_flg(boolean value) {
		setConstBoolean(offset + 50, $editable_qty17_flg, value);
	}


	/**
	 * Possible input month 18 入力可能年月１８.<p>
	 *
	 */
	public boolean editable_qty18_flg() {
		return getConstBoolean(offset + 51, $editable_qty18_flg);
	}

	/**
	 * Possible input month 18 入力可能年月１８.<p>
	 *
	 */
	public void editable_qty18_flg(boolean value) {
		setConstBoolean(offset + 51, $editable_qty18_flg, value);
	}


	/**
	 * Possible input month 19 入力可能年月１９.<p>
	 *
	 */
	public boolean editable_qty19_flg() {
		return getConstBoolean(offset + 52, $editable_qty19_flg);
	}

	/**
	 * Possible input month 19 入力可能年月１９.<p>
	 *
	 */
	public void editable_qty19_flg(boolean value) {
		setConstBoolean(offset + 52, $editable_qty19_flg, value);
	}


	/**
	 * Possible input month 20 入力可能年月２０.<p>
	 *
	 */
	public boolean editable_qty20_flg() {
		return getConstBoolean(offset + 53, $editable_qty20_flg);
	}

	/**
	 * Possible input month 20 入力可能年月２０.<p>
	 *
	 */
	public void editable_qty20_flg(boolean value) {
		setConstBoolean(offset + 53, $editable_qty20_flg, value);
	}


	/**
	 * Possible input month 21 入力可能年月２１.<p>
	 *
	 */
	public boolean editable_qty21_flg() {
		return getConstBoolean(offset + 54, $editable_qty21_flg);
	}

	/**
	 * Possible input month 21 入力可能年月２１.<p>
	 *
	 */
	public void editable_qty21_flg(boolean value) {
		setConstBoolean(offset + 54, $editable_qty21_flg, value);
	}


	/**
	 * Possible input month 22 入力可能年月２２.<p>
	 *
	 */
	public boolean editable_qty22_flg() {
		return getConstBoolean(offset + 55, $editable_qty22_flg);
	}

	/**
	 * Possible input month 22 入力可能年月２２.<p>
	 *
	 */
	public void editable_qty22_flg(boolean value) {
		setConstBoolean(offset + 55, $editable_qty22_flg, value);
	}


	/**
	 * Possible input month 23 入力可能年月２３.<p>
	 *
	 */
	public boolean editable_qty23_flg() {
		return getConstBoolean(offset + 56, $editable_qty23_flg);
	}

	/**
	 * Possible input month 23 入力可能年月２３.<p>
	 *
	 */
	public void editable_qty23_flg(boolean value) {
		setConstBoolean(offset + 56, $editable_qty23_flg, value);
	}


	/**
	 * Possible input month 24 入力可能年月２４.<p>
	 *
	 */
	public boolean editable_qty24_flg() {
		return getConstBoolean(offset + 57, $editable_qty24_flg);
	}

	/**
	 * Possible input month 24 入力可能年月２４.<p>
	 *
	 */
	public void editable_qty24_flg(boolean value) {
		setConstBoolean(offset + 57, $editable_qty24_flg, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 58, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 58, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 58, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 58, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 58, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 58, $dec_place, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 59, $amt_dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 59, $amt_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 59, $amt_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 59, $amt_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 59, $amt_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 59, $amt_dec_place, value);
	}


	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public String spln_itm_cd() {
		return getConstString(offset + 60, $spln_itm_cd);
	}

	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public void spln_itm_cd(String value) {
		setConstString(offset + 60, $spln_itm_cd, value);
	}


	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public String spln_itm_nm() {
		return getConstString(offset + 61, $spln_itm_nm);
	}

	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public void spln_itm_nm(String value) {
		setConstString(offset + 61, $spln_itm_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 62, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 62, $itm_p, row);
	}


	/**
	 * Sales plan setting classification 販売計画設定区分.<p>
	 *
	 */
	public String spln_set_typ() {
		return getConstString(offset + 63, $spln_set_typ);
	}

	/**
	 * Sales plan setting classification 販売計画設定区分.<p>
	 *
	 */
	public void spln_set_typ(String value) {
		setConstString(offset + 63, $spln_set_typ, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 64, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 64, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 65, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 65, $cur_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 66, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 66, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 67, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 67, $unit_nm, value);
	}


	/**
	 * Plan items display order 計画品目表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 68, $disp_seq);
	}

	/**
	 * Plan items display order 計画品目表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 68, $disp_seq, value);
	}

	/**
	 * Plan items display order 計画品目表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 68, $disp_seq, value);
	}

	/**
	 * Plan items display order 計画品目表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 68, $disp_seq, value);
	}

	/**
	 * Plan items display order 計画品目表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 68, $disp_seq, value);
	}

	/**
	 * Plan items display order 計画品目表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 68, $disp_seq, value);
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean old_fix_flg() {
		return getConstBoolean(offset + 69, $old_fix_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void old_fix_flg(boolean value) {
		setConstBoolean(offset + 69, $old_fix_flg, value);
	}


	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber grp_peg_no() {
		return getConstNumber(offset + 70, $grp_peg_no);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(MCNumber value) {
		setConstNumber(offset + 70, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(int value) {
		setConstNumber(offset + 70, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(long value) {
		setConstNumber(offset + 70, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(float value) {
		setConstNumber(offset + 70, $grp_peg_no, value);
	}

	/**
	 * Group pegging No. グループ紐付けＮＯ.<p>
	 *
	 */
	public void grp_peg_no(double value) {
		setConstNumber(offset + 70, $grp_peg_no, value);
	}


	/**
	 * Plan item row 計画品目行.<p>
	 *
	 */
	public boolean spln_itm_flg() {
		return getConstBoolean(offset + 71, $spln_itm_flg);
	}

	/**
	 * Plan item row 計画品目行.<p>
	 *
	 */
	public void spln_itm_flg(boolean value) {
		setConstBoolean(offset + 71, $spln_itm_flg, value);
	}


	/**
	 * Quantity row 数量行.<p>
	 *
	 */
	public boolean qty_flg() {
		return getConstBoolean(offset + 72, $qty_flg);
	}

	/**
	 * Quantity row 数量行.<p>
	 *
	 */
	public void qty_flg(boolean value) {
		setConstBoolean(offset + 72, $qty_flg, value);
	}


	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public MCNumber record_id() {
		return getConstNumber(offset + 73, $record_id);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void record_id(MCNumber value) {
		setConstNumber(offset + 73, $record_id, value);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void record_id(int value) {
		setConstNumber(offset + 73, $record_id, value);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void record_id(long value) {
		setConstNumber(offset + 73, $record_id, value);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void record_id(float value) {
		setConstNumber(offset + 73, $record_id, value);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void record_id(double value) {
		setConstNumber(offset + 73, $record_id, value);
	}


	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public MCNumber record_grp_id() {
		return getConstNumber(offset + 74, $record_grp_id);
	}

	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public void record_grp_id(MCNumber value) {
		setConstNumber(offset + 74, $record_grp_id, value);
	}

	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public void record_grp_id(int value) {
		setConstNumber(offset + 74, $record_grp_id, value);
	}

	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public void record_grp_id(long value) {
		setConstNumber(offset + 74, $record_grp_id, value);
	}

	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public void record_grp_id(float value) {
		setConstNumber(offset + 74, $record_grp_id, value);
	}

	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public void record_grp_id(double value) {
		setConstNumber(offset + 74, $record_grp_id, value);
	}


	public String getString(String name) {
		if ($disp_spln_itm.equalsIgnoreCase(name)) {
			return disp_spln_itm();
		}
		if ($disp_itm.equalsIgnoreCase(name)) {
			return disp_itm();
		}
		if ($row_title_col.equalsIgnoreCase(name)) {
			return row_title_col();
		}
		if ($row_title_nm.equalsIgnoreCase(name)) {
			return row_title_nm();
		}
		if ($disp_row_title_nm.equalsIgnoreCase(name)) {
			return disp_row_title_nm();
		}
		if ($disp_unit_cd.equalsIgnoreCase(name)) {
			return disp_unit_cd();
		}
		if ($disp_unit_nm.equalsIgnoreCase(name)) {
			return disp_unit_nm();
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			return spln_itm_cd();
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			return spln_itm_nm();
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			return spln_set_typ();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			return grp_peg_no();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($spln_set_typ_flg.equalsIgnoreCase(name)) {
			return spln_set_typ_flg();
		}
		if ($editable_qty01_flg.equalsIgnoreCase(name)) {
			return editable_qty01_flg();
		}
		if ($editable_qty02_flg.equalsIgnoreCase(name)) {
			return editable_qty02_flg();
		}
		if ($editable_qty03_flg.equalsIgnoreCase(name)) {
			return editable_qty03_flg();
		}
		if ($editable_qty04_flg.equalsIgnoreCase(name)) {
			return editable_qty04_flg();
		}
		if ($editable_qty05_flg.equalsIgnoreCase(name)) {
			return editable_qty05_flg();
		}
		if ($editable_qty06_flg.equalsIgnoreCase(name)) {
			return editable_qty06_flg();
		}
		if ($editable_qty07_flg.equalsIgnoreCase(name)) {
			return editable_qty07_flg();
		}
		if ($editable_qty08_flg.equalsIgnoreCase(name)) {
			return editable_qty08_flg();
		}
		if ($editable_qty09_flg.equalsIgnoreCase(name)) {
			return editable_qty09_flg();
		}
		if ($editable_qty10_flg.equalsIgnoreCase(name)) {
			return editable_qty10_flg();
		}
		if ($editable_qty11_flg.equalsIgnoreCase(name)) {
			return editable_qty11_flg();
		}
		if ($editable_qty12_flg.equalsIgnoreCase(name)) {
			return editable_qty12_flg();
		}
		if ($editable_qty13_flg.equalsIgnoreCase(name)) {
			return editable_qty13_flg();
		}
		if ($editable_qty14_flg.equalsIgnoreCase(name)) {
			return editable_qty14_flg();
		}
		if ($editable_qty15_flg.equalsIgnoreCase(name)) {
			return editable_qty15_flg();
		}
		if ($editable_qty16_flg.equalsIgnoreCase(name)) {
			return editable_qty16_flg();
		}
		if ($editable_qty17_flg.equalsIgnoreCase(name)) {
			return editable_qty17_flg();
		}
		if ($editable_qty18_flg.equalsIgnoreCase(name)) {
			return editable_qty18_flg();
		}
		if ($editable_qty19_flg.equalsIgnoreCase(name)) {
			return editable_qty19_flg();
		}
		if ($editable_qty20_flg.equalsIgnoreCase(name)) {
			return editable_qty20_flg();
		}
		if ($editable_qty21_flg.equalsIgnoreCase(name)) {
			return editable_qty21_flg();
		}
		if ($editable_qty22_flg.equalsIgnoreCase(name)) {
			return editable_qty22_flg();
		}
		if ($editable_qty23_flg.equalsIgnoreCase(name)) {
			return editable_qty23_flg();
		}
		if ($editable_qty24_flg.equalsIgnoreCase(name)) {
			return editable_qty24_flg();
		}
		if ($old_fix_flg.equalsIgnoreCase(name)) {
			return old_fix_flg();
		}
		if ($spln_itm_flg.equalsIgnoreCase(name)) {
			return spln_itm_flg();
		}
		if ($qty_flg.equalsIgnoreCase(name)) {
			return qty_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($disp_spln_itm.equalsIgnoreCase(name)) {
			return disp_spln_itm();
		}
		if ($disp_itm.equalsIgnoreCase(name)) {
			return disp_itm();
		}
		if ($row_title_col.equalsIgnoreCase(name)) {
			return row_title_col();
		}
		if ($row_title_nm.equalsIgnoreCase(name)) {
			return row_title_nm();
		}
		if ($disp_row_title_nm.equalsIgnoreCase(name)) {
			return disp_row_title_nm();
		}
		if ($disp_unit_cd.equalsIgnoreCase(name)) {
			return disp_unit_cd();
		}
		if ($disp_unit_nm.equalsIgnoreCase(name)) {
			return disp_unit_nm();
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			return spln_itm_cd();
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			return spln_itm_nm();
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			return spln_set_typ();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			return grp_peg_no();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($spln_set_typ_flg.equalsIgnoreCase(name)) {
			return spln_set_typ_flg();
		}
		if ($editable_qty01_flg.equalsIgnoreCase(name)) {
			return editable_qty01_flg();
		}
		if ($editable_qty02_flg.equalsIgnoreCase(name)) {
			return editable_qty02_flg();
		}
		if ($editable_qty03_flg.equalsIgnoreCase(name)) {
			return editable_qty03_flg();
		}
		if ($editable_qty04_flg.equalsIgnoreCase(name)) {
			return editable_qty04_flg();
		}
		if ($editable_qty05_flg.equalsIgnoreCase(name)) {
			return editable_qty05_flg();
		}
		if ($editable_qty06_flg.equalsIgnoreCase(name)) {
			return editable_qty06_flg();
		}
		if ($editable_qty07_flg.equalsIgnoreCase(name)) {
			return editable_qty07_flg();
		}
		if ($editable_qty08_flg.equalsIgnoreCase(name)) {
			return editable_qty08_flg();
		}
		if ($editable_qty09_flg.equalsIgnoreCase(name)) {
			return editable_qty09_flg();
		}
		if ($editable_qty10_flg.equalsIgnoreCase(name)) {
			return editable_qty10_flg();
		}
		if ($editable_qty11_flg.equalsIgnoreCase(name)) {
			return editable_qty11_flg();
		}
		if ($editable_qty12_flg.equalsIgnoreCase(name)) {
			return editable_qty12_flg();
		}
		if ($editable_qty13_flg.equalsIgnoreCase(name)) {
			return editable_qty13_flg();
		}
		if ($editable_qty14_flg.equalsIgnoreCase(name)) {
			return editable_qty14_flg();
		}
		if ($editable_qty15_flg.equalsIgnoreCase(name)) {
			return editable_qty15_flg();
		}
		if ($editable_qty16_flg.equalsIgnoreCase(name)) {
			return editable_qty16_flg();
		}
		if ($editable_qty17_flg.equalsIgnoreCase(name)) {
			return editable_qty17_flg();
		}
		if ($editable_qty18_flg.equalsIgnoreCase(name)) {
			return editable_qty18_flg();
		}
		if ($editable_qty19_flg.equalsIgnoreCase(name)) {
			return editable_qty19_flg();
		}
		if ($editable_qty20_flg.equalsIgnoreCase(name)) {
			return editable_qty20_flg();
		}
		if ($editable_qty21_flg.equalsIgnoreCase(name)) {
			return editable_qty21_flg();
		}
		if ($editable_qty22_flg.equalsIgnoreCase(name)) {
			return editable_qty22_flg();
		}
		if ($editable_qty23_flg.equalsIgnoreCase(name)) {
			return editable_qty23_flg();
		}
		if ($editable_qty24_flg.equalsIgnoreCase(name)) {
			return editable_qty24_flg();
		}
		if ($old_fix_flg.equalsIgnoreCase(name)) {
			return old_fix_flg();
		}
		if ($spln_itm_flg.equalsIgnoreCase(name)) {
			return spln_itm_flg();
		}
		if ($qty_flg.equalsIgnoreCase(name)) {
			return qty_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($disp_spln_itm.equalsIgnoreCase(name)) {
			disp_spln_itm(value);
			return;
		}
		if ($disp_itm.equalsIgnoreCase(name)) {
			disp_itm(value);
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
		if ($disp_row_title_nm.equalsIgnoreCase(name)) {
			disp_row_title_nm(value);
			return;
		}
		if ($disp_unit_cd.equalsIgnoreCase(name)) {
			disp_unit_cd(value);
			return;
		}
		if ($disp_unit_nm.equalsIgnoreCase(name)) {
			disp_unit_nm(value);
			return;
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			spln_itm_cd(value);
			return;
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			spln_itm_nm(value);
			return;
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			spln_set_typ(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($spln_set_typ_flg.equalsIgnoreCase(name)) {
			spln_set_typ_flg(value);
			return;
		}
		if ($editable_qty01_flg.equalsIgnoreCase(name)) {
			editable_qty01_flg(value);
			return;
		}
		if ($editable_qty02_flg.equalsIgnoreCase(name)) {
			editable_qty02_flg(value);
			return;
		}
		if ($editable_qty03_flg.equalsIgnoreCase(name)) {
			editable_qty03_flg(value);
			return;
		}
		if ($editable_qty04_flg.equalsIgnoreCase(name)) {
			editable_qty04_flg(value);
			return;
		}
		if ($editable_qty05_flg.equalsIgnoreCase(name)) {
			editable_qty05_flg(value);
			return;
		}
		if ($editable_qty06_flg.equalsIgnoreCase(name)) {
			editable_qty06_flg(value);
			return;
		}
		if ($editable_qty07_flg.equalsIgnoreCase(name)) {
			editable_qty07_flg(value);
			return;
		}
		if ($editable_qty08_flg.equalsIgnoreCase(name)) {
			editable_qty08_flg(value);
			return;
		}
		if ($editable_qty09_flg.equalsIgnoreCase(name)) {
			editable_qty09_flg(value);
			return;
		}
		if ($editable_qty10_flg.equalsIgnoreCase(name)) {
			editable_qty10_flg(value);
			return;
		}
		if ($editable_qty11_flg.equalsIgnoreCase(name)) {
			editable_qty11_flg(value);
			return;
		}
		if ($editable_qty12_flg.equalsIgnoreCase(name)) {
			editable_qty12_flg(value);
			return;
		}
		if ($editable_qty13_flg.equalsIgnoreCase(name)) {
			editable_qty13_flg(value);
			return;
		}
		if ($editable_qty14_flg.equalsIgnoreCase(name)) {
			editable_qty14_flg(value);
			return;
		}
		if ($editable_qty15_flg.equalsIgnoreCase(name)) {
			editable_qty15_flg(value);
			return;
		}
		if ($editable_qty16_flg.equalsIgnoreCase(name)) {
			editable_qty16_flg(value);
			return;
		}
		if ($editable_qty17_flg.equalsIgnoreCase(name)) {
			editable_qty17_flg(value);
			return;
		}
		if ($editable_qty18_flg.equalsIgnoreCase(name)) {
			editable_qty18_flg(value);
			return;
		}
		if ($editable_qty19_flg.equalsIgnoreCase(name)) {
			editable_qty19_flg(value);
			return;
		}
		if ($editable_qty20_flg.equalsIgnoreCase(name)) {
			editable_qty20_flg(value);
			return;
		}
		if ($editable_qty21_flg.equalsIgnoreCase(name)) {
			editable_qty21_flg(value);
			return;
		}
		if ($editable_qty22_flg.equalsIgnoreCase(name)) {
			editable_qty22_flg(value);
			return;
		}
		if ($editable_qty23_flg.equalsIgnoreCase(name)) {
			editable_qty23_flg(value);
			return;
		}
		if ($editable_qty24_flg.equalsIgnoreCase(name)) {
			editable_qty24_flg(value);
			return;
		}
		if ($old_fix_flg.equalsIgnoreCase(name)) {
			old_fix_flg(value);
			return;
		}
		if ($spln_itm_flg.equalsIgnoreCase(name)) {
			spln_itm_flg(value);
			return;
		}
		if ($qty_flg.equalsIgnoreCase(name)) {
			qty_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($disp_spln_itm.equalsIgnoreCase(name)) {
			disp_spln_itm(value);
			return;
		}
		if ($disp_itm.equalsIgnoreCase(name)) {
			disp_itm(value);
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
		if ($disp_row_title_nm.equalsIgnoreCase(name)) {
			disp_row_title_nm(value);
			return;
		}
		if ($disp_unit_cd.equalsIgnoreCase(name)) {
			disp_unit_cd(value);
			return;
		}
		if ($disp_unit_nm.equalsIgnoreCase(name)) {
			disp_unit_nm(value);
			return;
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			spln_itm_cd(value);
			return;
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			spln_itm_nm(value);
			return;
		}
		if ($spln_set_typ.equalsIgnoreCase(name)) {
			spln_set_typ(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($grp_peg_no.equalsIgnoreCase(name)) {
			grp_peg_no(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($spln_set_typ_flg.equalsIgnoreCase(name)) {
			spln_set_typ_flg(value);
			return;
		}
		if ($editable_qty01_flg.equalsIgnoreCase(name)) {
			editable_qty01_flg(value);
			return;
		}
		if ($editable_qty02_flg.equalsIgnoreCase(name)) {
			editable_qty02_flg(value);
			return;
		}
		if ($editable_qty03_flg.equalsIgnoreCase(name)) {
			editable_qty03_flg(value);
			return;
		}
		if ($editable_qty04_flg.equalsIgnoreCase(name)) {
			editable_qty04_flg(value);
			return;
		}
		if ($editable_qty05_flg.equalsIgnoreCase(name)) {
			editable_qty05_flg(value);
			return;
		}
		if ($editable_qty06_flg.equalsIgnoreCase(name)) {
			editable_qty06_flg(value);
			return;
		}
		if ($editable_qty07_flg.equalsIgnoreCase(name)) {
			editable_qty07_flg(value);
			return;
		}
		if ($editable_qty08_flg.equalsIgnoreCase(name)) {
			editable_qty08_flg(value);
			return;
		}
		if ($editable_qty09_flg.equalsIgnoreCase(name)) {
			editable_qty09_flg(value);
			return;
		}
		if ($editable_qty10_flg.equalsIgnoreCase(name)) {
			editable_qty10_flg(value);
			return;
		}
		if ($editable_qty11_flg.equalsIgnoreCase(name)) {
			editable_qty11_flg(value);
			return;
		}
		if ($editable_qty12_flg.equalsIgnoreCase(name)) {
			editable_qty12_flg(value);
			return;
		}
		if ($editable_qty13_flg.equalsIgnoreCase(name)) {
			editable_qty13_flg(value);
			return;
		}
		if ($editable_qty14_flg.equalsIgnoreCase(name)) {
			editable_qty14_flg(value);
			return;
		}
		if ($editable_qty15_flg.equalsIgnoreCase(name)) {
			editable_qty15_flg(value);
			return;
		}
		if ($editable_qty16_flg.equalsIgnoreCase(name)) {
			editable_qty16_flg(value);
			return;
		}
		if ($editable_qty17_flg.equalsIgnoreCase(name)) {
			editable_qty17_flg(value);
			return;
		}
		if ($editable_qty18_flg.equalsIgnoreCase(name)) {
			editable_qty18_flg(value);
			return;
		}
		if ($editable_qty19_flg.equalsIgnoreCase(name)) {
			editable_qty19_flg(value);
			return;
		}
		if ($editable_qty20_flg.equalsIgnoreCase(name)) {
			editable_qty20_flg(value);
			return;
		}
		if ($editable_qty21_flg.equalsIgnoreCase(name)) {
			editable_qty21_flg(value);
			return;
		}
		if ($editable_qty22_flg.equalsIgnoreCase(name)) {
			editable_qty22_flg(value);
			return;
		}
		if ($editable_qty23_flg.equalsIgnoreCase(name)) {
			editable_qty23_flg(value);
			return;
		}
		if ($editable_qty24_flg.equalsIgnoreCase(name)) {
			editable_qty24_flg(value);
			return;
		}
		if ($old_fix_flg.equalsIgnoreCase(name)) {
			old_fix_flg(value);
			return;
		}
		if ($spln_itm_flg.equalsIgnoreCase(name)) {
			spln_itm_flg(value);
			return;
		}
		if ($qty_flg.equalsIgnoreCase(name)) {
			qty_flg(value);
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
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
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
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public MCNumber qty01() {
		return qty01_p().qty();
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void qty01(MCNumber value) {
		qty01_p().qty(value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void qty01(int value) {
		qty01_p().qty(value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void qty01(long value) {
		qty01_p().qty(value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void qty01(float value) {
		qty01_p().qty(value);
	}

	/**
	 * Month 01 年月０１.<p>
	 *
	 */
	public void qty01(double value) {
		qty01_p().qty(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public MCNumber qty02() {
		return qty02_p().qty();
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void qty02(MCNumber value) {
		qty02_p().qty(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void qty02(int value) {
		qty02_p().qty(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void qty02(long value) {
		qty02_p().qty(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void qty02(float value) {
		qty02_p().qty(value);
	}

	/**
	 * Month 02 年月０２.<p>
	 *
	 */
	public void qty02(double value) {
		qty02_p().qty(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public MCNumber qty03() {
		return qty03_p().qty();
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void qty03(MCNumber value) {
		qty03_p().qty(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void qty03(int value) {
		qty03_p().qty(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void qty03(long value) {
		qty03_p().qty(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void qty03(float value) {
		qty03_p().qty(value);
	}

	/**
	 * Month 03 年月０３.<p>
	 *
	 */
	public void qty03(double value) {
		qty03_p().qty(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public MCNumber qty04() {
		return qty04_p().qty();
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void qty04(MCNumber value) {
		qty04_p().qty(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void qty04(int value) {
		qty04_p().qty(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void qty04(long value) {
		qty04_p().qty(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void qty04(float value) {
		qty04_p().qty(value);
	}

	/**
	 * Month 04 年月０４.<p>
	 *
	 */
	public void qty04(double value) {
		qty04_p().qty(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public MCNumber qty05() {
		return qty05_p().qty();
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void qty05(MCNumber value) {
		qty05_p().qty(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void qty05(int value) {
		qty05_p().qty(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void qty05(long value) {
		qty05_p().qty(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void qty05(float value) {
		qty05_p().qty(value);
	}

	/**
	 * Month 05 年月０５.<p>
	 *
	 */
	public void qty05(double value) {
		qty05_p().qty(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public MCNumber qty06() {
		return qty06_p().qty();
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void qty06(MCNumber value) {
		qty06_p().qty(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void qty06(int value) {
		qty06_p().qty(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void qty06(long value) {
		qty06_p().qty(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void qty06(float value) {
		qty06_p().qty(value);
	}

	/**
	 * Month 06 年月０６.<p>
	 *
	 */
	public void qty06(double value) {
		qty06_p().qty(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public MCNumber qty07() {
		return qty07_p().qty();
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void qty07(MCNumber value) {
		qty07_p().qty(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void qty07(int value) {
		qty07_p().qty(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void qty07(long value) {
		qty07_p().qty(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void qty07(float value) {
		qty07_p().qty(value);
	}

	/**
	 * Month 07 年月０７.<p>
	 *
	 */
	public void qty07(double value) {
		qty07_p().qty(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public MCNumber qty08() {
		return qty08_p().qty();
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void qty08(MCNumber value) {
		qty08_p().qty(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void qty08(int value) {
		qty08_p().qty(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void qty08(long value) {
		qty08_p().qty(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void qty08(float value) {
		qty08_p().qty(value);
	}

	/**
	 * Month 08 年月０８.<p>
	 *
	 */
	public void qty08(double value) {
		qty08_p().qty(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public MCNumber qty09() {
		return qty09_p().qty();
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void qty09(MCNumber value) {
		qty09_p().qty(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void qty09(int value) {
		qty09_p().qty(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void qty09(long value) {
		qty09_p().qty(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void qty09(float value) {
		qty09_p().qty(value);
	}

	/**
	 * Month 09 年月０９.<p>
	 *
	 */
	public void qty09(double value) {
		qty09_p().qty(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public MCNumber qty10() {
		return qty10_p().qty();
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void qty10(MCNumber value) {
		qty10_p().qty(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void qty10(int value) {
		qty10_p().qty(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void qty10(long value) {
		qty10_p().qty(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void qty10(float value) {
		qty10_p().qty(value);
	}

	/**
	 * Month 10 年月１０.<p>
	 *
	 */
	public void qty10(double value) {
		qty10_p().qty(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public MCNumber qty11() {
		return qty11_p().qty();
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void qty11(MCNumber value) {
		qty11_p().qty(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void qty11(int value) {
		qty11_p().qty(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void qty11(long value) {
		qty11_p().qty(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void qty11(float value) {
		qty11_p().qty(value);
	}

	/**
	 * Month 11 年月１１.<p>
	 *
	 */
	public void qty11(double value) {
		qty11_p().qty(value);
	}

	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public MCNumber qty12() {
		return qty12_p().qty();
	}

	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public void qty12(MCNumber value) {
		qty12_p().qty(value);
	}

	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public void qty12(int value) {
		qty12_p().qty(value);
	}

	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public void qty12(long value) {
		qty12_p().qty(value);
	}

	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public void qty12(float value) {
		qty12_p().qty(value);
	}

	/**
	 * Month 12 年月１２.<p>
	 *
	 */
	public void qty12(double value) {
		qty12_p().qty(value);
	}

	/**
	 * Month 13 年月１３.<p>
	 *
	 */
	public MCNumber qty13() {
		return qty13_p().qty();
	}

	/**
	 * Month 13 年月１３.<p>
	 *
	 */
	public void qty13(MCNumber value) {
		qty13_p().qty(value);
	}

	/**
	 * Month 13 年月１３.<p>
	 *
	 */
	public void qty13(int value) {
		qty13_p().qty(value);
	}

	/**
	 * Month 13 年月１３.<p>
	 *
	 */
	public void qty13(long value) {
		qty13_p().qty(value);
	}

	/**
	 * Month 13 年月１３.<p>
	 *
	 */
	public void qty13(float value) {
		qty13_p().qty(value);
	}

	/**
	 * Month 13 年月１３.<p>
	 *
	 */
	public void qty13(double value) {
		qty13_p().qty(value);
	}

	/**
	 * Month 14 年月１４.<p>
	 *
	 */
	public MCNumber qty14() {
		return qty14_p().qty();
	}

	/**
	 * Month 14 年月１４.<p>
	 *
	 */
	public void qty14(MCNumber value) {
		qty14_p().qty(value);
	}

	/**
	 * Month 14 年月１４.<p>
	 *
	 */
	public void qty14(int value) {
		qty14_p().qty(value);
	}

	/**
	 * Month 14 年月１４.<p>
	 *
	 */
	public void qty14(long value) {
		qty14_p().qty(value);
	}

	/**
	 * Month 14 年月１４.<p>
	 *
	 */
	public void qty14(float value) {
		qty14_p().qty(value);
	}

	/**
	 * Month 14 年月１４.<p>
	 *
	 */
	public void qty14(double value) {
		qty14_p().qty(value);
	}

	/**
	 * Month 15 年月１５.<p>
	 *
	 */
	public MCNumber qty15() {
		return qty15_p().qty();
	}

	/**
	 * Month 15 年月１５.<p>
	 *
	 */
	public void qty15(MCNumber value) {
		qty15_p().qty(value);
	}

	/**
	 * Month 15 年月１５.<p>
	 *
	 */
	public void qty15(int value) {
		qty15_p().qty(value);
	}

	/**
	 * Month 15 年月１５.<p>
	 *
	 */
	public void qty15(long value) {
		qty15_p().qty(value);
	}

	/**
	 * Month 15 年月１５.<p>
	 *
	 */
	public void qty15(float value) {
		qty15_p().qty(value);
	}

	/**
	 * Month 15 年月１５.<p>
	 *
	 */
	public void qty15(double value) {
		qty15_p().qty(value);
	}

	/**
	 * Month 16 年月１６.<p>
	 *
	 */
	public MCNumber qty16() {
		return qty16_p().qty();
	}

	/**
	 * Month 16 年月１６.<p>
	 *
	 */
	public void qty16(MCNumber value) {
		qty16_p().qty(value);
	}

	/**
	 * Month 16 年月１６.<p>
	 *
	 */
	public void qty16(int value) {
		qty16_p().qty(value);
	}

	/**
	 * Month 16 年月１６.<p>
	 *
	 */
	public void qty16(long value) {
		qty16_p().qty(value);
	}

	/**
	 * Month 16 年月１６.<p>
	 *
	 */
	public void qty16(float value) {
		qty16_p().qty(value);
	}

	/**
	 * Month 16 年月１６.<p>
	 *
	 */
	public void qty16(double value) {
		qty16_p().qty(value);
	}

	/**
	 * Month 17 年月１７.<p>
	 *
	 */
	public MCNumber qty17() {
		return qty17_p().qty();
	}

	/**
	 * Month 17 年月１７.<p>
	 *
	 */
	public void qty17(MCNumber value) {
		qty17_p().qty(value);
	}

	/**
	 * Month 17 年月１７.<p>
	 *
	 */
	public void qty17(int value) {
		qty17_p().qty(value);
	}

	/**
	 * Month 17 年月１７.<p>
	 *
	 */
	public void qty17(long value) {
		qty17_p().qty(value);
	}

	/**
	 * Month 17 年月１７.<p>
	 *
	 */
	public void qty17(float value) {
		qty17_p().qty(value);
	}

	/**
	 * Month 17 年月１７.<p>
	 *
	 */
	public void qty17(double value) {
		qty17_p().qty(value);
	}

	/**
	 * Month 18 年月１８.<p>
	 *
	 */
	public MCNumber qty18() {
		return qty18_p().qty();
	}

	/**
	 * Month 18 年月１８.<p>
	 *
	 */
	public void qty18(MCNumber value) {
		qty18_p().qty(value);
	}

	/**
	 * Month 18 年月１８.<p>
	 *
	 */
	public void qty18(int value) {
		qty18_p().qty(value);
	}

	/**
	 * Month 18 年月１８.<p>
	 *
	 */
	public void qty18(long value) {
		qty18_p().qty(value);
	}

	/**
	 * Month 18 年月１８.<p>
	 *
	 */
	public void qty18(float value) {
		qty18_p().qty(value);
	}

	/**
	 * Month 18 年月１８.<p>
	 *
	 */
	public void qty18(double value) {
		qty18_p().qty(value);
	}

	/**
	 * Month 19 年月１９.<p>
	 *
	 */
	public MCNumber qty19() {
		return qty19_p().qty();
	}

	/**
	 * Month 19 年月１９.<p>
	 *
	 */
	public void qty19(MCNumber value) {
		qty19_p().qty(value);
	}

	/**
	 * Month 19 年月１９.<p>
	 *
	 */
	public void qty19(int value) {
		qty19_p().qty(value);
	}

	/**
	 * Month 19 年月１９.<p>
	 *
	 */
	public void qty19(long value) {
		qty19_p().qty(value);
	}

	/**
	 * Month 19 年月１９.<p>
	 *
	 */
	public void qty19(float value) {
		qty19_p().qty(value);
	}

	/**
	 * Month 19 年月１９.<p>
	 *
	 */
	public void qty19(double value) {
		qty19_p().qty(value);
	}

	/**
	 * Month 20 年月２０.<p>
	 *
	 */
	public MCNumber qty20() {
		return qty20_p().qty();
	}

	/**
	 * Month 20 年月２０.<p>
	 *
	 */
	public void qty20(MCNumber value) {
		qty20_p().qty(value);
	}

	/**
	 * Month 20 年月２０.<p>
	 *
	 */
	public void qty20(int value) {
		qty20_p().qty(value);
	}

	/**
	 * Month 20 年月２０.<p>
	 *
	 */
	public void qty20(long value) {
		qty20_p().qty(value);
	}

	/**
	 * Month 20 年月２０.<p>
	 *
	 */
	public void qty20(float value) {
		qty20_p().qty(value);
	}

	/**
	 * Month 20 年月２０.<p>
	 *
	 */
	public void qty20(double value) {
		qty20_p().qty(value);
	}

	/**
	 * Month 21 年月２１.<p>
	 *
	 */
	public MCNumber qty21() {
		return qty21_p().qty();
	}

	/**
	 * Month 21 年月２１.<p>
	 *
	 */
	public void qty21(MCNumber value) {
		qty21_p().qty(value);
	}

	/**
	 * Month 21 年月２１.<p>
	 *
	 */
	public void qty21(int value) {
		qty21_p().qty(value);
	}

	/**
	 * Month 21 年月２１.<p>
	 *
	 */
	public void qty21(long value) {
		qty21_p().qty(value);
	}

	/**
	 * Month 21 年月２１.<p>
	 *
	 */
	public void qty21(float value) {
		qty21_p().qty(value);
	}

	/**
	 * Month 21 年月２１.<p>
	 *
	 */
	public void qty21(double value) {
		qty21_p().qty(value);
	}

	/**
	 * Month 22 年月２２.<p>
	 *
	 */
	public MCNumber qty22() {
		return qty22_p().qty();
	}

	/**
	 * Month 22 年月２２.<p>
	 *
	 */
	public void qty22(MCNumber value) {
		qty22_p().qty(value);
	}

	/**
	 * Month 22 年月２２.<p>
	 *
	 */
	public void qty22(int value) {
		qty22_p().qty(value);
	}

	/**
	 * Month 22 年月２２.<p>
	 *
	 */
	public void qty22(long value) {
		qty22_p().qty(value);
	}

	/**
	 * Month 22 年月２２.<p>
	 *
	 */
	public void qty22(float value) {
		qty22_p().qty(value);
	}

	/**
	 * Month 22 年月２２.<p>
	 *
	 */
	public void qty22(double value) {
		qty22_p().qty(value);
	}

	/**
	 * Month 23 年月２３.<p>
	 *
	 */
	public MCNumber qty23() {
		return qty23_p().qty();
	}

	/**
	 * Month 23 年月２３.<p>
	 *
	 */
	public void qty23(MCNumber value) {
		qty23_p().qty(value);
	}

	/**
	 * Month 23 年月２３.<p>
	 *
	 */
	public void qty23(int value) {
		qty23_p().qty(value);
	}

	/**
	 * Month 23 年月２３.<p>
	 *
	 */
	public void qty23(long value) {
		qty23_p().qty(value);
	}

	/**
	 * Month 23 年月２３.<p>
	 *
	 */
	public void qty23(float value) {
		qty23_p().qty(value);
	}

	/**
	 * Month 23 年月２３.<p>
	 *
	 */
	public void qty23(double value) {
		qty23_p().qty(value);
	}

	/**
	 * Month 24 年月２４.<p>
	 *
	 */
	public MCNumber qty24() {
		return qty24_p().qty();
	}

	/**
	 * Month 24 年月２４.<p>
	 *
	 */
	public void qty24(MCNumber value) {
		qty24_p().qty(value);
	}

	/**
	 * Month 24 年月２４.<p>
	 *
	 */
	public void qty24(int value) {
		qty24_p().qty(value);
	}

	/**
	 * Month 24 年月２４.<p>
	 *
	 */
	public void qty24(long value) {
		qty24_p().qty(value);
	}

	/**
	 * Month 24 年月２４.<p>
	 *
	 */
	public void qty24(float value) {
		qty24_p().qty(value);
	}

	/**
	 * Month 24 年月２４.<p>
	 *
	 */
	public void qty24(double value) {
		qty24_p().qty(value);
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

