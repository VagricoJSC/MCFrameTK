<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("SERVER_PACKAGE")};

<@REV.REV_IMPORT/>

/**
 * 画面クエリ"${S("SERVER_CLASS")}"のロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
<#if FMCONST_B("FTL.SUPPRESSWARNINGS")>
@SuppressWarnings({"all"})
</#if>
<@REV.REV_ANNOTATION/>
abstract public class ${S("SERVER_CLASS")}_${S("CLASS_SUFFIX")}_A extends <#if B("HAS_EXTENDS_DESCRIPTION")>${S("EXTENDS_DESCRIPTION")}<#else>${S("SERVER_EXTENDS_CLASS")}</#if> <#if B("HAS_IMPLEMENTS_DESCRIPTION")>implements ${S("IMPLEMENTS_DESCRIPTION")} </#if>{

}