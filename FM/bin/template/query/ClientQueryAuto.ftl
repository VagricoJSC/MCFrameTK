<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("CLIENT_PACKAGE")};

<@REV.REV_IMPORT/>

/**
 * 画面クエリ"${S("CLIENT_CLASS")}"クラスです。<p>
 *
<#list S("MEMO")?split("\n") as lToken>
 * ${lToken}<br>
</#list>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
<#if FMCONST_B("FTL.SUPPRESSWARNINGS")>
@SuppressWarnings({"all"})
</#if>
<@REV.REV_ANNOTATION/>
abstract public class ${S("CLIENT_CLASS")}_${S("CLASS_SUFFIX")}_A extends ${S("CLIENT_EXTENDS_CLASS")}{

<#list A("BLOCK_IDS") as aBlockId>
	public MCList ${aBlockId}(MCRow row) {
		MCList<MCRow> down = getListFor(MCCacheType.${S(aBlockId + "_CACHE_TYPE")}, row, "${aBlockId}");
<#if A(aBlockId + "_SORT_ITEMS")?size!=0>
		down.sort(<#list A(aBlockId + "_SORT_ITEMS") as anId>"${anId}"<#if anId_has_next>, </#if></#list>);
</#if>
		return down;
	}
</#list>
}