<#import "/macro/XmlResource.ftl" as RES>
<#macro PKG_LAB_XML tabs>
${tabs}<${S("MODULE_ID")}>
${tabs}	<${S("ID")}>
<#list A("BLOCK_IDS") as aBlockId><#if B("${aBlockId}_HAS_PANEL")>
${tabs}		<${aBlockId}><#if S("${aBlockId}_LABEL_CTL")=="">
${tabs}			<label><@RES.CDATA value=S("${aBlockId}_LABEL")/></label><#elseif S("${aBlockId}_MESSAGE")!="">
${tabs}			<label><@RES.CDATA value=S("${aBlockId}_MESSAGE")/></label></#if><#if S("${aBlockId}_MESSAGE")!="">
${tabs}			<message><@RES.CDATA value=S("${aBlockId}_MESSAGE")/></message></#if>
<#list A("${aBlockId}_ITEM_IDS") as anItemId>
<#if (B("${aBlockId}_${anItemId}_HAS_BEAN"))||(B("${aBlockId}_${anItemId}_IS_CI_TYPE")&&S("${aBlockId}_${anItemId}_CP_ALIAS")=="")>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="R"><#-- RadioButton -->
${tabs}			<${anItemId}><#if S("${aBlockId}_${anItemId}_MESSAGE_CTL")==""><message><@RES.CDATA value=S("${aBlockId}_${anItemId}_MESSAGE")/></message></#if></${anItemId}>
		<#list A("${aBlockId}_${anItemId}_BUTTON_IDS") as aBtnId>
${tabs}			<${anItemId}_${aBtnId}><label><@RES.CDATA value=S("${aBlockId}_${anItemId}_${aBtnId}_LABEL")/></label></${anItemId}_${aBtnId}>
		</#list>
	<#elseif B("${aBlockId}_${anItemId}_IS_CI_TYPE")>
${tabs}			<${S("${aBlockId}_${anItemId}_TER_CMP_PATH")}><#if S("${aBlockId}_${anItemId}_LABEL_CTL")==""><#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")!="R">
${tabs}				<label><@RES.CDATA value=S("${aBlockId}_${anItemId}_LABEL")/></label></#if></#if><#if S("${aBlockId}_${anItemId}_MESSAGE_CTL")=="">
${tabs}				<message><@RES.CDATA value=S("${aBlockId}_${anItemId}_MESSAGE")/></message></#if>
${tabs}			</${S("${aBlockId}_${anItemId}_TER_CMP_PATH")}>
	<#else>
${tabs}			<${anItemId}><#if S("${aBlockId}_${anItemId}_LABEL_CTL")=="">
${tabs}				<label><@RES.CDATA value=S("${aBlockId}_${anItemId}_LABEL")/></label></#if><#if S("${aBlockId}_${anItemId}_MESSAGE_CTL")=="">
${tabs}				<message><@RES.CDATA value=S("${aBlockId}_${anItemId}_MESSAGE")/></message></#if>
${tabs}			</${anItemId}>
	</#if>
</#if>
<#if S("${aBlockId}_${anItemId}_COMPONENT")=="LP">
${tabs}			<${anItemId}><#if S("${aBlockId}_${anItemId}_LABEL_CTL")=="">
${tabs}				<label><@RES.CDATA value=S("${aBlockId}_${anItemId}_LABEL")/></label></#if><#if S("${aBlockId}_${anItemId}_MESSAGE_CTL")=="">
${tabs}				<message><@RES.CDATA value=S("${aBlockId}_${anItemId}_MESSAGE")/></message></#if>
${tabs}			</${anItemId}>
</#if>
</#list>
${tabs}		</${aBlockId}>
</#if></#list>
${tabs}	</${S("ID")}>
${tabs}</${S("MODULE_ID")}>
</#macro>