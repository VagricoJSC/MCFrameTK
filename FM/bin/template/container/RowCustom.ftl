<#import "/container/Container.ftl" as CCON>
<#import "/macro/RevAnnotation.ftl" as REV>
<#import "/container/FMRowAutoCustomize.ftl" as FMD>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")};

import mcframe.commonCore.notice.*;
<@REV.REV_IMPORT/>
<#if EXISTS(S("FTL.ROW.CUSTOM_IMPORT"))><#include S("FTL.ROW.CUSTOM_IMPORT")/></#if>
//FMCB IMPORT START
${CB("IMPORT")}
//FMCB IMPORT END

/**
 * ブロック"${S("BLOCK_ID")}"コンテナRowクラスです。<p>
 *
<#list S(S("BLOCK_ID") + "_MEMO")?split("\n") as lToken>
 * ${lToken}<br>
</#list>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
<#if B("IS_GENE_LIST")>
 * <br>
 * @see ${S("PACKAGE")}.${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L_<@CCON.C_SUF/>
</#if>
 */
<@REV.REV_ANNOTATION/>
abstract public class ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R_<@CCON.C_SUF/><@FMD.CLASS_G_DEC lay="C"/> extends ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R_<@CCON.C_SUF/>_A<@FMD.S_CLASS_G_DEC lay="C"/> <#if B("HAS_IMPLEMENTS_DESCRIPTION")>implements ${S("IMPLEMENTS_DESCRIPTION")} </#if>{

//FMCB CUSTOM_METHOD START
<#-- MCConstMetaListからConstMetaListの名称変更のための実装ゾーン内の旧コンストラクタのお掃除処理を含む。-->
<#assign mcconst_pos=CB("CUSTOM_METHOD")?index_of("MCConstMetaList")>
<#assign CNST_START="	/**
	 * コンストラクタ
	 */">
<#assign st_pos=CB("CUSTOM_METHOD")?last_index_of(CNST_START, mcconst_pos)><#-- "MCConstMetaList"から左方向に探す。-->
<#assign CNST_END=" metas) {
		super(metas);
	}">
<#assign ed_pos=CB("CUSTOM_METHOD")?index_of(CNST_END, mcconst_pos)><#-- "MCConstMetaList"から右方向に探す。-->
<#if st_pos &gt; -1&&ed_pos &gt; -1&&ed_pos-st_pos &lt; 100>
${CB("CUSTOM_METHOD")?substring(0, st_pos)}
${CB("CUSTOM_METHOD")?substring(ed_pos+30)}<#-- CNST_ENDの文字数＋α = 30 -->
<#else>
${CB("CUSTOM_METHOD")}
</#if>
<#-- eclipseのformatterにより、コンストラクタ引数部で改行されてしまう場合にも対応。-->
<#if !INC_LINE_IN_CB("protected " + S("BLOCK_ID") + B("IS_DAO")?string("_","") + "R_" + (S("CLASS_SUFFIX")!="")?string(S("CLASS_SUFFIX"), (S(S("BLOCK_ID") + "_CLASS_SUFFIX"))) + "(ConstMetaList<?", "CUSTOM_METHOD")
	&& !INC_LINE_IN_CB("protected " + S("BLOCK_ID") + B("IS_DAO")?string("_","") + "R_" + (S("CLASS_SUFFIX")!="")?string(S("CLASS_SUFFIX"), (S(S("BLOCK_ID") + "_CLASS_SUFFIX"))) + "(", "CUSTOM_METHOD")>
	/**
	 * コンストラクタ
	 */
	protected ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R_<@CCON.C_SUF/>(ConstMetaList<? extends ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R> metas) {
		super(metas);
	}
</#if>
}