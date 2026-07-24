package mcframe.serverMSBG.MSBGL0020;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
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
 * ブロック"Srch01_DtlSlsSub"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_DtlSlsSubR_MC_A extends MCConstRow {

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public static final String $inc_tax_amt = "inc_tax_amt";
	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public static final String $ar_trd_grp_typ = "ar_trd_grp_typ";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public static final String $bill_d_no = "bill_d_no";
	/**
	 * Billing date 請求年月日.<p>
	 *
	 */
	public static final String $schd_bill_dt = "schd_bill_dt";
	/**
	 * Row number 行番号.<p>
	 *
	 */
	public static final String $row_num = "row_num";


	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta inc_tax_amt_META = createCommonMeta($inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ar_trd_grp_typ_META = createCommonMeta($ar_trd_grp_typ, mcframe.commonMA.meta.MA_META.AR_TRD_GRP_TYP);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta bill_d_no_META = createCommonMeta($bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta schd_bill_dt_META = createCommonMeta($schd_bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta row_num_META = createCommonMeta($row_num, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<Srch01_DtlSlsSubR> constMetas = new ConstMetaList<Srch01_DtlSlsSubR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			trd_cur_amt_META,
			trd_cur_tax_amt_META,
			inc_tax_amt_META,
			ar_trd_grp_typ_META,
			trd_ptn_typ_META,
			bill_d_no_META,
			schd_bill_dt_META,
			row_num_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
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
	protected Srch01_DtlSlsSubR_MC_A(ConstMetaList<? extends Srch01_DtlSlsSubR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlSlsSubR clone() {
		return (Srch01_DtlSlsSubR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlSlsSubR createInstance() {
		return (Srch01_DtlSlsSubR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlSlsSubR getValues(String... names) {
		return (Srch01_DtlSlsSubR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 0, $trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 0, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 0, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 0, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 0, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 0, $trd_cur_amt, value);
	}


	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 1, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 1, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 1, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 1, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 1, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 1, $trd_cur_tax_amt, value);
	}


	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public MCNumber inc_tax_amt() {
		return getConstNumber(offset + 2, $inc_tax_amt);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 2, $inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void inc_tax_amt(int value) {
		setConstNumber(offset + 2, $inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void inc_tax_amt(long value) {
		setConstNumber(offset + 2, $inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void inc_tax_amt(float value) {
		setConstNumber(offset + 2, $inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void inc_tax_amt(double value) {
		setConstNumber(offset + 2, $inc_tax_amt, value);
	}


	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public String ar_trd_grp_typ() {
		return getConstString(offset + 3, $ar_trd_grp_typ);
	}

	/**
	 * AR transaction group type 債権取引グループ区分.<p>
	 *
	 */
	public void ar_trd_grp_typ(String value) {
		setConstString(offset + 3, $ar_trd_grp_typ, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 4, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 4, $trd_ptn_typ, value);
	}


	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public String bill_d_no() {
		return getConstString(offset + 5, $bill_d_no);
	}

	/**
	 * Billing details No. 請求明細ＮＯ.<p>
	 *
	 */
	public void bill_d_no(String value) {
		setConstString(offset + 5, $bill_d_no, value);
	}


	/**
	 * Billing date 請求年月日.<p>
	 *
	 */
	public MCDate schd_bill_dt() {
		return getConstDate(offset + 6, $schd_bill_dt);
	}

	/**
	 * Billing date 請求年月日.<p>
	 *
	 */
	public void schd_bill_dt(MCDate value) {
		setConstDate(offset + 6, $schd_bill_dt, value);
	}


	/**
	 * Row number 行番号.<p>
	 *
	 */
	public MCNumber row_num() {
		return getConstNumber(offset + 7, $row_num);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_num(MCNumber value) {
		setConstNumber(offset + 7, $row_num, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_num(int value) {
		setConstNumber(offset + 7, $row_num, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_num(long value) {
		setConstNumber(offset + 7, $row_num, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_num(float value) {
		setConstNumber(offset + 7, $row_num, value);
	}

	/**
	 * Row number 行番号.<p>
	 *
	 */
	public void row_num(double value) {
		setConstNumber(offset + 7, $row_num, value);
	}


	public String getString(String name) {
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			return inc_tax_amt();
		}
		if ($row_num.equalsIgnoreCase(name)) {
			return row_num();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($schd_bill_dt.equalsIgnoreCase(name)) {
			return schd_bill_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			return ar_trd_grp_typ();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			return inc_tax_amt();
		}
		if ($row_num.equalsIgnoreCase(name)) {
			return row_num();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($schd_bill_dt.equalsIgnoreCase(name)) {
			return schd_bill_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($schd_bill_dt.equalsIgnoreCase(name)) {
			schd_bill_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ar_trd_grp_typ.equalsIgnoreCase(name)) {
			ar_trd_grp_typ(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($inc_tax_amt.equalsIgnoreCase(name)) {
			inc_tax_amt(value);
			return;
		}
		if ($row_num.equalsIgnoreCase(name)) {
			row_num(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($schd_bill_dt.equalsIgnoreCase(name)) {
			schd_bill_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

