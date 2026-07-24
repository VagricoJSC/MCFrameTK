package mcframe.clientMBBE.MBBEP0040;

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
 * ブロック"Back"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BackR_MC_A extends MCConstRow {

	/**
	 * Date 1 日付１.<p>
	 *
	 */
	public static final String $dt1 = "dt1";
	/**
	 * Date 2 日付２.<p>
	 *
	 */
	public static final String $dt2 = "dt2";
	/**
	 * Date 3 日付３.<p>
	 *
	 */
	public static final String $dt3 = "dt3";
	/**
	 * Date 4 日付４.<p>
	 *
	 */
	public static final String $dt4 = "dt4";
	/**
	 * Date 5 日付５.<p>
	 *
	 */
	public static final String $dt5 = "dt5";
	/**
	 * Date 6 日付６.<p>
	 *
	 */
	public static final String $dt6 = "dt6";
	/**
	 * Date 7 日付７.<p>
	 *
	 */
	public static final String $dt7 = "dt7";
	/**
	 * Date 8 日付８.<p>
	 *
	 */
	public static final String $dt8 = "dt8";
	/**
	 * Date 9 日付９.<p>
	 *
	 */
	public static final String $dt9 = "dt9";
	/**
	 * Date 10 日付１０.<p>
	 *
	 */
	public static final String $dt10 = "dt10";
	/**
	 * String 1 文字列１.<p>
	 *
	 */
	public static final String $str1 = "str1";
	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public static final String $str2 = "str2";
	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public static final String $str3 = "str3";
	/**
	 * String 4 文字列４.<p>
	 *
	 */
	public static final String $str4 = "str4";
	/**
	 * String 5 文字列５.<p>
	 *
	 */
	public static final String $str5 = "str5";
	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public static final String $num1 = "num1";
	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public static final String $num2 = "num2";
	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public static final String $num3 = "num3";
	/**
	 * Numerical 4 数値４.<p>
	 *
	 */
	public static final String $num4 = "num4";
	/**
	 * Numerical 5 数値５.<p>
	 *
	 */
	public static final String $num5 = "num5";
	/**
	 * Flg. 1 フラグ１.<p>
	 *
	 */
	public static final String $flg1 = "flg1";
	/**
	 * Flg. 2 フラグ２.<p>
	 *
	 */
	public static final String $flg2 = "flg2";
	/**
	 * Flg. 3 フラグ３.<p>
	 *
	 */
	public static final String $flg3 = "flg3";
	/**
	 * Flg. 4 フラグ４.<p>
	 *
	 */
	public static final String $flg4 = "flg4";
	/**
	 * Flg. 5 フラグ５.<p>
	 *
	 */
	public static final String $flg5 = "flg5";


	public static final MCMeta dt1_META = createCommonMeta($dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt2_META = createCommonMeta($dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt3_META = createCommonMeta($dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt4_META = createCommonMeta($dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt5_META = createCommonMeta($dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt6_META = createCommonMeta($dt6, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt7_META = createCommonMeta($dt7, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt8_META = createCommonMeta($dt8, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt9_META = createCommonMeta($dt9, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dt10_META = createCommonMeta($dt10, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta str1_META = createStringMeta($str1, 20);
	public static final MCMeta str2_META = createStringMeta($str2, 20);
	public static final MCMeta str3_META = createStringMeta($str3, 20);
	public static final MCMeta str4_META = createStringMeta($str4, 20);
	public static final MCMeta str5_META = createStringMeta($str5, 20);
	public static final MCMeta num1_META = createCommonMeta($num1, mcframe.commonMA.meta.MA_META.NUM);
	public static final MCMeta num2_META = createCommonMeta($num2, mcframe.commonMA.meta.MA_META.NUM);
	public static final MCMeta num3_META = createCommonMeta($num3, mcframe.commonMA.meta.MA_META.NUM);
	public static final MCMeta num4_META = createCommonMeta($num4, mcframe.commonMA.meta.MA_META.NUM);
	public static final MCMeta num5_META = createCommonMeta($num5, mcframe.commonMA.meta.MA_META.NUM);
	public static final MCMeta flg1_META = createCommonMeta($flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg2_META = createCommonMeta($flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg3_META = createCommonMeta($flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg4_META = createCommonMeta($flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg5_META = createCommonMeta($flg5, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<BackR> constMetas = new ConstMetaList<BackR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dt1_META,
			dt2_META,
			dt3_META,
			dt4_META,
			dt5_META,
			dt6_META,
			dt7_META,
			dt8_META,
			dt9_META,
			dt10_META,
			str1_META,
			str2_META,
			str3_META,
			str4_META,
			str5_META,
			num1_META,
			num2_META,
			num3_META,
			num4_META,
			num5_META,
			flg1_META,
			flg2_META,
			flg3_META,
			flg4_META,
			flg5_META
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
	protected BackR_MC_A(ConstMetaList<? extends BackR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BackR clone() {
		return (BackR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BackR createInstance() {
		return (BackR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BackR getValues(String... names) {
		return (BackR) super.getValues(names);
	}



	/**
	 * Date 1 日付１.<p>
	 *
	 */
	public MCDate dt1() {
		return getConstDate(offset + 0, $dt1);
	}

	/**
	 * Date 1 日付１.<p>
	 *
	 */
	public void dt1(MCDate value) {
		setConstDate(offset + 0, $dt1, value);
	}


	/**
	 * Date 2 日付２.<p>
	 *
	 */
	public MCDate dt2() {
		return getConstDate(offset + 1, $dt2);
	}

	/**
	 * Date 2 日付２.<p>
	 *
	 */
	public void dt2(MCDate value) {
		setConstDate(offset + 1, $dt2, value);
	}


	/**
	 * Date 3 日付３.<p>
	 *
	 */
	public MCDate dt3() {
		return getConstDate(offset + 2, $dt3);
	}

	/**
	 * Date 3 日付３.<p>
	 *
	 */
	public void dt3(MCDate value) {
		setConstDate(offset + 2, $dt3, value);
	}


	/**
	 * Date 4 日付４.<p>
	 *
	 */
	public MCDate dt4() {
		return getConstDate(offset + 3, $dt4);
	}

	/**
	 * Date 4 日付４.<p>
	 *
	 */
	public void dt4(MCDate value) {
		setConstDate(offset + 3, $dt4, value);
	}


	/**
	 * Date 5 日付５.<p>
	 *
	 */
	public MCDate dt5() {
		return getConstDate(offset + 4, $dt5);
	}

	/**
	 * Date 5 日付５.<p>
	 *
	 */
	public void dt5(MCDate value) {
		setConstDate(offset + 4, $dt5, value);
	}


	/**
	 * Date 6 日付６.<p>
	 *
	 */
	public MCDate dt6() {
		return getConstDate(offset + 5, $dt6);
	}

	/**
	 * Date 6 日付６.<p>
	 *
	 */
	public void dt6(MCDate value) {
		setConstDate(offset + 5, $dt6, value);
	}


	/**
	 * Date 7 日付７.<p>
	 *
	 */
	public MCDate dt7() {
		return getConstDate(offset + 6, $dt7);
	}

	/**
	 * Date 7 日付７.<p>
	 *
	 */
	public void dt7(MCDate value) {
		setConstDate(offset + 6, $dt7, value);
	}


	/**
	 * Date 8 日付８.<p>
	 *
	 */
	public MCDate dt8() {
		return getConstDate(offset + 7, $dt8);
	}

	/**
	 * Date 8 日付８.<p>
	 *
	 */
	public void dt8(MCDate value) {
		setConstDate(offset + 7, $dt8, value);
	}


	/**
	 * Date 9 日付９.<p>
	 *
	 */
	public MCDate dt9() {
		return getConstDate(offset + 8, $dt9);
	}

	/**
	 * Date 9 日付９.<p>
	 *
	 */
	public void dt9(MCDate value) {
		setConstDate(offset + 8, $dt9, value);
	}


	/**
	 * Date 10 日付１０.<p>
	 *
	 */
	public MCDate dt10() {
		return getConstDate(offset + 9, $dt10);
	}

	/**
	 * Date 10 日付１０.<p>
	 *
	 */
	public void dt10(MCDate value) {
		setConstDate(offset + 9, $dt10, value);
	}


	/**
	 * String 1 文字列１.<p>
	 *
	 */
	public String str1() {
		return getConstString(offset + 10, $str1);
	}

	/**
	 * String 1 文字列１.<p>
	 *
	 */
	public void str1(String value) {
		setConstString(offset + 10, $str1, value);
	}


	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public String str2() {
		return getConstString(offset + 11, $str2);
	}

	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public void str2(String value) {
		setConstString(offset + 11, $str2, value);
	}


	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public String str3() {
		return getConstString(offset + 12, $str3);
	}

	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public void str3(String value) {
		setConstString(offset + 12, $str3, value);
	}


	/**
	 * String 4 文字列４.<p>
	 *
	 */
	public String str4() {
		return getConstString(offset + 13, $str4);
	}

	/**
	 * String 4 文字列４.<p>
	 *
	 */
	public void str4(String value) {
		setConstString(offset + 13, $str4, value);
	}


	/**
	 * String 5 文字列５.<p>
	 *
	 */
	public String str5() {
		return getConstString(offset + 14, $str5);
	}

	/**
	 * String 5 文字列５.<p>
	 *
	 */
	public void str5(String value) {
		setConstString(offset + 14, $str5, value);
	}


	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public MCNumber num1() {
		return getConstNumber(offset + 15, $num1);
	}

	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public void num1(MCNumber value) {
		setConstNumber(offset + 15, $num1, value);
	}

	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public void num1(int value) {
		setConstNumber(offset + 15, $num1, value);
	}

	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public void num1(long value) {
		setConstNumber(offset + 15, $num1, value);
	}

	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public void num1(float value) {
		setConstNumber(offset + 15, $num1, value);
	}

	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public void num1(double value) {
		setConstNumber(offset + 15, $num1, value);
	}


	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public MCNumber num2() {
		return getConstNumber(offset + 16, $num2);
	}

	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public void num2(MCNumber value) {
		setConstNumber(offset + 16, $num2, value);
	}

	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public void num2(int value) {
		setConstNumber(offset + 16, $num2, value);
	}

	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public void num2(long value) {
		setConstNumber(offset + 16, $num2, value);
	}

	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public void num2(float value) {
		setConstNumber(offset + 16, $num2, value);
	}

	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public void num2(double value) {
		setConstNumber(offset + 16, $num2, value);
	}


	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public MCNumber num3() {
		return getConstNumber(offset + 17, $num3);
	}

	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public void num3(MCNumber value) {
		setConstNumber(offset + 17, $num3, value);
	}

	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public void num3(int value) {
		setConstNumber(offset + 17, $num3, value);
	}

	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public void num3(long value) {
		setConstNumber(offset + 17, $num3, value);
	}

	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public void num3(float value) {
		setConstNumber(offset + 17, $num3, value);
	}

	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public void num3(double value) {
		setConstNumber(offset + 17, $num3, value);
	}


	/**
	 * Numerical 4 数値４.<p>
	 *
	 */
	public MCNumber num4() {
		return getConstNumber(offset + 18, $num4);
	}

	/**
	 * Numerical 4 数値４.<p>
	 *
	 */
	public void num4(MCNumber value) {
		setConstNumber(offset + 18, $num4, value);
	}

	/**
	 * Numerical 4 数値４.<p>
	 *
	 */
	public void num4(int value) {
		setConstNumber(offset + 18, $num4, value);
	}

	/**
	 * Numerical 4 数値４.<p>
	 *
	 */
	public void num4(long value) {
		setConstNumber(offset + 18, $num4, value);
	}

	/**
	 * Numerical 4 数値４.<p>
	 *
	 */
	public void num4(float value) {
		setConstNumber(offset + 18, $num4, value);
	}

	/**
	 * Numerical 4 数値４.<p>
	 *
	 */
	public void num4(double value) {
		setConstNumber(offset + 18, $num4, value);
	}


	/**
	 * Numerical 5 数値５.<p>
	 *
	 */
	public MCNumber num5() {
		return getConstNumber(offset + 19, $num5);
	}

	/**
	 * Numerical 5 数値５.<p>
	 *
	 */
	public void num5(MCNumber value) {
		setConstNumber(offset + 19, $num5, value);
	}

	/**
	 * Numerical 5 数値５.<p>
	 *
	 */
	public void num5(int value) {
		setConstNumber(offset + 19, $num5, value);
	}

	/**
	 * Numerical 5 数値５.<p>
	 *
	 */
	public void num5(long value) {
		setConstNumber(offset + 19, $num5, value);
	}

	/**
	 * Numerical 5 数値５.<p>
	 *
	 */
	public void num5(float value) {
		setConstNumber(offset + 19, $num5, value);
	}

	/**
	 * Numerical 5 数値５.<p>
	 *
	 */
	public void num5(double value) {
		setConstNumber(offset + 19, $num5, value);
	}


	/**
	 * Flg. 1 フラグ１.<p>
	 *
	 */
	public boolean flg1() {
		return getConstBoolean(offset + 20, $flg1);
	}

	/**
	 * Flg. 1 フラグ１.<p>
	 *
	 */
	public void flg1(boolean value) {
		setConstBoolean(offset + 20, $flg1, value);
	}


	/**
	 * Flg. 2 フラグ２.<p>
	 *
	 */
	public boolean flg2() {
		return getConstBoolean(offset + 21, $flg2);
	}

	/**
	 * Flg. 2 フラグ２.<p>
	 *
	 */
	public void flg2(boolean value) {
		setConstBoolean(offset + 21, $flg2, value);
	}


	/**
	 * Flg. 3 フラグ３.<p>
	 *
	 */
	public boolean flg3() {
		return getConstBoolean(offset + 22, $flg3);
	}

	/**
	 * Flg. 3 フラグ３.<p>
	 *
	 */
	public void flg3(boolean value) {
		setConstBoolean(offset + 22, $flg3, value);
	}


	/**
	 * Flg. 4 フラグ４.<p>
	 *
	 */
	public boolean flg4() {
		return getConstBoolean(offset + 23, $flg4);
	}

	/**
	 * Flg. 4 フラグ４.<p>
	 *
	 */
	public void flg4(boolean value) {
		setConstBoolean(offset + 23, $flg4, value);
	}


	/**
	 * Flg. 5 フラグ５.<p>
	 *
	 */
	public boolean flg5() {
		return getConstBoolean(offset + 24, $flg5);
	}

	/**
	 * Flg. 5 フラグ５.<p>
	 *
	 */
	public void flg5(boolean value) {
		setConstBoolean(offset + 24, $flg5, value);
	}


	public String getString(String name) {
		if ($str1.equalsIgnoreCase(name)) {
			return str1();
		}
		if ($str2.equalsIgnoreCase(name)) {
			return str2();
		}
		if ($str3.equalsIgnoreCase(name)) {
			return str3();
		}
		if ($str4.equalsIgnoreCase(name)) {
			return str4();
		}
		if ($str5.equalsIgnoreCase(name)) {
			return str5();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($num1.equalsIgnoreCase(name)) {
			return num1();
		}
		if ($num2.equalsIgnoreCase(name)) {
			return num2();
		}
		if ($num3.equalsIgnoreCase(name)) {
			return num3();
		}
		if ($num4.equalsIgnoreCase(name)) {
			return num4();
		}
		if ($num5.equalsIgnoreCase(name)) {
			return num5();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dt1.equalsIgnoreCase(name)) {
			return dt1();
		}
		if ($dt2.equalsIgnoreCase(name)) {
			return dt2();
		}
		if ($dt3.equalsIgnoreCase(name)) {
			return dt3();
		}
		if ($dt4.equalsIgnoreCase(name)) {
			return dt4();
		}
		if ($dt5.equalsIgnoreCase(name)) {
			return dt5();
		}
		if ($dt6.equalsIgnoreCase(name)) {
			return dt6();
		}
		if ($dt7.equalsIgnoreCase(name)) {
			return dt7();
		}
		if ($dt8.equalsIgnoreCase(name)) {
			return dt8();
		}
		if ($dt9.equalsIgnoreCase(name)) {
			return dt9();
		}
		if ($dt10.equalsIgnoreCase(name)) {
			return dt10();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($flg1.equalsIgnoreCase(name)) {
			return flg1();
		}
		if ($flg2.equalsIgnoreCase(name)) {
			return flg2();
		}
		if ($flg3.equalsIgnoreCase(name)) {
			return flg3();
		}
		if ($flg4.equalsIgnoreCase(name)) {
			return flg4();
		}
		if ($flg5.equalsIgnoreCase(name)) {
			return flg5();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($str1.equalsIgnoreCase(name)) {
			return str1();
		}
		if ($str2.equalsIgnoreCase(name)) {
			return str2();
		}
		if ($str3.equalsIgnoreCase(name)) {
			return str3();
		}
		if ($str4.equalsIgnoreCase(name)) {
			return str4();
		}
		if ($str5.equalsIgnoreCase(name)) {
			return str5();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($num1.equalsIgnoreCase(name)) {
			return num1();
		}
		if ($num2.equalsIgnoreCase(name)) {
			return num2();
		}
		if ($num3.equalsIgnoreCase(name)) {
			return num3();
		}
		if ($num4.equalsIgnoreCase(name)) {
			return num4();
		}
		if ($num5.equalsIgnoreCase(name)) {
			return num5();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt1.equalsIgnoreCase(name)) {
			return dt1();
		}
		if ($dt2.equalsIgnoreCase(name)) {
			return dt2();
		}
		if ($dt3.equalsIgnoreCase(name)) {
			return dt3();
		}
		if ($dt4.equalsIgnoreCase(name)) {
			return dt4();
		}
		if ($dt5.equalsIgnoreCase(name)) {
			return dt5();
		}
		if ($dt6.equalsIgnoreCase(name)) {
			return dt6();
		}
		if ($dt7.equalsIgnoreCase(name)) {
			return dt7();
		}
		if ($dt8.equalsIgnoreCase(name)) {
			return dt8();
		}
		if ($dt9.equalsIgnoreCase(name)) {
			return dt9();
		}
		if ($dt10.equalsIgnoreCase(name)) {
			return dt10();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($flg1.equalsIgnoreCase(name)) {
			return flg1();
		}
		if ($flg2.equalsIgnoreCase(name)) {
			return flg2();
		}
		if ($flg3.equalsIgnoreCase(name)) {
			return flg3();
		}
		if ($flg4.equalsIgnoreCase(name)) {
			return flg4();
		}
		if ($flg5.equalsIgnoreCase(name)) {
			return flg5();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($str1.equalsIgnoreCase(name)) {
			str1(value);
			return;
		}
		if ($str2.equalsIgnoreCase(name)) {
			str2(value);
			return;
		}
		if ($str3.equalsIgnoreCase(name)) {
			str3(value);
			return;
		}
		if ($str4.equalsIgnoreCase(name)) {
			str4(value);
			return;
		}
		if ($str5.equalsIgnoreCase(name)) {
			str5(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt1.equalsIgnoreCase(name)) {
			dt1(value);
			return;
		}
		if ($dt2.equalsIgnoreCase(name)) {
			dt2(value);
			return;
		}
		if ($dt3.equalsIgnoreCase(name)) {
			dt3(value);
			return;
		}
		if ($dt4.equalsIgnoreCase(name)) {
			dt4(value);
			return;
		}
		if ($dt5.equalsIgnoreCase(name)) {
			dt5(value);
			return;
		}
		if ($dt6.equalsIgnoreCase(name)) {
			dt6(value);
			return;
		}
		if ($dt7.equalsIgnoreCase(name)) {
			dt7(value);
			return;
		}
		if ($dt8.equalsIgnoreCase(name)) {
			dt8(value);
			return;
		}
		if ($dt9.equalsIgnoreCase(name)) {
			dt9(value);
			return;
		}
		if ($dt10.equalsIgnoreCase(name)) {
			dt10(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($flg1.equalsIgnoreCase(name)) {
			flg1(value);
			return;
		}
		if ($flg2.equalsIgnoreCase(name)) {
			flg2(value);
			return;
		}
		if ($flg3.equalsIgnoreCase(name)) {
			flg3(value);
			return;
		}
		if ($flg4.equalsIgnoreCase(name)) {
			flg4(value);
			return;
		}
		if ($flg5.equalsIgnoreCase(name)) {
			flg5(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($str1.equalsIgnoreCase(name)) {
			str1(value);
			return;
		}
		if ($str2.equalsIgnoreCase(name)) {
			str2(value);
			return;
		}
		if ($str3.equalsIgnoreCase(name)) {
			str3(value);
			return;
		}
		if ($str4.equalsIgnoreCase(name)) {
			str4(value);
			return;
		}
		if ($str5.equalsIgnoreCase(name)) {
			str5(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($num4.equalsIgnoreCase(name)) {
			num4(value);
			return;
		}
		if ($num5.equalsIgnoreCase(name)) {
			num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt1.equalsIgnoreCase(name)) {
			dt1(value);
			return;
		}
		if ($dt2.equalsIgnoreCase(name)) {
			dt2(value);
			return;
		}
		if ($dt3.equalsIgnoreCase(name)) {
			dt3(value);
			return;
		}
		if ($dt4.equalsIgnoreCase(name)) {
			dt4(value);
			return;
		}
		if ($dt5.equalsIgnoreCase(name)) {
			dt5(value);
			return;
		}
		if ($dt6.equalsIgnoreCase(name)) {
			dt6(value);
			return;
		}
		if ($dt7.equalsIgnoreCase(name)) {
			dt7(value);
			return;
		}
		if ($dt8.equalsIgnoreCase(name)) {
			dt8(value);
			return;
		}
		if ($dt9.equalsIgnoreCase(name)) {
			dt9(value);
			return;
		}
		if ($dt10.equalsIgnoreCase(name)) {
			dt10(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($flg1.equalsIgnoreCase(name)) {
			flg1(value);
			return;
		}
		if ($flg2.equalsIgnoreCase(name)) {
			flg2(value);
			return;
		}
		if ($flg3.equalsIgnoreCase(name)) {
			flg3(value);
			return;
		}
		if ($flg4.equalsIgnoreCase(name)) {
			flg4(value);
			return;
		}
		if ($flg5.equalsIgnoreCase(name)) {
			flg5(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

