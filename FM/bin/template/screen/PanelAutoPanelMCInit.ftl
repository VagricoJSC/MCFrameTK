<#import "/macro/Panel.ftl" as PANEL>
<#-- Panel/ScrollPane/Table/Tree のカスタマイズ要件外の設定を行う。 -->
<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))||S("${aBlockId}_COMPONENT")="TAB"||S("${aBlockId}_COMPONENT")="TRE">
	<#if !B("${aBlockId}_IS_EI")><#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
		p.${aBlockId}<@PANEL.B_SWING_SUF comp=S("${aBlockId}_COMPONENT")/>.addAllListener(p);
	</#if></#if>
</#if>