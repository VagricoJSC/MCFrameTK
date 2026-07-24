<#macro PKG_ACT_XML tabs>
${tabs}<${S("MODULE_ID")}>
${tabs}	<${S("ID")}>
<#-- 2010/5/31 cont/MCACType.xml ‚É"type"‚ðˆÚ‚µ‚½B -->
<#--	<#if S("ACTYPE")!="">			-->
<#--		<type>${S("ACTYPE")}</type>	-->
<#--	</#if>					-->
<#list A("BLOCK_IDS") as aBlockId><#if B("${aBlockId}_HAS_PANEL")>
<#if HAS_ACTYPE(aBlockId)>
${tabs}		<${aBlockId}><#if S("${aBlockId}_ACTYPE")!="">${S("${aBlockId}_ACTYPE")}</#if>
<#list A("${aBlockId}_ITEM_IDS") as anItemId>
<#if B("${aBlockId}_${anItemId}_HAS_BEAN")>
	<#if B("${aBlockId}_${anItemId}_IS_BUTTON_TYPE")||B("${aBlockId}_${anItemId}_IS_PB_TYPE")||B("${aBlockId}_${anItemId}_IS_BC_TYPE")>
		<#if S("${aBlockId}_${anItemId}_ACTYPE")!="">
${tabs}			<${anItemId}>
${tabs}				<type>${S("${aBlockId}_${anItemId}_ACTYPE")}</type>
${tabs}			</${anItemId}>
		</#if>
	</#if>
</#if>
</#list>
${tabs}		</${aBlockId}>
</#if>
</#if></#list>
${tabs}	</${S("ID")}>
${tabs}</${S("MODULE_ID")}>
</#macro>

<#function HAS_ACTYPE bId>
<#list A(bId + "_ITEM_IDS") as anItemId>
	<#if B(bId + "_${anItemId}_HAS_BEAN")>
		<#if B(bId + "_${anItemId}_IS_BUTTON_TYPE")||B(bId + "_${anItemId}_IS_PB_TYPE")||B(bId + "_${anItemId}_IS_BC_TYPE")>
			<#if S(bId + "_${anItemId}_ACTYPE")!=""><#return true></#if>
		</#if>
	</#if>
</#list>
<#return false>
</#function>