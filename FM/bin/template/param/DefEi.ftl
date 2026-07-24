<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")};

import mcframe.commonCore.annotation.EI;
<#if S("SORD")=="SCR">
<@REV.REV_IMPORT/>
</#if>
<#if S("SORD")=="OPE">
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cn;
</#if>
<#if CB("IMPORT")!="">
//FMCB IMPORT START
${CB("IMPORT")}
//FMCB IMPORT END
</#if>

/**
 * [${S("CLASS")}]の入出力情報となる電文（上り・下り電文）と
 * 画面コンテナの間のデータ変換の定義を行うクラスです。
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズはできません。
 */
<#if S("SORD")=="SCR">
<@REV.REV_ANNOTATION/>
</#if>
<#if S("SORD")=="OPE">
<@REV.REV_ANNOTATION_WITH_CNAME cName=S("TELEGRAM")?replace(".","_")/>
</#if>
@EI
public class PDef extends PDef_${S("CLASS_SUFFIX")}_A <#if B("HAS_IMPLEMENTS_DESCRIPTION")>implements ${S("IMPLEMENTS_DESCRIPTION")} </#if>{
<#if CB("CUSTOM")!="">
//FMCB CUSTOM START
${CB("CUSTOM")}
//FMCB CUSTOM END
</#if>
}