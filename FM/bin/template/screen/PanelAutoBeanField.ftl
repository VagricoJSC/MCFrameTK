<#import "/macro/Panel.ftl" as PANEL>
<#list A("${aBlockId}_ITEM_IDS") as anItemId>
<#if B("${aBlockId}_${anItemId}_HAS_BEAN")>
<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
<#if B("${aBlockId}_${anItemId}_IS_BUTTON_TYPE")>
<@COMMENT bId=aBlockId iId=anItemId/>
	public MCButton ${aBlockId}_${anItemId} = null;
</#if>
<#if B("${aBlockId}_${anItemId}_IS_PB_TYPE")>
<@COMMENT bId=aBlockId iId=anItemId/>
	public MCTextPopupMenuItem ${aBlockId}_${anItemId} = null;
</#if>
<#if S("${aBlockId}_${anItemId}_COMPONENT")="BL">
<@COMMENT bId=aBlockId iId=anItemId/>
	public MCBorderLine ${aBlockId}_${anItemId} = null;
</#if>
<#if S("${aBlockId}_${anItemId}_COMPONENT")="LAB">
<@COMMENT bId=aBlockId iId=anItemId/>
	public MCLabel ${aBlockId}_${anItemId} = null;
</#if>
<#if S("${aBlockId}_COMPONENT")="N">
	<#if B("${aBlockId}_${anItemId}_IS_FIELD_TYPE")>
<@LABEL bId=aBlockId iId=anItemId/>
<@COMMENT bId=aBlockId iId=anItemId/>
		<#if S("${aBlockId}_${anItemId}_TYPE")="C"||S("${aBlockId}_${anItemId}_TYPE")="CC"||S("${aBlockId}_${anItemId}_TYPE")="CLB">
	public MCTextField ${aBlockId}_${anItemId} = null;
      		</#if>
		<#if S("${aBlockId}_${anItemId}_TYPE")="N">
	public MCNumberField ${aBlockId}_${anItemId} = null;
      		</#if>
		<#if S("${aBlockId}_${anItemId}_TYPE")="D">
	public MCDateField ${aBlockId}_${anItemId} = null;
      		</#if>
		<#if S("${aBlockId}_${anItemId}_TYPE")="TS">
	public MCTimestampField ${aBlockId}_${anItemId} = null;
      		</#if>
		<#if S("${aBlockId}_${anItemId}_TYPE")="F"||S("${aBlockId}_${anItemId}_TYPE")="FA"||S("${aBlockId}_${anItemId}_TYPE")="FF"||S("${aBlockId}_${anItemId}_TYPE")="FFA"||S("${aBlockId}_${anItemId}_TYPE")="SF"||S("${aBlockId}_${anItemId}_TYPE")="SFA">
	//${aBlockId}_${anItemId}は、Booleanの値をFieldで表現しようとしています。
	//このソースの作成に失敗しました。
      		</#if>
<@SET_NAME_LABEL bId=aBlockId iId=anItemId/>
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="PF">
<@LABEL bId=aBlockId iId=anItemId/>
<@COMMENT bId=aBlockId iId=anItemId/>
	public MCPasswordField ${aBlockId}_${anItemId} = null;
<@SET_NAME_LABEL bId=aBlockId iId=anItemId/>
	</#if>
	<#if B("${aBlockId}_${anItemId}_IS_COMBO_TYPE")>
<@LABEL bId=aBlockId iId=anItemId/>
<@COMMENT bId=aBlockId iId=anItemId/>
	public <@OLD_NEW_COMBO_CLASS bId=aBlockId iId=anItemId/> ${aBlockId}_${anItemId} = null;
<@SET_NAME_LABEL bId=aBlockId iId=anItemId/>
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="K">
<@COMMENT bId=aBlockId iId=anItemId/>
	public MCCheckBox ${aBlockId}_${anItemId} = null;
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="IMG">
<@LABEL bId=aBlockId iId=anItemId/>
<@COMMENT bId=aBlockId iId=anItemId/>
	public MCImageView ${aBlockId}_${anItemId} = null;
<@SET_NAME_LABEL bId=aBlockId iId=anItemId/>
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="T">
<@LABEL bId=aBlockId iId=anItemId/>
	public MCScrollPane ${aBlockId}_${anItemId}ScrollPane = null;
<@COMMENT bId=aBlockId iId=anItemId/>
	public MCTextArea ${aBlockId}_${anItemId} = null;
