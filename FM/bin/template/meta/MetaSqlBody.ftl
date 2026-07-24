<#import "/macro/RevAnnotation.ftl" as REV>
<#assign PRE_NAME=SCRL("FILE_NAME")?substring(0,SCRL("FILE_NAME")?length-5)/><#-- "CPA_META_BODY"‚©‚ç"CPA_META"‚ð’Šo -->
<@REV.SQL_COMMENT/>
CREATE OR REPLACE PACKAGE BODY ${PRE_NAME}
<@REV.REV_SQL_COMMENT/>
IS
<#list A("BLOCK_IDS") as aBlockId>
<#list A("${aBlockId}_ITEM_IDS_SCS") as anItemId>
<#if IS_DESCRIBE(aBlockId, anItemId)>
<#if S("${aBlockId}_${anItemId}_TYPE")=="C"||S("${aBlockId}_${anItemId}_TYPE")=="CC"||S("${aBlockId}_${anItemId}_TYPE")=="CLB"||S("${aBlockId}_${anItemId}_TYPE")=="N">
	FUNCTION ${anItemId}_L RETURN NUMBER IS
	BEGIN
		RETURN <#if S("${aBlockId}_${anItemId}__LENGTH")=="">-1<#else>${S("${aBlockId}_${anItemId}__LENGTH")}</#if>;
	END ${anItemId}_L;

<#elseif S("${aBlockId}_${anItemId}_TYPE")=="F">
	FUNCTION ${anItemId}_L RETURN NUMBER IS
	BEGIN
		RETURN 1;
	END ${anItemId}_L;

</#if>
</#if>
</#list>
</#list>
END;
/
<#function IS_DESCRIBE b i>
<#if S("MODULE_ID") + "PA_META_BODY" == SCRL("FILE_NAME")>
<#return S("${b}_${i}_PLSQL_PKG")==""||S("${b}_${i}_PLSQL_PKG")==PRE_NAME>
<#else>
<#return S("${b}_${i}_PLSQL_PKG")==PRE_NAME>
</#if>
</#function>