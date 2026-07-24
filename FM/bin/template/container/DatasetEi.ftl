<#import "/container/Container.ftl" as CCON>
<#import "/macro/RevAnnotation.ftl" as REV>
<#import "/macro/ClassDef.ftl" as CDEF>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")};

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.annotation.EI;
<@REV.REV_IMPORT/>
<#if FMCONF_B("EI_CLASS_DEV_MODE")||CB("IMPORT")!="">
//FMCB IMPORT START
${CB("IMPORT")}
//FMCB IMPORT END
</#if>

/**
 * ブロック"${S("BLOCK_ID")}"コンテナListクラスです。<p>
 *
<#list S(S("BLOCK_ID") + "_MEMO")?split("\n") as lToken>
 * ${lToken}<br>
</#list>
 *
<#if B("IS_DAO")><#include F("FTL.ROW.DBC_COMMENT")/><#else><#include F("FTL.ROW.C_COMMENT")/></#if>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
 *
 * @see ${S("PACKAGE")}.${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R
 */
<@REV.REV_ANNOTATION/>
@EI
${S(S("BLOCK_ID") + "_MODIFIER")} class ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<E extends ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R> extends ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L_<@CCON.C_SUF/><E> <#if B("HAS_IMPLEMENTS_DESCRIPTION")>implements ${S("IMPLEMENTS_DESCRIPTION")} </#if>{

<@CREATE/>

<@CREATE_BY_NAME/>

	/**
	 * コンストラクタです。
	 */
	protected ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L(Class<E> rowc) {
		super(rowc);
	}

	/**
	 * コンストラクタです。
	 */
	protected ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L(Class<E> rowc, int initCapacity) {
		super(rowc, initCapacity);
	}

<#if FMCONF_B("EI_CLASS_DEV_MODE")||CB("CUSTOM")!="">
//FMCB CUSTOM START
${CB("CUSTOM")}
//FMCB CUSTOM END
</#if>}<#rt>
<#macro CREATE><#-- マクロ化して、３層構造時のEIクラスと１層構造時のAUTOクラスの両方で使用しています。-->
	/**
	 * 新しいListを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static <T extends ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R> ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<T> create<@CDEF.MY_L_CREATE_SUFFIX/>(Class<T> clazz) {
		${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<T> ls = new ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<T>(clazz);
		return ls;
	}

<#if B("IS_DAO")>
	/**
	 * 新しいListを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R> create<@CDEF.MY_L_CREATE_SUFFIX/>() {
		${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R> ls = new ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R>(${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R.class);
		return ls;
	}

</#if>
	/**
	 * 新しいListを生成します。
	 *
	 * @param initCapacity 初期容量
	 * @return 新しいインスタンス
	 */
	public static <T extends ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R> ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<T> create<@CDEF.MY_L_CREATE_SUFFIX/>(Class<T> clazz, int initCapacity) {
		${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<T> ls = new ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<T>(clazz, initCapacity);
		return ls;
	}

<#if B("IS_DAO")>
	/**
	 * 新しいListを生成します。
	 *
	 * @param initCapacity 初期容量
	 * @return 新しいインスタンス
	 */
	public static ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R> create<@CDEF.MY_L_CREATE_SUFFIX/>(int initCapacity) {
		${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R> ls = new ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R>(${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R.class, initCapacity);
		return ls;
	}

</#if>
</#macro>
<#-- DBC Rowで生成されるList create -->
<#macro CREATE2 L L_MID L_BID>
<#assign R_CLASS=S("BLOCK_ID")+B("IS_DAO")?string("_","")+"R"/>
<#assign L_CLASS=L/>
<#if L_MID!=""&&L_BID!="">
<#assign L_CREATE_SUFFIX=L_MID + "_" + L_BID/>
<#else>
<#assign L_CREATE_SUFFIX=""/>
</#if>
	/**
	 * 新しいListを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static <T extends ${R_CLASS}> ${L_CLASS}<T> create<@CDEF.MY_L_CREATE_SUFFIX/>_L(Class<T> clazz) {
		${L_CLASS}<T> ls = ${L_CLASS}.create<#if !FMCONST_B("LIST_GENE_630")>${L_CREATE_SUFFIX}</#if>(clazz);
		return ls;
	}

<#if B("IS_DAO")>
	/**
	 * 新しいListを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static ${L_CLASS}<${R_CLASS}> create<@CDEF.MY_L_CREATE_SUFFIX/>_L() {
		${L_CLASS}<${R_CLASS}> ls = ${L_CLASS}.create<#if !FMCONST_B("LIST_GENE_630")>${L_CREATE_SUFFIX}</#if>(${R_CLASS}.class);
		return ls;
	}

</#if>
	/**
	 * 新しいListを生成します。
	 *
	 * @param initCapacity 初期容量
	 * @return 新しいインスタンス
	 */
	public static <T extends ${R_CLASS}> ${L_CLASS}<T> create<@CDEF.MY_L_CREATE_SUFFIX/>_L(Class<T> clazz, int initCapacity) {
		${L_CLASS}<T> ls = ${L_CLASS}.create<#if !FMCONST_B("LIST_GENE_630")>${L_CREATE_SUFFIX}</#if>(clazz, initCapacity);
		return ls;
	}

<#if B("IS_DAO")>
	/**
	 * 新しいListを生成します。
	 *
	 * @param initCapacity 初期容量
	 * @return 新しいインスタンス
	 */
	public static ${L_CLASS}<${R_CLASS}> create<@CDEF.MY_L_CREATE_SUFFIX/>_L(int initCapacity) {
		${L_CLASS}<${R_CLASS}> ls = ${L_CLASS}.create<#if !FMCONST_B("LIST_GENE_630")>${L_CREATE_SUFFIX}</#if>(${R_CLASS}.class, initCapacity);
		return ls;
	}

</#if>
</#macro>
<#macro CREATE_BY_NAME><#-- マクロ化して、３層構造時のEIクラスと１層構造時のAUTOクラスの両方で使用しています。-->
	/**
	 * 新しいListを生成し別のListのRowを複製して追加します。
	 *
	 * @param proto 複製するRowを格納したList
	 * @return 複製したRowを追加した新しいインスタンス
	 */
	public static <T extends ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R> ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<T> create<@CDEF.MY_L_CREATE_SUFFIX/>ByName(Class<T> clazz, MCList<? extends MCRow> proto) {
		${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<T> ls = ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L.create<@CDEF.MY_L_CREATE_SUFFIX/>(clazz);
		copyByName(ls, proto);
		return ls;
	}

<#if B("IS_DAO")>
	/**
	 * 新しいListを生成し別のListのRowを複製して追加します。
	 *
	 * @param proto 複製するRowを格納したList
	 * @return 複製したRowを追加した新しいインスタンス
	 */
	public static ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R> create<@CDEF.MY_L_CREATE_SUFFIX/>ByName(MCList<? extends MCRow> proto) {
		${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L<${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R> ls = ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L.create<@CDEF.MY_L_CREATE_SUFFIX/>(${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R.class);
		copyByName(ls, proto);
		return ls;
	}

</#if>
</#macro>
