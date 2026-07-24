package mcframe.serverMSBD.MSBDL5170;

import mcframe.commonCore.container.MCGroupByPolicy;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCConstList;

/**
 * ブロック"Io"コンテナListクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 *
 * @see mcframe.serverMSBD.MSBDL5170.IoR_MC_A_A
 */
@SuppressWarnings({"all"})
abstract class IoL_MC_A<E extends IoR> extends MCConstList<E> {

	/**
	 * コンストラクタです。
	 */
	protected IoL_MC_A(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected IoL_MC_A(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public IoL<E> clone() {
		return (IoL<E>) super.clone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public IoL<E> shallowClone() {
		return (IoL<E>) super.shallowClone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public IoL<E> createInstance() {
		return (IoL<E>) super.createInstance();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public IoL<E> groupBy(String... names) {
		return (IoL<E>) super.groupBy(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public IoL<E> groupBy(MCGroupByPolicy policy) {
		return (IoL<E>) super.groupBy(policy);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public IoL<E>[] groupList(String... names) {
		return (IoL<E>[]) super.groupList(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public IoL<E> statusChangedList() {
		return (IoL<E>) super.statusChangedList();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public IoL<E> subList(int fromIndex, int toIndex) {
		return (IoL<E>) super.subList(fromIndex, toIndex);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public IoL<E> subList(MCIndexKey idxkey, Comparable... vals) {
		return (IoL<E>) super.subList(idxkey, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public IoL<E> subList(MCRow.Status... status) {
		return (IoL<E>) super.subList(status);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public IoL<E> subList(String key, Comparable val) {
		return (IoL<E>) super.subList(key, val);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public IoL<E> subList(String[] keys, Comparable[] vals) {
		return (IoL<E>) super.subList(keys, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public IoL<E> subList(MCRowMatcher<E> matcher) {
		return (IoL<E>) super.subList(matcher);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public IoL<E> subList(MCRowMatcher<E> matcher, MCIndexKey serial) {
		return (IoL<E>) super.subList(matcher, serial);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public IoL<E> subList(String[] cols, MCRow valrow) {
		return (IoL<E>) super.subList(cols, valrow);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public IoL<E> subList(String[] owncols, MCRow valrow, String[] valcols) {
		return (IoL<E>) super.subList(owncols, valrow, valcols);
	}
}