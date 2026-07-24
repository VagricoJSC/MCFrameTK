package mcframe.commonMSBH.MSBHR0020;

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
 * ブロック"PaySchdFtr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PaySchdFtrR_MC_A extends MCConstRow {

	/**
	 *  税込金額計.<p>
	 *
	 */
	public static final String $total_amt = "total_amt";
	/**
	 *  税込金額計文字列.<p>
	 *
	 */
	public static final String $s_total_amt = "s_total_amt";
	/**
	 *  手数料計.<p>
	 *
	 */
	public static final String $total_com_paid = "total_com_paid";
	/**
	 *  手数料計文字列.<p>
	 *
	 */
	public static final String $s_total_com_paid = "s_total_com_paid";
	/**
	 *  取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 *  取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";


	public static final MCMeta total_amt_META = createCommonMeta($total_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_total_amt_META = createStringMeta($s_total_amt);
	public static final MCMeta total_com_paid_META = createCommonMeta($total_com_paid, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_total_com_paid_META = createStringMeta($s_total_com_paid);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);

	protected static final ConstMetaList<PaySchdFtrR> constMetas = new ConstMetaList<PaySchdFtrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			total_amt_META,
			s_total_amt_META,
			total_com_paid_META,
			s_total_com_paid_META,
			trd_cur_cd_META,
			trd_cur_nm_META
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
	protected PaySchdFtrR_MC_A(ConstMetaList<? extends PaySchdFtrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchdFtrR clone() {
		return (PaySchdFtrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchdFtrR createInstance() {
		return (PaySchdFtrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PaySchdFtrR getValues(String... names) {
		return (PaySchdFtrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  税込金額計.<p>
	 *
	 */
	public MCNumber total_amt() {
		return getConstNumber(offset + 0, $total_amt);
	}

	/**
	 *  税込金額計.<p>
	 *
	 */
	public void total_amt(MCNumber value) {
		setConstNumber(offset + 0, $total_amt, value);
	}

	/**
	 *  税込金額計.<p>
	 *
	 */
	public void total_amt(int value) {
		setConstNumber(offset + 0, $total_amt, value);
	}

	/**
	 *  税込金額計.<p>
	 *
	 */
	public void total_amt(long value) {
		setConstNumber(offset + 0, $total_amt, value);
	}

	/**
	 *  税込金額計.<p>
	 *
	 */
	public void total_amt(float value) {
		setConstNumber(offset + 0, $total_amt, value);
	}

	/**
	 *  税込金額計.<p>
	 *
	 */
	public void total_amt(double value) {
		setConstNumber(offset + 0, $total_amt, value);
	}


	/**
	 *  税込金額計文字列.<p>
	 *
	 */
	public String s_total_amt() {
		return getConstString(offset + 1, $s_total_amt);
	}

	/**
	 *  税込金額計文字列.<p>
	 *
	 */
	public void s_total_amt(String value) {
		setConstString(offset + 1, $s_total_amt, value);
	}


	/**
	 *  手数料計.<p>
	 *
	 */
	public MCNumber total_com_paid() {
		return getConstNumber(offset + 2, $total_com_paid);
	}

	/**
	 *  手数料計.<p>
	 *
	 */
	public void total_com_paid(MCNumber value) {
		setConstNumber(offset + 2, $total_com_paid, value);
	}

	/**
	 *  手数料計.<p>
	 *
	 */
	public void total_com_paid(int value) {
		setConstNumber(offset + 2, $total_com_paid, value);
	}

	/**
	 *  手数料計.<p>
	 *
	 */
	public void total_com_paid(long value) {
		setConstNumber(offset + 2, $total_com_paid, value);
	}

	/**
	 *  手数料計.<p>
	 *
	 */
	public void total_com_paid(float value) {
		setConstNumber(offset + 2, $total_com_paid, value);
	}

	/**
	 *  手数料計.<p>
	 *
	 */
	public void total_com_paid(double value) {
		setConstNumber(offset + 2, $total_com_paid, value);
	}


	/**
	 *  手数料計文字列.<p>
	 *
	 */
	public String s_total_com_paid() {
		return getConstString(offset + 3, $s_total_com_paid);
	}

	/**
	 *  手数料計文字列.<p>
	 *
	 */
	public void s_total_com_paid(String value) {
		setConstString(offset + 3, $s_total_com_paid, value);
	}


	/**
	 *  取引通貨名.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 4, $trd_cur_cd);
	}

	/**
	 *  取引通貨名.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 4, $trd_cur_cd, value);
	}


	/**
	 *  取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 5, $trd_cur_nm);
	}

	/**
	 *  取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 5, $trd_cur_nm, value);
	}


	public String getString(String name) {
		if ($s_total_amt.equalsIgnoreCase(name)) {
			return s_total_amt();
		}
		if ($s_total_com_paid.equalsIgnoreCase(name)) {
			return s_total_com_paid();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($total_amt.equalsIgnoreCase(name)) {
			return total_amt();
		}
		if ($total_com_paid.equalsIgnoreCase(name)) {
			return total_com_paid();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($s_total_amt.equalsIgnoreCase(name)) {
			return s_total_amt();
		}
		if ($s_total_com_paid.equalsIgnoreCase(name)) {
			return s_total_com_paid();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($total_amt.equalsIgnoreCase(name)) {
			return total_amt();
		}
		if ($total_com_paid.equalsIgnoreCase(name)) {
			return total_com_paid();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($s_total_amt.equalsIgnoreCase(name)) {
			s_total_amt(value);
			return;
		}
		if ($s_total_com_paid.equalsIgnoreCase(name)) {
			s_total_com_paid(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_com_paid.equalsIgnoreCase(name)) {
			total_com_paid(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_com_paid.equalsIgnoreCase(name)) {
			total_com_paid(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_com_paid.equalsIgnoreCase(name)) {
			total_com_paid(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_com_paid.equalsIgnoreCase(name)) {
			total_com_paid(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_com_paid.equalsIgnoreCase(name)) {
			total_com_paid(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($s_total_amt.equalsIgnoreCase(name)) {
			s_total_amt(value);
			return;
		}
		if ($s_total_com_paid.equalsIgnoreCase(name)) {
			s_total_com_paid(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_com_paid.equalsIgnoreCase(name)) {
			total_com_paid(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_com_paid.equalsIgnoreCase(name)) {
			total_com_paid(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_com_paid.equalsIgnoreCase(name)) {
			total_com_paid(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_com_paid.equalsIgnoreCase(name)) {
			total_com_paid(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($total_amt.equalsIgnoreCase(name)) {
			total_amt(value);
			return;
		}
		if ($total_com_paid.equalsIgnoreCase(name)) {
			total_com_paid(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

