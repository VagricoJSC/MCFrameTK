package mcframe.serverMSBD.MSBDL5170;

import mcframe.commonCore.container.MCGroupByPolicy;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCConstList;

/**
 * ブロック"Hdr"コンテナListクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 *
 * @see mcframe.serverMSBD.MSBDL5170.HdrR_MC_A_A
 */
@SuppressWarnings({"all"})
abstract class HdrL_MC_A<E extends HdrR> extends MCConstList<E> {

	/**
	 * コンストラクタです。
	 */
	protected HdrL_MC_A(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected HdrL_MC_A(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public HdrL<E> clone() {
		return (HdrL<E>) super.clone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public HdrL<E> shallowClone() {
		return (HdrL<E>) super.shallowClone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public HdrL<E> createInstance() {
		return (HdrL<E>) super.createInstance();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public HdrL<E> groupBy(String... names) {
		return (HdrL<E>) super.groupBy(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public HdrL<E> groupBy(MCGroupByPolicy policy) {
		return (HdrL<E>) super.groupBy(policy);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public HdrL<E>[] groupList(String... names) {
		return (HdrL<E>[]) super.groupList(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public HdrL<E> statusChangedList() {
		return (HdrL<E>) super.statusChangedList();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public HdrL<E> subList(int fromIndex, int toIndex) {
		return (HdrL<E>) super.subList(fromIndex, toIndex);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public HdrL<E> subList(MCIndexKey idxkey, Comparable... vals) {
		return (HdrL<E>) super.subList(idxkey, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public HdrL<E> subList(MCRow.Status... status) {
		return (HdrL<E>) super.subList(status);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public HdrL<E> subList(String key, Comparable val) {
		return (HdrL<E>) super.subList(key, val);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public HdrL<E> subList(String[] keys, Comparable[] vals) {
		return (HdrL<E>) super.subList(keys, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public HdrL<E> subList(MCRowMatcher<E> matcher) {
		return (HdrL<E>) super.subList(matcher);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public HdrL<E> subList(MCRowMatcher<E> matcher, MCIndexKey serial) {
		return (HdrL<E>) super.subList(matcher, serial);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public HdrL<E> subList(String[] cols, MCRow valrow) {
		return (HdrL<E>) super.subList(cols, valrow);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public HdrL<E> subList(String[] owncols, MCRow valrow, String[] valcols) {
		return (HdrL<E>) super.subList(owncols, valrow, valcols);
	}
}