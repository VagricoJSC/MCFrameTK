package mcframe.serverMGBD.MGBDL5450;

import mcframe.commonCore.container.MCGroupByPolicy;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCConstList;

/**
 * ブロック"CopyItmSls_Upd01_Dtl"コンテナListクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 *
 * @see mcframe.serverMGBD.MGBDL5450.CopyItmSls_Upd01_DtlR_MC_A_A
 */
@SuppressWarnings({"all"})
abstract class CopyItmSls_Upd01_DtlL_MC_A<E extends CopyItmSls_Upd01_DtlR> extends MCConstList<E> {

	/**
	 * コンストラクタです。
	 */
	protected CopyItmSls_Upd01_DtlL_MC_A(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected CopyItmSls_Upd01_DtlL_MC_A(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmSls_Upd01_DtlL<E> clone() {
		return (CopyItmSls_Upd01_DtlL<E>) super.clone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmSls_Upd01_DtlL<E> shallowClone() {
		return (CopyItmSls_Upd01_DtlL<E>) super.shallowClone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmSls_Upd01_DtlL<E> createInstance() {
		return (CopyItmSls_Upd01_DtlL<E>) super.createInstance();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmSls_Upd01_DtlL<E> groupBy(String... names) {
		return (CopyItmSls_Upd01_DtlL<E>) super.groupBy(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmSls_Upd01_DtlL<E> groupBy(MCGroupByPolicy policy) {
		return (CopyItmSls_Upd01_DtlL<E>) super.groupBy(policy);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmSls_Upd01_DtlL<E>[] groupList(String... names) {
		return (CopyItmSls_Upd01_DtlL<E>[]) super.groupList(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmSls_Upd01_DtlL<E> statusChangedList() {
		return (CopyItmSls_Upd01_DtlL<E>) super.statusChangedList();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmSls_Upd01_DtlL<E> subList(int fromIndex, int toIndex) {
		return (CopyItmSls_Upd01_DtlL<E>) super.subList(fromIndex, toIndex);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmSls_Upd01_DtlL<E> subList(MCIndexKey idxkey, Comparable... vals) {
		return (CopyItmSls_Upd01_DtlL<E>) super.subList(idxkey, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmSls_Upd01_DtlL<E> subList(MCRow.Status... status) {
		return (CopyItmSls_Upd01_DtlL<E>) super.subList(status);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmSls_Upd01_DtlL<E> subList(String key, Comparable val) {
		return (CopyItmSls_Upd01_DtlL<E>) super.subList(key, val);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmSls_Upd01_DtlL<E> subList(String[] keys, Comparable[] vals) {
		return (CopyItmSls_Upd01_DtlL<E>) super.subList(keys, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmSls_Upd01_DtlL<E> subList(MCRowMatcher<E> matcher) {
		return (CopyItmSls_Upd01_DtlL<E>) super.subList(matcher);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmSls_Upd01_DtlL<E> subList(MCRowMatcher<E> matcher, MCIndexKey serial) {
		return (CopyItmSls_Upd01_DtlL<E>) super.subList(matcher, serial);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmSls_Upd01_DtlL<E> subList(String[] cols, MCRow valrow) {
		return (CopyItmSls_Upd01_DtlL<E>) super.subList(cols, valrow);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmSls_Upd01_DtlL<E> subList(String[] owncols, MCRow valrow, String[] valcols) {
		return (CopyItmSls_Upd01_DtlL<E>) super.subList(owncols, valrow, valcols);
	}
}