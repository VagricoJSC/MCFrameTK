package mcframe.clientMABC.MABCP0560;

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
 * ブロック"Wrk4Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Wrk4HdrR_MC_A extends MCConstRow {

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public static final String $bill_cl_day1 = "bill_cl_day1";
	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public static final String $bill_cl_day2 = "bill_cl_day2";
	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public static final String $bill_cl_day3 = "bill_cl_day3";
	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public static final String $bill_cl_day4 = "bill_cl_day4";
	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public static final String $bill_cl_day5 = "bill_cl_day5";


	public static final MCMeta bill_cl_day1_META = createCommonMeta($bill_cl_day1, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day2_META = createCommonMeta($bill_cl_day2, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day3_META = createCommonMeta($bill_cl_day3, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day4_META = createCommonMeta($bill_cl_day4, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta bill_cl_day5_META = createCommonMeta($bill_cl_day5, mcframe.commonMA.meta.MA_META.CL_DAY);

	protected static final ConstMetaList<Wrk4HdrR> constMetas = new ConstMetaList<Wrk4HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bill_cl_day1_META,
			bill_cl_day2_META,
			bill_cl_day3_META,
			bill_cl_day4_META,
			bill_cl_day5_META
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

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
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
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
	protected Wrk4HdrR_MC_A(ConstMetaList<? extends Wrk4HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk4HdrR clone() {
		return (Wrk4HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk4HdrR createInstance() {
		return (Wrk4HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk4HdrR getValues(String... names) {
		return (Wrk4HdrR) super.getValues(names);
	}



	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public MCNumber bill_cl_day1() {
		return getConstNumber(offset + 0, $bill_cl_day1);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(MCNumber value) {
		setConstNumber(offset + 0, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(int value) {
		setConstNumber(offset + 0, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(long value) {
		setConstNumber(offset + 0, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(float value) {
		setConstNumber(offset + 0, $bill_cl_day1, value);
	}

	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public void bill_cl_day1(double value) {
		setConstNumber(offset + 0, $bill_cl_day1, value);
	}


	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public MCNumber bill_cl_day2() {
		return getConstNumber(offset + 1, $bill_cl_day2);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(MCNumber value) {
		setConstNumber(offset + 1, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(int value) {
		setConstNumber(offset + 1, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(long value) {
		setConstNumber(offset + 1, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(float value) {
		setConstNumber(offset + 1, $bill_cl_day2, value);
	}

	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public void bill_cl_day2(double value) {
		setConstNumber(offset + 1, $bill_cl_day2, value);
	}


	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public MCNumber bill_cl_day3() {
		return getConstNumber(offset + 2, $bill_cl_day3);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(MCNumber value) {
		setConstNumber(offset + 2, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(int value) {
		setConstNumber(offset + 2, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(long value) {
		setConstNumber(offset + 2, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(float value) {
		setConstNumber(offset + 2, $bill_cl_day3, value);
	}

	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public void bill_cl_day3(double value) {
		setConstNumber(offset + 2, $bill_cl_day3, value);
	}


	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public MCNumber bill_cl_day4() {
		return getConstNumber(offset + 3, $bill_cl_day4);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(MCNumber value) {
		setConstNumber(offset + 3, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(int value) {
		setConstNumber(offset + 3, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(long value) {
		setConstNumber(offset + 3, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(float value) {
		setConstNumber(offset + 3, $bill_cl_day4, value);
	}

	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public void bill_cl_day4(double value) {
		setConstNumber(offset + 3, $bill_cl_day4, value);
	}


	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public MCNumber bill_cl_day5() {
		return getConstNumber(offset + 4, $bill_cl_day5);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(MCNumber value) {
		setConstNumber(offset + 4, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(int value) {
		setConstNumber(offset + 4, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(long value) {
		setConstNumber(offset + 4, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(float value) {
		setConstNumber(offset + 4, $bill_cl_day5, value);
	}

	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public void bill_cl_day5(double value) {
		setConstNumber(offset + 4, $bill_cl_day5, value);
	}


	public MCNumber getNumber(String name) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			return bill_cl_day1();
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			return bill_cl_day2();
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			return bill_cl_day3();
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			return bill_cl_day4();
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			return bill_cl_day5();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			return bill_cl_day1();
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			return bill_cl_day2();
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			return bill_cl_day3();
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			return bill_cl_day4();
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			return bill_cl_day5();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($bill_cl_day1.equalsIgnoreCase(name)) {
			bill_cl_day1(value);
			return;
		}
		if ($bill_cl_day2.equalsIgnoreCase(name)) {
			bill_cl_day2(value);
			return;
		}
		if ($bill_cl_day3.equalsIgnoreCase(name)) {
			bill_cl_day3(value);
			return;
		}
		if ($bill_cl_day4.equalsIgnoreCase(name)) {
			bill_cl_day4(value);
			return;
		}
		if ($bill_cl_day5.equalsIgnoreCase(name)) {
			bill_cl_day5(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

