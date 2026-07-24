<#macro ACT_XML_BLOCK aHead tabs><#-- aHeadは"MCAcType"か""のどちらか -->
<#assign HEAD_PD=aHead + ".">
<#if aHead==""><#assign HEAD_PD=""></#if>
<#-- 今回の自動生成で追加されるリソースも既存分とあわせてソートするために -->
<#-- 解析データがある場合には、解析データにソート参考情報を追加する。-->
<#if ANALYZED()>
${SET_STRING_TO_XML(HEAD_PD + S("MODULE_ID") + "." + S("ID"), "DUMMY")}<#rt>
</#if>
<#if aHead!=""><${aHead}></#if>
<#list GET_SUBKEYS_FROM_XML(HEAD_PD, S("MODULE_ID")) as modId>
${tabs}<${modId}>
		<#if modId=S("MODULE_ID")>
<#assign scrs=GET_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.", S("ID"))/>
		<#else>
<#assign scrs=GET_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.")/>
		</#if>
<#list scrs as anId>
		<#if modId=S("MODULE_ID")&&anId=S("ID")>
	<#if S("ACTYPE")!="">
${tabs}	<${anId}>
${tabs}		<type>${S("ACTYPE")}</type>
${tabs}	</${anId}>
	</#if>
		<#else>
	<#if GET_FROM_XML(HEAD_PD + "${modId}.${anId}.type")!="">
${tabs}	<${anId}>
${tabs}		<type>${GET_FROM_XML(HEAD_PD + "${modId}.${anId}.type")}</type>
${tabs}	</${anId}>
	</#if>
		</#if>
</#list>
${tabs}</${modId}>
</#list>
<#if aHead!=""></${aHead}></#if>
</#macro>
