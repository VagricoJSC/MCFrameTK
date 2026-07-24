package mcframe.serverMGBD.MGBDL5470;

import mcframe.commonCore.container.MCGroupByPolicy;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCConstList;

/**
 * ブロック"CopyItmProv_Upd01_Dtl"コンテナListクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 *
 * @see mcframe.serverMGBD.MGBDL5470.CopyItmProv_Upd01_DtlR_MC_A_A
 */
@SuppressWarnings({"all"})
abstract class CopyItmProv_Upd01_DtlL_MC_A<E extends CopyItmProv_Upd01_DtlR> extends MCConstList<E> {

	/**
	 * コンストラクタです。
	 */
	protected CopyItmProv_Upd01_DtlL_MC_A(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected CopyItmProv_Upd01_DtlL_MC_A(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmProv_Upd01_DtlL<E> clone() {
		return (CopyItmProv_Upd01_DtlL<E>) super.clone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmProv_Upd01_DtlL<E> shallowClone() {
		return (CopyItmProv_Upd01_DtlL<E>) super.shallowClone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmProv_Upd01_DtlL<E> createInstance() {
		return (CopyItmProv_Upd01_DtlL<E>) super.createInstance();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmProv_Upd01_DtlL<E> groupBy(String... names) {
		return (CopyItmProv_Upd01_DtlL<E>) super.groupBy(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmProv_Upd01_DtlL<E> groupBy(MCGroupByPolicy policy) {
		return (CopyItmProv_Upd01_DtlL<E>) super.groupBy(policy);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmProv_Upd01_DtlL<E>[] groupList(String... names) {
		return (CopyItmProv_Upd01_DtlL<E>[]) super.groupList(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmProv_Upd01_DtlL<E> statusChangedList() {
		return (CopyItmProv_Upd01_DtlL<E>) super.statusChangedList();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmProv_Upd01_DtlL<E> subList(int fromIndex, int toIndex) {
		return (CopyItmProv_Upd01_DtlL<E>) super.subList(fromIndex, toIndex);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmProv_Upd01_DtlL<E> subList(MCIndexKey idxkey, Comparable... vals) {
		return (CopyItmProv_Upd01_DtlL<E>) super.subList(idxkey, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmProv_Upd01_DtlL<E> subList(MCRow.Status... status) {
		return (CopyItmProv_Upd01_DtlL<E>) super.subList(status);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmProv_Upd01_DtlL<E> subList(String key, Comparable val) {
		return (CopyItmProv_Upd01_DtlL<E>) super.subList(key, val);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmProv_Upd01_DtlL<E> subList(String[] keys, Comparable[] vals) {
		return (CopyItmProv_Upd01_DtlL<E>) super.subList(keys, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmProv_Upd01_DtlL<E> subList(MCRowMatcher<E> matcher) {
		return (CopyItmProv_Upd01_DtlL<E>) super.subList(matcher);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmProv_Upd01_DtlL<E> subList(MCRowMatcher<E> matcher, MCIndexKey serial) {
		return (CopyItmProv_Upd01_DtlL<E>) super.subList(matcher, serial);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmProv_Upd01_DtlL<E> subList(String[] cols, MCRow valrow) {
		return (CopyItmProv_Upd01_DtlL<E>) super.subList(cols, valrow);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmProv_Upd01_DtlL<E> subList(String[] owncols, MCRow valrow, String[] valcols) {
		return (CopyItmProv_Upd01_DtlL<E>) super.subList(owncols, valrow, valcols);
	}
}