package mcframe.serverMGBD.MGBDL0040;

import mcframe.commonCore.container.MCGroupByPolicy;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCConstList;

/**
 * ブロック"Srch01_Rslt"コンテナListクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 *
 * @see mcframe.serverMGBD.MGBDL0040.Srch01_RsltR_MC_A_A
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltL_MC_A<E extends Srch01_RsltR> extends MCConstList<E> {

	/**
	 * コンストラクタです。
	 */
	protected Srch01_RsltL_MC_A(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected Srch01_RsltL_MC_A(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch01_RsltL<E> clone() {
		return (Srch01_RsltL<E>) super.clone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch01_RsltL<E> shallowClone() {
		return (Srch01_RsltL<E>) super.shallowClone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch01_RsltL<E> createInstance() {
		return (Srch01_RsltL<E>) super.createInstance();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch01_RsltL<E> groupBy(String... names) {
		return (Srch01_RsltL<E>) super.groupBy(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch01_RsltL<E> groupBy(MCGroupByPolicy policy) {
		return (Srch01_RsltL<E>) super.groupBy(policy);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch01_RsltL<E>[] groupList(String... names) {
		return (Srch01_RsltL<E>[]) super.groupList(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch01_RsltL<E> statusChangedList() {
		return (Srch01_RsltL<E>) super.statusChangedList();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch01_RsltL<E> subList(int fromIndex, int toIndex) {
		return (Srch01_RsltL<E>) super.subList(fromIndex, toIndex);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch01_RsltL<E> subList(MCIndexKey idxkey, Comparable... vals) {
		return (Srch01_RsltL<E>) super.subList(idxkey, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch01_RsltL<E> subList(MCRow.Status... status) {
		return (Srch01_RsltL<E>) super.subList(status);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch01_RsltL<E> subList(String key, Comparable val) {
		return (Srch01_RsltL<E>) super.subList(key, val);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch01_RsltL<E> subList(String[] keys, Comparable[] vals) {
		return (Srch01_RsltL<E>) super.subList(keys, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch01_RsltL<E> subList(MCRowMatcher<E> matcher) {
		return (Srch01_RsltL<E>) super.subList(matcher);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch01_RsltL<E> subList(MCRowMatcher<E> matcher, MCIndexKey serial) {
		return (Srch01_RsltL<E>) super.subList(matcher, serial);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch01_RsltL<E> subList(String[] cols, MCRow valrow) {
		return (Srch01_RsltL<E>) super.subList(cols, valrow);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public Srch01_RsltL<E> subList(String[] owncols, MCRow valrow, String[] valcols) {
		return (Srch01_RsltL<E>) super.subList(owncols, valrow, valcols);
	}
}