<#import "/macro/xmlResource.ftl" as RES>
<#macro LAB_XML_BLOCK aHead tabs mode>
<#assign HEAD_PD=aHead + ".">
<#if aHead==""><#assign HEAD_PD=""></#if>
<#-- 今回の自動生成で追加されるリソースも既存分とあわせてソートするために -->
<#-- 解析データがある場合には、解析データにソート参考情報を追加する。-->
<#if ANALYZED()>
	<#if mode=="APPEND">
${SET_STRING_TO_XML(HEAD_PD + S("MODULE_ID") + "." + S("ID") + "." + S("METHOD_ID"), "DUMMY")}<#rt>
	</#if>
</#if>
<#if aHead!=""><${aHead}></#if>
	<#if mode=="APPEND">
<#assign mods=GET_SUBKEYS_FROM_XML(HEAD_PD, S("MODULE_ID"))/>
	<#else>
<#assign mods=GET_SUBKEYS_FROM_XML(HEAD_PD)/>
	</#if>
<#list mods as modId>
	<#if modId?length<5>
${tabs}<${modId}>
		<#if mode=="APPEND"&&modId=S("MODULE_ID")>
<#assign lgcs=GET_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.", S("ID"))/>
		<#else>
<#assign lgcs=GET_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.")/>
		</#if>
<#list lgcs as anId><#if anId!="label">
		<#if mode=="APPEND"&&modId=S("MODULE_ID")&&anId=S("ID")>
${tabs}	<${anId}>
${tabs}		<label><@RES.CDATA value=S("NAME")/></label>
		<#else>
${tabs}	<${anId}>
${tabs}		<label><@RES.CDATA value=GET_FROM_XML(HEAD_PD + "${modId}.${anId}.label")/></label>
		</#if>
		<#if mode=="APPEND"&&modId=S("MODULE_ID")&&anId=S("ID")>
<#assign opes=GET_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.${anId}.", S("METHOD_ID"))/>
		<#else>
<#assign opes=GET_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.${anId}.")/>
		</#if>
	<#list opes as anOpeId><#if anOpeId!="label">
		<#if mode=="APPEND"&&modId=S("MODULE_ID")&&anId=S("ID")&&anOpeId=S("METHOD_ID")>
${tabs}		<${anOpeId}>
${tabs}			<label><@RES.CDATA value=S("METHOD_NAME")/></label>
${tabs}		</${anOpeId}>
		<#else>
${tabs}		<${anOpeId}>
${tabs}			<label><@RES.CDATA value=GET_FROM_XML(HEAD_PD + "${modId}.${anId}.${anOpeId}.label")/></label>
${tabs}		</${anOpeId}>
		</#if>
	</#if></#list>
${tabs}	</${anId}>
</#if></#list>
${tabs}</${modId}>
	</#if>
</#list>
<#if aHead!=""></${aHead}></#if>
</#macro>
