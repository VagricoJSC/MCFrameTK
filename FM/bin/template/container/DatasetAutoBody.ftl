<#import "/container/Container.ftl" as CCON>
<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")};

import mcframe.commonCore.container.MCGroupByPolicy;
import mcframe.commonCore.container.MCIndexKey;
import mcframe.commonCore.container.MCRowMatcher;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCConstList;
<@REV.REV_IMPORT/>
<#if B("IS_DAO")>

import mcframe.serverCore.database.container.MCDBList;
import mcframe.serverCore.database.container.MCDMLAgent;
import mcframe.serverCore.database.MCLockTableMode;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
<#assign BIN_KEY_EXISTS=false/>
<#list A(S("BLOCK_ID") + "_KEY_ITEM_IDS2") as anItemId>
<#if S(S("BLOCK_ID") + "_" + anItemId + "_CLASS")=="MCBinary"><#assign BIN_KEY_EXISTS=true/><#break></#if>
</#list>
<#if BIN_KEY_EXISTS>
import mcframe.commonCore.lang.MCBinary;
</#if>
</#if>

/**
 * ブロック"${S("BLOCK_ID")}"コンテナListクラスです。<p>
 *
<#list S(S("BLOCK_ID") + "_MEMO")?split("\n") as lToken>
 * ${lToken}<br>
</#list>
 *
<#if S(S("BLOCK_ID") + "_GENE_MODE_LAYER")=="1">
<#if B("IS_DAO")><#include F("FTL.ROW.DBC_COMMENT")/><#else><#include F("FTL.ROW.C_COMMENT")/></#if>
 *
 * <br>
</#if>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 *
 * @see ${S("PACKAGE")}.${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R<#if S(S("BLOCK_ID") + "_GENE_MODE_LAYER")!="1">_<@CCON.C_SUF/>_A</#if>
 */
<#if FMCONST_B("FTL.SUPPRESSWARNINGS")>
@SuppressWarnings({"all"})
</#if>
<@REV.REV_ANNOTATION/>
${CLASS_MODIFIER}class ${CLASS_NAME}<E extends ${CONT_ROW_CNAME}> extends ${SUPER_CLASS_NAME} {

	/**
	 * コンストラクタです。
	 */
	protected ${CLASS_NAME}(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected ${CLASS_NAME}(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E> clone() {
		return (${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E>) super.clone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E> shallowClone() {
		return (${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E>) super.shallowClone();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E> createInstance() {
		return (${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E>) super.createInstance();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E> groupBy(String... names) {
		return (${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E>) super.groupBy(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E> groupBy(MCGroupByPolicy policy) {
		return (${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E>) super.groupBy(policy);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E>[] groupList(String... names) {
		return (${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E>[]) super.groupList(names);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E> statusChangedList() {
		return (${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E>) super.statusChangedList();
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E> subList(int fromIndex, int toIndex) {
		return (${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E>) super.subList(fromIndex, toIndex);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E> subList(MCIndexKey idxkey, Comparable... vals) {
		return (${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E>) super.subList(idxkey, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E> subList(MCRow.Status... status) {
		return (${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E>) super.subList(status);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E> subList(String key, Comparable val) {
		return (${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E>) super.subList(key, val);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E> subList(String[] keys, Comparable[] vals) {
		return (${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E>) super.subList(keys, vals);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E> subList(MCRowMatcher<E> matcher) {
		return (${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E>) super.subList(matcher);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E> subList(MCRowMatcher<E> matcher, MCIndexKey serial) {
		return (${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E>) super.subList(matcher, serial);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E> subList(String[] cols, MCRow valrow) {
		return (${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E>) super.subList(cols, valrow);
	}

	/*
	 * MCListのオーバーライドメソッドです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E> subList(String[] owncols, MCRow valrow, String[] valcols) {
		return (${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E>) super.subList(owncols, valrow, valcols);
	}
<#if FMCONST_B("DB.DBC_GENE_630")&&B("IS_DAO")>
<#include F("FTL.DATASET.AUTO_DAO")/>
</#if>