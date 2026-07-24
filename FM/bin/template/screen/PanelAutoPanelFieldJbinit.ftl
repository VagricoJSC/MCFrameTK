<#import "/macro/Panel.ftl" as PANEL>
<#if S("${aBlockId}_COMPONENT")="N">
	<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
		p.${aBlockId}Panel = p.beansFactory.createPanel("${aBlockId}");
<@ETCHED_TITLE lBlockId=aBlockId/>
	</#if>
</#if>
<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>
	<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
		p.${aBlockId}Panel = p.beansFactory.createPanel("${aBlockId}");
<@ETCHED_TITLE lBlockId=aBlockId/>
		p.${aBlockId}ScrollPane = p.beansFactory.createScrollPane("${aBlockId}.scroll");
		p.create${aBlockId}Table();
	</#if>
</#if>
<#if S("${aBlockId}_COMPONENT")="TRE">
	<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
		p.${aBlockId}Panel = p.beansFactory.createPanel("${aBlockId}");
<@ETCHED_TITLE lBlockId=aBlockId/>
		p.${aBlockId}ScrollPane = p.beansFactory.createScrollPane("${aBlockId}.scroll");
		<#if S("${aBlockId}_OPT1_DragAndDrop")!="true">
		p.${aBlockId}<@PANEL.B_SWING_SUF comp=S("${aBlockId}_COMPONENT")/> = p.beansFactory.createTree("${aBlockId}.tree");
		<#else>
		p.${aBlockId}<@PANEL.B_SWING_SUF comp=S("${aBlockId}_COMPONENT")/> = p.beansFactory.createDandDTree("${aBlockId}.tree");
		((MCTree64)p.${aBlockId}<@PANEL.B_SWING_SUF comp=S("${aBlockId}_COMPONENT")/>).delegate64 = get${aBlockId}Delegate();
		</#if>
	</#if>
</#if>
<#if S("${aBlockId}_COMPONENT")="TAB">
	<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
		p.${aBlockId}Panel = p.beansFactory.createPanel("${aBlockId}");
<@ETCHED_TITLE lBlockId=aBlockId/>
		p.${aBlockId}<@PANEL.B_SWING_SUF comp=S("${aBlockId}_COMPONENT")/> = p.beansFactory.createTabbedPane("${aBlockId}.tab");
	</#if>
</#if>
<#if B("EXPAND_AND_CONTRACT_${aBlockId}_FPANEL")>
		p.${aBlockId}BasePanel = p.beansFactory.createPanel("${aBlockId}.base");
		p.${aBlockId}ScrollPane = p.beansFactory.createScrollPane("${aBlockId}.scroll");
</#if>
<#macro ETCHED_TITLE lBlockId>
	<#if S("${lBlockId}_LABEL_CTL")=="$null$"||S("${lBlockId}_LABEL_CTL")=="">
		p.${lBlockId}TitledBorder = p.beansFactory.createTitledBorder();
	</#if>
	<#-- "${lBlockId}_LABEL_CTL"‚ª"$inherit$""$PARTS$"‚Ìê‡‚ÍBorder’è‹`‚È‚µ -->
</#macro>