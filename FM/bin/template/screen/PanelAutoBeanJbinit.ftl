<#import "/macro/Panel.ftl" as PANEL>
<#if S("${aBlockId}_COMPONENT")="N">
	<#if B("${aBlockId}_${anItemId}_IS_FIELD_TYPE")>
<@ITEM_ADD lBody=aBlockId lItem=anItemId/>
	<#if A("${aBlockId}_${anItemId}_EVENT_OUTS")?size!=0>
		p.${aBlockId}_${anItemId}.addLinkBeans(<#list A("${aBlockId}_${anItemId}_EVENT_OUTGUIS") as aDEST>p.${aBlockId}_${aDEST}<#if aDEST_has_next>,</#if></#list>);
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="SF"||S("${aBlockId}_${anItemId}_COMPONENT")="SFA">
		p.${aBlockId}_${anItemId}.setListType(MCListType.STRICT);
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="FF"||S("${aBlockId}_${anItemId}_COMPONENT")="FFA">
		p.${aBlockId}_${anItemId}.setListType(MCListType.FREE);
	</#if>
	<#if S("${aBlockId}_${anItemId}_FACT_TYPE")=="C"||S("${aBlockId}_${anItemId}_FACT_TYPE")=="CC"||S("${aBlockId}_${anItemId}_FACT_TYPE")=="CLB">
		<#if S("${aBlockId}_${anItemId}_COMPONENT")="FA"||S("${aBlockId}_${anItemId}_COMPONENT")="FFA"||S("${aBlockId}_${anItemId}_COMPONENT")="SFA">
		p.setPluralValueEnable(p.${aBlockId}_${anItemId}, true);
		<#else>
			<#if B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
		p.setPluralValueEnable(p.${aBlockId}_${anItemId}, false);
			</#if>
		</#if>
	</#if>
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="PF">
<@ITEM_ADD lBody=aBlockId lItem=anItemId/>
	</#if>
	<#if B("${aBlockId}_${anItemId}_IS_COMBO_TYPE")>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")="C"||S("${aBlockId}_${anItemId}_COMPONENT")="CA"||S("${aBlockId}_${anItemId}_COMPONENT")="_C">
		p.${aBlockId}_${anItemId}.setListType(MCListType.STRICT);
		</#if>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")="C2"||S("${aBlockId}_${anItemId}_COMPONENT")="C2A"||S("${aBlockId}_${anItemId}_COMPONENT")="_C2">
		p.${aBlockId}_${anItemId}.setListType(MCListType.FREE);
		</#if>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")="C3"||S("${aBlockId}_${anItemId}_COMPONENT")="_C3">
		p.${aBlockId}_${anItemId}.setListType(MCListType.SELECT_ONLY);
		</#if>
		<#if S("${aBlockId}_${anItemId}_FACT_TYPE")=="C"||S("${aBlockId}_${anItemId}_FACT_TYPE")=="CC"||S("${aBlockId}_${anItemId}_FACT_TYPE")=="CLB">
			<#if S("${aBlockId}_${anItemId}_COMPONENT")="CA"||S("${aBlockId}_${anItemId}_COMPONENT")="C2A">
		p.setPluralValueEnable(p.${aBlockId}_${anItemId}, true);
			<#else>
				<#if B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
					<#if S("${aBlockId}_${anItemId}_COMPONENT")!="_C"&&S("${aBlockId}_${anItemId}_COMPONENT")!="_C2"&&S("${aBlockId}_${anItemId}_COMPONENT")!="_C3">
		p.setPluralValueEnable(p.${aBlockId}_${anItemId}, false);
					</#if>
				</#if>
			</#if>
		</#if>
<#if A("${aBlockId}_${anItemId}_EVENT_OUTS")?size!=0>
		p.${aBlockId}_${anItemId}.setLinkBeans(<#list A("${aBlockId}_${anItemId}_EVENT_OUTGUIS") as aDEST>p.${aBlockId}_${aDEST}<#if aDEST_has_next>,</#if></#list>);
</#if>
<@ITEM_ADD lBody=aBlockId lItem=anItemId/>
	</#if>
	<#if B("${aBlockId}_${anItemId}_IS_CI_TYPE")>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")=="CI#FF"||S("${aBlockId}_${anItemId}_COMPONENT")=="CI#FFA"||S("${aBlockId}_${anItemId}_COMPONENT")=="CI#F"||S("${aBlockId}_${anItemId}_COMPONENT")=="CI#C2"||S("${aBlockId}_${anItemId}_COMPONENT")=="CI#C2A">
<#-- 旧仕様の"CI#F"も"CI#FF"と同じものとして許容する。 -->
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setListType(MCListType.FREE);
		</#if>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")=="CI#SF"||S("${aBlockId}_${anItemId}_COMPONENT")=="CI#SFA"||S("${aBlockId}_${anItemId}_COMPONENT")=="CI#C"||S("${aBlockId}_${anItemId}_COMPONENT")=="CI#CA">
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setListType(MCListType.STRICT);
		</#if>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")=="CI#C3">
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setListType(MCListType.SELECT_ONLY);
		</#if>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")=="CI#FA"||S("${aBlockId}_${anItemId}_COMPONENT")=="CI#FFA"||S("${aBlockId}_${anItemId}_COMPONENT")=="CI#SFA"||S("${aBlockId}_${anItemId}_COMPONENT")=="CI#CA"||S("${aBlockId}_${anItemId}_COMPONENT")=="CI#C2A">
			<#if S("${aBlockId}_${anItemId}_FACT_TYPE")=="C"||S("${aBlockId}_${anItemId}_FACT_TYPE")=="CC"||S("${aBlockId}_${anItemId}_FACT_TYPE")=="CLB">
		p.setPluralValueEnable(p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}, true);
			</#if>
		</#if>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")=="CI#F"||S("${aBlockId}_${anItemId}_COMPONENT")=="CI#FF"||S("${aBlockId}_${anItemId}_COMPONENT")=="CI#SF"||S("${aBlockId}_${anItemId}_COMPONENT")=="CI#C"||S("${aBlockId}_${anItemId}_COMPONENT")=="CI#C2"||S("${aBlockId}_${anItemId}_COMPONENT")=="CI#C3">
			<#if S("${aBlockId}_${anItemId}_FACT_TYPE")=="C"||S("${aBlockId}_${anItemId}_FACT_TYPE")=="CC"||S("${aBlockId}_${anItemId}_FACT_TYPE")=="CLB">
		p.setPluralValueEnable(p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}, false);
			</#if>
		</#if>
		<#if S("${aBlockId}_${anItemId}_FACT_TYPE")=="N">
			<#if S("${aBlockId}_${anItemId}_DIGIT")=="-">
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setMinusEnable(true);
			<#elseif S("${aBlockId}_${anItemId}_DIGIT")=="+">
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setMinusEnable(false);
			</#if>
		</#if>
		<#if B("${aBlockId}_${anItemId}_IS_FACT_FIELD_TYPE")||B("${aBlockId}_${anItemId}_IS_FACT_COMBO_TYPE")>
			<#if A("${aBlockId}_${anItemId}_EVENT_OUTS")?size!=0>
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setLinkBeans(<#list A("${aBlockId}_${anItemId}_EVENT_OUTGUIS") as aDEST>p.${aBlockId}_${aDEST}<#if aDEST_has_next>,</#if></#list>);
			</#if>
		</#if>
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="R">
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>

	<#if S("${aBlockId}_${anItemId}_ID_AT")=="">
		<#if B("${aBlockId}_${anItemId}_IS_FIRST_BEANS")>
		p.${aBlockId}Panel.set<#if B("IS_GUI_INHERITANT_ROOT")>First<#else>Last</#if>Beans(p.${aBlockId}_${anItemId}_Group);
		</#if>
	<#else>
		<#if B("${aBlockId}_${anItemId}_IS_FIRST_BEANS")>
		p.${S("${aBlockId}_${anItemId}_ID_AT")}Panel.set<#if B("IS_GUI_INHERITANT_ROOT")>First<#else>Last</#if>Beans(p.${aBlockId}_${anItemId}_Group);
		</#if>
	</#if>

	<#list A("${aBlockId}_${anItemId}_BUTTON_IDS") as aBtnId>
		<#if aBtnId_index==0>
		p.${aBlockId}_${anItemId}_Group.setFirstBeans(p.${aBlockId}_${anItemId}_${aBtnId});
		</#if>
		p.${aBlockId}_${anItemId}_${aBtnId}.setActionCommand("${S("${aBlockId}_${anItemId}_${aBtnId}_VALUE")}");
		p.${aBlockId}_${anItemId}_Group.add(p.${aBlockId}_${anItemId}_${aBtnId});
		<#if S("${aBlockId}_${anItemId}_ID_AT")=="">
		p.${aBlockId}Panel.add(p.${aBlockId}_${anItemId}_${aBtnId});
		<#else>
			<#if S("${aBlockId}_${anItemId}_ID_AT")!="null">
		p.${S("${aBlockId}_${anItemId}_ID_AT")}Panel.add(p.${aBlockId}_${anItemId}_${aBtnId});
			</#if>
		</#if>
		<#if S("${aBlockId}_${anItemId}_${aBtnId}_NEXT_BEANS") != "">
		p.${aBlockId}_${anItemId}_${aBtnId}.setNextBeans(p.<@PANEL.I_SWING_FIELD nbean=S("${aBlockId}_${anItemId}_${aBtnId}_NEXT_BEANS")/>);
		</#if>
	</#list>

		p.${aBlockId}_${anItemId}_Group.setRow(p.get${aBlockId}${S("${aBlockId}_CODE_S")}(), <@CDEF.CONT_DEF body=aBlockId/>.${anItemId}_META);
<#else>
	<#list A("${aBlockId}_${anItemId}_BUTTON_IDS") as aBtnId>
		<#if !B("${aBlockId}_${anItemId}_${aBtnId}_IS_GUI_OVERRIDE")>
		p.${aBlockId}_${anItemId}_Group.setLastBeans(p.${aBlockId}_${anItemId}_${aBtnId});
		p.${aBlockId}_${anItemId}_Group.add(p.${aBlockId}_${anItemId}_${aBtnId});
			<#if S("${aBlockId}_${anItemId}_ID_AT")=="">
		p.${aBlockId}Panel.add(p.${aBlockId}_${anItemId}_${aBtnId});
			<#else>
				<#if S("${aBlockId}_${anItemId}_ID_AT")!="null">
		p.${S("${aBlockId}_${anItemId}_ID_AT")}Panel.add(p.${aBlockId}_${anItemId}_${aBtnId});
				</#if>
			</#if>
		</#if>
		p.${aBlockId}_${anItemId}_${aBtnId}.setActionCommand("${S("${aBlockId}_${anItemId}_${aBtnId}_VALUE")}");
	</#list>
</#if>

<#if S("${aBlockId}_${anItemId}_NEXT_BEANS") != "">
		p.${aBlockId}_${anItemId}_Group.setNextBeans(p.<@PANEL.I_SWING_FIELD nbean=S("${aBlockId}_${anItemId}_NEXT_BEANS")/>);
</#if>

	</#if>

	<#if S("${aBlockId}_${anItemId}_COMPONENT")="K">
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
<#if S("${aBlockId}_${anItemId}_ID_AT")=="">
		p.${aBlockId}Panel.add(p.${aBlockId}_${anItemId});
	<#if B("${aBlockId}_${anItemId}_IS_FIRST_BEANS")>
		p.${aBlockId}Panel.set<#if B("IS_GUI_INHERITANT_ROOT")>First<#else>Last</#if>Beans(p.${aBlockId}_${anItemId});
	</#if>
<#else>
	<#if S("${aBlockId}_${anItemId}_ID_AT")!="null">
		p.${S("${aBlockId}_${anItemId}_ID_AT")}Panel.add(p.${aBlockId}_${anItemId});
		<#if B("${aBlockId}_${anItemId}_IS_FIRST_BEANS")>
		p.${S("${aBlockId}_${anItemId}_ID_AT")}Panel.set<#if B("IS_GUI_INHERITANT_ROOT")>First<#else>Last</#if>Beans(p.${aBlockId}_${anItemId});
		</#if>
	</#if>
</#if>
</#if>
<#if S("${aBlockId}_${anItemId}_NEXT_BEANS") != "">
		p.${aBlockId}_${anItemId}.setNextBeans(p.<@PANEL.I_SWING_FIELD nbean=S("${aBlockId}_${anItemId}_NEXT_BEANS")/>);
</#if>
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
		p.${aBlockId}_${anItemId}.setRow(p.get${aBlockId}${S("${aBlockId}_CODE_S")}(), <@CDEF.CONT_DEF body=aBlockId/>.${anItemId}_META);
</#if>
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="IMG">
<@ITEM_ADD lBody=aBlockId lItem=anItemId/>
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="T">
<@ITEM_ADD lBody=aBlockId lItem=anItemId/>
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="SC">
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
<#if S("${aBlockId}_${anItemId}_ID_AT")=="">
<#if B("EXPAND_AND_CONTRACT_${aBlockId}_CPANEL")>
		p.${aBlockId}Panel.setLayout(new BorderLayout());
		p.${aBlockId}Panel.add(p.${aBlockId}_${anItemId}_PPanel, BorderLayout.SOUTH);
<#else>
		p.${aBlockId}Panel.add(p.${aBlockId}_${anItemId}_PPanel);
</#if>
	<#if B("${aBlockId}_${anItemId}_IS_FIRST_BEANS")>
		p.${aBlockId}Panel.set<#if B("IS_GUI_INHERITANT_ROOT")>First<#else>Last</#if>Beans(p.${aBlockId}_${anItemId}_PPanel);
	</#if>
<#else>
	<#if S("${aBlockId}_${anItemId}_ID_AT")!="null">
		p.${S("${aBlockId}_${anItemId}_ID_AT")}Panel.add(p.${aBlockId}_${anItemId}_PPanel);
		<#if B("${aBlockId}_${anItemId}_IS_FIRST_BEANS")>
		p.${S("${aBlockId}_${anItemId}_ID_AT")}Panel.set<#if B("IS_GUI_INHERITANT_ROOT")>First<#else>Last</#if>Beans(p.${aBlockId}_${anItemId}_PPanel);
		</#if>
	</#if>
</#if>
</#if>
<#if S("${aBlockId}_${anItemId}_NEXT_BEANS") != "">
		p.${aBlockId}_${anItemId}_PPanel.setNextBeans(p.<@PANEL.I_SWING_FIELD nbean=S("${aBlockId}_${anItemId}_NEXT_BEANS")/>);
</#if>
	</#if>
<#if B("${aBlockId}_${anItemId}_IS_PB_TYPE")>
	<#if S("${aBlockId}_${anItemId}_ICON")!="">
		p.${aBlockId}_${anItemId}.setIcon("${S("${aBlockId}_${anItemId}_ICON")}");
	</#if>
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
		p.getComponentPopupMenu().add(p.${aBlockId}_${anItemId});
</#if>
</#if>
<#if S("${aBlockId}_${anItemId}_IME")!="">
	<#if B("${aBlockId}_${anItemId}_IS_FIELD_TYPE")||S("${aBlockId}_${anItemId}_COMPONENT")="PF"||B("${aBlockId}_${anItemId}_IS_COMBO_TYPE")||S("${aBlockId}_${anItemId}_COMPONENT")="T">
		p.${aBlockId}_${anItemId}.setInputMethodType(<@PANEL.IME_CODE i=S("${aBlockId}_${anItemId}_IME")/>);
	<#elseif B("${aBlockId}_${anItemId}_IS_CI_TYPE")>
		<#if S("${aBlockId}_${anItemId}_CP_ALIAS")=="">
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setInputMethodType(<@PANEL.IME_CODE i=S("${aBlockId}_${anItemId}_IME")/>);
		<#else>
		p.${aBlockId}_${S("${aBlockId}_${anItemId}_CP_ALIAS")}.setInputMethodType(<@PANEL.IME_CODE i=S("${aBlockId}_${anItemId}_IME")/>);
		</#if>
	</#if>
</#if>
</#if><#-- NORMAL枠のIF分岐 終わり -->

<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>
	<#if B("${aBlockId}_${anItemId}_IS_PB_TYPE")>
		<#if S("${aBlockId}_${anItemId}_ICON")!="">
		p.${aBlockId}_${anItemId}.setIcon("${S("${aBlockId}_${anItemId}_ICON")}");
		</#if>
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
		p.${aBlockId}<@PANEL.B_SWING_SUF comp="TBL"/>.getComponentPopupMenu().add(p.${aBlockId}_${anItemId});
</#if>
	</#if>
</#if>

<#if S("${aBlockId}_${anItemId}_COMPONENT")="LAB">
	<#if S("${aBlockId}_${anItemId}_ICON")!="">
		p.${aBlockId}_${anItemId}.setIcon("${S("${aBlockId}_${anItemId}_ICON")}");
	</#if>
  <#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
	<#if S("${aBlockId}_${anItemId}_ID_AT")=="">
		p.${aBlockId}Panel.add(p.${aBlockId}_${anItemId});
	<#else>
		<#if S("${aBlockId}_${anItemId}_ID_AT")!="null">
		p.${S("${aBlockId}_${anItemId}_ID_AT")}Panel.add(p.${aBlockId}_${anItemId});
		</#if>
	</#if>
  </#if>
</#if>
<#if S("${aBlockId}_${anItemId}_COMPONENT")="BL">
  <#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
	<#if S("${aBlockId}_${anItemId}_ID_AT")=="">
		p.${aBlockId}Panel.add(p.${aBlockId}_${anItemId});
	<#else>
		<#if S("${aBlockId}_${anItemId}_ID_AT")!="null">
		p.${S("${aBlockId}_${anItemId}_ID_AT")}Panel.add(p.${aBlockId}_${anItemId});
		</#if>
	</#if>
  </#if>
</#if>
<#if B("${aBlockId}_${anItemId}_IS_BUTTON_TYPE")>
	<#if S("${aBlockId}_${anItemId}_ICON")!="">
		p.${aBlockId}_${anItemId}.setIcon("${S("${aBlockId}_${anItemId}_ICON")}");
	</#if>
	<#if S("${aBlockId}_${anItemId}_FUNCTION")!="">
		p.${aBlockId}_${anItemId}.setFunctionKey(MCFunctionKey.${S("${aBlockId}_${anItemId}_FUNCTION")});
	</#if>
<#if B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
		<#if S("${aBlockId}_${anItemId}_COMP_CODE")!="">
		p.${aBlockId}_${anItemId}.setGroup("${S("${aBlockId}_${anItemId}_COMP_CODE")}");
		</#if>
<#else>
	<#if S("${aBlockId}_${anItemId}_ID_AT")=="">
		p.${aBlockId}Panel.add(p.${aBlockId}_${anItemId});
		<#if B("${aBlockId}_${anItemId}_IS_FIRST_BEANS")>
		p.${aBlockId}Panel.set<#if B("IS_GUI_INHERITANT_ROOT")>First<#else>Last</#if>Beans(p.${aBlockId}_${anItemId});
		</#if>
	<#else>
		<#if S("${aBlockId}_${anItemId}_ID_AT")!="null">
			<#if B("${aBlockId}_${anItemId}_IS_FIRST_BEANS")>
		p.${S("${aBlockId}_${anItemId}_ID_AT")}Panel.set<#if B("IS_GUI_INHERITANT_ROOT")>First<#else>Last</#if>Beans(p.${aBlockId}_${anItemId});
			</#if>
		p.${S("${aBlockId}_${anItemId}_ID_AT")}Panel.add(p.${aBlockId}_${anItemId});
		</#if>
	</#if>
</#if>
	<#if S("${aBlockId}_${anItemId}_NEXT_BEANS") != "">
		p.${aBlockId}_${anItemId}.setNextBeans(p.<@PANEL.I_SWING_FIELD nbean=S("${aBlockId}_${anItemId}_NEXT_BEANS")/>);
	</#if>
</#if>
<#if B("${aBlockId}_${anItemId}_IS_CI_TYPE")>
	<#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")="B"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")="AB">
		<#if S("${aBlockId}_${anItemId}_ICON")!="">
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setIcon("${S("${aBlockId}_${anItemId}_ICON")}");
		</#if>
		<#if S("${aBlockId}_${anItemId}_FUNCTION")!="">
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setFunctionKey(MCFunctionKey.${S("${aBlockId}_${anItemId}_FUNCTION")});
		</#if>
		<#if S("${aBlockId}_${anItemId}_COMP_CODE")!="">
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setGroup("${S("${aBlockId}_${anItemId}_COMP_CODE")}");
		</#if>
	</#if>
	<#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")="PB"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")="APB">
		<#if S("${aBlockId}_${anItemId}_ICON")!="">
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setIcon("${S("${aBlockId}_${anItemId}_ICON")}");
		</#if>
	</#if>
	<#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")="LAB">
		<#if S("${aBlockId}_${anItemId}_ICON")!="">
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setIcon("${S("${aBlockId}_${anItemId}_ICON")}");
		</#if>
	</#if>
	<#if S("${aBlockId}_${anItemId}_FACT_TYPE")="N"||S("${aBlockId}_${anItemId}_FACT_TYPE")="D"||S("${aBlockId}_${anItemId}_FACT_TYPE")="TS">
		<#if S("${aBlockId}_${anItemId}_FORMAT")!=""&&S("${aBlockId}_${anItemId}__FORMAT")!="">
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setFormatID("${S("${aBlockId}_${anItemId}__FORMAT")}");
		</#if>
	</#if>
</#if>
<#if S("${aBlockId}_${anItemId}_COMPONENT")="LP">
	<#if S("${aBlockId}_${anItemId}_ID_AT")=="">
		<#if S("${aBlockId}_COMPONENT")=="TAB">
		p.${aBlockId}Tab.add(p.${S("${aBlockId}_${anItemId}_KEY")}Panel, "${aBlockId}.${anItemId}");
		<#else>
		<#if B("EXPAND_AND_CONTRACT_" + S("${aBlockId}_${anItemId}_KEY") + "_FPANEL")>
		p.${aBlockId}Panel.add(p.FoldBasePanel);
		p.FoldBasePanel.add(p.FoldScrollPane);
		p.FoldScrollPane.setBorder(null);
		p.FoldScrollPane.setViewportView(p.FoldPanel);
		p.FoldBasePanel.setLayoutPosition("C");
		<#else>
		p.${aBlockId}Panel.add(p.${S("${aBlockId}_${anItemId}_KEY")}Panel, null);
		</#if>
		</#if>
	<#else>
		<#if S("${aBlockId}_${anItemId}_ID_AT")!="null">
			<#assign idat=S("${aBlockId}_${anItemId}_ID_AT")/>
			<#if S("${idat}_COMPONENT")=="TAB">
		p.${S("${aBlockId}_${anItemId}_ID_AT")}Tab.add(p.${S("${aBlockId}_${anItemId}_KEY")}Panel, "${aBlockId}.${anItemId}");
			<#else>
		p.${S("${aBlockId}_${anItemId}_ID_AT")}Panel.add(p.${S("${aBlockId}_${anItemId}_KEY")}Panel, null);
			</#if>
		</#if>
	</#if>
	<#if B("${aBlockId}_${anItemId}_IS_FIRST_BEANS")>
		<#if S("${aBlockId}_${anItemId}_ID_AT")=="">
			<#if S("${aBlockId}_COMPONENT")=="TAB">
		p.${aBlockId}Tab.set<#if B("IS_GUI_INHERITANT_ROOT")>First<#else>Last</#if>Beans(p.${S("${aBlockId}_${anItemId}_KEY")}Panel);
			<#else>
		p.${aBlockId}Panel.set<#if B("IS_GUI_INHERITANT_ROOT")>First<#else>Last</#if>Beans(p.${S("${aBlockId}_${anItemId}_KEY")}Panel);
			</#if>
		<#else>
			<#assign idat=S("${aBlockId}_${anItemId}_ID_AT")/>
			<#if S("${idat}_COMPONENT")=="TAB">
		p.${S("${aBlockId}_${anItemId}_ID_AT")}Tab.set<#if B("IS_GUI_INHERITANT_ROOT")>First<#else>Last</#if>Beans(p.${S("${aBlockId}_${anItemId}_KEY")}Panel);
			<#else>
		p.${S("${aBlockId}_${anItemId}_ID_AT")}Panel.set<#if B("IS_GUI_INHERITANT_ROOT")>First<#else>Last</#if>Beans(p.${S("${aBlockId}_${anItemId}_KEY")}Panel);
			</#if>
		</#if>
	</#if>
	<#if S("${aBlockId}_${anItemId}_NEXT_BEANS")!="">
		p.${S("${aBlockId}_${anItemId}_KEY")}Panel.setNextBeans(p.<@PANEL.I_SWING_FIELD nbean=S("${aBlockId}_${anItemId}_NEXT_BEANS")/>);
	</#if>
</#if>

<#macro ITEM_ADD lBody lItem>
<#-- TextField/PasswordField/ComboBox/TextArea/ImageView が対象 -->
<#if !B("${lBody}_${lItem}_IS_GUI_OVERRIDE")>
<#if S("${lBody}_${lItem}_LABEL_CTL")=="">
  <#if S("${lBody}_${lItem}_ICON")!="">
		p.${lBody}_${lItem}_Label.setIcon("${S("${lBody}_${lItem}_ICON")}");
  </#if>
	<#if S("${lBody}_${lItem}_ID_AT")=="">
		p.${lBody}Panel.add(p.${lBody}_${lItem}_Label);
	<#else>
		<#if S("${lBody}_${lItem}_ID_AT")!="null">
		p.${S("${lBody}_${lItem}_ID_AT")}Panel.add(p.${lBody}_${lItem}_Label);
		</#if>
	</#if>
</#if>
<#if S("${lBody}_${lItem}_COMPONENT")="T">
		p.${lBody}_${lItem}ScrollPane.getViewport().add(p.${lBody}_${lItem});
	<#if S("${lBody}_${lItem}_ID_AT")=="">
		p.${lBody}Panel.add(p.${lBody}_${lItem}ScrollPane);
		<#if B("${lBody}_${lItem}_IS_FIRST_BEANS")>
		p.${lBody}Panel.set<#if B("IS_GUI_INHERITANT_ROOT")>First<#else>Last</#if>Beans(p.${lBody}_${lItem});
		</#if>
	<#else>
		<#if S("${lBody}_${lItem}_ID_AT")!="null">
		p.${S("${lBody}_${lItem}_ID_AT")}Panel.add(p.${lBody}_${lItem}ScrollPane);
			<#if B("${lBody}_${lItem}_IS_FIRST_BEANS")>
		p.${S("${lBody}_${lItem}_ID_AT")}Panel.set<#if B("IS_GUI_INHERITANT_ROOT")>First<#else>Last</#if>Beans(p.${lBody}_${lItem});
			</#if>
		</#if>
	</#if>
<#else>
	<#if S("${lBody}_${lItem}_ID_AT")=="">
		p.${lBody}Panel.add(p.${lBody}_${lItem});
		<#if B("${lBody}_${lItem}_IS_FIRST_BEANS")>
		p.${lBody}Panel.set<#if B("IS_GUI_INHERITANT_ROOT")>First<#else>Last</#if>Beans(p.${lBody}_${lItem});
		</#if>
	<#else>
		<#if S("${lBody}_${lItem}_ID_AT")!="null">
		p.${S("${lBody}_${lItem}_ID_AT")}Panel.add(p.${lBody}_${lItem});
			<#if B("${lBody}_${lItem}_IS_FIRST_BEANS")>
		p.${S("${lBody}_${lItem}_ID_AT")}Panel.set<#if B("IS_GUI_INHERITANT_ROOT")>First<#else>Last</#if>Beans(p.${lBody}_${lItem});
			</#if>
		</#if>
	</#if>
</#if>
</#if>
<#if S("${lBody}_${lItem}_NEXT_BEANS")!="">
		p.${lBody}_${lItem}.setNextBeans(p.<@PANEL.I_SWING_FIELD nbean=S("${lBody}_${lItem}_NEXT_BEANS")/>);
</#if>
<#if !B("${lBody}_${lItem}_IS_GUI_OVERRIDE")>
		p.${lBody}_${lItem}.setRow(p.get${lBody}${S("${lBody}_CODE_S")}(), <@CDEF.CONT_DEF body=lBody/>.${lItem}_META);
</#if>
<#if S("${lBody}_${lItem}_TYPE")="N">
	<#if S("${lBody}_${lItem}_FORMAT")!=""&&S("${lBody}_${lItem}__FORMAT")!="">
		p.${lBody}_${lItem}.setFormatID("${S("${lBody}_${lItem}__FORMAT")}");
	<#else>
		<#if !B("${lBody}_${lItem}_IS_GUI_OVERRIDE")&&B("${lBody}_${lItem}_IS_SHARE_META_FORMAT")>
		p.${lBody}_${lItem}.setFormatID(${S("${lBody}_${lItem}_SHARE_META_CLASS")}.${S("${lBody}_${lItem}_SHARE_META_ID")}_FORMAT);
		</#if>
	</#if>
	<#if B("${lBody}_${lItem}__MINUS")>
		p.${lBody}_${lItem}.setMinusEnable(true);
	</#if>
</#if>
<#if S("${lBody}_${lItem}_TYPE")="D"||S("${lBody}_${lItem}_TYPE")="TS">
	<#if S("${lBody}_${lItem}_FORMAT")!=""&&S("${lBody}_${lItem}__FORMAT")!="">
		p.${lBody}_${lItem}.setFormatID("${S("${lBody}_${lItem}__FORMAT")}");
	<#else>
		<#if !B("${lBody}_${lItem}_IS_GUI_OVERRIDE")&&B("${lBody}_${lItem}_IS_SHARE_META_FORMAT")>
		p.${lBody}_${lItem}.setFormatID(${S("${lBody}_${lItem}_SHARE_META_CLASS")}.${S("${lBody}_${lItem}_SHARE_META_ID")}_FORMAT);
		</#if>
	</#if>
</#if>
</#macro>