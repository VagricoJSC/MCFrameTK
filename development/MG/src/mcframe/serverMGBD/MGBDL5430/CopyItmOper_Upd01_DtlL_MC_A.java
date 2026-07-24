package mcframe.serverMGBD.MGBDL5430;

import mcframe.commonCore.container.MCGroupByPolicy;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCConstList;

/**
 * ブロック"CopyItmOper_Upd01_Dtl"コンテナListクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 *
 * @see mcframe.serverMGBD.MGBDL5430.CopyItmOper_Upd01_DtlR_MC_A_A
 */
@SuppressWarnings({"all"})
abstract class CopyItmOper_Upd01_DtlL_MC_A<E extends CopyItmOper_Upd01_DtlR> extends MCConstList<E> {

	/**
	 * コンストラクタです。
	 */
	protected CopyItmOper_Upd01_DtlL_MC_A(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected CopyItmOper_Upd01_DtlL_MC_A(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmOper_Upd01_DtlL<E> clone() {
		return (CopyItmOper_Upd01_DtlL<E>) super.clone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmOper_Upd01_DtlL<E> shallowClone() {
		return (CopyItmOper_Upd01_DtlL<E>) super.shallowClone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmOper_Upd01_DtlL<E> createInstance() {
		return (CopyItmOper_Upd01_DtlL<E>) super.createInstance();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmOper_Upd01_DtlL<E> groupBy(String... names) {
		return (CopyItmOper_Upd01_DtlL<E>) super.groupBy(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmOper_Upd01_DtlL<E> groupBy(MCGroupByPolicy policy) {
		return (CopyItmOper_Upd01_DtlL<E>) super.groupBy(policy);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmOper_Upd01_DtlL<E>[] groupList(String... names) {
		return (CopyItmOper_Upd01_DtlL<E>[]) super.groupList(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmOper_Upd01_DtlL<E> statusChangedList() {
		return (CopyItmOper_Upd01_DtlL<E>) super.statusChangedList();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmOper_Upd01_DtlL<E> subList(int fromIndex, int toIndex) {
		return (CopyItmOper_Upd01_DtlL<E>) super.subList(fromIndex, toIndex);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmOper_Upd01_DtlL<E> subList(MCIndexKey idxkey, Comparable... vals) {
		return (CopyItmOper_Upd01_DtlL<E>) super.subList(idxkey, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmOper_Upd01_DtlL<E> subList(MCRow.Status... status) {
		return (CopyItmOper_Upd01_DtlL<E>) super.subList(status);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmOper_Upd01_DtlL<E> subList(String key, Comparable val) {
		return (CopyItmOper_Upd01_DtlL<E>) super.subList(key, val);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmOper_Upd01_DtlL<E> subList(String[] keys, Comparable[] vals) {
		return (CopyItmOper_Upd01_DtlL<E>) super.subList(keys, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmOper_Upd01_DtlL<E> subList(MCRowMatcher<E> matcher) {
		return (CopyItmOper_Upd01_DtlL<E>) super.subList(matcher);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmOper_Upd01_DtlL<E> subList(MCRowMatcher<E> matcher, MCIndexKey serial) {
		return (CopyItmOper_Upd01_DtlL<E>) super.subList(matcher, serial);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmOper_Upd01_DtlL<E> subList(String[] cols, MCRow valrow) {
		return (CopyItmOper_Upd01_DtlL<E>) super.subList(cols, valrow);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmOper_Upd01_DtlL<E> subList(String[] owncols, MCRow valrow, String[] valcols) {
		return (CopyItmOper_Upd01_DtlL<E>) super.subList(owncols, valrow, valcols);
	}
}