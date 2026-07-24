<#import "/macro/Panel.ftl" as PANEL>
<#-- Table/Tree枠以外の枠(NORMAL枠）、および、-->
<#-- Table/Tree枠のボタンのカスタマイズ要件外の設定を行う。-->

<#--<#if !B("${aBlockId}_${anItemId}_IS_OVERRIDE")>-->
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
<#if S("${aBlockId}_COMPONENT")="N">
	<#if B("${aBlockId}_${anItemId}_IS_COMBO_TYPE")>
		p.${aBlockId}_${anItemId}.setListListener(p);
		p.${aBlockId}_${anItemId}.addAllListener(p);
	<#else>
		<#if B("${aBlockId}_${anItemId}_IS_FACT_COMBO_TYPE")>
<#if S("${aBlockId}_${anItemId}_EVENT_CLASS")!="">
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
</#if>
		</#if>
	</#if>
	<#if B("${aBlockId}_${anItemId}_IS_FIELD_TYPE")>
		p.${aBlockId}_${anItemId}.setListListener(p);
		p.${aBlockId}_${anItemId}.addAllListener(p);
	<#else>
		<#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="SF"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="SFA"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="FF"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="FFA">
<#if S("${aBlockId}_${anItemId}_EVENT_CLASS")!="">
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
</#if>
		</#if>
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="K">
		p.${aBlockId}_${anItemId}.addAllListener(p);
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="IMG">
		p.${aBlockId}_${anItemId}.addAllListener(p);
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="T">
		p.${aBlockId}_${anItemId}.addAllListener(p);
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="PF">
		p.${aBlockId}_${anItemId}.addAllListener(p);
	</#if>
</#if>

<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")!="LAB"&&!B("${aBlockId}_${anItemId}_IS_BUTTON_TYPE")&&!B("${aBlockId}_${anItemId}_IS_PB_TYPE")&&
		S("${aBlockId}_${anItemId}_COMPONENT")!="SC"&&S("${aBlockId}_${anItemId}_COMPONENT")!="CM"&&!B("${aBlockId}_${anItemId}_IS_CI_TYPE")&&S("${aBlockId}_${anItemId}_COMPONENT")!="BL"&&
		S("${aBlockId}_${anItemId}_COMPONENT")!="CG"&&S("${aBlockId}_${anItemId}_COMPONENT")!="LV"&&S("${aBlockId}_${anItemId}_COMPONENT")!="LH">
		p.column${aBlockId}_${anItemId}.addAllListener(p);
	</#if>
	<#if B("${aBlockId}_${anItemId}_IS_BC_TYPE")>
		p.column${aBlockId}_${anItemId}.setAPMethodName("do${aBlockId}_${anItemId}");
	</#if>
	<#if B("${aBlockId}_${anItemId}_IS_COMBO_TYPE")>
		p.column${aBlockId}_${anItemId}.setListListener(p);
	<#else>
		<#if B("${aBlockId}_${anItemId}_IS_FACT_COMBO_TYPE")>
<#if S("${aBlockId}_${anItemId}_EVENT_CLASS")!="">
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
</#if>
		</#if>
	</#if>
	<#if B("${aBlockId}_${anItemId}_IS_FIELD_TYPE")>
		p.column${aBlockId}_${anItemId}.setListListener(p);
	<#else>
		<#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="SF"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="SFA"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="FF"||S("${aBlockId}_${anItemId}_FACT_COMPONENT")=="FFA">
<#if S("${aBlockId}_${anItemId}_EVENT_CLASS")!="">
		p.${S("${aBlockId}_${anItemId}_CMP_ACCESSOR")}.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
</#if>
		</#if>
	</#if>
</#if>

<#if S("${aBlockId}_COMPONENT")!="$">
<#if B("${aBlockId}_${anItemId}_IS_BUTTON_TYPE")||B("${aBlockId}_${anItemId}_IS_PB_TYPE")>
		p.${aBlockId}_${anItemId}.addAllListener(p);
		p.${aBlockId}_${anItemId}.setAPMethodName("do${aBlockId}_${anItemId}");
</#if>
</#if>

</#if>

<#if S("${aBlockId}_COMPONENT")="N"&&S("${aBlockId}_${anItemId}_COMPONENT")="R">
	<#--<#if !B("${aBlockId}_${anItemId}_IS_OVERRIDE")>-->
	<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
		p.${aBlockId}_${anItemId}_Group.addAllListener(p);
	</#if>
	<#list A("${aBlockId}_${anItemId}_BUTTON_IDS") as aBtnId>
		p.${aBlockId}_${anItemId}_${aBtnId}.addAllListener(p);
	</#list>
</#if>