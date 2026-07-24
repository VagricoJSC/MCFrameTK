package mcframe.serverMGBD.MGBDL5420;

import mcframe.commonCore.container.MCGroupByPolicy;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCConstList;

/**
 * ブロック"CopyBom_Upd01_Dtl"コンテナListクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 *
 * @see mcframe.serverMGBD.MGBDL5420.CopyBom_Upd01_DtlR_MC_A_A
 */
@SuppressWarnings({"all"})
abstract class CopyBom_Upd01_DtlL_MC_A<E extends CopyBom_Upd01_DtlR> extends MCConstList<E> {

	/**
	 * コンストラクタです。
	 */
	protected CopyBom_Upd01_DtlL_MC_A(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected CopyBom_Upd01_DtlL_MC_A(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyBom_Upd01_DtlL<E> clone() {
		return (CopyBom_Upd01_DtlL<E>) super.clone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyBom_Upd01_DtlL<E> shallowClone() {
		return (CopyBom_Upd01_DtlL<E>) super.shallowClone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyBom_Upd01_DtlL<E> createInstance() {
		return (CopyBom_Upd01_DtlL<E>) super.createInstance();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyBom_Upd01_DtlL<E> groupBy(String... names) {
		return (CopyBom_Upd01_DtlL<E>) super.groupBy(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyBom_Upd01_DtlL<E> groupBy(MCGroupByPolicy policy) {
		return (CopyBom_Upd01_DtlL<E>) super.groupBy(policy);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyBom_Upd01_DtlL<E>[] groupList(String... names) {
		return (CopyBom_Upd01_DtlL<E>[]) super.groupList(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyBom_Upd01_DtlL<E> statusChangedList() {
		return (CopyBom_Upd01_DtlL<E>) super.statusChangedList();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyBom_Upd01_DtlL<E> subList(int fromIndex, int toIndex) {
		return (CopyBom_Upd01_DtlL<E>) super.subList(fromIndex, toIndex);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyBom_Upd01_DtlL<E> subList(MCIndexKey idxkey, Comparable... vals) {
		return (CopyBom_Upd01_DtlL<E>) super.subList(idxkey, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyBom_Upd01_DtlL<E> subList(MCRow.Status... status) {
		return (CopyBom_Upd01_DtlL<E>) super.subList(status);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyBom_Upd01_DtlL<E> subList(String key, Comparable val) {
		return (CopyBom_Upd01_DtlL<E>) super.subList(key, val);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyBom_Upd01_DtlL<E> subList(String[] keys, Comparable[] vals) {
		return (CopyBom_Upd01_DtlL<E>) super.subList(keys, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyBom_Upd01_DtlL<E> subList(MCRowMatcher<E> matcher) {
		return (CopyBom_Upd01_DtlL<E>) super.subList(matcher);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyBom_Upd01_DtlL<E> subList(MCRowMatcher<E> matcher, MCIndexKey serial) {
		return (CopyBom_Upd01_DtlL<E>) super.subList(matcher, serial);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyBom_Upd01_DtlL<E> subList(String[] cols, MCRow valrow) {
		return (CopyBom_Upd01_DtlL<E>) super.subList(cols, valrow);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public CopyBom_Upd01_DtlL<E> subList(String[] owncols, MCRow valrow, String[] valcols) {
		return (CopyBom_Upd01_DtlL<E>) super.subList(owncols, valrow, valcols);
	}
}