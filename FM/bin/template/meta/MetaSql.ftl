<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.SQL_COMMENT/>
CREATE OR REPLACE PACKAGE ${SCRL("FILE_NAME")}
<@REV.REV_SQL_COMMENT/>
IS
<#list A("BLOCK_IDS") as aBlockId>
<#list A("${aBlockId}_ITEM_IDS_SCS") as anItemId>
<#if IS_DESCRIBE(aBlockId, anItemId)>
	${anItemId}	<@DATATYPE value=S("${aBlockId}_${anItemId}_TYPE") length=S("${aBlockId}_${anItemId}__LENGTH") decimal=S("${aBlockId}_${anItemId}__DECIMAL")/>;
</#if>
</#list>
</#list>

<#list A("BLOCK_IDS") as aBlockId>
<#list A("${aBlockId}_ITEM_IDS_SCS") as anItemId>
<#if IS_DESCRIBE(aBlockId, anItemId)>
<#if S("${aBlockId}_${anItemId}_TYPE")=="C"||S("${aBlockId}_${anItemId}_TYPE")=="CC"||S("${aBlockId}_${anItemId}_TYPE")=="CLB"||S("${aBlockId}_${anItemId}_TYPE")=="N"||S("${aBlockId}_${anItemId}_TYPE")=="F">
	FUNCTION ${anItemId}_L RETURN NUMBER;
</#if>
</#if>
</#list>
</#list>
END;
/

<#macro DATATYPE value length decimal>
<#if value=="C"||value=="CC">VARCHAR2(<#if length!="">${length}<#else>${FMCONST("MB.FREE_VARCHAR2_DEF_LEN")}</#if> char)</#if><#t>
<#if value=="N">NUMBER<#if length!="">(${length},${decimal})</#if></#if><#t>
<#if value=="D">DATE</#if><#t>
<#if value=="CLB">CLOB</#if><#t>
<#if value=="TS">TIMESTAMP</#if><#t>
<#if value=="F">CHAR(1)</#if><#t>
<#if value=="B">NUMBER</#if><#t>
</#macro>

<#function IS_DESCRIBE b i>
<#if S("MODULE_ID") + "PA_META" == SCRL("FILE_NAME")>
<#return S("${b}_${i}_PLSQL_PKG")==""||S("${b}_${i}_PLSQL_PKG")==SCRL("FILE_NAME")>
<#else>
<#return S("${b}_${i}_PLSQL_PKG")==SCRL("FILE_NAME")>
</#if>
</#function>