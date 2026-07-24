<#import "/macro/Panel.ftl" as PANEL>
<#list A("${aBlockId}_ITEM_IDS") as anItemId>
<#if B("${aBlockId}_${anItemId}_HAS_BEAN")>
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
<#if B("${aBlockId}_${anItemId}_IS_BUTTON_TYPE")>
		p.${aBlockId}_${anItemId} = p.beansFactory.createButton("${aBlockId}.${anItemId}"<#if S("${aBlockId}_${anItemId}_COMP_CODE")!="">, "${S("${aBlockId}_${anItemId}_COMP_CODE")}"</#if>);
</#if>
<#if B("${aBlockId}_${anItemId}_IS_PB_TYPE")>
		p.${aBlockId}_${anItemId} = p.beansFactory.createTextPopupMenuItem("${aBlockId}.${anItemId}");
</#if>
<#if S("${aBlockId}_${anItemId}_COMPONENT")="BL">
		p.${aBlockId}_${anItemId} = p.beansFactory.createBorderLine("${aBlockId}.${anItemId}");
</#if>
<#if S("${aBlockId}_${anItemId}_COMPONENT")="LAB">
		p.${aBlockId}_${anItemId} = p.beansFactory.createLabel("${aBlockId}.${anItemId}");
</#if>
<#if S("${aBlockId}_COMPONENT")="N">
	<#if B("${aBlockId}_${anItemId}_IS_FIELD_TYPE")>
<@LABEL bId=aBlockId iId=anItemId/>
		p.${aBlockId}_${anItemId} = p.beansFactory.<@C_F_CREATE_METHOD c=S("${aBlockId}_${anItemId}_COMPONENT") t=S("${aBlockId}_${anItemId}_TYPE")/>("${aBlockId}.${anItemId}");
<@SET_NAME_LABEL bId=aBlockId iId=anItemId/>
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="PF">
<@LABEL bId=aBlockId iId=anItemId/>
		p.${aBlockId}_${anItemId} = p.beansFactory.createPasswordField("${aBlockId}.${anItemId}");
<@SET_NAME_LABEL bId=aBlockId iId=anItemId/>
	</#if>
	<#if B("${aBlockId}_${anItemId}_IS_COMBO_TYPE")>
<@LABEL bId=aBlockId iId=anItemId/>
		p.${aBlockId}_${anItemId} = p.beansFactory.<@C_F_CREATE_METHOD c=S("${aBlockId}_${anItemId}_COMPONENT") t=S("${aBlockId}_${anItemId}_TYPE")/>("${aBlockId}.${anItemId}");
<@SET_NAME_LABEL bId=aBlockId iId=anItemId/>
	</#if>

	<#if S("${aBlockId}_${anItemId}_COMPONENT")="K">
		p.${aBlockId}_${anItemId} = p.beansFactory.createCheckBox("${aBlockId}.${anItemId}");
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="IMG">
<@LABEL bId=aBlockId iId=anItemId/>
		p.${aBlockId}_${anItemId} = p.beansFactory.createImageView("${aBlockId}.${anItemId}");
<@SET_NAME_LABEL bId=aBlockId iId=anItemId/>
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="T">
<@LABEL bId=aBlockId iId=anItemId/>
		p.${aBlockId}_${anItemId}ScrollPane = p.beansFactory.createScrollPane("${aBlockId}.${anItemId}scroll");
		p.${aBlockId}_${anItemId} = p.beansFactory.createTextArea("${aBlockId}.${anItemId}");
<@SET_NAME_LABEL bId=aBlockId iId=anItemId/>
	</#if>
</#if>
<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")!="CM"&&S("${aBlockId}_${anItemId}_COMPONENT")!="SC"&&
		!B("${aBlockId}_${anItemId}_IS_BUTTON_TYPE")&&!B("${aBlockId}_${anItemId}_IS_PB_TYPE")&&
		S("${aBlockId}_${anItemId}_COMPONENT")!="LAB"&&!B("${aBlockId}_${anItemId}_IS_CI_TYPE")&&S("${aBlockId}_${anItemId}_COMPONENT")!="BL"&&
		S("${aBlockId}_${anItemId}_COMPONENT")!="CG"&&S("${aBlockId}_${anItemId}_COMPONENT")!="LV"&&S("${aBlockId}_${anItemId}_COMPONENT")!="LH">
		p.column${aBlockId}_${anItemId} = p.beansFactory.createTableColumn("${aBlockId}.${anItemId}"<@COL_TYPE bId=aBlockId iId=anItemId/>);
	</#if>
</#if>

</#if><#-- !IS_GUI_OVERRIDE -->

<#if S("${aBlockId}_${anItemId}_COMPONENT")="R">
	<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
		p.${aBlockId}_${anItemId}_Group = p.beansFactory.createButtonGroup("${aBlockId}.${anItemId}");
	</#if>
	<#list A("${aBlockId}_${anItemId}_BUTTON_IDS") as aBtnId>
		p.${aBlockId}_${anItemId}_${aBtnId} = p.beansFactory.createRadioButton("${aBlockId}.${anItemId}_${aBtnId}");
	</#list>
</#if>

<#--TREE˜g‚ÌField’è‹`‚Í‚±‚±‚Å‚Í‚È‚µB-->

</#if></#list>

<#if S("${aBlockId}_COMPONENT")="CGT">
	<#list A("${aBlockId}_ITEM_IDS") as anItemId>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")=="CG">
		p.cg${aBlockId}_${anItemId} = p.beansFactory.createColumnGroup("${aBlockId}.${anItemId}");
		</#if>
	</#list>
</#if>
<#if S("${aBlockId}_COMPONENT")="LYT">
	<#list A("${aBlockId}_ITEM_IDS") as anItemId>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")=="LV">
		p.ly${aBlockId}_${anItemId} = p.beansFactory.createColumnLayoutVertical("${aBlockId}.${anItemId}");
		</#if>
		<#if S("${aBlockId}_${anItemId}_COMPONENT")=="LH">
		p.ly${aBlockId}_${anItemId} = p.beansFactory.createColumnLayoutHorizontal("${aBlockId}.${anItemId}");
		</#if>
	</#list>
</#if>

<#macro LABEL bId iId>
<#if S("${bId}_${iId}_LABEL_CTL")=="">
		p.${bId}_${iId}_Label = p.beansFactory.createLabel("${bId}.${iId}_Label");
</#if>
</#macro>

<#macro SET_NAME_LABEL bId iId>
<#if S("${bId}_${iId}_LABEL_CTL")=="">
		p.${bId}_${iId}.setLabel(p.${bId}_${iId}_Label);
</#if>
</#macro>

<#macro COL_TYPE bId iId>
<#if B("${bId}_${iId}_IS_FIELD_TYPE")>
, MCColumnType.<@COL_TYPE_CODE t=S("${bId}_${iId}_TYPE")/><#t>
</#if>
<#if B("${bId}_${iId}_IS_COMBO_TYPE")>
	<#if B("${bId}_${iId}_IS_COMBO620_TYPE")>
, MCColumnType.<@COL_TYPE_CODE t=S("${bId}_${iId}_TYPE")/>_COMBO<@COMBO_CODE c=S("${bId}_${iId}_COMPONENT")/><#t>
	<#else>
, MCColumnType.COMBO<@COMBO_CODE c=S("${bId}_${iId}_COMPONENT")/><#t>
	</#if>
</#if>
<#if S("${bId}_${iId}_COMPONENT")="K">, MCColumnType.CHECK</#if><#t>
<#if S("${bId}_${iId}_COMPONENT")="IMG">, MCColumnType.IMAGE_VIEW</#if><#t>
<#if S("${bId}_${iId}_COMPONENT")="PF">, MCColumnType.PASSWORD</#if><#t>
<#if B("${bId}_${iId}_IS_BC_TYPE")>, MCColumnType.BUTTON</#if><#t>
</#macro>

<#macro COMBO_CODE c>
<#if c="_C"||c="C"></#if><#t>
<#if c="_C2"||c="C2">_FREE</#if><#t>
<#if c="_C3"||c="C3">_SELECT_ONLY</#if><#t>
</#macro>

<#macro COL_TYPE_CODE t>
<#if t="C"||t="CC"||t="CLB">TEXT</#if><#t>
<#if t="N">NUMBER</#if><#t>
<#if t="D">DATE</#if><#t>
<#if t="TS">TIMESTAMP</#if><#t>
</#macro>

<#macro C_F_CREATE_METHOD c t>
<#if c="F"||c="FA"||c="SF"||c="SFA"||c="FF"||c="FFA">
<#if t="C"||t="CC"||t="CLB">createTextField</#if><#rt>
<#if t="N">createNumberField</#if><#rt>
<#if t="D">createDateField</#if><#rt>
<#if t="TS">createTimestampField</#if><#rt>
</#if>
<#if c="_C"||c="_C2"||c="_C3">createComboBox</#if><#rt>
<#if c="C"||c="CA"||c="C2"||c="C2A"||c="C3">
<#if t="C"||t="CC"||t="CLB">createTextComboBox</#if><#rt>
<#if t="N">createNumberComboBox</#if><#rt>
<#if t="D">createDateComboBox</#if><#rt>
<#if t="TS">createTimestampComboBox</#if><#rt>
</#if><#rt>
</#macro>