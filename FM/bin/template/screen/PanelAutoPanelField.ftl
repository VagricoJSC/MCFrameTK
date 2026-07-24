<#import "/macro/Panel.ftl" as PANEL>
<#if S("${aBlockId}_COMPONENT")="N">
	<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
	public MCPanel ${aBlockId}Panel = null;
	</#if>
<@ETCHED_TITLE lBlockId=aBlockId/>
</#if>
<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>
	<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
	public MCPanel ${aBlockId}Panel = null;
	</#if>
<@ETCHED_TITLE lBlockId=aBlockId/>
	<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
	public MCScrollPane ${aBlockId}ScrollPane = null;
	public MC<#if S("${aBlockId}_COMPONENT")="CGT">ColumnGroup<#elseif S("${aBlockId}_COMPONENT")="LYT">Layout</#if>Table<#if S("${aBlockId}_COMPONENT")="TBL2"||S("${aBlockId}_COMPONENT")="TBL">2</#if><${S("${aBlockId}_FACT_ID")}R> ${aBlockId}<@PANEL.B_SWING_SUF comp=S("${aBlockId}_COMPONENT")/> = null;
	</#if>
</#if>
<#if S("${aBlockId}_COMPONENT")="TRE">
	<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
	public MCPanel ${aBlockId}Panel = null;
	</#if>
<@ETCHED_TITLE lBlockId=aBlockId/>
	<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
	public MCScrollPane ${aBlockId}ScrollPane = null;
	public MCTree<${S("${aBlockId}_FACT_ID")}R> ${aBlockId}<@PANEL.B_SWING_SUF comp=S("${aBlockId}_COMPONENT")/> = null;
	</#if>
</#if>
<#if S("${aBlockId}_COMPONENT")="TAB">
	<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
	public MCPanel ${aBlockId}Panel = null;
	</#if>
<@ETCHED_TITLE lBlockId=aBlockId/>
	<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
	public MCTabbedPane ${aBlockId}<@PANEL.B_SWING_SUF comp=S("${aBlockId}_COMPONENT")/> = null;
	</#if>
</#if>
<#if B("EXPAND_AND_CONTRACT_${aBlockId}_FPANEL")>
	public MCPanel ${aBlockId}BasePanel = null;
	public MCScrollPane ${aBlockId}ScrollPane = null;
</#if>
<#macro ETCHED_TITLE lBlockId>
	<#if S("${lBlockId}_LABEL_CTL")=="$null$"||S("${lBlockId}_LABEL_CTL")=="">
		<#if !B("${lBlockId}_IS_TITLEDBORDER_OVERRIDE")>
	public MCTitledBorder ${lBlockId}TitledBorder = null;
		</#if>
	</#if>
	<#-- "${lBlockId}_LABEL_CTL"‚ª"$inherit"‚Ìê‡‚ÍBorder’è‹`‚È‚µ -->
</#macro>