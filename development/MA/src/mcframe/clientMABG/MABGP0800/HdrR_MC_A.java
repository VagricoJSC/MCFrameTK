package mcframe.clientMABG.MABGP0800;

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
 * ブロック"Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrR_MC_A extends MCConstRow {

	public static final String $term_p = "term_p";
	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public static final String $std_disp_digit = "std_disp_digit";
	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public static final String $amt_disp_digit = "amt_disp_digit";
	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public static final String $unit_disp_digit = "unit_disp_digit";
	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public static final String $rate_disp_digit = "rate_disp_digit";
	/**
	 * Input/output planning data in Excel 計画データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public static final String $excel_pln_flg = "excel_pln_flg";
	/**
	 * Input/output result data in Excel 実績データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public static final String $excel_act_flg = "excel_act_flg";
	/**
	 * Input/output allocation data in Excel 配賦データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public static final String $excel_alc_flg = "excel_alc_flg";

	public static final String $term = $term_p + ".term";
	public static final String $term_nm = $term_p + ".term_nm";

	public static final MCMeta term_p_META = createInnerRowMeta($term_p, mcframe.clientMAUB.MAUBP0230.TermR.class);
	public static final MCMeta std_disp_digit_META = createCommonMeta($std_disp_digit, mcframe.commonMA.meta.MA_META.DISP_DIGIT);
	public static final MCMeta amt_disp_digit_META = createCommonMeta($amt_disp_digit, mcframe.commonMA.meta.MA_META.DISP_DIGIT);
	public static final MCMeta unit_disp_digit_META = createCommonMeta($unit_disp_digit, mcframe.commonMA.meta.MA_META.DISP_DIGIT);
	public static final MCMeta rate_disp_digit_META = createCommonMeta($rate_disp_digit, mcframe.commonMA.meta.MA_META.DISP_DIGIT);
	public static final MCMeta excel_pln_flg_META = createCommonMeta($excel_pln_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta excel_act_flg_META = createCommonMeta($excel_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta excel_alc_flg_META = createCommonMeta($excel_alc_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			term_p_META,
			std_disp_digit_META,
			amt_disp_digit_META,
			unit_disp_digit_META,
			rate_disp_digit_META,
			excel_pln_flg_META,
			excel_act_flg_META,
			excel_alc_flg_META
		},
		new String[][]{
			{
				"term",
				"term_nm"
			},
			{
				$term,
				$term_nm
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
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
	protected HdrR_MC_A(ConstMetaList<? extends HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR clone() {
		return (HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR createInstance() {
		return (HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR getValues(String... names) {
		return (HdrR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP0230.TermR term_p(){
		return (mcframe.clientMAUB.MAUBP0230.TermR) getConstInnerRow(offset + 0, $term_p);
	}
	
	public void term_p(mcframe.clientMAUB.MAUBP0230.TermR row){
		setConstInnerRow(offset + 0, $term_p, row);
	}


	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public MCNumber std_disp_digit() {
		return getConstNumber(offset + 1, $std_disp_digit);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(MCNumber value) {
		setConstNumber(offset + 1, $std_disp_digit, value);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(int value) {
		setConstNumber(offset + 1, $std_disp_digit, value);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(long value) {
		setConstNumber(offset + 1, $std_disp_digit, value);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(float value) {
		setConstNumber(offset + 1, $std_disp_digit, value);
	}

	/**
	 * Display digits (Standard decimal places) 標準小数部表示桁.<p>
	 *
	 */
	public void std_disp_digit(double value) {
		setConstNumber(offset + 1, $std_disp_digit, value);
	}


	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public MCNumber amt_disp_digit() {
		return getConstNumber(offset + 2, $amt_disp_digit);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(MCNumber value) {
		setConstNumber(offset + 2, $amt_disp_digit, value);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(int value) {
		setConstNumber(offset + 2, $amt_disp_digit, value);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(long value) {
		setConstNumber(offset + 2, $amt_disp_digit, value);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(float value) {
		setConstNumber(offset + 2, $amt_disp_digit, value);
	}

	/**
	 * Display digits (Amount decimal places) 金額小数部表示桁.<p>
	 *
	 */
	public void amt_disp_digit(double value) {
		setConstNumber(offset + 2, $amt_disp_digit, value);
	}


	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public MCNumber unit_disp_digit() {
		return getConstNumber(offset + 3, $unit_disp_digit);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(MCNumber value) {
		setConstNumber(offset + 3, $unit_disp_digit, value);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(int value) {
		setConstNumber(offset + 3, $unit_disp_digit, value);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(long value) {
		setConstNumber(offset + 3, $unit_disp_digit, value);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(float value) {
		setConstNumber(offset + 3, $unit_disp_digit, value);
	}

	/**
	 * Display digits (Unit price decimal places) 単価小数部表示桁.<p>
	 *
	 */
	public void unit_disp_digit(double value) {
		setConstNumber(offset + 3, $unit_disp_digit, value);
	}


	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public MCNumber rate_disp_digit() {
		return getConstNumber(offset + 4, $rate_disp_digit);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(MCNumber value) {
		setConstNumber(offset + 4, $rate_disp_digit, value);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(int value) {
		setConstNumber(offset + 4, $rate_disp_digit, value);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(long value) {
		setConstNumber(offset + 4, $rate_disp_digit, value);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(float value) {
		setConstNumber(offset + 4, $rate_disp_digit, value);
	}

	/**
	 * Display digits (Ratio decimal places) 比率小数部表示桁.<p>
	 *
	 */
	public void rate_disp_digit(double value) {
		setConstNumber(offset + 4, $rate_disp_digit, value);
	}


	/**
	 * Input/output planning data in Excel 計画データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public boolean excel_pln_flg() {
		return getConstBoolean(offset + 5, $excel_pln_flg);
	}

	/**
	 * Input/output planning data in Excel 計画データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public void excel_pln_flg(boolean value) {
		setConstBoolean(offset + 5, $excel_pln_flg, value);
	}


	/**
	 * Input/output result data in Excel 実績データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public boolean excel_act_flg() {
		return getConstBoolean(offset + 6, $excel_act_flg);
	}

	/**
	 * Input/output result data in Excel 実績データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public void excel_act_flg(boolean value) {
		setConstBoolean(offset + 6, $excel_act_flg, value);
	}


	/**
	 * Input/output allocation data in Excel 配賦データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public boolean excel_alc_flg() {
		return getConstBoolean(offset + 7, $excel_alc_flg);
	}

	/**
	 * Input/output allocation data in Excel 配賦データをＥｘｃｅｌで入出力する.<p>
	 *
	 */
	public void excel_alc_flg(boolean value) {
		setConstBoolean(offset + 7, $excel_alc_flg, value);
	}


	public MCNumber getNumber(String name) {
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			return std_disp_digit();
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			return amt_disp_digit();
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			return unit_disp_digit();
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			return rate_disp_digit();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($excel_pln_flg.equalsIgnoreCase(name)) {
			return excel_pln_flg();
		}
		if ($excel_act_flg.equalsIgnoreCase(name)) {
			return excel_act_flg();
		}
		if ($excel_alc_flg.equalsIgnoreCase(name)) {
			return excel_alc_flg();
		}
		return super.getBoolean(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			return std_disp_digit();
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			return amt_disp_digit();
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			return unit_disp_digit();
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			return rate_disp_digit();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($excel_pln_flg.equalsIgnoreCase(name)) {
			return excel_pln_flg();
		}
		if ($excel_act_flg.equalsIgnoreCase(name)) {
			return excel_act_flg();
		}
		if ($excel_alc_flg.equalsIgnoreCase(name)) {
			return excel_alc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($excel_pln_flg.equalsIgnoreCase(name)) {
			excel_pln_flg(value);
			return;
		}
		if ($excel_act_flg.equalsIgnoreCase(name)) {
			excel_act_flg(value);
			return;
		}
		if ($excel_alc_flg.equalsIgnoreCase(name)) {
			excel_alc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($std_disp_digit.equalsIgnoreCase(name)) {
			std_disp_digit(value);
			return;
		}
		if ($amt_disp_digit.equalsIgnoreCase(name)) {
			amt_disp_digit(value);
			return;
		}
		if ($unit_disp_digit.equalsIgnoreCase(name)) {
			unit_disp_digit(value);
			return;
		}
		if ($rate_disp_digit.equalsIgnoreCase(name)) {
			rate_disp_digit(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($excel_pln_flg.equalsIgnoreCase(name)) {
			excel_pln_flg(value);
			return;
		}
		if ($excel_act_flg.equalsIgnoreCase(name)) {
			excel_act_flg(value);
			return;
		}
		if ($excel_alc_flg.equalsIgnoreCase(name)) {
			excel_alc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($term_p.equalsIgnoreCase(name)) {
			return term_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($term_p.equalsIgnoreCase(name)) {
			term_p(
				((MCContainerMeta) term_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0230.TermR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate term() {
		return term_p().term();
	}

	public void term(MCDate value) {
		term_p().term(value);
	}

	public String term_nm() {
		return term_p().term_nm();
	}

	public void term_nm(String value) {
		term_p().term_nm(value);
	}

}

