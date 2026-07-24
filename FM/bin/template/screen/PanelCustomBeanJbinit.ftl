<#if S("${aBlockId}_COMPONENT")="N">
	<#if B("${aBlockId}_${anItemId}_IS_FIELD_TYPE")||S("${aBlockId}_${anItemId}_COMPONENT")="PF"||B("${aBlockId}_${anItemId}_IS_COMBO_TYPE")||S("${aBlockId}_${anItemId}_COMPONENT")="T">
<@L_SET_B llBlockId=aBlockId llItemId=anItemId/>
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="R">
		<#list A("${aBlockId}_${anItemId}_BUTTON_IDS") as aBtnId>
<#--<#if !INC_LINE_IN_CB("${lBlockId}_$lItemId}_${aBtnId}.setBounds(new", "CUSTOM_JBINIT")>
		${lBlockId}_$lItemId}_${aBtnId}.setBounds(new Rectangle(${S("${lBlockId}_${lItemId}_${aBtnId}_RECTANGLE")}));
</#if>-->
		</#list>
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="K">
<@SET_B lBlockId=aBlockId lItemId=anItemId/>
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="SC"||S("${aBlockId}_${anItemId}_COMPONENT")="LP">
<@SET_B lBlockId=aBlockId lItemId=anItemId/>
	</#if>
</#if>

<#if S("${aBlockId}_${anItemId}_COMPONENT")="LAB">
<@SET_B lBlockId=aBlockId lItemId=anItemId/>
</#if>

<#if B("${aBlockId}_${anItemId}_IS_BUTTON_TYPE")||B("${aBlockId}_${anItemId}_IS_PB_TYPE")>
<@SET_B lBlockId=aBlockId lItemId=anItemId/>
</#if>

<#macro L_SET_B llBlockId llItemId>
<#if S("${llBlockId}_${llItemId}_LABEL")!="">
<#--<#if !INC_LINE_IN_CB("${llBlockId}_${llItemId}_Label.setBounds(new", "CUSTOM_JBINIT")>
		${llBlockId}_${llItemId}_Label.setBounds(new Rectangle(${S("${llBlockId}_${llItemId}_LABEL_RECTANGLE")}));
</#if>-->
</#if>
<@SET_B lBlockId=llBlockId lItemId=llItemId/>
</#macro>

<#macro SET_B lBlockId lItemId>
<#--<#if !INC_LINE_IN_CB("${lBlockId}_${lItemId}.setBounds(new", "CUSTOM_JBINIT")>
		${lBlockId}_${lItemId}<#if S("${lBlockId}_${lItemId}_COMPONENT")="T">ScrollPane</#if><#if S("${lBlockId}_${lItemId}_COMPONENT")="SC"||S("${lBlockId}_${lItemId}_COMPONENT")="LP">_PPanel</#if>.setBounds(new Rectangle(${S("${lBlockId}_${lItemId}_RECTANGLE")}));
</#if>-->
</#macro>