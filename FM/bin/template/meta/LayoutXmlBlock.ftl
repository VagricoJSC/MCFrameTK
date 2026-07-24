<#macro LYT_XML_BLOCK aHead tabs><#-- aHead‚Í"MCLabel"‚©""‚Ì‚Ç‚¿‚ç‚© -->
<@REV.REV_XML_COMMENT/>
<@TRIMLINE>
<#if aHead!=""><${aHead}></#if>
${tabs}<${S("MODULE_ID")}>
${tabs}	<meta>
<#list A("BLOCK_IDS") as aBlockId>
<#list A("${aBlockId}_ITEM_IDS") as anItemId>
<#if WH_DEF(aBlockId, anItemId)>
${tabs}		<${anItemId}>
<@GUI_WH bb=aBlockId ii=anItemId GUI_CD="TEXTFIELD" component_CD="TextField" tabs=tabs/>
<@GUI_WH bb=aBlockId ii=anItemId GUI_CD="COMBOBOX" component_CD="ComboBox" tabs=tabs/>
<@GUI_WH bb=aBlockId ii=anItemId GUI_CD="TEXTAREA" component_CD="TextArea" tabs=tabs/>
<@GUI_WH bb=aBlockId ii=anItemId GUI_CD="COLUMN" component_CD="Column" tabs=tabs/>
<@GUI_WH bb=aBlockId ii=anItemId GUI_CD="IMAGEVIEW" component_CD="ImageView" tabs=tabs/>
${tabs}		</${anItemId}>
</#if>
</#list>
</#list>
${tabs}	</meta>
${tabs}</${S("MODULE_ID")}>
<#if aHead!=""></${aHead}></#if>
</@TRIMLINE>
</#macro>

<#macro GUI_WH bb ii GUI_CD component_CD tabs>
<#assign prex="${bb}_${ii}_${GUI_CD}">
<#if S(prex + "_W")!=""||S(prex + "_H")!="">
${tabs}			<${component_CD}>
<#if S(prex + "_W")!="">
${tabs}				<w>${S(prex + "_W")}</w>
</#if>
<#if S(prex + "_H")!="">
${tabs}				<h>${S(prex + "_H")}</h>
</#if>
${tabs}			</${component_CD}>
</#if>
</#macro>

<#function WH_DEF bb ii>
<#assign comps=["TEXTFIELD","COMBOBOX","TEXTAREA","COLUMN","IMAGEVIEW"]/>
<#assign whs=["W","H"]/>
<#list comps as comp>
	<#list whs as wh>
<#if S(bb + "_" + ii + "_" + comp + "_" + wh) != "">
<#return true>
</#if>
	</#list>
</#list>
<#return false>
</#function>