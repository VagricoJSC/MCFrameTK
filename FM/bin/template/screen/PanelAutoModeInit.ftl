<#import "/macro/Panel.ftl" as PANEL>
<@TRIMLINE>
	<#if S("${aBlockId}_COMPONENT")="N">
		<#list A("${aBlockId}_ITEM_IDS") as anItemId>
			<#if S("${aBlockId}_${anItemId}_MODE_${aMode}")!="">
			<#if S("${aBlockId}_${anItemId}_COMPONENT")!=""&&S("${aBlockId}_${anItemId}_COMPONENT")!="$"&&S("${aBlockId}_${anItemId}_FACT_COMPONENT")!="BL">
	<#if S("${aBlockId}_${anItemId}_COMPONENT")!="LP"&&S("${aBlockId}_${anItemId}_COMPONENT")!="SC"&&!B("${aBlockId}_${anItemId}_IS_CI_TYPE")>
${"\t\t"}<@MODE_SET lBlockId=aBlockId lItemId=anItemId lModeId=aMode pref="p."/>
	<#elseif B("${aBlockId}_${anItemId}_IS_CI_TYPE")>
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.putMode(p, ${aMode}, MCMode.<@M_STATUS llMode=S("${aBlockId}_${anItemId}_MODE_${aMode}")/>);
	<#elseif S("${aBlockId}_${anItemId}_COMPONENT")=="SC">
		p.${aBlockId}_${anItemId}_PPanel.putStatus(${aMode}, ${S("${aBlockId}_${anItemId}_EMBSCR_CLASS")}.${S("${aBlockId}_${anItemId}_MODE_${aMode}")});
	</#if>
			</#if>
			</#if>
		</#list>
	</#if>


	<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>
		<#list A("${aBlockId}_ITEM_IDS") as anItemId>
			<#if S("${aBlockId}_${anItemId}_MODE_${aMode}")!="">
			<#if S("${aBlockId}_${anItemId}_COMPONENT")!=""&&S("${aBlockId}_${anItemId}_COMPONENT")!="$"&&S("${aBlockId}_${anItemId}_FACT_COMPONENT")!="BL"&&S("${aBlockId}_${anItemId}_FACT_COMPONENT")!="CG">
	<#if S("${aBlockId}_${anItemId}_COMPONENT")!="CM"&&!B("${aBlockId}_${anItemId}_IS_CI_TYPE")>
${"\t\t"}p.<@TBL_MODE_SET kBlockId=aBlockId kItemId=anItemId kModeId=aMode/>
	<#elseif B("${aBlockId}_${anItemId}_IS_CI_TYPE")>
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.putMode(p, ${aMode}, MCMode.<@M_STATUS llMode=S("${aBlockId}_${anItemId}_MODE_${aMode}")/>);
	<#elseif S("${aBlockId}_${anItemId}_COMPONENT")=="CM">
		p.${aBlockId}_${anItemId}_PPanel.putStatus(${aMode}, ${S("${aBlockId}_${anItemId}_EMBTBL_CLASS")}.${S("${aBlockId}_${anItemId}_MODE_${aMode}")});
	</#if>
			</#if>
			</#if>
		</#list>
	</#if>


	<#if S("${aBlockId}_COMPONENT")="TAB">
		<#list A("${aBlockId}_ITEM_IDS") as anItemId>
			<#if S("${aBlockId}_${anItemId}_MODE_${aMode}")!="">
<#if B("${aBlockId}_${anItemId}_IS_BUTTON_TYPE")||B("${aBlockId}_${anItemId}_IS_PB_TYPE")||S("${aBlockId}_${anItemId}_COMPONENT")="LAB"||S("${aBlockId}_${anItemId}_COMPONENT")="BL">
${"\t\t"}<@MODE_SET lBlockId=aBlockId lItemId=anItemId lModeId=aMode pref="p."/>
</#if>
			</#if>
		</#list>
	</#if>
</@TRIMLINE>

<#macro TBL_MODE_SET kBlockId kItemId kModeId>
<#if !B("${kBlockId}_${kItemId}_IS_BUTTON_TYPE")&&S("${kBlockId}_${kItemId}_COMPONENT")!="LAB"&&S("${kBlockId}_${kItemId}_COMPONENT")!="PB"&&S("${kBlockId}_${kItemId}_COMPONENT")!="BL">column</#if><@MODE_SET lBlockId=kBlockId lItemId=kItemId lModeId=kModeId/>
</#macro>

<#macro MODE_SET lBlockId lItemId lModeId pref="">
<#if S("${lBlockId}_${lItemId}_MODE_${lModeId}")=="R"||S("${lBlockId}_${lItemId}_MODE_${lModeId}")=="E"||S("${lBlockId}_${lItemId}_MODE_${lModeId}")=="RO"||S("${lBlockId}_${lItemId}_MODE_${lModeId}")=="D"||S("${lBlockId}_${lItemId}_MODE_${lModeId}")=="I">
${pref}${lBlockId}_${lItemId}<#if S("${lBlockId}_${lItemId}_COMPONENT")="R">_Group</#if>.putMode(p, ${lModeId}, MCMode.<@M_STATUS llMode=S("${lBlockId}_${lItemId}_MODE_${lModeId}")/>);
</#if></#macro>

<#macro M_STATUS llMode>
<#switch llMode>
<#case "R">REQUIRED<#break>
<#case "E">ENABLE<#break>
<#case "RO">READ_ONLY<#break>
<#case "D">DISABLE<#break>
<#case "I">INVISIBLE<#break>
</#switch></#macro>