<@SET_NAME_LABEL bId=aBlockId iId=anItemId/>
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="SC">
	public ${S("${aBlockId}_${anItemId}_EMBSCR_CLASS")} ${aBlockId}_${anItemId}_PPanel;
	</#if>
	<#if B("${aBlockId}_${anItemId}_IS_CI_TYPE")&&S("${aBlockId}_${anItemId}_CP_ALIAS")!="">
		<#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")="SC">
	public ${S("${aBlockId}_${anItemId}_EMBSCR_CLASS")} ${aBlockId}_${S("${aBlockId}_${anItemId}_CP_ALIAS")}_PPanel;	// [${aBlockId}]の[${anItemId}]を[${aBlockId}_${S("${aBlockId}_${anItemId}_CP_ALIAS")}_PPanel]としてエイリアス定義。
		<#else>
	public <@COMP_CLASS c=S("${aBlockId}_${anItemId}_FACT_COMPONENT") t=S("${aBlockId}_${anItemId}_FACT_TYPE")/> ${aBlockId}_${S("${aBlockId}_${anItemId}_CP_ALIAS")}<#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")="R">_Group</#if>;	// [${aBlockId}]の[${anItemId}]を[${aBlockId}_${S("${aBlockId}_${anItemId}_CP_ALIAS")}<#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")="R">_Group</#if>]としてエイリアス定義。
		</#if>
	</#if>
</#if>
<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")!="CM"&&S("${aBlockId}_${anItemId}_COMPONENT")!="SC"&&
		!B("${aBlockId}_${anItemId}_IS_BUTTON_TYPE")&&!B("${aBlockId}_${anItemId}_IS_PB_TYPE")&&
		S("${aBlockId}_${anItemId}_COMPONENT")!="LAB"&&!B("${aBlockId}_${anItemId}_IS_CI_TYPE")&&S("${aBlockId}_${anItemId}_COMPONENT")!="BL"&&
		S("${aBlockId}_${anItemId}_COMPONENT")!="CG"&&S("${aBlockId}_${anItemId}_COMPONENT")!="LV"&&S("${aBlockId}_${anItemId}_COMPONENT")!="LH">
<@COMMENT bId=aBlockId iId=anItemId/>
	public MCColumnConfig column${aBlockId}_${anItemId} = null;
	</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="CM">
	public ${S("${aBlockId}_${anItemId}_EMBTBL_CLASS")} ${aBlockId}_${anItemId}_PPanel;
	</#if>
	<#if B("${aBlockId}_${anItemId}_IS_CI_TYPE")&&S("${aBlockId}_${anItemId}_CP_ALIAS")!="">
		<#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")="CM">
	public ${S("${aBlockId}_${anItemId}_EMBTBL_CLASS")} ${aBlockId}_${S("${aBlockId}_${anItemId}_CP_ALIAS")}_PPanel;// [${aBlockId}]の[${anItemId}]を[${aBlockId}_${S("${aBlockId}_${anItemId}_CP_ALIAS")}_PPanel]としてエイリアス定義。
		<#else>
			<#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")="CG">
	public MCColumnGroup cg${aBlockId}_${S("${aBlockId}_${anItemId}_CP_ALIAS")};// [${aBlockId}]の[${anItemId}]を[cg${aBlockId}_${S("${aBlockId}_${anItemId}_CP_ALIAS")}]としてエイリアス定義。
			<#else>
	public MCColumnConfig column${aBlockId}_${S("${aBlockId}_${anItemId}_CP_ALIAS")};// [${aBlockId}]の[${anItemId}]を[column${aBlockId}_${S("${aBlockId}_${anItemId}_CP_ALIAS")}]としてエイリアス定義。
			</#if>
		</#if>
	</#if>
</#if>

</#if><#-- !IS_GUI_OVERRIDE -->

<#if S("${aBlockId}_${anItemId}_COMPONENT")="R">
	<#if !B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")>
<@COMMENT bId=aBlockId iId=anItemId/>
	public MCButtonGroup ${aBlockId}_${anItemId}_Group = null;
	</#if>
	<#list A("${aBlockId}_${anItemId}_BUTTON_IDS") as aBtnId>
	public MCRadioButton ${aBlockId}_${anItemId}_${aBtnId} = null;
	</#list>
</#if>

<#--TREE枠のField定義はここではなし。-->

</#if></#list>

