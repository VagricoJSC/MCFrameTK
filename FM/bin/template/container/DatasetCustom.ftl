<#import "/container/Container.ftl" as CCON>
<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")};

import mcframe.commonCore.notice.*;
<@REV.REV_IMPORT/>
<#if EXISTS(S("FTL.LIST.CUSTOM_IMPORT"))><#include S("FTL.LIST.CUSTOM_IMPORT")/></#if>
//FMCB IMPORT START
${CB("IMPORT")}
//FMCB IMPORT END

/**
 * ブロック"${S("BLOCK_ID")}"コンテナListクラスです。<p>
 *
<#list S(S("BLOCK_ID") + "_MEMO")?split("\n") as lToken>
 * ${lToken}<br>
</#list>
 *
 * 実装仕様書から自動生成されるクラスです。このクラスにカスタマイズを行ってください。
 *
 * @see ${S("PACKAGE")}.${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R_<@CCON.C_SUF/>
 */
<@REV.REV_ANNOTATION/>
abstract public class ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L_<@CCON.C_SUF/><E extends ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>R> extends ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L_<@CCON.C_SUF/>_A<E> <#if B("HAS_IMPLEMENTS_DESCRIPTION")>implements ${S("IMPLEMENTS_DESCRIPTION")} </#if>{

//FMCB CUSTOM_METHOD START
${CB("CUSTOM_METHOD")}
<#-- eclipseのformatterにより、コンストラクタ引数部で改行されてしまう場合にも対応。-->
<#if !INC_LINE_IN_CB("protected " + S("BLOCK_ID") + B("IS_DAO")?string("_","") + "L_" + (S("CLASS_SUFFIX")!="")?string(S("CLASS_SUFFIX"), (S(S("BLOCK_ID") + "_CLASS_SUFFIX"))) + "(Class<E>", "CUSTOM_METHOD")
	&& !INC_LINE_IN_CB("protected " + S("BLOCK_ID") + B("IS_DAO")?string("_","") + "L_" + (S("CLASS_SUFFIX")!="")?string(S("CLASS_SUFFIX"), (S(S("BLOCK_ID") + "_CLASS_SUFFIX"))) + "(", "CUSTOM_METHOD")>
	protected ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L_<@CCON.C_SUF/>(Class<E> rowc){
		super(rowc);
	}

	protected ${S("BLOCK_ID")}<#if B("IS_DAO")>_</#if>L_<@CCON.C_SUF/>(Class<E> rowc, int initCapacity){
		super(rowc, initCapacity);
	}
</#if>
}