<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")};

import mcframe.commonCore.annotation.EI;
<@REV.REV_IMPORT/>
<#if CB("IMPORT")!="">
//FMCB IMPORT START
${CB("IMPORT")}
//FMCB IMPORT END
</#if>

/**
 * 共有項目メタの定義クラスです。
 *
 * 実装仕様書から自動生成されるクラスです。
 */
<@REV.REV_ANNOTATION/>
@EI
public class ${S("CLASS")} extends ${S("CLASS")}_${S("CLASS_SUFFIX")}_A <#if B("HAS_IMPLEMENTS_DESCRIPTION")>implements ${S("IMPLEMENTS_DESCRIPTION")} </#if>{
<#if CB("CUSTOM")!="">
//FMCB CUSTOM START
${CB("CUSTOM")}
//FMCB CUSTOM END
</#if>
}