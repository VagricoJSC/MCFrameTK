package mcframe.commonMGBG.MGBGR5080;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 *  .<p>
	 *
	 * 年月
	 */
	public static final String $ym = "ym";
	/**
	 *  .<p>
	 *
	 * データレベル
	 */
	public static final String $datalevel = "datalevel";
	/**
	 *  .<p>
	 *
	 * 部門コード
	 */
	public static final String $deptcode = "deptcode";
	/**
	 *  .<p>
	 *
	 * 科目
	 */
	public static final String $accode = "accode";
	/**
	 *  .<p>
	 *
	 * 補助科目
	 */
	public static final String $subcode = "subcode";
	/**
	 *  .<p>
	 *
	 * 通貨コード
	 */
	public static final String $currcode = "currcode";
	/**
	 *  .<p>
	 *
	 * 借方基準金額
	 */
	public static final String $amountdrsc = "amountdrsc";
	/**
	 *  .<p>
	 *
	 * 借方税金額
	 */
	public static final String $taxdrsc = "taxdrsc";
	/**
	 *  .<p>
	 *
	 * 貸方基準金額
	 */
	public static final String $amountcrsc = "amountcrsc";
	/**
	 *  .<p>
	 *
	 * 貸方税基準金額
	 */
	public static final String $taxcrsc = "taxcrsc";


	public static final MCMeta ym_META = createDateMeta($ym);
	public static final MCMeta datalevel_META = createNumberMeta($datalevel, 1, 0, false);
	public static final MCMeta deptcode_META = createStringMeta($deptcode, 20);
	public static final MCMeta accode_META = createStringMeta($accode, 20);
	public static final MCMeta subcode_META = createStringMeta($subcode, 20);
	public static final MCMeta currcode_META = createStringMeta($currcode, 20);
	public static final MCMeta amountdrsc_META = createNumberMeta($amountdrsc, 17, 2, false);
	public static final MCMeta taxdrsc_META = createNumberMeta($taxdrsc, 17, 2, false);
	public static final MCMeta amountcrsc_META = createNumberMeta($amountcrsc, 17, 2, false);
	public static final MCMeta taxcrsc_META = createNumberMeta($taxcrsc, 17, 2, false);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ym_META,
			datalevel_META,
			deptcode_META,
			accode_META,
			subcode_META,
			currcode_META,
			amountdrsc_META,
			taxdrsc_META,
			amountcrsc_META,
			taxcrsc_META
		},
		new String[][]{
			{
			},
			{
			}
		}
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
	 * コンストラクタです。
	 */
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  .<p>
	 *
	 * 年月
	 */
	public MCDate ym() {
		return getConstDate(offset + 0, $ym);
	}

	/**
	 *  .<p>
	 *
	 * 年月
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 0, $ym, value);
	}


	/**
	 *  .<p>
	 *
	 * データレベル
	 */
	public MCNumber datalevel() {
		return getConstNumber(offset + 1, $datalevel);
	}

	/**
	 *  .<p>
	 *
	 * データレベル
	 */
	public void datalevel(MCNumber value) {
		setConstNumber(offset + 1, $datalevel, value);
	}

	/**
	 *  .<p>
	 *
	 * データレベル
	 */
	public void datalevel(int value) {
		setConstNumber(offset + 1, $datalevel, value);
	}

	/**
	 *  .<p>
	 *
	 * データレベル
	 */
	public void datalevel(long value) {
		setConstNumber(offset + 1, $datalevel, value);
	}

	/**
	 *  .<p>
	 *
	 * データレベル
	 */
	public void datalevel(float value) {
		setConstNumber(offset + 1, $datalevel, value);
	}

	/**
	 *  .<p>
	 *
	 * データレベル
	 */
	public void datalevel(double value) {
		setConstNumber(offset + 1, $datalevel, value);
	}


	/**
	 *  .<p>
	 *
	 * 部門コード
	 */
	public String deptcode() {
		return getConstString(offset + 2, $deptcode);
	}

	/**
	 *  .<p>
	 *
	 * 部門コード
	 */
	public void deptcode(String value) {
		setConstString(offset + 2, $deptcode, value);
	}


	/**
	 *  .<p>
	 *
	 * 科目
	 */
	public String accode() {
		return getConstString(offset + 3, $accode);
	}

	/**
	 *  .<p>
	 *
	 * 科目
	 */
	public void accode(String value) {
		setConstString(offset + 3, $accode, value);
	}


	/**
	 *  .<p>
	 *
	 * 補助科目
	 */
	public String subcode() {
		return getConstString(offset + 4, $subcode);
	}

	/**
	 *  .<p>
	 *
	 * 補助科目
	 */
	public void subcode(String value) {
		setConstString(offset + 4, $subcode, value);
	}


	/**
	 *  .<p>
	 *
	 * 通貨コード
	 */
	public String currcode() {
		return getConstString(offset + 5, $currcode);
	}

	/**
	 *  .<p>
	 *
	 * 通貨コード
	 */
	public void currcode(String value) {
		setConstString(offset + 5, $currcode, value);
	}


	/**
	 *  .<p>
	 *
	 * 借方基準金額
	 */
	public MCNumber amountdrsc() {
		return getConstNumber(offset + 6, $amountdrsc);
	}

	/**
	 *  .<p>
	 *
	 * 借方基準金額
	 */
	public void amountdrsc(MCNumber value) {
		setConstNumber(offset + 6, $amountdrsc, value);
	}

	/**
	 *  .<p>
	 *
	 * 借方基準金額
	 */
	public void amountdrsc(int value) {
		setConstNumber(offset + 6, $amountdrsc, value);
	}

	/**
	 *  .<p>
	 *
	 * 借方基準金額
	 */
	public void amountdrsc(long value) {
		setConstNumber(offset + 6, $amountdrsc, value);
	}

	/**
	 *  .<p>
	 *
	 * 借方基準金額
	 */
	public void amountdrsc(float value) {
		setConstNumber(offset + 6, $amountdrsc, value);
	}

	/**
	 *  .<p>
	 *
	 * 借方基準金額
	 */
	public void amountdrsc(double value) {
		setConstNumber(offset + 6, $amountdrsc, value);
	}


	/**
	 *  .<p>
	 *
	 * 借方税金額
	 */
	public MCNumber taxdrsc() {
		return getConstNumber(offset + 7, $taxdrsc);
	}

	/**
	 *  .<p>
	 *
	 * 借方税金額
	 */
	public void taxdrsc(MCNumber value) {
		setConstNumber(offset + 7, $taxdrsc, value);
	}

	/**
	 *  .<p>
	 *
	 * 借方税金額
	 */
	public void taxdrsc(int value) {
		setConstNumber(offset + 7, $taxdrsc, value);
	}

	/**
	 *  .<p>
	 *
	 * 借方税金額
	 */
	public void taxdrsc(long value) {
		setConstNumber(offset + 7, $taxdrsc, value);
	}

	/**
	 *  .<p>
	 *
	 * 借方税金額
	 */
	public void taxdrsc(float value) {
		setConstNumber(offset + 7, $taxdrsc, value);
	}

	/**
	 *  .<p>
	 *
	 * 借方税金額
	 */
	public void taxdrsc(double value) {
		setConstNumber(offset + 7, $taxdrsc, value);
	}


	/**
	 *  .<p>
	 *
	 * 貸方基準金額
	 */
	public MCNumber amountcrsc() {
		return getConstNumber(offset + 8, $amountcrsc);
	}

	/**
	 *  .<p>
	 *
	 * 貸方基準金額
	 */
	public void amountcrsc(MCNumber value) {
		setConstNumber(offset + 8, $amountcrsc, value);
	}

	/**
	 *  .<p>
	 *
	 * 貸方基準金額
	 */
	public void amountcrsc(int value) {
		setConstNumber(offset + 8, $amountcrsc, value);
	}

	/**
	 *  .<p>
	 *
	 * 貸方基準金額
	 */
	public void amountcrsc(long value) {
		setConstNumber(offset + 8, $amountcrsc, value);
	}

	/**
	 *  .<p>
	 *
	 * 貸方基準金額
	 */
	public void amountcrsc(float value) {
		setConstNumber(offset + 8, $amountcrsc, value);
	}

	/**
	 *  .<p>
	 *
	 * 貸方基準金額
	 */
	public void amountcrsc(double value) {
		setConstNumber(offset + 8, $amountcrsc, value);
	}


	/**
	 *  .<p>
	 *
	 * 貸方税基準金額
	 */
	public MCNumber taxcrsc() {
		return getConstNumber(offset + 9, $taxcrsc);
	}

	/**
	 *  .<p>
	 *
	 * 貸方税基準金額
	 */
	public void taxcrsc(MCNumber value) {
		setConstNumber(offset + 9, $taxcrsc, value);
	}

	/**
	 *  .<p>
	 *
	 * 貸方税基準金額
	 */
	public void taxcrsc(int value) {
		setConstNumber(offset + 9, $taxcrsc, value);
	}

	/**
	 *  .<p>
	 *
	 * 貸方税基準金額
	 */
	public void taxcrsc(long value) {
		setConstNumber(offset + 9, $taxcrsc, value);
	}

	/**
	 *  .<p>
	 *
	 * 貸方税基準金額
	 */
	public void taxcrsc(float value) {
		setConstNumber(offset + 9, $taxcrsc, value);
	}

	/**
	 *  .<p>
	 *
	 * 貸方税基準金額
	 */
	public void taxcrsc(double value) {
		setConstNumber(offset + 9, $taxcrsc, value);
	}


	public String getString(String name) {
		if ($deptcode.equalsIgnoreCase(name)) {
			return deptcode();
		}
		if ($accode.equalsIgnoreCase(name)) {
			return accode();
		}
		if ($subcode.equalsIgnoreCase(name)) {
			return subcode();
		}
		if ($currcode.equalsIgnoreCase(name)) {
			return currcode();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($datalevel.equalsIgnoreCase(name)) {
			return datalevel();
		}
		if ($amountdrsc.equalsIgnoreCase(name)) {
			return amountdrsc();
		}
		if ($taxdrsc.equalsIgnoreCase(name)) {
			return taxdrsc();
		}
		if ($amountcrsc.equalsIgnoreCase(name)) {
			return amountcrsc();
		}
		if ($taxcrsc.equalsIgnoreCase(name)) {
			return taxcrsc();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($deptcode.equalsIgnoreCase(name)) {
			return deptcode();
		}
		if ($accode.equalsIgnoreCase(name)) {
			return accode();
		}
		if ($subcode.equalsIgnoreCase(name)) {
			return subcode();
		}
		if ($currcode.equalsIgnoreCase(name)) {
			return currcode();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($datalevel.equalsIgnoreCase(name)) {
			return datalevel();
		}
		if ($amountdrsc.equalsIgnoreCase(name)) {
			return amountdrsc();
		}
		if ($taxdrsc.equalsIgnoreCase(name)) {
			return taxdrsc();
		}
		if ($amountcrsc.equalsIgnoreCase(name)) {
			return amountcrsc();
		}
		if ($taxcrsc.equalsIgnoreCase(name)) {
			return taxcrsc();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($deptcode.equalsIgnoreCase(name)) {
			deptcode(value);
			return;
		}
		if ($accode.equalsIgnoreCase(name)) {
			accode(value);
			return;
		}
		if ($subcode.equalsIgnoreCase(name)) {
			subcode(value);
			return;
		}
		if ($currcode.equalsIgnoreCase(name)) {
			currcode(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($amountdrsc.equalsIgnoreCase(name)) {
			amountdrsc(value);
			return;
		}
		if ($taxdrsc.equalsIgnoreCase(name)) {
			taxdrsc(value);
			return;
		}
		if ($amountcrsc.equalsIgnoreCase(name)) {
			amountcrsc(value);
			return;
		}
		if ($taxcrsc.equalsIgnoreCase(name)) {
			taxcrsc(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($amountdrsc.equalsIgnoreCase(name)) {
			amountdrsc(value);
			return;
		}
		if ($taxdrsc.equalsIgnoreCase(name)) {
			taxdrsc(value);
			return;
		}
		if ($amountcrsc.equalsIgnoreCase(name)) {
			amountcrsc(value);
			return;
		}
		if ($taxcrsc.equalsIgnoreCase(name)) {
			taxcrsc(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($amountdrsc.equalsIgnoreCase(name)) {
			amountdrsc(value);
			return;
		}
		if ($taxdrsc.equalsIgnoreCase(name)) {
			taxdrsc(value);
			return;
		}
		if ($amountcrsc.equalsIgnoreCase(name)) {
			amountcrsc(value);
			return;
		}
		if ($taxcrsc.equalsIgnoreCase(name)) {
			taxcrsc(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($amountdrsc.equalsIgnoreCase(name)) {
			amountdrsc(value);
			return;
		}
		if ($taxdrsc.equalsIgnoreCase(name)) {
			taxdrsc(value);
			return;
		}
		if ($amountcrsc.equalsIgnoreCase(name)) {
			amountcrsc(value);
			return;
		}
		if ($taxcrsc.equalsIgnoreCase(name)) {
			taxcrsc(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($amountdrsc.equalsIgnoreCase(name)) {
			amountdrsc(value);
			return;
		}
		if ($taxdrsc.equalsIgnoreCase(name)) {
			taxdrsc(value);
			return;
		}
		if ($amountcrsc.equalsIgnoreCase(name)) {
			amountcrsc(value);
			return;
		}
		if ($taxcrsc.equalsIgnoreCase(name)) {
			taxcrsc(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($deptcode.equalsIgnoreCase(name)) {
			deptcode(value);
			return;
		}
		if ($accode.equalsIgnoreCase(name)) {
			accode(value);
			return;
		}
		if ($subcode.equalsIgnoreCase(name)) {
			subcode(value);
			return;
		}
		if ($currcode.equalsIgnoreCase(name)) {
			currcode(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($amountdrsc.equalsIgnoreCase(name)) {
			amountdrsc(value);
			return;
		}
		if ($taxdrsc.equalsIgnoreCase(name)) {
			taxdrsc(value);
			return;
		}
		if ($amountcrsc.equalsIgnoreCase(name)) {
			amountcrsc(value);
			return;
		}
		if ($taxcrsc.equalsIgnoreCase(name)) {
			taxcrsc(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($amountdrsc.equalsIgnoreCase(name)) {
			amountdrsc(value);
			return;
		}
		if ($taxdrsc.equalsIgnoreCase(name)) {
			taxdrsc(value);
			return;
		}
		if ($amountcrsc.equalsIgnoreCase(name)) {
			amountcrsc(value);
			return;
		}
		if ($taxcrsc.equalsIgnoreCase(name)) {
			taxcrsc(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($amountdrsc.equalsIgnoreCase(name)) {
			amountdrsc(value);
			return;
		}
		if ($taxdrsc.equalsIgnoreCase(name)) {
			taxdrsc(value);
			return;
		}
		if ($amountcrsc.equalsIgnoreCase(name)) {
			amountcrsc(value);
			return;
		}
		if ($taxcrsc.equalsIgnoreCase(name)) {
			taxcrsc(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($amountdrsc.equalsIgnoreCase(name)) {
			amountdrsc(value);
			return;
		}
		if ($taxdrsc.equalsIgnoreCase(name)) {
			taxdrsc(value);
			return;
		}
		if ($amountcrsc.equalsIgnoreCase(name)) {
			amountcrsc(value);
			return;
		}
		if ($taxcrsc.equalsIgnoreCase(name)) {
			taxcrsc(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($datalevel.equalsIgnoreCase(name)) {
			datalevel(value);
			return;
		}
		if ($amountdrsc.equalsIgnoreCase(name)) {
			amountdrsc(value);
			return;
		}
		if ($taxdrsc.equalsIgnoreCase(name)) {
			taxdrsc(value);
			return;
		}
		if ($amountcrsc.equalsIgnoreCase(name)) {
			amountcrsc(value);
			return;
		}
		if ($taxcrsc.equalsIgnoreCase(name)) {
			taxcrsc(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

