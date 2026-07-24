package mcframe.serverMGBD.MGBDL5410;

import mcframe.commonCore.container.MCGroupByPolicy;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCConstList;

/**
 * ブロック"CopyItmDtl_Upd01_Dtl"コンテナListクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 *
 * @see mcframe.serverMGBD.MGBDL5410.CopyItmDtl_Upd01_DtlR_MC_A_A
 */
@SuppressWarnings({"all"})
abstract class CopyItmDtl_Upd01_DtlL_MC_A<E extends CopyItmDtl_Upd01_DtlR> extends MCConstList<E> {

	/**
	 * コンストラクタです。
	 */
	protected CopyItmDtl_Upd01_DtlL_MC_A(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected CopyItmDtl_Upd01_DtlL_MC_A(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmDtl_Upd01_DtlL<E> clone() {
		return (CopyItmDtl_Upd01_DtlL<E>) super.clone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmDtl_Upd01_DtlL<E> shallowClone() {
		return (CopyItmDtl_Upd01_DtlL<E>) super.shallowClone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmDtl_Upd01_DtlL<E> createInstance() {
		return (CopyItmDtl_Upd01_DtlL<E>) super.createInstance();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmDtl_Upd01_DtlL<E> groupBy(String... names) {
		return (CopyItmDtl_Upd01_DtlL<E>) super.groupBy(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmDtl_Upd01_DtlL<E> groupBy(MCGroupByPolicy policy) {
		return (CopyItmDtl_Upd01_DtlL<E>) super.groupBy(policy);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmDtl_Upd01_DtlL<E>[] groupList(String... names) {
		return (CopyItmDtl_Upd01_DtlL<E>[]) super.groupList(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmDtl_Upd01_DtlL<E> statusChangedList() {
		return (CopyItmDtl_Upd01_DtlL<E>) super.statusChangedList();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmDtl_Upd01_DtlL<E> subList(int fromIndex, int toIndex) {
		return (CopyItmDtl_Upd01_DtlL<E>) super.subList(fromIndex, toIndex);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmDtl_Upd01_DtlL<E> subList(MCIndexKey idxkey, Comparable... vals) {
		return (CopyItmDtl_Upd01_DtlL<E>) super.subList(idxkey, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmDtl_Upd01_DtlL<E> subList(MCRow.Status... status) {
		return (CopyItmDtl_Upd01_DtlL<E>) super.subList(status);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmDtl_Upd01_DtlL<E> subList(String key, Comparable val) {
		return (CopyItmDtl_Upd01_DtlL<E>) super.subList(key, val);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmDtl_Upd01_DtlL<E> subList(String[] keys, Comparable[] vals) {
		return (CopyItmDtl_Upd01_DtlL<E>) super.subList(keys, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmDtl_Upd01_DtlL<E> subList(MCRowMatcher<E> matcher) {
		return (CopyItmDtl_Upd01_DtlL<E>) super.subList(matcher);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmDtl_Upd01_DtlL<E> subList(MCRowMatcher<E> matcher, MCIndexKey serial) {
		return (CopyItmDtl_Upd01_DtlL<E>) super.subList(matcher, serial);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmDtl_Upd01_DtlL<E> subList(String[] cols, MCRow valrow) {
		return (CopyItmDtl_Upd01_DtlL<E>) super.subList(cols, valrow);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmDtl_Upd01_DtlL<E> subList(String[] owncols, MCRow valrow, String[] valcols) {
		return (CopyItmDtl_Upd01_DtlL<E>) super.subList(owncols, valrow, valcols);
	}
}