<#list A("${aBlockId}_ITEM_IDS") as anItemId>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")=="CG">
	public MCColumnGroup cg${aBlockId}_${anItemId} = null;
	<#elseif S("${aBlockId}_${anItemId}_COMPONENT")=="LV"||S("${aBlockId}_${anItemId}_COMPONENT")=="LH">
	public MCColumnLayout ly${aBlockId}_${anItemId} = null;
	</#if>
</#list>

<#macro COMMENT bId iId>
<#if S("${bId}_${iId}_NAME")!=""||S("${bId}_${iId}_MESSAGE")!="">
	/**
	 * ${S("${bId}_${iId}_NAME")} ${S("${bId}_${iId}_MESSAGE")}.<p>
	 *
<#if S("${bId}_${iId}_MEMO")!="">
<#list S("${bId}_${iId}_MEMO")?split("\n") as lToken>
	 * ${lToken}<#if lToken_has_next><br></#if>
</#list></#if>
	 */
</#if>
</#macro>

<#macro LABEL bId iId>
<#if S("${bId}_${iId}_LABEL_CTL")=="">
	public MCLabel ${bId}_${iId}_Label = null;
</#if>
</#macro>

<#macro SET_NAME_LABEL bId iId>
<#--<#if S("${bId}_${iId}_LABEL_CTL")=="">
	{	${bId}_${iId}.setLabel(${bId}_${iId}_Label);	}
</#if>-->
</#macro>

<#macro COL_TYPE bId iId>
<#if B("${bId}_${iId}_IS_FIELD_TYPE")>
	<#if S("${bId}_${iId}_TYPE")="C"||S("${bId}_${iId}_TYPE")="CC"||S("${bId}_${iId}_TYPE")="CLB">, MCColumnType.TEXT</#if><#t>
	<#if S("${bId}_${iId}_TYPE")="N">, MCColumnType.NUMBER</#if><#t>
	<#if S("${bId}_${iId}_TYPE")="D">, MCColumnType.DATE</#if><#t>
	<#if S("${bId}_${iId}_TYPE")="TS">, MCColumnType.TIMESTAMP</#if><#t>
</#if>
<#if S("${bId}_${iId}_COMPONENT")="C">, MCColumnType.COMBO</#if><#t>
<#if S("${bId}_${iId}_COMPONENT")="C2">, MCColumnType.COMBO_FREE</#if><#t>
<#if S("${bId}_${iId}_COMPONENT")="C3">, MCColumnType.COMBO_SELECT_ONLY</#if><#t>
<#if S("${bId}_${iId}_COMPONENT")="K">, MCColumnType.CHECK</#if><#t>
<#if S("${bId}_${iId}_COMPONENT")="IMG">, MCColumnType.IMAGE_VIEW</#if><#t>
<#if S("${bId}_${iId}_COMPONENT")="PF">, MCColumnType.PASSWORD</#if><#t>
</#macro>

<#macro COMP_CLASS c t>
<#if c="F"||c="FA"||c="FF"||c="FFA"||c="SF"||c="SFA">
<#if t="C"||t="CC"||t="CLB">MCTextField</#if><#rt>
<#if t="N">MCNumberField</#if><#rt>
<#if t="D">MCDateField</#if><#rt>
<#if t="TS">MCTimestampField</#if><#rt>
</#if>
<#if c="PF">MCPasswordField</#if><#rt>
<#if c="_C"||c="_C2"||c="_C3">MCComboBox</#if><#rt>
<#if c="C"||c="CA"||c="C2"||c="C2A"||c="C3">
<#if t="C"||t="CC"||t="CLB">MCTextComboBox</#if><#rt>
<#if t="N">MCNumberComboBox</#if><#rt>
<#if t="D">MCDateComboBox</#if><#rt>
<#if t="TS">MCTimestampComboBox</#if><#rt>
</#if><#rt>
<#if c="R">MCButtonGroup</#if><#rt>
<#if c="K">MCCheckBox</#if><#rt>
<#if c="T">MCTextArea</#if><#rt>
<#if c="B"||c="AB">MCButton</#if><#rt>
<#if c="LAB">MCLabel</#if><#rt>
<#if c="PB"||c="APB">MCPupupButton</#if><#rt>
<#if c="IMG">MCImageView</#if><#rt>
</#macro>

<#macro OLD_NEW_COMBO_CLASS bId iId>
<#if B("${bId}_${iId}_IS_COMBO620_TYPE")>
<@COMP_CLASS c=S("${bId}_${iId}_COMPONENT") t=S("${bId}_${iId}_TYPE")/>
<#else>
MCComboBox<#rt>
</#if>
</#macro>