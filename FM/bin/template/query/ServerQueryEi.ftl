<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("SERVER_PACKAGE")};

import mcframe.commonCore.annotation.EI;
<@REV.REV_IMPORT/>
<#if CB("IMPORT")!="">
//FMCB IMPORT START
${CB("IMPORT")}
//FMCB IMPORT END
</#if>
/**
 * 画面クエリ"${S("SERVER_CLASS")}"のロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
<@REV.REV_ANNOTATION/>
@EI
<#if S("MODIFIER")="abstract">abstract </#if>public class ${S("SERVER_CLASS")} extends ${S("SERVERCLASS")}_${S("CLASS_SUFFIX")} <#if B("HAS_IMPLEMENTS_DESCRIPTION")>implements ${S("IMPLEMENTS_DESCRIPTION")} </#if>{
<#if CB("CUSTOM")!="">
//FMCB CUSTOM START
${CB("CUSTOM")}
//FMCB CUSTOM END
</#if>
}