<#import "/macro/Panel.ftl" as PANEL>
<#if S("${aBlockId}_COMPONENT")="GNT">
<#assign gbId=aBlockId>
<#assign gbFactId=S("${gbId}_FACT_ID")>
<#assign rbId=S("${gbId}_GANTTCHART_RESOURCE_ID")>
<#assign rbFactId=S("${gbId}_GANTTCHART_RESOURCE_FACT_ID")>
<#else>
<#-- Œp³‰æ–Ê‚ÅGNT_R‚Ì‚Ý‚ª’è‹`‚³‚ê‚Ä‚¢‚éê‡‚ÌGNT_RƒuƒƒbƒN‚É‘Î‚·‚éˆ— -->
<#assign gbId=S("${aBlockId}_GANTTCHART_ID")>
<#assign gbFactId=S("${aBlockId}_GANTTCHART_FACT_ID")>
<#assign rbId=aBlockId>
<#assign rbFactId=S("${rbId}_FACT_ID")>
</#if>
		MCGanttChart<#if !B(aBlockId + "_IS_OVERRIDE")><${rbFactId}R, ${gbFactId}R></#if>.MCGanttInfo ${gbId}GChartInfo = p.${gbId}GChart.info();
<#-- ¡ e‰æ–Ê aBlock is GNT -->
<#-- ‡@ ResouceÝ’èETaskÝ’è‚Ì—¼•û‚ ‚è -->
<#-- ¡ Žq‰æ–Ê aBlock is GNT or GNT_R -->
<#-- aBlock is GNT -->
<#-- ‡A ResouceÝ’èETaskÝ’è‚Ì—¼•û‚ ‚è -->
<#-- aBlock is GNT && GANTTCHART_RESOURCE_ID ‚ª BLOCK_IDS‚ÉŠÜ‚Ü‚ê‚È‚¢ -->
<#-- ‡B TaskÝ’è‚Ì‚Ý -->
<#-- aBlock is GNT_R -->
<#-- ‡C ResouceÝ’è‚Ì‚Ý -->
<#if (aBlockId==gbId&&A("BLOCK_IDS")?seq_contains(rbId))||aBlockId==rbId>
	<#if B(rbId + "_IS_OVERRIDE")>
		mcframe.clientCore.beans.chart.gantt.model.MCResourceModel gcrm = (mcframe.clientCore.beans.chart.gantt.model.MCResourceModel)${gbId}GChartInfo.getResourceModel();
		String[] domViews = new String[]{
		<#list A(rbId + "_ITEM_IDS") as anItemId>
			<#if B(rbId + "_" + anItemId + "_IS_GANTT_VIEW")>
			${rbFactId}R.<@META_EXP bl=rbId it=anItemId/>,
			</#if>
		</#list>
		};
		gcrm.addViewColumns(domViews, true);
		String[] domKeys = new String[]{
		<#list A(rbId + "_ITEM_IDS") as anItemId>
			<#if B(rbId + "_" + anItemId + "_IS_GANTT_KEY")>
			${rbFactId}R.<@META_EXP bl=rbId it=anItemId/>,
			</#if>
		</#list>
		};
		gcrm.addKeyColumns(domKeys, true);
		<#else>
		String[] domViews = new String[]{
		<#list A(rbId + "_ITEM_IDS") as anItemId>
			<#if B(rbId + "_" + anItemId + "_IS_GANTT_VIEW")>
			${rbFactId}R.<@META_EXP bl=rbId it=anItemId/>,
			</#if>
		</#list>
		};
		String[] domKeys = new String[]{
		<#list A(rbId + "_ITEM_IDS") as anItemId>
			<#if B(rbId + "_" + anItemId + "_IS_GANTT_KEY")>
			${rbFactId}R.<@META_EXP bl=rbId it=anItemId/>,
			</#if>
		</#list>
		};
		${gbId}GChartInfo.setResources(p.get${rbId}L()
				, domViews
				, domKeys
				, <#if S(rbId + "_GRID_BAND_ITEM")!="">${rbFactId}R.<@META_EXP bl=rbId it=S(rbId + "_GRID_BAND_ITEM")/><#else>null</#if>);
	</#if>
</#if>
<#if aBlockId==gbId>
	<#if B(gbId + "_IS_GUI_OVERRIDE")>
		mcframe.clientCore.beans.chart.gantt.model.MCTaskModel gctm = (mcframe.clientCore.beans.chart.gantt.model.MCTaskModel)${gbId}GChartInfo.getTaskModel();
		<#if S("${gbId}_TASK_START_ITEM")!="">
		gctm.setStartDateColumn(${S("${gbId}_FACT_ID")}R.<@META_EXP bl=gbId it=S("${gbId}_TASK_START_ITEM")/>);
		</#if>
		<#if S("${gbId}_TASK_END_ITEM")!="">
		gctm.setEndDateColumn(${S("${gbId}_FACT_ID")}R.<@META_EXP bl=gbId it=S("${gbId}_TASK_END_ITEM")/>);
		</#if>
		<#if S("${gbId}_TASK_PERCENT_ITEM")!="">
		gctm.setPercentCompleteColumn(${S("${gbId}_FACT_ID")}R.<@META_EXP bl=gbId it=S("${gbId}_TASK_PERCENT_ITEM")/>);
		</#if>
	<#else>
		${gbId}GChartInfo.setTasks(p.get${gbId}L()
				, ${S("${gbId}_FACT_ID")}R.<@META_EXP bl=gbId it=S("${gbId}_TASK_START_ITEM")/>
				, ${S("${gbId}_FACT_ID")}R.<@META_EXP bl=gbId it=S("${gbId}_TASK_END_ITEM")/>
				, <#if S("${gbId}_TASK_PERCENT_ITEM")!="">${S("${gbId}_FACT_ID")}R.<@META_EXP bl=gbId it=S("${gbId}_TASK_PERCENT_ITEM")/><#else>null</#if>);
	</#if>

</#if>
<#if (aBlockId==gbId&&A("BLOCK_IDS")?seq_contains(rbId))||aBlockId==rbId>
		MCResourceColumnInfo rc = p.${gbId}GChart.getResourceColumnInfo();
	<#list A(rbId + "_ITEM_IDS") as anItemId>
		<#if S(rbId + "_" + anItemId + "_LABEL_CTL")=="">
		rc.setLabelAndMessage(p, ${rbFactId}R.<@META_EXP bl=rbId it=anItemId/>, "${rbId}.${anItemId}");
		</#if>
		<#if S(rbId + "_" + anItemId + "_TYPE")=="D"||S(rbId + "_" + anItemId + "_TYPE")=="TS">
			<#if S(rbId + "_" + anItemId + "_FORMAT")!=""&&S(rbId + "_" + anItemId + "__FORMAT")!="">
		rc.setDateFormatId(${rbFactId}R.<@META_EXP bl=rbId it=anItemId/>, "${S(rbId + "_" + anItemId + "__FORMAT")}");
			</#if>
		</#if>
	</#list>
</#if>
<#if aBlockId==gbId>
		MCTaskColumnInfo tc = p.${gbId}GChart.getTaskColumnInfo();
<#list A(gbId + "_ITEM_IDS") as anItemId>
	<#if S(gbId + "_" + anItemId + "_LABEL_CTL")=="">
		tc.setLabelAndMessage(p, ${S("${gbId}_FACT_ID")}R.<@META_EXP bl=gbId it=anItemId/>, "${gbId}.${anItemId}");
	</#if>
	<#if S(gbId + "_" + anItemId + "_TYPE")=="D"||S(gbId + "_" + anItemId + "_TYPE")=="TS">
		<#if S(gbId + "_" + anItemId + "_FORMAT")!=""&&S(gbId + "_" + anItemId + "__FORMAT")!="">
		tc.setDateFormatId(${S("${gbId}_FACT_ID")}R.<@META_EXP bl=gbId it=anItemId/>, "${S(gbId + "_" + anItemId + "__FORMAT")}");
		</#if>
	</#if>
	<#if B(gbId + "_" + anItemId + "_FACT_CONTAINER_ITEM")&&S(gbId + "_" + anItemId + "_TYPE")!="R">
		tc.setTaskLabelVisible(${S("${gbId}_FACT_ID")}R.<@META_EXP bl=gbId it=anItemId/>, <#if B(gbId + "_" + anItemId + "_IS_GANTT_VIEW")>true<#else>false</#if>);
	</#if>
</#list>
</#if>

<#macro META_EXP bl it>
<#if S(bl + "_" + it + "_CP_ALIAS") == "">
	<#if S(bl + "_" + it + "_DEPEND_TER_PATH") == "">
$${it}<#rt>
	<#else>
$${S(bl + "_" + it + "_DEPEND_ITEM_ID")} + ".${S(bl + "_" + it + "_DEPEND_TER_PATH")}"<#rt>
	</#if>
<#else>
$${S(bl + "_" + it + "_CP_ALIAS")}<#rt>
</#if>
</#macro>
