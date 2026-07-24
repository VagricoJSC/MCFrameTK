package mcframe.serverMSBD.MSBDL5170;

import mcframe.commonCore.container.MCGroupByPolicy;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCConstList;

/**
 * ブロック"Schd_Io"コンテナListクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 *
 * @see mcframe.serverMSBD.MSBDL5170.Schd_IoR_MC_A_A
 */
@SuppressWarnings({"all"})
abstract class Schd_IoL_MC_A<E extends Schd_IoR> extends MCConstList<E> {

	/**
	 * コンストラクタです。
	 */
	protected Schd_IoL_MC_A(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected Schd_IoL_MC_A(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_IoL<E> clone() {
		return (Schd_IoL<E>) super.clone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_IoL<E> shallowClone() {
		return (Schd_IoL<E>) super.shallowClone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_IoL<E> createInstance() {
		return (Schd_IoL<E>) super.createInstance();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_IoL<E> groupBy(String... names) {
		return (Schd_IoL<E>) super.groupBy(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_IoL<E> groupBy(MCGroupByPolicy policy) {
		return (Schd_IoL<E>) super.groupBy(policy);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_IoL<E>[] groupList(String... names) {
		return (Schd_IoL<E>[]) super.groupList(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_IoL<E> statusChangedList() {
		return (Schd_IoL<E>) super.statusChangedList();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_IoL<E> subList(int fromIndex, int toIndex) {
		return (Schd_IoL<E>) super.subList(fromIndex, toIndex);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_IoL<E> subList(MCIndexKey idxkey, Comparable... vals) {
		return (Schd_IoL<E>) super.subList(idxkey, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_IoL<E> subList(MCRow.Status... status) {
		return (Schd_IoL<E>) super.subList(status);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_IoL<E> subList(String key, Comparable val) {
		return (Schd_IoL<E>) super.subList(key, val);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_IoL<E> subList(String[] keys, Comparable[] vals) {
		return (Schd_IoL<E>) super.subList(keys, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_IoL<E> subList(MCRowMatcher<E> matcher) {
		return (Schd_IoL<E>) super.subList(matcher);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_IoL<E> subList(MCRowMatcher<E> matcher, MCIndexKey serial) {
		return (Schd_IoL<E>) super.subList(matcher, serial);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_IoL<E> subList(String[] cols, MCRow valrow) {
		return (Schd_IoL<E>) super.subList(cols, valrow);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Schd_IoL<E> subList(String[] owncols, MCRow valrow, String[] valcols) {
		return (Schd_IoL<E>) super.subList(owncols, valrow, valcols);
	}
}