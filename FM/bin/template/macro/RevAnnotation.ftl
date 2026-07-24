<#macro REV_IMPORT>
<#if A("REVS")?size != 0>
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
</#if>
</#macro>

<#macro REV_ANNOTATION>
<#if A("REVS")?size != 0>
@Rev(pjs = {
	<#list A("REVS") as revLine>
	@Pj( { <#list revLine?split(" ") as revItem>"${revItem}"<#if revItem_has_next>, </#if></#list> })<#if revLine_has_next>, </#if>
	</#list>
})
</#if>
</#macro>

<#macro REV_ANNOTATION_WITH_CNAME cName>
<#-- サーバ側PDefの生成の場合にはOperation名毎のRev生成を行う。-->
<#if B("IS_FIRST_IN_LOGIC")>
${DEL_ALL_CLPJ_REV()}<#rt>
</#if>
<#if ANALYZED()>
	<#if A("REVS")?size == 0>
${DEL_CLPJ_REV(cName)}<#rt>
	<#else>
${SET_CLPJ_REV(cName)}<#rt>
	</#if>
</#if>
<#if A("REVS")?size == 0>
<#assign cls=GET_CLPJ_REV_CLASSES()/>
<#else>
<#assign cls=GET_CLPJ_REV_CLASSES(cName)/>
</#if>
<#if cls?size != 0>
@Rev(cnPjs = {
<#list cls as aCl>
	@Cn(cn = "${aCl}" , rev = {
	<#if aCl==cName>
<#assign revLines = A("REVS")/>
	<#else>
<#assign revLines = GET_CLPJ_REV_PJS(aCl)/>
	</#if>
	<#list revLines as revLine>
		@Pj( { <#list revLine?split(" ") as revItem>"${revItem}"<#if revItem_has_next>, </#if></#list> })<#if revLine_has_next>, </#if>
	</#list>
	})<#if aCl_has_next>,</#if>
</#list>
})
</#if>
</#macro>

<#macro REV_ANNOTATION_WITH_CLASS cName>
<#-- Operationを生成しないLogicクラスの場合に対応する。-->
<#if S("GENE_TYPE")=="ALL">
	<#if B("IS_FIRST_IN_LOGIC")>
${DEL_ALL_CLPJ_REV()}<#rt>
	</#if>
	<#if ANALYZED()>
		<#if A("REVS")?size == 0>
${DEL_CLPJ_REV(cName)}<#rt>
		<#else>
${SET_CLPJ_REV(cName)}<#rt>
		</#if>
	</#if>
	<#if A("REVS")?size == 0>
<#assign cls=GET_CLPJ_REV_CLASSES()/>
	<#else>
<#assign cls=GET_CLPJ_REV_CLASSES(cName)/>
	</#if>
	<#if cls?size != 0>
@Rev(clPjs = {
	<#list cls as aCl>
	@Cl(cl = ${aCl}.class , rev = {
		<#if aCl==cName>
<#assign revLines = A("REVS")/>
		<#else>
<#assign revLines = GET_CLPJ_REV_PJS(aCl)/>
		</#if>
		<#list revLines as revLine>
		@Pj( { <#list revLine?split(" ") as revItem>"${revItem}"<#if revItem_has_next>, </#if></#list> })<#if revLine_has_next>, </#if>
		</#list>
	})<#if aCl_has_next>,</#if>
	</#list>
})
	</#if>
<#else><#-- OperationなしのLogicクラス生成の場合 -->
<@REV_ANNOTATION/>
</#if>
</#macro>

<#macro REV_XML_COMMENT>
<#if A("REVS")?size != 0>
<#list A("REVS") as revLine>
<!-- rev <#list revLine?split(" ") as revItem>"${revItem}"<#if revItem_has_next>, </#if></#list> -->
</#list>
</#if>
</#macro>

<#macro REV_XML_WITH_CLASS tabs>
<#if A("REVS")?size != 0>
${tabs}<Rev>
	<#list A("REVS") as revLine>
<#assign revTokens = revLine?split(" ")/>
		<#if revTokens?size == 2>
${tabs}	<${revTokens?first}><@CDATA value=revTokens?last/></${revTokens?first}>
		</#if>
	</#list>
${tabs}</Rev>

</#if>
</#macro>

<#macro REV_SQL_COMMENT>
<#if A("REVS")?size != 0>
/*****************************
<#list A("REVS") as revLine>
	rev <#list revLine?split(" ") as revItem>"${revItem}"<#if revItem_has_next>, </#if></#list>
</#list>
******************************/
</#if>
</#macro>

<#macro CDATA value>
<![CDATA[${value?replace("]]>","]]]]><![CDATA[>")}]]><#rt>
</#macro>

<#macro JAVA_COMMENT>
<#if EXISTS(S("FTL.CUSTOM_JAVA_COMMENT"))><#include S("FTL.CUSTOM_JAVA_COMMENT")/></#if>
</#macro>

<#macro XML_COMMENT>
<#if EXISTS(S("FTL.CUSTOM_XML_COMMENT"))><#include S("FTL.CUSTOM_XML_COMMENT")/></#if>
</#macro>

<#macro SQL_COMMENT>
<#if EXISTS(S("FTL.CUSTOM_SQL_COMMENT"))><#include S("FTL.CUSTOM_SQL_COMMENT")/></#if>
</#macro>