package mcframe.serverMGBD.MGBDL0020;

import mcframe.commonCore.container.MCGroupByPolicy;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCConstList;

/**
 * ブロック"Dtl"コンテナListクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 *
 * @see mcframe.serverMGBD.MGBDL0020.DtlR_MC_A_A
 */
@SuppressWarnings({"all"})
abstract class DtlL_MC_A<E extends DtlR> extends MCConstList<E> {

	/**
	 * コンストラクタです。
	 */
	protected DtlL_MC_A(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected DtlL_MC_A(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public DtlL<E> clone() {
		return (DtlL<E>) super.clone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public DtlL<E> shallowClone() {
		return (DtlL<E>) super.shallowClone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public DtlL<E> createInstance() {
		return (DtlL<E>) super.createInstance();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public DtlL<E> groupBy(String... names) {
		return (DtlL<E>) super.groupBy(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public DtlL<E> groupBy(MCGroupByPolicy policy) {
		return (DtlL<E>) super.groupBy(policy);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public DtlL<E>[] groupList(String... names) {
		return (DtlL<E>[]) super.groupList(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public DtlL<E> statusChangedList() {
		return (DtlL<E>) super.statusChangedList();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public DtlL<E> subList(int fromIndex, int toIndex) {
		return (DtlL<E>) super.subList(fromIndex, toIndex);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public DtlL<E> subList(MCIndexKey idxkey, Comparable... vals) {
		return (DtlL<E>) super.subList(idxkey, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public DtlL<E> subList(MCRow.Status... status) {
		return (DtlL<E>) super.subList(status);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public DtlL<E> subList(String key, Comparable val) {
		return (DtlL<E>) super.subList(key, val);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public DtlL<E> subList(String[] keys, Comparable[] vals) {
		return (DtlL<E>) super.subList(keys, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public DtlL<E> subList(MCRowMatcher<E> matcher) {
		return (DtlL<E>) super.subList(matcher);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public DtlL<E> subList(MCRowMatcher<E> matcher, MCIndexKey serial) {
		return (DtlL<E>) super.subList(matcher, serial);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public DtlL<E> subList(String[] cols, MCRow valrow) {
		return (DtlL<E>) super.subList(cols, valrow);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public DtlL<E> subList(String[] owncols, MCRow valrow, String[] valcols) {
		return (DtlL<E>) super.subList(owncols, valrow, valcols);
	}
}