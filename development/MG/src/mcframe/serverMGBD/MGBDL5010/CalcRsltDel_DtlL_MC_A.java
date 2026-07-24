package mcframe.serverMGBD.MGBDL5010;

import mcframe.commonCore.container.MCGroupByPolicy;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCConstList;

/**
 * ブロック"CalcRsltDel_Dtl"コンテナListクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 *
 * @see mcframe.serverMGBD.MGBDL5010.CalcRsltDel_DtlR_MC_A_A
 */
@SuppressWarnings({"all"})
abstract class CalcRsltDel_DtlL_MC_A<E extends CalcRsltDel_DtlR> extends MCConstList<E> {

	/**
	 * コンストラクタです。
	 */
	protected CalcRsltDel_DtlL_MC_A(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected CalcRsltDel_DtlL_MC_A(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CalcRsltDel_DtlL<E> clone() {
		return (CalcRsltDel_DtlL<E>) super.clone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CalcRsltDel_DtlL<E> shallowClone() {
		return (CalcRsltDel_DtlL<E>) super.shallowClone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CalcRsltDel_DtlL<E> createInstance() {
		return (CalcRsltDel_DtlL<E>) super.createInstance();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CalcRsltDel_DtlL<E> groupBy(String... names) {
		return (CalcRsltDel_DtlL<E>) super.groupBy(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CalcRsltDel_DtlL<E> groupBy(MCGroupByPolicy policy) {
		return (CalcRsltDel_DtlL<E>) super.groupBy(policy);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CalcRsltDel_DtlL<E>[] groupList(String... names) {
		return (CalcRsltDel_DtlL<E>[]) super.groupList(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CalcRsltDel_DtlL<E> statusChangedList() {
		return (CalcRsltDel_DtlL<E>) super.statusChangedList();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CalcRsltDel_DtlL<E> subList(int fromIndex, int toIndex) {
		return (CalcRsltDel_DtlL<E>) super.subList(fromIndex, toIndex);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CalcRsltDel_DtlL<E> subList(MCIndexKey idxkey, Comparable... vals) {
		return (CalcRsltDel_DtlL<E>) super.subList(idxkey, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CalcRsltDel_DtlL<E> subList(MCRow.Status... status) {
		return (CalcRsltDel_DtlL<E>) super.subList(status);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CalcRsltDel_DtlL<E> subList(String key, Comparable val) {
		return (CalcRsltDel_DtlL<E>) super.subList(key, val);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CalcRsltDel_DtlL<E> subList(String[] keys, Comparable[] vals) {
		return (CalcRsltDel_DtlL<E>) super.subList(keys, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CalcRsltDel_DtlL<E> subList(MCRowMatcher<E> matcher) {
		return (CalcRsltDel_DtlL<E>) super.subList(matcher);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CalcRsltDel_DtlL<E> subList(MCRowMatcher<E> matcher, MCIndexKey serial) {
		return (CalcRsltDel_DtlL<E>) super.subList(matcher, serial);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CalcRsltDel_DtlL<E> subList(String[] cols, MCRow valrow) {
		return (CalcRsltDel_DtlL<E>) super.subList(cols, valrow);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CalcRsltDel_DtlL<E> subList(String[] owncols, MCRow valrow, String[] valcols) {
		return (CalcRsltDel_DtlL<E>) super.subList(owncols, valrow, valcols);
	}
}