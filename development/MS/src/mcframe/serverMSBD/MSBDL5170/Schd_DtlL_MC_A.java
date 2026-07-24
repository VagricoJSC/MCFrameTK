package mcframe.serverMSBD.MSBDL5170;

import mcframe.commonCore.container.MCGroupByPolicy;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCConstList;

/**
 * ブロック"Schd_Dtl"コンテナListクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 *
 * @see mcframe.serverMSBD.MSBDL5170.Schd_DtlR_MC_A_A
 */
@SuppressWarnings({"all"})
abstract class Schd_DtlL_MC_A<E extends Schd_DtlR> extends MCConstList<E> {

	/**
	 * コンストラクタです。
	 */
	protected Schd_DtlL_MC_A(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected Schd_DtlL_MC_A(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_DtlL<E> clone() {
		return (Schd_DtlL<E>) super.clone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_DtlL<E> shallowClone() {
		return (Schd_DtlL<E>) super.shallowClone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_DtlL<E> createInstance() {
		return (Schd_DtlL<E>) super.createInstance();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_DtlL<E> groupBy(String... names) {
		return (Schd_DtlL<E>) super.groupBy(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_DtlL<E> groupBy(MCGroupByPolicy policy) {
		return (Schd_DtlL<E>) super.groupBy(policy);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_DtlL<E>[] groupList(String... names) {
		return (Schd_DtlL<E>[]) super.groupList(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_DtlL<E> statusChangedList() {
		return (Schd_DtlL<E>) super.statusChangedList();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_DtlL<E> subList(int fromIndex, int toIndex) {
		return (Schd_DtlL<E>) super.subList(fromIndex, toIndex);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_DtlL<E> subList(MCIndexKey idxkey, Comparable... vals) {
		return (Schd_DtlL<E>) super.subList(idxkey, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_DtlL<E> subList(MCRow.Status... status) {
		return (Schd_DtlL<E>) super.subList(status);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_DtlL<E> subList(String key, Comparable val) {
		return (Schd_DtlL<E>) super.subList(key, val);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_DtlL<E> subList(String[] keys, Comparable[] vals) {
		return (Schd_DtlL<E>) super.subList(keys, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_DtlL<E> subList(MCRowMatcher<E> matcher) {
		return (Schd_DtlL<E>) super.subList(matcher);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_DtlL<E> subList(MCRowMatcher<E> matcher, MCIndexKey serial) {
		return (Schd_DtlL<E>) super.subList(matcher, serial);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_DtlL<E> subList(String[] cols, MCRow valrow) {
		return (Schd_DtlL<E>) super.subList(cols, valrow);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_DtlL<E> subList(String[] owncols, MCRow valrow, String[] valcols) {
		return (Schd_DtlL<E>) super.subList(owncols, valrow, valcols);
	}
}