<#import "/macro/Panel.ftl" as PANEL>
		<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>
<#list A("${aBlockId}_ITEM_IDS") as anItemId>
<#if B("${aBlockId}_${anItemId}_HAS_BEAN")>
   <#if !B("${aBlockId}_${anItemId}_IS_CI_TYPE")&&S("${aBlockId}_${anItemId}_COMPONENT")!="CM">
	<#if S("${aBlockId}_${anItemId}_TYPE")!="">
		p.column${aBlockId}_${anItemId}.setMeta(${S(aBlockId + "_FACT_ID")}R.${anItemId}_META);
	</#if>
	<#if S("${aBlockId}_${anItemId}_TYPE")="N">
		<#if S("${aBlockId}_${anItemId}_FORMAT")!=""&&S("${aBlockId}_${anItemId}__FORMAT")!="">
		p.column${aBlockId}_${anItemId}.setFormatID("${S("${aBlockId}_${anItemId}__FORMAT")}");
		<#else>
			<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")&&B("${aBlockId}_${anItemId}_IS_SHARE_META_FORMAT")>
		p.column${aBlockId}_${anItemId}.setFormatID(${S("${aBlockId}_${anItemId}_SHARE_META_CLASS")}.${S("${aBlockId}_${anItemId}_SHARE_META_ID")}_FORMAT);
			</#if>
		</#if>
		<#if B("${aBlockId}_${anItemId}__MINUS")>
		p.column${aBlockId}_${anItemId}.setMinusEnable(true);
		</#if>
	</#if>
	<#if S("${aBlockId}_${anItemId}_TYPE")="D"||S("${aBlockId}_${anItemId}_TYPE")="TS">
		<#if S("${aBlockId}_${anItemId}_FORMAT")!=""&&S("${aBlockId}_${anItemId}__FORMAT")!="">
		p.column${aBlockId}_${anItemId}.setFormatID("${S("${aBlockId}_${anItemId}__FORMAT")}");
		<#else>
			<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")&&B("${aBlockId}_${anItemId}_IS_SHARE_META_FORMAT")>
		p.column${aBlockId}_${anItemId}.setFormatID(${S("${aBlockId}_${anItemId}_SHARE_META_CLASS")}.${S("${aBlockId}_${anItemId}_SHARE_META_ID")}_FORMAT);
			</#if>
		</#if>
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")=="SF">
		p.column${aBlockId}_${anItemId}.setListType(MCListType.STRICT);
	</#if>
	<#if A("${aBlockId}_${anItemId}_EVENT_OUTS")?size!=0>
		p.column${aBlockId}_${anItemId}.addLinkBeans(<#list A("${aBlockId}_${anItemId}_EVENT_OUTS") as aDEST>p.column${aBlockId}_${aDEST}<#if aDEST_has_next>,</#if></#list>);
	</#if>
	<#if S("${aBlockId}_${anItemId}_TYPE")!=""&&!B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
		p.${aBlockId}Table.addColumnConfig(p.column${aBlockId}_${anItemId});
	</#if>
	<#if B("${aBlockId}_${anItemId}_IS_BC_TYPE")>
		<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
		p.${aBlockId}Table.addColumnConfig(p.column${aBlockId}_${anItemId});
		</#if>
		<#if S("${aBlockId}_${anItemId}_ICON")!="">
		p.column${aBlockId}_${anItemId}.setIcon("${S("${aBlockId}_${anItemId}_ICON")}");
		</#if>
<#--		<#if S("${aBlockId}_${anItemId}_COMP_CODE")!="">-->
<#--		p.column${aBlockId}_${anItemId}.setGroup("${S("${aBlockId}_${anItemId}_COMP_CODE")}");-->
<#--		</#if>-->
	</#if>
   </#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")=="CM"&&!B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
		p.${aBlockId}Table.addTable(p.${aBlockId}_${anItemId}_PPanel.${S("${aBlockId}_${anItemId}_EMBTBL_BLOCK")}Table);
	</#if>
</#if>
	<#if B("${aBlockId}_${anItemId}_IS_CI_TYPE")>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")=="CI#FF"||S("${aBlockId}_${anItemId}_COMPONENT")=="CI#F"||S("${aBlockId}_${anItemId}_COMPONENT")=="CI#C2">
<#-- 旧仕様の"CI#F"も"CI#FF"と同じものとして許容する。 -->
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setListType(MCListType.FREE);
		</#if>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")=="CI#SF"||S("${aBlockId}_${anItemId}_COMPONENT")=="CI#C">
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setListType(MCListType.STRICT);
		</#if>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")=="CI#C3">
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setListType(MCListType.SELECT_ONLY);
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
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setLinkBeans(<#list A("${aBlockId}_${anItemId}_EVENT_OUTS") as aDEST>p.column${aBlockId}_${aDEST}<#if aDEST_has_next>, </#if></#list>);
			</#if>
		</#if>
		<#if B("${aBlockId}_${anItemId}_IS_FACT_BC_TYPE")>
			<#if S("${aBlockId}_${anItemId}_ICON")!="">
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setIcon("${S("${aBlockId}_${anItemId}_ICON")}");
			</#if>
<#--			<#if S("${aBlockId}_${anItemId}_COMP_CODE")!="">-->
<#--		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setGroup("${S("${aBlockId}_${anItemId}_COMP_CODE")}");-->
<#--			</#if>-->
		</#if>
	</#if>
<#if S("${aBlockId}_${anItemId}_IME")!="">
	<#if B("${aBlockId}_${anItemId}_IS_FIELD_TYPE")||S("${aBlockId}_${anItemId}_COMPONENT")="PF"||B("${aBlockId}_${anItemId}_IS_COMBO_TYPE")>
		p.column${aBlockId}_${anItemId}.setInputMethodType(<@PANEL.IME_CODE i=S("${aBlockId}_${anItemId}_IME")/>);
	<#elseif B("${aBlockId}_${anItemId}_IS_CI_TYPE")>
		<#if S("${aBlockId}_${anItemId}_CP_ALIAS")=="">
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setInputMethodType(<@PANEL.IME_CODE i=S("${aBlockId}_${anItemId}_IME")/>);
		<#else>
		p.column${aBlockId}_${S("${aBlockId}_${anItemId}_CP_ALIAS")}.setInputMethodType(<@PANEL.IME_CODE i=S("${aBlockId}_${anItemId}_IME")/>);
		</#if>
	</#if>
</#if>
</#list>
<#if S("${aBlockId}_COMPONENT")=="CGT">
	<#list A("${aBlockId}_ITEM_IDS") as anItemId>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")=="CG">
			<#list A("${aBlockId}_${anItemId}_CG_CHILDREN") as cgId>
				<#if S("${aBlockId}_${cgId}_COMPONENT")=="CG">
		p.cg${aBlockId}_${anItemId}.add(p.cg${aBlockId}_${cgId});
				<#elseif S("${aBlockId}_${cgId}_COMPONENT")=="CM">
		p.cg${aBlockId}_${anItemId}.add(p.${aBlockId}_${cgId}_PPanel.${S("${aBlockId}_${cgId}_EMBTBL_BLOCK")}Table);
				<#else>
		p.cg${aBlockId}_${anItemId}.add(p.column${aBlockId}_${cgId});
				</#if>
			</#list>
			<#if S("${aBlockId}_${anItemId}_CG_PARENT")=="">
		p.${aBlockId}Table.addColumnGroup(p.cg${aBlockId}_${anItemId});
			</#if>
		</#if>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")=="CM"&&S("${aBlockId}_${anItemId}_CG_PARENT")=="">
		p.${aBlockId}Table.addColumnGroup(p.${aBlockId}_${anItemId}_PPanel.${S("${aBlockId}_${anItemId}_EMBTBL_BLOCK")}Table);
		</#if>
	</#list>
</#if>
<#if S("${aBlockId}_COMPONENT")=="LYT">
	<#list A("${aBlockId}_LAYOUT_ARRAY") as anItemId>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")=="LH"||S("${aBlockId}_${anItemId}_COMPONENT")=="LV">
			<#list A("${aBlockId}_${anItemId}_CG_CHILDREN") as cgId>
				<#if S("${aBlockId}_${cgId}_COMPONENT")=="LH"||S("${aBlockId}_${cgId}_COMPONENT")=="LV">
		p.ly${aBlockId}_${anItemId}.add(p.ly${aBlockId}_${cgId});
				<#elseif S("${aBlockId}_${cgId}_COMPONENT")=="CM">
		p.ly${aBlockId}_${anItemId}.add(p.${aBlockId}_${cgId}_PPanel.${S("${aBlockId}_${cgId}_EMBTBL_BLOCK")}Table);
				<#else>
		p.ly${aBlockId}_${anItemId}.add(p.column${aBlockId}_${cgId});
				</#if>
			</#list>
			<#if S("${aBlockId}_${anItemId}_CG_PARENT")=="">
		p.${aBlockId}Table.addColumnLayout(p.ly${aBlockId}_${anItemId});
			</#if>
		<#elseif S("${aBlockId}_${anItemId}_COMPONENT")=="CM">
		p.${aBlockId}Table.addColumnLayout(p.${aBlockId}_${anItemId}_PPanel.${S("${aBlockId}_${anItemId}_EMBTBL_BLOCK")}Table);
		</#if>
	</#list>
</#if>
<#if S("${aBlockId}_COMPONENT")=="TBL2"||S("${aBlockId}_COMPONENT")=="TBL">
	<#list A("${aBlockId}_ITEM_IDS") as anItemId>
		<#if B("${aBlockId}_${anItemId}_RETURNFLAG")>
			<#if B("${aBlockId}_${anItemId}_IS_CI_TYPE")>
				<#if S("${aBlockId}_${anItemId}_CP_ALIAS")=="">
		p.${aBlockId}Table.addReturnColumn(p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")});
				<#else>
		p.${aBlockId}Table.addReturnColumn(p.column${aBlockId}_${S("${aBlockId}_${anItemId}_CP_ALIAS")});
				</#if>
			<#else>
		p.${aBlockId}Table.addReturnColumn(p.column${aBlockId}_${anItemId});
			</#if>
		</#if>
	</#list>
</#if>
<#if S("${aBlockId}_FIXED_ITEM")!="">
		// スクロール固定カラムの指定
	<#if B(aBlockId + "_" + S("${aBlockId}_FIXED_ITEM") + "_IS_CI_TYPE")>
		<#if S("${aBlockId}_FIXED_ITEM_CP_ALIAS")=="">
		p.${aBlockId}Table.setUnscrollColumn(p.${S("${aBlockId}_FIXED_ITEM_CMP_ACCESSOR")});
		<#else>
		p.${aBlockId}Table.setUnscrollColumn(p.column${aBlockId}_${S("${aBlockId}_FIXED_ITEM_CP_ALIAS")});
		</#if>
	<#else>
		p.${aBlockId}Table.setUnscrollColumn(p.column${aBlockId}_${S("${aBlockId}_FIXED_ITEM")});
	</#if>
</#if>
	</#if>