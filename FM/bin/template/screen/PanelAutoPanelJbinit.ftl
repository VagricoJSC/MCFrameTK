<#import "/macro/Panel.ftl" as PANEL>
<#if S("${aBlockId}_LABEL_CTL")=="$null$"||S("${aBlockId}_LABEL_CTL")=="">
	<#if !B("${aBlockId}_IS_TITLEDBORDER_OVERRIDE")>
		p.${aBlockId}Panel.setBorder(p.${aBlockId}TitledBorder);
	</#if>
</#if>
	<#-- "${lBlockId}_LABEL_CTL"が"$inherit"の場合はBorder定義なし -->

<#if !B("${aBlockId}_IS_GUI_OVERRIDE")>
	<#if S("${aBlockId}_ADD_TARTGET")="">
		p.add(p.${aBlockId}Panel);
	</#if>
	<#if B("${aBlockId}_IS_FIRST_BEANS")>
		p.set<#if B("IS_GUI_INHERITANT_ROOT")>First<#else>Last</#if>Beans(p.${aBlockId}Panel);
	</#if>
	<#if S("${aBlockId}_NEXT_BEANS") != "">
		p.${aBlockId}Panel.setNextBeans(p.${S("${aBlockId}_NEXT_BEANS")}Panel);
	</#if>
</#if>
<#-- "LP"枠の追加（TabbedPane/Normalへの追加）はここではなく、PanelAutoBeanJbinit で行っている。 -->

<#if !B("${aBlockId}_IS_GUI_OVERRIDE")&&PANEL.isTable(S("${aBlockId}_COMPONENT"))>
		p.${aBlockId}Panel.add(p.${aBlockId}ScrollPane);
<@TTT_FOCUS_IMP bId=aBlockId/>
		p.${aBlockId}ScrollPane.setViewportView(p.${aBlockId}Table);
		p.${aBlockId}Table.setList(p.get${aBlockId}L());
	<#if S("${aBlockId}_OPT1_RowNumberColumn")!="">
		p.${aBlockId}Table.setRowNumberColumnVisible(${S("${aBlockId}_OPT1_RowNumberColumn")});
	</#if>
	<#if S("${aBlockId}_OPT1_StatusColumn")!="">
		p.${aBlockId}Table.setStatusColumnVisible(${S("${aBlockId}_OPT1_StatusColumn")});
	</#if>
</#if>

<#if !B("${aBlockId}_IS_GUI_OVERRIDE")&&S("${aBlockId}_COMPONENT")="TRE">
		p.${aBlockId}Panel.add(p.${aBlockId}ScrollPane);
<@TTT_FOCUS_IMP bId=aBlockId/>
		p.${aBlockId}ScrollPane.setViewportView(p.${aBlockId}Tree);
		p.${aBlockId}Tree.setList(p.get${aBlockId}L());
	<#if S("${aBlockId}_OPT1_RootVisible")!="">
		p.${aBlockId}Tree.setRootVisible(${S("${aBlockId}_OPT1_RootVisible")});
	</#if>
	<#if S("${aBlockId}_OPT1_ScrollsOnExpand")!="">
		p.${aBlockId}Tree.setScrollsOnExpand(${S("${aBlockId}_OPT1_ScrollsOnExpand")});
	</#if>
</#if>

<#if !B("${aBlockId}_IS_GUI_OVERRIDE")&&S("${aBlockId}_COMPONENT")="TAB">
		p.${aBlockId}Panel.add(p.${aBlockId}Tab);
		p.${aBlockId}Panel.set<#if B("IS_GUI_INHERITANT_ROOT")>First<#else>Last</#if>Beans(p.${aBlockId}<@PANEL.B_SWING_SUF comp=S("${aBlockId}_COMPONENT")/>);
	<#if S("${aBlockId}_OPT1_TabLayoutPolicy")!="">
		p.${aBlockId}Tab.setTabLayoutPolicy(MCTabbedPane.${S("${aBlockId}_OPT1_TabLayoutPolicy")});
	</#if>
	<#if S("${aBlockId}_OPT1_TabPlacement")!="">
		p.${aBlockId}Tab.setTabPlacement(MCTabbedPane.${S("${aBlockId}_OPT1_TabPlacement")});
	</#if>
</#if>
<#if S("${aBlockId}_IO_TYPE")=="S"||S("${aBlockId}_IO_TYPE")=="NV">
		p.${aBlockId}Panel.setValueCheck(false);
</#if>
<#if S("${aBlockId}_IO_TYPE")=="S"||S("${aBlockId}_IO_TYPE")=="P">
		p.${aBlockId}Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
</#if>
<#if S("${aBlockId}_LYT")!="">
		p.${aBlockId}Panel.setLayoutPosition("${S("${aBlockId}_LYT")}");
</#if>

<#macro TTT_FOCUS_IMP bId>
		p.${bId}Panel.set<#if B("IS_GUI_INHERITANT_ROOT")>First<#else>Last</#if>Beans(p.${bId}<@PANEL.B_SWING_SUF comp=S("${bId}_COMPONENT")/>);
<#list A("${bId}_ITEM_IDS") as anItemId>
	<#if B("${bId}_${anItemId}_IS_BUTTON_TYPE")||S("${bId}_${anItemId}_COMPONENT")="LP">
		p.${bId}<@PANEL.B_SWING_SUF comp=S("${bId}_COMPONENT")/>.setNextBeans(p.<@PANEL.I_SWING_FIELD nbean="${bId}_${anItemId}"/>);
	<#break>
	</#if>
</#list>
</#macro>