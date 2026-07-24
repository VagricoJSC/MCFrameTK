package mcframe.serverMGBD.MGBDL0030;

import mcframe.commonCore.container.MCGroupByPolicy;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCConstList;

/**
 * ブロック"Srch02_Dtl"コンテナListクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 *
 * @see mcframe.serverMGBD.MGBDL0030.Srch02_DtlR_MC_A_A
 */
@SuppressWarnings({"all"})
abstract class Srch02_DtlL_MC_A<E extends Srch02_DtlR> extends MCConstList<E> {

	/**
	 * コンストラクタです。
	 */
	protected Srch02_DtlL_MC_A(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected Srch02_DtlL_MC_A(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch02_DtlL<E> clone() {
		return (Srch02_DtlL<E>) super.clone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch02_DtlL<E> shallowClone() {
		return (Srch02_DtlL<E>) super.shallowClone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch02_DtlL<E> createInstance() {
		return (Srch02_DtlL<E>) super.createInstance();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch02_DtlL<E> groupBy(String... names) {
		return (Srch02_DtlL<E>) super.groupBy(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch02_DtlL<E> groupBy(MCGroupByPolicy policy) {
		return (Srch02_DtlL<E>) super.groupBy(policy);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch02_DtlL<E>[] groupList(String... names) {
		return (Srch02_DtlL<E>[]) super.groupList(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch02_DtlL<E> statusChangedList() {
		return (Srch02_DtlL<E>) super.statusChangedList();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch02_DtlL<E> subList(int fromIndex, int toIndex) {
		return (Srch02_DtlL<E>) super.subList(fromIndex, toIndex);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch02_DtlL<E> subList(MCIndexKey idxkey, Comparable... vals) {
		return (Srch02_DtlL<E>) super.subList(idxkey, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch02_DtlL<E> subList(MCRow.Status... status) {
		return (Srch02_DtlL<E>) super.subList(status);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch02_DtlL<E> subList(String key, Comparable val) {
		return (Srch02_DtlL<E>) super.subList(key, val);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch02_DtlL<E> subList(String[] keys, Comparable[] vals) {
		return (Srch02_DtlL<E>) super.subList(keys, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch02_DtlL<E> subList(MCRowMatcher<E> matcher) {
		return (Srch02_DtlL<E>) super.subList(matcher);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch02_DtlL<E> subList(MCRowMatcher<E> matcher, MCIndexKey serial) {
		return (Srch02_DtlL<E>) super.subList(matcher, serial);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch02_DtlL<E> subList(String[] cols, MCRow valrow) {
		return (Srch02_DtlL<E>) super.subList(cols, valrow);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch02_DtlL<E> subList(String[] owncols, MCRow valrow, String[] valcols) {
		return (Srch02_DtlL<E>) super.subList(owncols, valrow, valcols);
	}
}