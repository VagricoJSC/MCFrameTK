<#import "/container/Container.ftl" as CCON>
<#import "/macro/RevAnnotation.ftl" as REV>
<#import "/container/FMRowAutoCustomize.ftl" as FMD>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")};

import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.annotation.EI;
<@REV.REV_IMPORT/>
<#if FMCONF_B("EI_CLASS_DEV_MODE")||CB("IMPORT")!="">
//FMCB IMPORT START
${CB("IMPORT")}
//FMCB IMPORT END
</#if>

/**
 * ブロック"${S("BLOCK_ID")}"コンテナRowクラスです。<p>
 *
<#list S(S("BLOCK_ID") + "_MEMO")?split("\n") as lToken>
 * ${lToken}<br>
</#list>
 *
<#if B("IS_DAO")><#include F("FTL.ROW.DBC_COMMENT")/><#else><#include F("FTL.ROW.C_COMMENT")/></#if>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。
<#if B(S("BLOCK_ID") + "_IS_GENE_LIST")>
 * <br>
 * @see ${S("PACKAGE")}.${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L
</#if>
 */
<@REV.REV_ANNOTATION/>
@EI
${S(S("BLOCK_ID") + "_MODIFIER")} class ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R<@FMD.CLASS_G_DEC lay="E"/> extends ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R_<@CCON.C_SUF/><@FMD.S_CLASS_G_DEC lay="E"/> <#if B("HAS_IMPLEMENTS_DESCRIPTION")>implements ${S("IMPLEMENTS_DESCRIPTION")} </#if>{

<@CREATE/>

<@CREATE_BY_NAME/>

	/**
	 * コンストラクタです。
	 */
	public ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R(ConstMetaList<? extends ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R> metas) {
		super(metas);
	}
<#if FMCONF_B("EI_CLASS_DEV_MODE")||CB("CUSTOM")!="">
//FMCB CUSTOM START
${CB("CUSTOM")}
//FMCB CUSTOM END
</#if>}<#rt>
<#macro CREATE><#-- マクロ化して、３層構造時のEIクラスと１層構造時のAUTOクラスの両方で使用しています。-->
	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R create() {
		${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R row = new ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R(constMetas);
		return row;
	}
</#macro>
<#macro CREATE_BY_NAME><#-- マクロ化して、３層構造時のEIクラスと１層構造時のAUTOクラスの両方で使用しています。-->
	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R createByName(T proto) {
		${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R row = ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R.create();
		copyByName(row, proto);
		return row;
	}
</#macro>