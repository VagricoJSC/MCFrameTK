package mcframe.clientMABC.MABCP0140;

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
 * ブロック"DtlSub"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlSubR_MC_A extends MCConstRow {

	/**
	 * Key キー.<p>
	 *
	 */
	public static final String $const_key = "const_key";
	/**
	 * Value 値.<p>
	 *
	 */
	public static final String $const_value = "const_value";
	/**
	 * Name 名称.<p>
	 *
	 */
	public static final String $const_name = "const_name";
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public static final String $const_rmrks = "const_rmrks";
	/**
	 * Attribute 1 属性１.<p>
	 *
	 */
	public static final String $col1 = "col1";
	/**
	 * Attribute 2 属性２.<p>
	 *
	 */
	public static final String $col2 = "col2";
	/**
	 * Attribute 3 属性３.<p>
	 *
	 */
	public static final String $col3 = "col3";
	/**
	 * Attribute 4 属性４.<p>
	 *
	 */
	public static final String $col4 = "col4";
	/**
	 * Attribute 5 属性５.<p>
	 *
	 */
	public static final String $col5 = "col5";
	/**
	 * Attribute 6 属性６.<p>
	 *
	 */
	public static final String $col6 = "col6";
	/**
	 * Attribute 7 属性７.<p>
	 *
	 */
	public static final String $col7 = "col7";
	/**
	 * Attribute 8 属性８.<p>
	 *
	 */
	public static final String $col8 = "col8";
	/**
	 * Attribute 9 属性９.<p>
	 *
	 */
	public static final String $col9 = "col9";
	/**
	 * Attribute 10 属性１０.<p>
	 *
	 */
	public static final String $col10 = "col10";
	/**
	 * Attribute 11 属性１１.<p>
	 *
	 */
	public static final String $col11 = "col11";
	/**
	 * Attribute 12 属性１２.<p>
	 *
	 */
	public static final String $col12 = "col12";
	/**
	 * Attribute 13 属性１３.<p>
	 *
	 */
	public static final String $col13 = "col13";
	/**
	 * Attribute 14 属性１４.<p>
	 *
	 */
	public static final String $col14 = "col14";
	/**
	 * Attribute 15 属性１５.<p>
	 *
	 */
	public static final String $col15 = "col15";
	/**
	 * Attribute 16 属性１６.<p>
	 *
	 */
	public static final String $col16 = "col16";
	/**
	 * Attribute 17 属性１７.<p>
	 *
	 */
	public static final String $col17 = "col17";
	/**
	 * Attribute 18 属性１８.<p>
	 *
	 */
	public static final String $col18 = "col18";
	/**
	 * Attribute 19 属性１９.<p>
	 *
	 */
	public static final String $col19 = "col19";
	/**
	 * Attribute 20 属性２０.<p>
	 *
	 */
	public static final String $col20 = "col20";
	/**
	 * Attribute 21 属性２１.<p>
	 *
	 */
	public static final String $col21 = "col21";
	/**
	 * Attribute 22 属性２２.<p>
	 *
	 */
	public static final String $col22 = "col22";
	/**
	 * Attribute 23 属性２３.<p>
	 *
	 */
	public static final String $col23 = "col23";
	/**
	 * Attribute 24 属性２４.<p>
	 *
	 */
	public static final String $col24 = "col24";
	/**
	 * Attribute 25 属性２５.<p>
	 *
	 */
	public static final String $col25 = "col25";
	/**
	 * Attribute 26 属性２６.<p>
	 *
	 */
	public static final String $col26 = "col26";
	/**
	 * Attribute 27 属性２７.<p>
	 *
	 */
	public static final String $col27 = "col27";
	/**
	 * Attribute 28 属性２８.<p>
	 *
	 */
	public static final String $col28 = "col28";
	/**
	 * Attribute 29 属性２９.<p>
	 *
	 */
	public static final String $col29 = "col29";
	/**
	 * Attribute 30 属性３０.<p>
	 *
	 */
	public static final String $col30 = "col30";


	public static final MCMeta const_key_META = createStringMeta($const_key);
	public static final MCMeta const_value_META = createStringMeta($const_value);
	public static final MCMeta const_name_META = createStringMeta($const_name);
	public static final MCMeta const_rmrks_META = createStringMeta($const_rmrks);
	public static final MCMeta col1_META = createStringMeta($col1);
	public static final MCMeta col2_META = createStringMeta($col2);
	public static final MCMeta col3_META = createStringMeta($col3);
	public static final MCMeta col4_META = createStringMeta($col4);
	public static final MCMeta col5_META = createStringMeta($col5);
	public static final MCMeta col6_META = createStringMeta($col6);
	public static final MCMeta col7_META = createStringMeta($col7);
	public static final MCMeta col8_META = createStringMeta($col8);
	public static final MCMeta col9_META = createStringMeta($col9);
	public static final MCMeta col10_META = createStringMeta($col10);
	public static final MCMeta col11_META = createStringMeta($col11);
	public static final MCMeta col12_META = createStringMeta($col12);
	public static final MCMeta col13_META = createStringMeta($col13);
	public static final MCMeta col14_META = createStringMeta($col14);
	public static final MCMeta col15_META = createStringMeta($col15);
	public static final MCMeta col16_META = createStringMeta($col16);
	public static final MCMeta col17_META = createStringMeta($col17);
	public static final MCMeta col18_META = createStringMeta($col18);
	public static final MCMeta col19_META = createStringMeta($col19);
	public static final MCMeta col20_META = createStringMeta($col20);
	public static final MCMeta col21_META = createStringMeta($col21);
	public static final MCMeta col22_META = createStringMeta($col22);
	public static final MCMeta col23_META = createStringMeta($col23);
	public static final MCMeta col24_META = createStringMeta($col24);
	public static final MCMeta col25_META = createStringMeta($col25);
	public static final MCMeta col26_META = createStringMeta($col26);
	public static final MCMeta col27_META = createStringMeta($col27);
	public static final MCMeta col28_META = createStringMeta($col28);
	public static final MCMeta col29_META = createStringMeta($col29);
	public static final MCMeta col30_META = createStringMeta($col30);

	protected static final ConstMetaList<DtlSubR> constMetas = new ConstMetaList<DtlSubR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			const_key_META,
			const_value_META,
			const_name_META,
			const_rmrks_META,
			col1_META,
			col2_META,
			col3_META,
			col4_META,
			col5_META,
			col6_META,
			col7_META,
			col8_META,
			col9_META,
			col10_META,
			col11_META,
			col12_META,
			col13_META,
			col14_META,
			col15_META,
			col16_META,
			col17_META,
			col18_META,
			col19_META,
			col20_META,
			col21_META,
			col22_META,
			col23_META,
			col24_META,
			col25_META,
			col26_META,
			col27_META,
			col28_META,
			col29_META,
			col30_META
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
	protected DtlSubR_MC_A(ConstMetaList<? extends DtlSubR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlSubR clone() {
		return (DtlSubR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlSubR createInstance() {
		return (DtlSubR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlSubR getValues(String... names) {
		return (DtlSubR) super.getValues(names);
	}



	/**
	 * Key キー.<p>
	 *
	 */
	public String const_key() {
		return getConstString(offset + 0, $const_key);
	}

	/**
	 * Key キー.<p>
	 *
	 */
	public void const_key(String value) {
		setConstString(offset + 0, $const_key, value);
	}


	/**
	 * Value 値.<p>
	 *
	 */
	public String const_value() {
		return getConstString(offset + 1, $const_value);
	}

	/**
	 * Value 値.<p>
	 *
	 */
	public void const_value(String value) {
		setConstString(offset + 1, $const_value, value);
	}


	/**
	 * Name 名称.<p>
	 *
	 */
	public String const_name() {
		return getConstString(offset + 2, $const_name);
	}

	/**
	 * Name 名称.<p>
	 *
	 */
	public void const_name(String value) {
		setConstString(offset + 2, $const_name, value);
	}


	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String const_rmrks() {
		return getConstString(offset + 3, $const_rmrks);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void const_rmrks(String value) {
		setConstString(offset + 3, $const_rmrks, value);
	}


	/**
	 * Attribute 1 属性１.<p>
	 *
	 */
	public String col1() {
		return getConstString(offset + 4, $col1);
	}

	/**
	 * Attribute 1 属性１.<p>
	 *
	 */
	public void col1(String value) {
		setConstString(offset + 4, $col1, value);
	}


	/**
	 * Attribute 2 属性２.<p>
	 *
	 */
	public String col2() {
		return getConstString(offset + 5, $col2);
	}

	/**
	 * Attribute 2 属性２.<p>
	 *
	 */
	public void col2(String value) {
		setConstString(offset + 5, $col2, value);
	}


	/**
	 * Attribute 3 属性３.<p>
	 *
	 */
	public String col3() {
		return getConstString(offset + 6, $col3);
	}

	/**
	 * Attribute 3 属性３.<p>
	 *
	 */
	public void col3(String value) {
		setConstString(offset + 6, $col3, value);
	}


	/**
	 * Attribute 4 属性４.<p>
	 *
	 */
	public String col4() {
		return getConstString(offset + 7, $col4);
	}

	/**
	 * Attribute 4 属性４.<p>
	 *
	 */
	public void col4(String value) {
		setConstString(offset + 7, $col4, value);
	}


	/**
	 * Attribute 5 属性５.<p>
	 *
	 */
	public String col5() {
		return getConstString(offset + 8, $col5);
	}

	/**
	 * Attribute 5 属性５.<p>
	 *
	 */
	public void col5(String value) {
		setConstString(offset + 8, $col5, value);
	}


	/**
	 * Attribute 6 属性６.<p>
	 *
	 */
	public String col6() {
		return getConstString(offset + 9, $col6);
	}

	/**
	 * Attribute 6 属性６.<p>
	 *
	 */
	public void col6(String value) {
		setConstString(offset + 9, $col6, value);
	}


	/**
	 * Attribute 7 属性７.<p>
	 *
	 */
	public String col7() {
		return getConstString(offset + 10, $col7);
	}

	/**
	 * Attribute 7 属性７.<p>
	 *
	 */
	public void col7(String value) {
		setConstString(offset + 10, $col7, value);
	}


	/**
	 * Attribute 8 属性８.<p>
	 *
	 */
	public String col8() {
		return getConstString(offset + 11, $col8);
	}

	/**
	 * Attribute 8 属性８.<p>
	 *
	 */
	public void col8(String value) {
		setConstString(offset + 11, $col8, value);
	}


	/**
	 * Attribute 9 属性９.<p>
	 *
	 */
	public String col9() {
		return getConstString(offset + 12, $col9);
	}

	/**
	 * Attribute 9 属性９.<p>
	 *
	 */
	public void col9(String value) {
		setConstString(offset + 12, $col9, value);
	}


	/**
	 * Attribute 10 属性１０.<p>
	 *
	 */
	public String col10() {
		return getConstString(offset + 13, $col10);
	}

	/**
	 * Attribute 10 属性１０.<p>
	 *
	 */
	public void col10(String value) {
		setConstString(offset + 13, $col10, value);
	}


	/**
	 * Attribute 11 属性１１.<p>
	 *
	 */
	public String col11() {
		return getConstString(offset + 14, $col11);
	}

	/**
	 * Attribute 11 属性１１.<p>
	 *
	 */
	public void col11(String value) {
		setConstString(offset + 14, $col11, value);
	}


	/**
	 * Attribute 12 属性１２.<p>
	 *
	 */
	public String col12() {
		return getConstString(offset + 15, $col12);
	}

	/**
	 * Attribute 12 属性１２.<p>
	 *
	 */
	public void col12(String value) {
		setConstString(offset + 15, $col12, value);
	}


	/**
	 * Attribute 13 属性１３.<p>
	 *
	 */
	public String col13() {
		return getConstString(offset + 16, $col13);
	}

	/**
	 * Attribute 13 属性１３.<p>
	 *
	 */
	public void col13(String value) {
		setConstString(offset + 16, $col13, value);
	}


	/**
	 * Attribute 14 属性１４.<p>
	 *
	 */
	public String col14() {
		return getConstString(offset + 17, $col14);
	}

	/**
	 * Attribute 14 属性１４.<p>
	 *
	 */
	public void col14(String value) {
		setConstString(offset + 17, $col14, value);
	}


	/**
	 * Attribute 15 属性１５.<p>
	 *
	 */
	public String col15() {
		return getConstString(offset + 18, $col15);
	}

	/**
	 * Attribute 15 属性１５.<p>
	 *
	 */
	public void col15(String value) {
		setConstString(offset + 18, $col15, value);
	}


	/**
	 * Attribute 16 属性１６.<p>
	 *
	 */
	public String col16() {
		return getConstString(offset + 19, $col16);
	}

	/**
	 * Attribute 16 属性１６.<p>
	 *
	 */
	public void col16(String value) {
		setConstString(offset + 19, $col16, value);
	}


	/**
	 * Attribute 17 属性１７.<p>
	 *
	 */
	public String col17() {
		return getConstString(offset + 20, $col17);
	}

	/**
	 * Attribute 17 属性１７.<p>
	 *
	 */
	public void col17(String value) {
		setConstString(offset + 20, $col17, value);
	}


	/**
	 * Attribute 18 属性１８.<p>
	 *
	 */
	public String col18() {
		return getConstString(offset + 21, $col18);
	}

	/**
	 * Attribute 18 属性１８.<p>
	 *
	 */
	public void col18(String value) {
		setConstString(offset + 21, $col18, value);
	}


	/**
	 * Attribute 19 属性１９.<p>
	 *
	 */
	public String col19() {
		return getConstString(offset + 22, $col19);
	}

	/**
	 * Attribute 19 属性１９.<p>
	 *
	 */
	public void col19(String value) {
		setConstString(offset + 22, $col19, value);
	}


	/**
	 * Attribute 20 属性２０.<p>
	 *
	 */
	public String col20() {
		return getConstString(offset + 23, $col20);
	}

	/**
	 * Attribute 20 属性２０.<p>
	 *
	 */
	public void col20(String value) {
		setConstString(offset + 23, $col20, value);
	}


	/**
	 * Attribute 21 属性２１.<p>
	 *
	 */
	public String col21() {
		return getConstString(offset + 24, $col21);
	}

	/**
	 * Attribute 21 属性２１.<p>
	 *
	 */
	public void col21(String value) {
		setConstString(offset + 24, $col21, value);
	}


	/**
	 * Attribute 22 属性２２.<p>
	 *
	 */
	public String col22() {
		return getConstString(offset + 25, $col22);
	}

	/**
	 * Attribute 22 属性２２.<p>
	 *
	 */
	public void col22(String value) {
		setConstString(offset + 25, $col22, value);
	}


	/**
	 * Attribute 23 属性２３.<p>
	 *
	 */
	public String col23() {
		return getConstString(offset + 26, $col23);
	}

	/**
	 * Attribute 23 属性２３.<p>
	 *
	 */
	public void col23(String value) {
		setConstString(offset + 26, $col23, value);
	}


	/**
	 * Attribute 24 属性２４.<p>
	 *
	 */
	public String col24() {
		return getConstString(offset + 27, $col24);
	}

	/**
	 * Attribute 24 属性２４.<p>
	 *
	 */
	public void col24(String value) {
		setConstString(offset + 27, $col24, value);
	}


	/**
	 * Attribute 25 属性２５.<p>
	 *
	 */
	public String col25() {
		return getConstString(offset + 28, $col25);
	}

	/**
	 * Attribute 25 属性２５.<p>
	 *
	 */
	public void col25(String value) {
		setConstString(offset + 28, $col25, value);
	}


	/**
	 * Attribute 26 属性２６.<p>
	 *
	 */
	public String col26() {
		return getConstString(offset + 29, $col26);
	}

	/**
	 * Attribute 26 属性２６.<p>
	 *
	 */
	public void col26(String value) {
		setConstString(offset + 29, $col26, value);
	}


	/**
	 * Attribute 27 属性２７.<p>
	 *
	 */
	public String col27() {
		return getConstString(offset + 30, $col27);
	}

	/**
	 * Attribute 27 属性２７.<p>
	 *
	 */
	public void col27(String value) {
		setConstString(offset + 30, $col27, value);
	}


	/**
	 * Attribute 28 属性２８.<p>
	 *
	 */
	public String col28() {
		return getConstString(offset + 31, $col28);
	}

	/**
	 * Attribute 28 属性２８.<p>
	 *
	 */
	public void col28(String value) {
		setConstString(offset + 31, $col28, value);
	}


	/**
	 * Attribute 29 属性２９.<p>
	 *
	 */
	public String col29() {
		return getConstString(offset + 32, $col29);
	}

	/**
	 * Attribute 29 属性２９.<p>
	 *
	 */
	public void col29(String value) {
		setConstString(offset + 32, $col29, value);
	}


	/**
	 * Attribute 30 属性３０.<p>
	 *
	 */
	public String col30() {
		return getConstString(offset + 33, $col30);
	}

	/**
	 * Attribute 30 属性３０.<p>
	 *
	 */
	public void col30(String value) {
		setConstString(offset + 33, $col30, value);
	}


	public String getString(String name) {
		if ($const_key.equalsIgnoreCase(name)) {
			return const_key();
		}
		if ($const_value.equalsIgnoreCase(name)) {
			return const_value();
		}
		if ($const_name.equalsIgnoreCase(name)) {
			return const_name();
		}
		if ($const_rmrks.equalsIgnoreCase(name)) {
			return const_rmrks();
		}
		if ($col1.equalsIgnoreCase(name)) {
			return col1();
		}
		if ($col2.equalsIgnoreCase(name)) {
			return col2();
		}
		if ($col3.equalsIgnoreCase(name)) {
			return col3();
		}
		if ($col4.equalsIgnoreCase(name)) {
			return col4();
		}
		if ($col5.equalsIgnoreCase(name)) {
			return col5();
		}
		if ($col6.equalsIgnoreCase(name)) {
			return col6();
		}
		if ($col7.equalsIgnoreCase(name)) {
			return col7();
		}
		if ($col8.equalsIgnoreCase(name)) {
			return col8();
		}
		if ($col9.equalsIgnoreCase(name)) {
			return col9();
		}
		if ($col10.equalsIgnoreCase(name)) {
			return col10();
		}
		if ($col11.equalsIgnoreCase(name)) {
			return col11();
		}
		if ($col12.equalsIgnoreCase(name)) {
			return col12();
		}
		if ($col13.equalsIgnoreCase(name)) {
			return col13();
		}
		if ($col14.equalsIgnoreCase(name)) {
			return col14();
		}
		if ($col15.equalsIgnoreCase(name)) {
			return col15();
		}
		if ($col16.equalsIgnoreCase(name)) {
			return col16();
		}
		if ($col17.equalsIgnoreCase(name)) {
			return col17();
		}
		if ($col18.equalsIgnoreCase(name)) {
			return col18();
		}
		if ($col19.equalsIgnoreCase(name)) {
			return col19();
		}
		if ($col20.equalsIgnoreCase(name)) {
			return col20();
		}
		if ($col21.equalsIgnoreCase(name)) {
			return col21();
		}
		if ($col22.equalsIgnoreCase(name)) {
			return col22();
		}
		if ($col23.equalsIgnoreCase(name)) {
			return col23();
		}
		if ($col24.equalsIgnoreCase(name)) {
			return col24();
		}
		if ($col25.equalsIgnoreCase(name)) {
			return col25();
		}
		if ($col26.equalsIgnoreCase(name)) {
			return col26();
		}
		if ($col27.equalsIgnoreCase(name)) {
			return col27();
		}
		if ($col28.equalsIgnoreCase(name)) {
			return col28();
		}
		if ($col29.equalsIgnoreCase(name)) {
			return col29();
		}
		if ($col30.equalsIgnoreCase(name)) {
			return col30();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($const_key.equalsIgnoreCase(name)) {
			return const_key();
		}
		if ($const_value.equalsIgnoreCase(name)) {
			return const_value();
		}
		if ($const_name.equalsIgnoreCase(name)) {
			return const_name();
		}
		if ($const_rmrks.equalsIgnoreCase(name)) {
			return const_rmrks();
		}
		if ($col1.equalsIgnoreCase(name)) {
			return col1();
		}
		if ($col2.equalsIgnoreCase(name)) {
			return col2();
		}
		if ($col3.equalsIgnoreCase(name)) {
			return col3();
		}
		if ($col4.equalsIgnoreCase(name)) {
			return col4();
		}
		if ($col5.equalsIgnoreCase(name)) {
			return col5();
		}
		if ($col6.equalsIgnoreCase(name)) {
			return col6();
		}
		if ($col7.equalsIgnoreCase(name)) {
			return col7();
		}
		if ($col8.equalsIgnoreCase(name)) {
			return col8();
		}
		if ($col9.equalsIgnoreCase(name)) {
			return col9();
		}
		if ($col10.equalsIgnoreCase(name)) {
			return col10();
		}
		if ($col11.equalsIgnoreCase(name)) {
			return col11();
		}
		if ($col12.equalsIgnoreCase(name)) {
			return col12();
		}
		if ($col13.equalsIgnoreCase(name)) {
			return col13();
		}
		if ($col14.equalsIgnoreCase(name)) {
			return col14();
		}
		if ($col15.equalsIgnoreCase(name)) {
			return col15();
		}
		if ($col16.equalsIgnoreCase(name)) {
			return col16();
		}
		if ($col17.equalsIgnoreCase(name)) {
			return col17();
		}
		if ($col18.equalsIgnoreCase(name)) {
			return col18();
		}
		if ($col19.equalsIgnoreCase(name)) {
			return col19();
		}
		if ($col20.equalsIgnoreCase(name)) {
			return col20();
		}
		if ($col21.equalsIgnoreCase(name)) {
			return col21();
		}
		if ($col22.equalsIgnoreCase(name)) {
			return col22();
		}
		if ($col23.equalsIgnoreCase(name)) {
			return col23();
		}
		if ($col24.equalsIgnoreCase(name)) {
			return col24();
		}
		if ($col25.equalsIgnoreCase(name)) {
			return col25();
		}
		if ($col26.equalsIgnoreCase(name)) {
			return col26();
		}
		if ($col27.equalsIgnoreCase(name)) {
			return col27();
		}
		if ($col28.equalsIgnoreCase(name)) {
			return col28();
		}
		if ($col29.equalsIgnoreCase(name)) {
			return col29();
		}
		if ($col30.equalsIgnoreCase(name)) {
			return col30();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($const_key.equalsIgnoreCase(name)) {
			const_key(value);
			return;
		}
		if ($const_value.equalsIgnoreCase(name)) {
			const_value(value);
			return;
		}
		if ($const_name.equalsIgnoreCase(name)) {
			const_name(value);
			return;
		}
		if ($const_rmrks.equalsIgnoreCase(name)) {
			const_rmrks(value);
			return;
		}
		if ($col1.equalsIgnoreCase(name)) {
			col1(value);
			return;
		}
		if ($col2.equalsIgnoreCase(name)) {
			col2(value);
			return;
		}
		if ($col3.equalsIgnoreCase(name)) {
			col3(value);
			return;
		}
		if ($col4.equalsIgnoreCase(name)) {
			col4(value);
			return;
		}
		if ($col5.equalsIgnoreCase(name)) {
			col5(value);
			return;
		}
		if ($col6.equalsIgnoreCase(name)) {
			col6(value);
			return;
		}
		if ($col7.equalsIgnoreCase(name)) {
			col7(value);
			return;
		}
		if ($col8.equalsIgnoreCase(name)) {
			col8(value);
			return;
		}
		if ($col9.equalsIgnoreCase(name)) {
			col9(value);
			return;
		}
		if ($col10.equalsIgnoreCase(name)) {
			col10(value);
			return;
		}
		if ($col11.equalsIgnoreCase(name)) {
			col11(value);
			return;
		}
		if ($col12.equalsIgnoreCase(name)) {
			col12(value);
			return;
		}
		if ($col13.equalsIgnoreCase(name)) {
			col13(value);
			return;
		}
		if ($col14.equalsIgnoreCase(name)) {
			col14(value);
			return;
		}
		if ($col15.equalsIgnoreCase(name)) {
			col15(value);
			return;
		}
		if ($col16.equalsIgnoreCase(name)) {
			col16(value);
			return;
		}
		if ($col17.equalsIgnoreCase(name)) {
			col17(value);
			return;
		}
		if ($col18.equalsIgnoreCase(name)) {
			col18(value);
			return;
		}
		if ($col19.equalsIgnoreCase(name)) {
			col19(value);
			return;
		}
		if ($col20.equalsIgnoreCase(name)) {
			col20(value);
			return;
		}
		if ($col21.equalsIgnoreCase(name)) {
			col21(value);
			return;
		}
		if ($col22.equalsIgnoreCase(name)) {
			col22(value);
			return;
		}
		if ($col23.equalsIgnoreCase(name)) {
			col23(value);
			return;
		}
		if ($col24.equalsIgnoreCase(name)) {
			col24(value);
			return;
		}
		if ($col25.equalsIgnoreCase(name)) {
			col25(value);
			return;
		}
		if ($col26.equalsIgnoreCase(name)) {
			col26(value);
			return;
		}
		if ($col27.equalsIgnoreCase(name)) {
			col27(value);
			return;
		}
		if ($col28.equalsIgnoreCase(name)) {
			col28(value);
			return;
		}
		if ($col29.equalsIgnoreCase(name)) {
			col29(value);
			return;
		}
		if ($col30.equalsIgnoreCase(name)) {
			col30(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($const_key.equalsIgnoreCase(name)) {
			const_key(value);
			return;
		}
		if ($const_value.equalsIgnoreCase(name)) {
			const_value(value);
			return;
		}
		if ($const_name.equalsIgnoreCase(name)) {
			const_name(value);
			return;
		}
		if ($const_rmrks.equalsIgnoreCase(name)) {
			const_rmrks(value);
			return;
		}
		if ($col1.equalsIgnoreCase(name)) {
			col1(value);
			return;
		}
		if ($col2.equalsIgnoreCase(name)) {
			col2(value);
			return;
		}
		if ($col3.equalsIgnoreCase(name)) {
			col3(value);
			return;
		}
		if ($col4.equalsIgnoreCase(name)) {
			col4(value);
			return;
		}
		if ($col5.equalsIgnoreCase(name)) {
			col5(value);
			return;
		}
		if ($col6.equalsIgnoreCase(name)) {
			col6(value);
			return;
		}
		if ($col7.equalsIgnoreCase(name)) {
			col7(value);
			return;
		}
		if ($col8.equalsIgnoreCase(name)) {
			col8(value);
			return;
		}
		if ($col9.equalsIgnoreCase(name)) {
			col9(value);
			return;
		}
		if ($col10.equalsIgnoreCase(name)) {
			col10(value);
			return;
		}
		if ($col11.equalsIgnoreCase(name)) {
			col11(value);
			return;
		}
		if ($col12.equalsIgnoreCase(name)) {
			col12(value);
			return;
		}
		if ($col13.equalsIgnoreCase(name)) {
			col13(value);
			return;
		}
		if ($col14.equalsIgnoreCase(name)) {
			col14(value);
			return;
		}
		if ($col15.equalsIgnoreCase(name)) {
			col15(value);
			return;
		}
		if ($col16.equalsIgnoreCase(name)) {
			col16(value);
			return;
		}
		if ($col17.equalsIgnoreCase(name)) {
			col17(value);
			return;
		}
		if ($col18.equalsIgnoreCase(name)) {
			col18(value);
			return;
		}
		if ($col19.equalsIgnoreCase(name)) {
			col19(value);
			return;
		}
		if ($col20.equalsIgnoreCase(name)) {
			col20(value);
			return;
		}
		if ($col21.equalsIgnoreCase(name)) {
			col21(value);
			return;
		}
		if ($col22.equalsIgnoreCase(name)) {
			col22(value);
			return;
		}
		if ($col23.equalsIgnoreCase(name)) {
			col23(value);
			return;
		}
		if ($col24.equalsIgnoreCase(name)) {
			col24(value);
			return;
		}
		if ($col25.equalsIgnoreCase(name)) {
			col25(value);
			return;
		}
		if ($col26.equalsIgnoreCase(name)) {
			col26(value);
			return;
		}
		if ($col27.equalsIgnoreCase(name)) {
			col27(value);
			return;
		}
		if ($col28.equalsIgnoreCase(name)) {
			col28(value);
			return;
		}
		if ($col29.equalsIgnoreCase(name)) {
			col29(value);
			return;
		}
		if ($col30.equalsIgnoreCase(name)) {
			col30(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

