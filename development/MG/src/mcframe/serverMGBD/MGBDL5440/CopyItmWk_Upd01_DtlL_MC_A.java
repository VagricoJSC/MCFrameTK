package mcframe.serverMGBD.MGBDL5440;

import mcframe.commonCore.container.MCGroupByPolicy;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCConstList;

/**
 * ブロック"CopyItmWk_Upd01_Dtl"コンテナListクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 *
 * @see mcframe.serverMGBD.MGBDL5440.CopyItmWk_Upd01_DtlR_MC_A_A
 */
@SuppressWarnings({"all"})
abstract class CopyItmWk_Upd01_DtlL_MC_A<E extends CopyItmWk_Upd01_DtlR> extends MCConstList<E> {

	/**
	 * コンストラクタです。
	 */
	protected CopyItmWk_Upd01_DtlL_MC_A(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected CopyItmWk_Upd01_DtlL_MC_A(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmWk_Upd01_DtlL<E> clone() {
		return (CopyItmWk_Upd01_DtlL<E>) super.clone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmWk_Upd01_DtlL<E> shallowClone() {
		return (CopyItmWk_Upd01_DtlL<E>) super.shallowClone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmWk_Upd01_DtlL<E> createInstance() {
		return (CopyItmWk_Upd01_DtlL<E>) super.createInstance();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmWk_Upd01_DtlL<E> groupBy(String... names) {
		return (CopyItmWk_Upd01_DtlL<E>) super.groupBy(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmWk_Upd01_DtlL<E> groupBy(MCGroupByPolicy policy) {
		return (CopyItmWk_Upd01_DtlL<E>) super.groupBy(policy);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmWk_Upd01_DtlL<E>[] groupList(String... names) {
		return (CopyItmWk_Upd01_DtlL<E>[]) super.groupList(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmWk_Upd01_DtlL<E> statusChangedList() {
		return (CopyItmWk_Upd01_DtlL<E>) super.statusChangedList();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmWk_Upd01_DtlL<E> subList(int fromIndex, int toIndex) {
		return (CopyItmWk_Upd01_DtlL<E>) super.subList(fromIndex, toIndex);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmWk_Upd01_DtlL<E> subList(MCIndexKey idxkey, Comparable... vals) {
		return (CopyItmWk_Upd01_DtlL<E>) super.subList(idxkey, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmWk_Upd01_DtlL<E> subList(MCRow.Status... status) {
		return (CopyItmWk_Upd01_DtlL<E>) super.subList(status);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmWk_Upd01_DtlL<E> subList(String key, Comparable val) {
		return (CopyItmWk_Upd01_DtlL<E>) super.subList(key, val);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmWk_Upd01_DtlL<E> subList(String[] keys, Comparable[] vals) {
		return (CopyItmWk_Upd01_DtlL<E>) super.subList(keys, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmWk_Upd01_DtlL<E> subList(MCRowMatcher<E> matcher) {
		return (CopyItmWk_Upd01_DtlL<E>) super.subList(matcher);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmWk_Upd01_DtlL<E> subList(MCRowMatcher<E> matcher, MCIndexKey serial) {
		return (CopyItmWk_Upd01_DtlL<E>) super.subList(matcher, serial);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmWk_Upd01_DtlL<E> subList(String[] cols, MCRow valrow) {
		return (CopyItmWk_Upd01_DtlL<E>) super.subList(cols, valrow);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyItmWk_Upd01_DtlL<E> subList(String[] owncols, MCRow valrow, String[] valcols) {
		return (CopyItmWk_Upd01_DtlL<E>) super.subList(owncols, valrow, valcols);
	}
}