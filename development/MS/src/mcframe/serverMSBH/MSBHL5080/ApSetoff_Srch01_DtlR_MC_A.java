package mcframe.serverMSBH.MSBHL5080;

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
 * ブロック"ApSetoff_Srch01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ApSetoff_Srch01_DtlR_MC_A extends MCConstRow {

	/**
	 * AR balance 売掛金残高.<p>
	 *
	 */
	public static final String $ar_bal_amt = "ar_bal_amt";
	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public static final String $end_bal = "end_bal";
	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public static final String $not_proc_bal = "not_proc_bal";
	/**
	 * Payment schedule amount 支払予定金額.<p>
	 *
	 */
	public static final String $schd_amt = "schd_amt";


	public static final MCMeta ar_bal_amt_META = createCommonMeta($ar_bal_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta end_bal_META = createCommonMeta($end_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta not_proc_bal_META = createCommonMeta($not_proc_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_amt_META = createCommonMeta($schd_amt, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<ApSetoff_Srch01_DtlR> constMetas = new ConstMetaList<ApSetoff_Srch01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ar_bal_amt_META,
			end_bal_META,
			not_proc_bal_META,
			schd_amt_META
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
	protected ApSetoff_Srch01_DtlR_MC_A(ConstMetaList<? extends ApSetoff_Srch01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ApSetoff_Srch01_DtlR clone() {
		return (ApSetoff_Srch01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ApSetoff_Srch01_DtlR createInstance() {
		return (ApSetoff_Srch01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ApSetoff_Srch01_DtlR getValues(String... names) {
		return (ApSetoff_Srch01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * AR balance 売掛金残高.<p>
	 *
	 */
	public MCNumber ar_bal_amt() {
		return getConstNumber(offset + 0, $ar_bal_amt);
	}

	/**
	 * AR balance 売掛金残高.<p>
	 *
	 */
	public void ar_bal_amt(MCNumber value) {
		setConstNumber(offset + 0, $ar_bal_amt, value);
	}

	/**
	 * AR balance 売掛金残高.<p>
	 *
	 */
	public void ar_bal_amt(int value) {
		setConstNumber(offset + 0, $ar_bal_amt, value);
	}

	/**
	 * AR balance 売掛金残高.<p>
	 *
	 */
	public void ar_bal_amt(long value) {
		setConstNumber(offset + 0, $ar_bal_amt, value);
	}

	/**
	 * AR balance 売掛金残高.<p>
	 *
	 */
	public void ar_bal_amt(float value) {
		setConstNumber(offset + 0, $ar_bal_amt, value);
	}

	/**
	 * AR balance 売掛金残高.<p>
	 *
	 */
	public void ar_bal_amt(double value) {
		setConstNumber(offset + 0, $ar_bal_amt, value);
	}


	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public MCNumber end_bal() {
		return getConstNumber(offset + 1, $end_bal);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(MCNumber value) {
		setConstNumber(offset + 1, $end_bal, value);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(int value) {
		setConstNumber(offset + 1, $end_bal, value);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(long value) {
		setConstNumber(offset + 1, $end_bal, value);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(float value) {
		setConstNumber(offset + 1, $end_bal, value);
	}

	/**
	 * Balance (Current month) 当月残高.<p>
	 *
	 */
	public void end_bal(double value) {
		setConstNumber(offset + 1, $end_bal, value);
	}


	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public MCNumber not_proc_bal() {
		return getConstNumber(offset + 2, $not_proc_bal);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(MCNumber value) {
		setConstNumber(offset + 2, $not_proc_bal, value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(int value) {
		setConstNumber(offset + 2, $not_proc_bal, value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(long value) {
		setConstNumber(offset + 2, $not_proc_bal, value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(float value) {
		setConstNumber(offset + 2, $not_proc_bal, value);
	}

	/**
	 * Unreconciled balance 未処理残高.<p>
	 *
	 */
	public void not_proc_bal(double value) {
		setConstNumber(offset + 2, $not_proc_bal, value);
	}


	/**
	 * Payment schedule amount 支払予定金額.<p>
	 *
	 */
	public MCNumber schd_amt() {
		return getConstNumber(offset + 3, $schd_amt);
	}

	/**
	 * Payment schedule amount 支払予定金額.<p>
	 *
	 */
	public void schd_amt(MCNumber value) {
		setConstNumber(offset + 3, $schd_amt, value);
	}

	/**
	 * Payment schedule amount 支払予定金額.<p>
	 *
	 */
	public void schd_amt(int value) {
		setConstNumber(offset + 3, $schd_amt, value);
	}

	/**
	 * Payment schedule amount 支払予定金額.<p>
	 *
	 */
	public void schd_amt(long value) {
		setConstNumber(offset + 3, $schd_amt, value);
	}

	/**
	 * Payment schedule amount 支払予定金額.<p>
	 *
	 */
	public void schd_amt(float value) {
		setConstNumber(offset + 3, $schd_amt, value);
	}

	/**
	 * Payment schedule amount 支払予定金額.<p>
	 *
	 */
	public void schd_amt(double value) {
		setConstNumber(offset + 3, $schd_amt, value);
	}


	public MCNumber getNumber(String name) {
		if ($ar_bal_amt.equalsIgnoreCase(name)) {
			return ar_bal_amt();
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			return end_bal();
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			return not_proc_bal();
		}
		if ($schd_amt.equalsIgnoreCase(name)) {
			return schd_amt();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($ar_bal_amt.equalsIgnoreCase(name)) {
			return ar_bal_amt();
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			return end_bal();
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			return not_proc_bal();
		}
		if ($schd_amt.equalsIgnoreCase(name)) {
			return schd_amt();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($ar_bal_amt.equalsIgnoreCase(name)) {
			ar_bal_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($schd_amt.equalsIgnoreCase(name)) {
			schd_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($ar_bal_amt.equalsIgnoreCase(name)) {
			ar_bal_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($schd_amt.equalsIgnoreCase(name)) {
			schd_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($ar_bal_amt.equalsIgnoreCase(name)) {
			ar_bal_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($schd_amt.equalsIgnoreCase(name)) {
			schd_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($ar_bal_amt.equalsIgnoreCase(name)) {
			ar_bal_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($schd_amt.equalsIgnoreCase(name)) {
			schd_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($ar_bal_amt.equalsIgnoreCase(name)) {
			ar_bal_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($schd_amt.equalsIgnoreCase(name)) {
			schd_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($ar_bal_amt.equalsIgnoreCase(name)) {
			ar_bal_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($schd_amt.equalsIgnoreCase(name)) {
			schd_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($ar_bal_amt.equalsIgnoreCase(name)) {
			ar_bal_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($schd_amt.equalsIgnoreCase(name)) {
			schd_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($ar_bal_amt.equalsIgnoreCase(name)) {
			ar_bal_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($schd_amt.equalsIgnoreCase(name)) {
			schd_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($ar_bal_amt.equalsIgnoreCase(name)) {
			ar_bal_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($schd_amt.equalsIgnoreCase(name)) {
			schd_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($ar_bal_amt.equalsIgnoreCase(name)) {
			ar_bal_amt(value);
			return;
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($schd_amt.equalsIgnoreCase(name)) {
			schd_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

