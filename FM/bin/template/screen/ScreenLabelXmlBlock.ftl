<#import "/macro/xmlResource.ftl" as RES>
<#macro LAB_XML_BLOCK aHead tabs mode><#-- aHeadは"MCLabel"か"MCReportLabel"か""のいずれか -->
<#assign HEAD_PD=aHead + ".">
<#if aHead==""><#assign HEAD_PD=""></#if>
<#-- 今回の自動生成で追加されるリソースも既存分とあわせてソートするために -->
<#-- 解析データがある場合には、解析データにソート参考情報を追加する。-->
<#if ANALYZED()>
	<#if mode=="APPEND">
${SET_STRING_TO_XML(HEAD_PD + S("MODULE_ID") + "." + S("ID"), "DUMMY")}<#rt>
	</#if>
</#if>
<#if aHead!=""><${aHead}></#if>
	<#if mode=="APPEND">
<#assign mods=GET_SUBKEYS_FROM_XML(HEAD_PD, S("MODULE_ID"))/>
	<#else>
<#assign mods=GET_SUBKEYS_FROM_XML(HEAD_PD)/>
	</#if>
<#list mods as modId>
	<#if modId?length < 5>
${tabs}<${modId}>
		<#if mode=="APPEND"&&modId=S("MODULE_ID")>
<#assign scrs=GET_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.", S("ID"))/>
		<#else>
<#assign scrs=GET_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.")/>
		</#if>
<#list scrs as anId>
		<#if mode=="APPEND"&&modId=S("MODULE_ID")&&anId=S("ID")>
${tabs}	<${anId}>
${tabs}		<label><@RES.CDATA value=S("NAME")/></label>
${tabs}	</${anId}>
		<#else>
${tabs}	<${anId}>
${tabs}		<label><@RES.CDATA value=GET_FROM_XML(HEAD_PD + "${modId}.${anId}.label")/></label>
${tabs}	</${anId}>
		</#if>
</#list>
${tabs}</${modId}><#rt>
	</#if>
</#list>
<#if aHead!=""></${aHead}></#if>
</#macro>
