<#import "/macro/xmlResource.ftl" as RES>
<#macro LAB_XML_BLOCK aHead tabs>
<#assign HEAD_PD=aHead + ".">
<#if aHead==""><#assign HEAD_PD=""></#if>
<#if aHead!=""><${aHead}></#if>
<#assign mods=GET_NS_SUBKEYS_FROM_XML(HEAD_PD)/>
<#list mods as modId>
	<#if modId?length<5>
${tabs}<${modId}>
<#assign tbls=GET_NS_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.")/>
<#list tbls as anId>
${tabs}	<${anId}>
${tabs}		<label><@RES.CDATA value=GET_FROM_XML(HEAD_PD + "${modId}.${anId}.label")/></label>
<#assign cols=GET_NS_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.${anId}.")/>
<#list cols as aColId><#if aColId!="label">
${tabs}		<${aColId}>
${tabs}			<label><@RES.CDATA value=GET_FROM_XML(HEAD_PD + "${modId}.${anId}.${aColId}.label")/></label>
${tabs}		</${aColId}>
</#if></#list>
${tabs}	</${anId}>
</#list>
${tabs}</${modId}>
	</#if>
</#list>
<#if aHead!=""></${aHead}></#if>
</#macro>
