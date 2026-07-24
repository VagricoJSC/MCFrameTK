<#import "/macro/Panel.ftl" as PANEL>
<#macro PKG_LYT_XML tabs>
<#assign BASE=S("MODULE_ID")+"."+S("ID")+".">
${tabs}<${S("MODULE_ID")}>
${tabs}	<${S("ID")}>

<#assign scsSuffix=B("LYT_ALL")?string("_SCS", "")>
<#list A("BLOCK_IDS" + scsSuffix) as aBlockId><#if !B("${aBlockId}_IS_IGONORE_SCREEN_BLOCK")><#if B("${aBlockId}_HAS_PANEL")>
${tabs}		<${aBlockId}>

<#list A("${aBlockId}_ITEM_IDS" + scsSuffix) as anItemId>
<#if B("LYT_ALL")||!B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")||B("${aBlockId}_${anItemId}_IS_LYT_DESCRIBE")>
<#if B("${aBlockId}_${anItemId}_HAS_BEAN")||B("${aBlockId}_${anItemId}_IS_CI_TYPE")&&S("${aBlockId}_${anItemId}_CP_ALIAS")=="">
<#if S("${aBlockId}_COMPONENT")="N">
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="K"||S("${aBlockId}_${anItemId}_COMPONENT")="SC"||S("${aBlockId}_${anItemId}_COMPONENT")="LP">
<#assign str2=AUTO_LAYOUT_LINE("${aBlockId}_${anItemId}" tabs + "\t\t\t\t")>
<#if str2!="">
${tabs}			<${anItemId}>
${str2}
${tabs}			</${anItemId}>
</#if>
	<#elseif S("${aBlockId}_${anItemId}_COMPONENT")="R">
<#assign str2=AUTO_LAYOUT_LINE("${aBlockId}_${anItemId}" tabs + "\t\t\t\t")>
<#if str2!="">
<#list A("${aBlockId}_${anItemId}_BUTTON_IDS_SCS") as aBtnId>
${tabs}			<${anItemId}_${aBtnId}>
${str2}
${tabs}			</${anItemId}_${aBtnId}>
</#list>
</#if>
	<#elseif B("${aBlockId}_${anItemId}_IS_CI_TYPE")>
		<#assign str2=AUTO_LAYOUT_LINE("${aBlockId}_${anItemId}" tabs + "\t\t\t\t")>
		<#if str2!="">
${tabs}			<${S("${aBlockId}_${anItemId}_TER_CMP_PATH")}<#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")="T">scroll</#if>>
${str2}
${tabs}			</${S("${aBlockId}_${anItemId}_TER_CMP_PATH")}<#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")="T">scroll</#if>>
		</#if>
	<#elseif S("${aBlockId}_${anItemId}_COMPONENT")!="LAB"&&!B("${aBlockId}_${anItemId}_IS_BUTTON_TYPE")&&!B("${aBlockId}_${anItemId}_IS_PB_TYPE")&&S("${aBlockId}_${anItemId}_COMPONENT")!="BL">
		<#if S("${aBlockId}_${anItemId}_LABEL_CTL")=="">
		<#assign str2=AUTO_LAYOUT_LINE("${aBlockId}_${anItemId}" tabs + "\t\t\t\t")>
			<#if str2!="">
${tabs}			<${anItemId}_Label>
${str2}
${tabs}			</${anItemId}_Label>
			</#if>
		</#if>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")="T">
		<#assign str2=AUTO_LAYOUT_LINE("${aBlockId}_${anItemId}" tabs + "\t\t\t\t")>
			<#if str2!="">
${tabs}			<${anItemId}scroll>
${str2}
${tabs}			</${anItemId}scroll>
			</#if>
		<#else>
			<#assign str2=AUTO_LAYOUT_LINE("${aBlockId}_${anItemId}" tabs + "\t\t\t\t")>
			<#if str2!="">
${tabs}			<${anItemId}>
${str2}
${tabs}			</${anItemId}>
			</#if>
		</#if>
	</#if>
</#if>

</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="LAB"||B("${aBlockId}_${anItemId}_IS_BUTTON_TYPE")||S("${aBlockId}_${anItemId}_COMPONENT")="BL">
<#assign str2=AUTO_LAYOUT_LINE("${aBlockId}_${anItemId}" tabs + "\t\t\t\t")>
<#if str2!="">
${tabs}			<${anItemId}>
${str2}
${tabs}			</${anItemId}>
</#if>
	</#if>
</#if><#-- LYT_ALL||!IS_OVERRIDE -->
</#list>
${tabs}		</${aBlockId}>
</#if></#if></#list>
${tabs}	</${S("ID")}>
${tabs}</${S("MODULE_ID")}>
</#macro>

<#function AUTO_LAYOUT_LINE key tabs>
<#if S("${key}_VIEW_DIGIT")=="0">
	<#assign ret=tabs + "<auto_layout>false</auto_layout>">
	<#return ret>
</#if>
<#assign IMV=true>
<#list A("MODE_IDS") as aMode>
	<#if S("${key}_MODE_${aMode}")!="I">
		<#assign IMV=false>
		<#break>
	</#if>
</#list>
<#assign ret="">
<#if A("MODE_IDS")?size!=0&&IMV>
	<#assign ret=tabs + "<auto_layout>false</auto_layout>">
</#if>
<#return ret>
</#function>