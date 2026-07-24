<#import "/macro/Panel.ftl" as PANEL>
<#--<#if !INC_LINE_IN_CB("${aBlockId}Panel.setBounds(new", "CUSTOM_JBINIT")>
		${aBlockId}Panel.setBounds(new Rectangle(${S("${aBlockId}_RECTANGLE")}));
</#if>-->
<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))||S("${aBlockId}_COMPONENT")="TRE">
<#--<#if !INC_LINE_IN_CB("${aBlockId}ScrollPane.setBounds(new", "CUSTOM_JBINIT")>
		${aBlockId}ScrollPane.setBounds(new Rectangle(${S("${aBlockId}ScrollPane_RECTANGLE")}));
</#if>--></#if>