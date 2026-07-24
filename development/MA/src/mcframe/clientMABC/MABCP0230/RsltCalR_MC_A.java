package mcframe.clientMABC.MABCP0230;

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
 * ブロック"RsltCal"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltCalR_MC_A extends MCConstRow {

	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * 1 1.<p>
	 *
	 */
	public static final String $dt01 = "dt01";
	/**
	 * 2 2.<p>
	 *
	 */
	public static final String $dt02 = "dt02";
	/**
	 * 3 3.<p>
	 *
	 */
	public static final String $dt03 = "dt03";
	/**
	 * 4 4.<p>
	 *
	 */
	public static final String $dt04 = "dt04";
	/**
	 * 5 5.<p>
	 *
	 */
	public static final String $dt05 = "dt05";
	/**
	 * 6 6.<p>
	 *
	 */
	public static final String $dt06 = "dt06";
	/**
	 * 7 7.<p>
	 *
	 */
	public static final String $dt07 = "dt07";
	/**
	 * 8 8.<p>
	 *
	 */
	public static final String $dt08 = "dt08";
	/**
	 * 9 9.<p>
	 *
	 */
	public static final String $dt09 = "dt09";
	/**
	 * 10 10.<p>
	 *
	 */
	public static final String $dt10 = "dt10";
	/**
	 * 11 11.<p>
	 *
	 */
	public static final String $dt11 = "dt11";
	/**
	 * 12 12.<p>
	 *
	 */
	public static final String $dt12 = "dt12";
	/**
	 * 13 13.<p>
	 *
	 */
	public static final String $dt13 = "dt13";
	/**
	 * 14 14.<p>
	 *
	 */
	public static final String $dt14 = "dt14";
	/**
	 * 15 15.<p>
	 *
	 */
	public static final String $dt15 = "dt15";
	/**
	 * 16 16.<p>
	 *
	 */
	public static final String $dt16 = "dt16";
	/**
	 * 17 17.<p>
	 *
	 */
	public static final String $dt17 = "dt17";
	/**
	 * 18 18.<p>
	 *
	 */
	public static final String $dt18 = "dt18";
	/**
	 * 19 19.<p>
	 *
	 */
	public static final String $dt19 = "dt19";
	/**
	 * 20 20.<p>
	 *
	 */
	public static final String $dt20 = "dt20";
	/**
	 * 21 21.<p>
	 *
	 */
	public static final String $dt21 = "dt21";
	/**
	 * 22 22.<p>
	 *
	 */
	public static final String $dt22 = "dt22";
	/**
	 * 23 23.<p>
	 *
	 */
	public static final String $dt23 = "dt23";
	/**
	 * 24 24.<p>
	 *
	 */
	public static final String $dt24 = "dt24";
	/**
	 * 25 25.<p>
	 *
	 */
	public static final String $dt25 = "dt25";
	/**
	 * 26 26.<p>
	 *
	 */
	public static final String $dt26 = "dt26";
	/**
	 * 27 27.<p>
	 *
	 */
	public static final String $dt27 = "dt27";
	/**
	 * 28 28.<p>
	 *
	 */
	public static final String $dt28 = "dt28";
	/**
	 * 29 29.<p>
	 *
	 */
	public static final String $dt29 = "dt29";
	/**
	 * 30 30.<p>
	 *
	 */
	public static final String $dt30 = "dt30";
	/**
	 * 31 31.<p>
	 *
	 */
	public static final String $dt31 = "dt31";


	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta dt01_META = createCommonMeta($dt01, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt02_META = createCommonMeta($dt02, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt03_META = createCommonMeta($dt03, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt04_META = createCommonMeta($dt04, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt05_META = createCommonMeta($dt05, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt06_META = createCommonMeta($dt06, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt07_META = createCommonMeta($dt07, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt08_META = createCommonMeta($dt08, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt09_META = createCommonMeta($dt09, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt10_META = createCommonMeta($dt10, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt11_META = createCommonMeta($dt11, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt12_META = createCommonMeta($dt12, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt13_META = createCommonMeta($dt13, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt14_META = createCommonMeta($dt14, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt15_META = createCommonMeta($dt15, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt16_META = createCommonMeta($dt16, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt17_META = createCommonMeta($dt17, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt18_META = createCommonMeta($dt18, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt19_META = createCommonMeta($dt19, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt20_META = createCommonMeta($dt20, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt21_META = createCommonMeta($dt21, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt22_META = createCommonMeta($dt22, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt23_META = createCommonMeta($dt23, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt24_META = createCommonMeta($dt24, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt25_META = createCommonMeta($dt25, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt26_META = createCommonMeta($dt26, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt27_META = createCommonMeta($dt27, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt28_META = createCommonMeta($dt28, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt29_META = createCommonMeta($dt29, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt30_META = createCommonMeta($dt30, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);
	public static final MCMeta dt31_META = createCommonMeta($dt31, mcframe.commonMA.meta.MA_META.CAL_DT_VIEW);

	protected static final ConstMetaList<RsltCalR> constMetas = new ConstMetaList<RsltCalR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ym_META,
			dt01_META,
			dt02_META,
			dt03_META,
			dt04_META,
			dt05_META,
			dt06_META,
			dt07_META,
			dt08_META,
			dt09_META,
			dt10_META,
			dt11_META,
			dt12_META,
			dt13_META,
			dt14_META,
			dt15_META,
			dt16_META,
			dt17_META,
			dt18_META,
			dt19_META,
			dt20_META,
			dt21_META,
			dt22_META,
			dt23_META,
			dt24_META,
			dt25_META,
			dt26_META,
			dt27_META,
			dt28_META,
			dt29_META,
			dt30_META,
			dt31_META
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

	/** 項目属性情報のグループ[FLG_GRP]のキー定数 */
	public static final String $$FLG_GRP = "FLG_GRP";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$FLG_GRP, new MCExtList(
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
	protected RsltCalR_MC_A(ConstMetaList<? extends RsltCalR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltCalR clone() {
		return (RsltCalR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltCalR createInstance() {
		return (RsltCalR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltCalR getValues(String... names) {
		return (RsltCalR) super.getValues(names);
	}



	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 0, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 0, $ym, value);
	}


	/**
	 * 1 1.<p>
	 *
	 */
	public String dt01() {
		return getConstString(offset + 1, $dt01);
	}

	/**
	 * 1 1.<p>
	 *
	 */
	public void dt01(String value) {
		setConstString(offset + 1, $dt01, value);
	}


	/**
	 * 2 2.<p>
	 *
	 */
	public String dt02() {
		return getConstString(offset + 2, $dt02);
	}

	/**
	 * 2 2.<p>
	 *
	 */
	public void dt02(String value) {
		setConstString(offset + 2, $dt02, value);
	}


	/**
	 * 3 3.<p>
	 *
	 */
	public String dt03() {
		return getConstString(offset + 3, $dt03);
	}

	/**
	 * 3 3.<p>
	 *
	 */
	public void dt03(String value) {
		setConstString(offset + 3, $dt03, value);
	}


	/**
	 * 4 4.<p>
	 *
	 */
	public String dt04() {
		return getConstString(offset + 4, $dt04);
	}

	/**
	 * 4 4.<p>
	 *
	 */
	public void dt04(String value) {
		setConstString(offset + 4, $dt04, value);
	}


	/**
	 * 5 5.<p>
	 *
	 */
	public String dt05() {
		return getConstString(offset + 5, $dt05);
	}

	/**
	 * 5 5.<p>
	 *
	 */
	public void dt05(String value) {
		setConstString(offset + 5, $dt05, value);
	}


	/**
	 * 6 6.<p>
	 *
	 */
	public String dt06() {
		return getConstString(offset + 6, $dt06);
	}

	/**
	 * 6 6.<p>
	 *
	 */
	public void dt06(String value) {
		setConstString(offset + 6, $dt06, value);
	}


	/**
	 * 7 7.<p>
	 *
	 */
	public String dt07() {
		return getConstString(offset + 7, $dt07);
	}

	/**
	 * 7 7.<p>
	 *
	 */
	public void dt07(String value) {
		setConstString(offset + 7, $dt07, value);
	}


	/**
	 * 8 8.<p>
	 *
	 */
	public String dt08() {
		return getConstString(offset + 8, $dt08);
	}

	/**
	 * 8 8.<p>
	 *
	 */
	public void dt08(String value) {
		setConstString(offset + 8, $dt08, value);
	}


	/**
	 * 9 9.<p>
	 *
	 */
	public String dt09() {
		return getConstString(offset + 9, $dt09);
	}

	/**
	 * 9 9.<p>
	 *
	 */
	public void dt09(String value) {
		setConstString(offset + 9, $dt09, value);
	}


	/**
	 * 10 10.<p>
	 *
	 */
	public String dt10() {
		return getConstString(offset + 10, $dt10);
	}

	/**
	 * 10 10.<p>
	 *
	 */
	public void dt10(String value) {
		setConstString(offset + 10, $dt10, value);
	}


	/**
	 * 11 11.<p>
	 *
	 */
	public String dt11() {
		return getConstString(offset + 11, $dt11);
	}

	/**
	 * 11 11.<p>
	 *
	 */
	public void dt11(String value) {
		setConstString(offset + 11, $dt11, value);
	}


	/**
	 * 12 12.<p>
	 *
	 */
	public String dt12() {
		return getConstString(offset + 12, $dt12);
	}

	/**
	 * 12 12.<p>
	 *
	 */
	public void dt12(String value) {
		setConstString(offset + 12, $dt12, value);
	}


	/**
	 * 13 13.<p>
	 *
	 */
	public String dt13() {
		return getConstString(offset + 13, $dt13);
	}

	/**
	 * 13 13.<p>
	 *
	 */
	public void dt13(String value) {
		setConstString(offset + 13, $dt13, value);
	}


	/**
	 * 14 14.<p>
	 *
	 */
	public String dt14() {
		return getConstString(offset + 14, $dt14);
	}

	/**
	 * 14 14.<p>
	 *
	 */
	public void dt14(String value) {
		setConstString(offset + 14, $dt14, value);
	}


	/**
	 * 15 15.<p>
	 *
	 */
	public String dt15() {
		return getConstString(offset + 15, $dt15);
	}

	/**
	 * 15 15.<p>
	 *
	 */
	public void dt15(String value) {
		setConstString(offset + 15, $dt15, value);
	}


	/**
	 * 16 16.<p>
	 *
	 */
	public String dt16() {
		return getConstString(offset + 16, $dt16);
	}

	/**
	 * 16 16.<p>
	 *
	 */
	public void dt16(String value) {
		setConstString(offset + 16, $dt16, value);
	}


	/**
	 * 17 17.<p>
	 *
	 */
	public String dt17() {
		return getConstString(offset + 17, $dt17);
	}

	/**
	 * 17 17.<p>
	 *
	 */
	public void dt17(String value) {
		setConstString(offset + 17, $dt17, value);
	}


	/**
	 * 18 18.<p>
	 *
	 */
	public String dt18() {
		return getConstString(offset + 18, $dt18);
	}

	/**
	 * 18 18.<p>
	 *
	 */
	public void dt18(String value) {
		setConstString(offset + 18, $dt18, value);
	}


	/**
	 * 19 19.<p>
	 *
	 */
	public String dt19() {
		return getConstString(offset + 19, $dt19);
	}

	/**
	 * 19 19.<p>
	 *
	 */
	public void dt19(String value) {
		setConstString(offset + 19, $dt19, value);
	}


	/**
	 * 20 20.<p>
	 *
	 */
	public String dt20() {
		return getConstString(offset + 20, $dt20);
	}

	/**
	 * 20 20.<p>
	 *
	 */
	public void dt20(String value) {
		setConstString(offset + 20, $dt20, value);
	}


	/**
	 * 21 21.<p>
	 *
	 */
	public String dt21() {
		return getConstString(offset + 21, $dt21);
	}

	/**
	 * 21 21.<p>
	 *
	 */
	public void dt21(String value) {
		setConstString(offset + 21, $dt21, value);
	}


	/**
	 * 22 22.<p>
	 *
	 */
	public String dt22() {
		return getConstString(offset + 22, $dt22);
	}

	/**
	 * 22 22.<p>
	 *
	 */
	public void dt22(String value) {
		setConstString(offset + 22, $dt22, value);
	}


	/**
	 * 23 23.<p>
	 *
	 */
	public String dt23() {
		return getConstString(offset + 23, $dt23);
	}

	/**
	 * 23 23.<p>
	 *
	 */
	public void dt23(String value) {
		setConstString(offset + 23, $dt23, value);
	}


	/**
	 * 24 24.<p>
	 *
	 */
	public String dt24() {
		return getConstString(offset + 24, $dt24);
	}

	/**
	 * 24 24.<p>
	 *
	 */
	public void dt24(String value) {
		setConstString(offset + 24, $dt24, value);
	}


	/**
	 * 25 25.<p>
	 *
	 */
	public String dt25() {
		return getConstString(offset + 25, $dt25);
	}

	/**
	 * 25 25.<p>
	 *
	 */
	public void dt25(String value) {
		setConstString(offset + 25, $dt25, value);
	}


	/**
	 * 26 26.<p>
	 *
	 */
	public String dt26() {
		return getConstString(offset + 26, $dt26);
	}

	/**
	 * 26 26.<p>
	 *
	 */
	public void dt26(String value) {
		setConstString(offset + 26, $dt26, value);
	}


	/**
	 * 27 27.<p>
	 *
	 */
	public String dt27() {
		return getConstString(offset + 27, $dt27);
	}

	/**
	 * 27 27.<p>
	 *
	 */
	public void dt27(String value) {
		setConstString(offset + 27, $dt27, value);
	}


	/**
	 * 28 28.<p>
	 *
	 */
	public String dt28() {
		return getConstString(offset + 28, $dt28);
	}

	/**
	 * 28 28.<p>
	 *
	 */
	public void dt28(String value) {
		setConstString(offset + 28, $dt28, value);
	}


	/**
	 * 29 29.<p>
	 *
	 */
	public String dt29() {
		return getConstString(offset + 29, $dt29);
	}

	/**
	 * 29 29.<p>
	 *
	 */
	public void dt29(String value) {
		setConstString(offset + 29, $dt29, value);
	}


	/**
	 * 30 30.<p>
	 *
	 */
	public String dt30() {
		return getConstString(offset + 30, $dt30);
	}

	/**
	 * 30 30.<p>
	 *
	 */
	public void dt30(String value) {
		setConstString(offset + 30, $dt30, value);
	}


	/**
	 * 31 31.<p>
	 *
	 */
	public String dt31() {
		return getConstString(offset + 31, $dt31);
	}

	/**
	 * 31 31.<p>
	 *
	 */
	public void dt31(String value) {
		setConstString(offset + 31, $dt31, value);
	}


	public String getString(String name) {
		if ($dt01.equalsIgnoreCase(name)) {
			return dt01();
		}
		if ($dt02.equalsIgnoreCase(name)) {
			return dt02();
		}
		if ($dt03.equalsIgnoreCase(name)) {
			return dt03();
		}
		if ($dt04.equalsIgnoreCase(name)) {
			return dt04();
		}
		if ($dt05.equalsIgnoreCase(name)) {
			return dt05();
		}
		if ($dt06.equalsIgnoreCase(name)) {
			return dt06();
		}
		if ($dt07.equalsIgnoreCase(name)) {
			return dt07();
		}
		if ($dt08.equalsIgnoreCase(name)) {
			return dt08();
		}
		if ($dt09.equalsIgnoreCase(name)) {
			return dt09();
		}
		if ($dt10.equalsIgnoreCase(name)) {
			return dt10();
		}
		if ($dt11.equalsIgnoreCase(name)) {
			return dt11();
		}
		if ($dt12.equalsIgnoreCase(name)) {
			return dt12();
		}
		if ($dt13.equalsIgnoreCase(name)) {
			return dt13();
		}
		if ($dt14.equalsIgnoreCase(name)) {
			return dt14();
		}
		if ($dt15.equalsIgnoreCase(name)) {
			return dt15();
		}
		if ($dt16.equalsIgnoreCase(name)) {
			return dt16();
		}
		if ($dt17.equalsIgnoreCase(name)) {
			return dt17();
		}
		if ($dt18.equalsIgnoreCase(name)) {
			return dt18();
		}
		if ($dt19.equalsIgnoreCase(name)) {
			return dt19();
		}
		if ($dt20.equalsIgnoreCase(name)) {
			return dt20();
		}
		if ($dt21.equalsIgnoreCase(name)) {
			return dt21();
		}
		if ($dt22.equalsIgnoreCase(name)) {
			return dt22();
		}
		if ($dt23.equalsIgnoreCase(name)) {
			return dt23();
		}
		if ($dt24.equalsIgnoreCase(name)) {
			return dt24();
		}
		if ($dt25.equalsIgnoreCase(name)) {
			return dt25();
		}
		if ($dt26.equalsIgnoreCase(name)) {
			return dt26();
		}
		if ($dt27.equalsIgnoreCase(name)) {
			return dt27();
		}
		if ($dt28.equalsIgnoreCase(name)) {
			return dt28();
		}
		if ($dt29.equalsIgnoreCase(name)) {
			return dt29();
		}
		if ($dt30.equalsIgnoreCase(name)) {
			return dt30();
		}
		if ($dt31.equalsIgnoreCase(name)) {
			return dt31();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($dt01.equalsIgnoreCase(name)) {
			return dt01();
		}
		if ($dt02.equalsIgnoreCase(name)) {
			return dt02();
		}
		if ($dt03.equalsIgnoreCase(name)) {
			return dt03();
		}
		if ($dt04.equalsIgnoreCase(name)) {
			return dt04();
		}
		if ($dt05.equalsIgnoreCase(name)) {
			return dt05();
		}
		if ($dt06.equalsIgnoreCase(name)) {
			return dt06();
		}
		if ($dt07.equalsIgnoreCase(name)) {
			return dt07();
		}
		if ($dt08.equalsIgnoreCase(name)) {
			return dt08();
		}
		if ($dt09.equalsIgnoreCase(name)) {
			return dt09();
		}
		if ($dt10.equalsIgnoreCase(name)) {
			return dt10();
		}
		if ($dt11.equalsIgnoreCase(name)) {
			return dt11();
		}
		if ($dt12.equalsIgnoreCase(name)) {
			return dt12();
		}
		if ($dt13.equalsIgnoreCase(name)) {
			return dt13();
		}
		if ($dt14.equalsIgnoreCase(name)) {
			return dt14();
		}
		if ($dt15.equalsIgnoreCase(name)) {
			return dt15();
		}
		if ($dt16.equalsIgnoreCase(name)) {
			return dt16();
		}
		if ($dt17.equalsIgnoreCase(name)) {
			return dt17();
		}
		if ($dt18.equalsIgnoreCase(name)) {
			return dt18();
		}
		if ($dt19.equalsIgnoreCase(name)) {
			return dt19();
		}
		if ($dt20.equalsIgnoreCase(name)) {
			return dt20();
		}
		if ($dt21.equalsIgnoreCase(name)) {
			return dt21();
		}
		if ($dt22.equalsIgnoreCase(name)) {
			return dt22();
		}
		if ($dt23.equalsIgnoreCase(name)) {
			return dt23();
		}
		if ($dt24.equalsIgnoreCase(name)) {
			return dt24();
		}
		if ($dt25.equalsIgnoreCase(name)) {
			return dt25();
		}
		if ($dt26.equalsIgnoreCase(name)) {
			return dt26();
		}
		if ($dt27.equalsIgnoreCase(name)) {
			return dt27();
		}
		if ($dt28.equalsIgnoreCase(name)) {
			return dt28();
		}
		if ($dt29.equalsIgnoreCase(name)) {
			return dt29();
		}
		if ($dt30.equalsIgnoreCase(name)) {
			return dt30();
		}
		if ($dt31.equalsIgnoreCase(name)) {
			return dt31();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($dt01.equalsIgnoreCase(name)) {
			dt01(value);
			return;
		}
		if ($dt02.equalsIgnoreCase(name)) {
			dt02(value);
			return;
		}
		if ($dt03.equalsIgnoreCase(name)) {
			dt03(value);
			return;
		}
		if ($dt04.equalsIgnoreCase(name)) {
			dt04(value);
			return;
		}
		if ($dt05.equalsIgnoreCase(name)) {
			dt05(value);
			return;
		}
		if ($dt06.equalsIgnoreCase(name)) {
			dt06(value);
			return;
		}
		if ($dt07.equalsIgnoreCase(name)) {
			dt07(value);
			return;
		}
		if ($dt08.equalsIgnoreCase(name)) {
			dt08(value);
			return;
		}
		if ($dt09.equalsIgnoreCase(name)) {
			dt09(value);
			return;
		}
		if ($dt10.equalsIgnoreCase(name)) {
			dt10(value);
			return;
		}
		if ($dt11.equalsIgnoreCase(name)) {
			dt11(value);
			return;
		}
		if ($dt12.equalsIgnoreCase(name)) {
			dt12(value);
			return;
		}
		if ($dt13.equalsIgnoreCase(name)) {
			dt13(value);
			return;
		}
		if ($dt14.equalsIgnoreCase(name)) {
			dt14(value);
			return;
		}
		if ($dt15.equalsIgnoreCase(name)) {
			dt15(value);
			return;
		}
		if ($dt16.equalsIgnoreCase(name)) {
			dt16(value);
			return;
		}
		if ($dt17.equalsIgnoreCase(name)) {
			dt17(value);
			return;
		}
		if ($dt18.equalsIgnoreCase(name)) {
			dt18(value);
			return;
		}
		if ($dt19.equalsIgnoreCase(name)) {
			dt19(value);
			return;
		}
		if ($dt20.equalsIgnoreCase(name)) {
			dt20(value);
			return;
		}
		if ($dt21.equalsIgnoreCase(name)) {
			dt21(value);
			return;
		}
		if ($dt22.equalsIgnoreCase(name)) {
			dt22(value);
			return;
		}
		if ($dt23.equalsIgnoreCase(name)) {
			dt23(value);
			return;
		}
		if ($dt24.equalsIgnoreCase(name)) {
			dt24(value);
			return;
		}
		if ($dt25.equalsIgnoreCase(name)) {
			dt25(value);
			return;
		}
		if ($dt26.equalsIgnoreCase(name)) {
			dt26(value);
			return;
		}
		if ($dt27.equalsIgnoreCase(name)) {
			dt27(value);
			return;
		}
		if ($dt28.equalsIgnoreCase(name)) {
			dt28(value);
			return;
		}
		if ($dt29.equalsIgnoreCase(name)) {
			dt29(value);
			return;
		}
		if ($dt30.equalsIgnoreCase(name)) {
			dt30(value);
			return;
		}
		if ($dt31.equalsIgnoreCase(name)) {
			dt31(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dt01.equalsIgnoreCase(name)) {
			dt01(value);
			return;
		}
		if ($dt02.equalsIgnoreCase(name)) {
			dt02(value);
			return;
		}
		if ($dt03.equalsIgnoreCase(name)) {
			dt03(value);
			return;
		}
		if ($dt04.equalsIgnoreCase(name)) {
			dt04(value);
			return;
		}
		if ($dt05.equalsIgnoreCase(name)) {
			dt05(value);
			return;
		}
		if ($dt06.equalsIgnoreCase(name)) {
			dt06(value);
			return;
		}
		if ($dt07.equalsIgnoreCase(name)) {
			dt07(value);
			return;
		}
		if ($dt08.equalsIgnoreCase(name)) {
			dt08(value);
			return;
		}
		if ($dt09.equalsIgnoreCase(name)) {
			dt09(value);
			return;
		}
		if ($dt10.equalsIgnoreCase(name)) {
			dt10(value);
			return;
		}
		if ($dt11.equalsIgnoreCase(name)) {
			dt11(value);
			return;
		}
		if ($dt12.equalsIgnoreCase(name)) {
			dt12(value);
			return;
		}
		if ($dt13.equalsIgnoreCase(name)) {
			dt13(value);
			return;
		}
		if ($dt14.equalsIgnoreCase(name)) {
			dt14(value);
			return;
		}
		if ($dt15.equalsIgnoreCase(name)) {
			dt15(value);
			return;
		}
		if ($dt16.equalsIgnoreCase(name)) {
			dt16(value);
			return;
		}
		if ($dt17.equalsIgnoreCase(name)) {
			dt17(value);
			return;
		}
		if ($dt18.equalsIgnoreCase(name)) {
			dt18(value);
			return;
		}
		if ($dt19.equalsIgnoreCase(name)) {
			dt19(value);
			return;
		}
		if ($dt20.equalsIgnoreCase(name)) {
			dt20(value);
			return;
		}
		if ($dt21.equalsIgnoreCase(name)) {
			dt21(value);
			return;
		}
		if ($dt22.equalsIgnoreCase(name)) {
			dt22(value);
			return;
		}
		if ($dt23.equalsIgnoreCase(name)) {
			dt23(value);
			return;
		}
		if ($dt24.equalsIgnoreCase(name)) {
			dt24(value);
			return;
		}
		if ($dt25.equalsIgnoreCase(name)) {
			dt25(value);
			return;
		}
		if ($dt26.equalsIgnoreCase(name)) {
			dt26(value);
			return;
		}
		if ($dt27.equalsIgnoreCase(name)) {
			dt27(value);
			return;
		}
		if ($dt28.equalsIgnoreCase(name)) {
			dt28(value);
			return;
		}
		if ($dt29.equalsIgnoreCase(name)) {
			dt29(value);
			return;
		}
		if ($dt30.equalsIgnoreCase(name)) {
			dt30(value);
			return;
		}
		if ($dt31.equalsIgnoreCase(name)) {
			dt31(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

