<#import "/macro/Panel.ftl" as PANEL>
<#macro PKG_LYT_XML tabs>
<#assign BASE=S("MODULE_ID")+"."+S("ID")+".">
<#assign str2="">
${tabs}<${S("MODULE_ID")}>
${tabs}	<${S("ID")}>
	<#if !B("IS_LAYOUT_OVERRIDE")>
${tabs}		<w>${S("ROOT_PANEL_SIZE_W")}</w>
${tabs}		<h>${S("ROOT_PANEL_SIZE_H")}</h>
<#if B("IS_NO_FRAME")>
${tabs}		<frame_w>${S("ROOT_FRAME_SIZE_W")}</frame_w>
${tabs}		<frame_h>${S("ROOT_FRAME_SIZE_H")}</frame_h>
</#if>
	<#else>
${tabs}		<!-- •\Ž¦˜g‚ª‘¶Ý‚·‚é‰æ–Ê‚ðŒp³‚µ‚Ä‚¢‚é‚½‚ß -->
${tabs}		<!-- ‚±‚Ì‰æ–Ê‚Ì w,h,frame_w,frame_h ‚ÍŽ©“®¶¬‚µ‚Ü‚¹‚ñB-->
	</#if>
<#if B("IS_FIT")>
${tabs}		<fit>true</fit>
</#if>
<#assign scsSuffix=B("LYT_ALL")?string("_SCS", "")>
<#list A("BLOCK_IDS" + scsSuffix) as aBlockId><#if !B("${aBlockId}_IS_IGONORE_SCREEN_BLOCK")><#if B("${aBlockId}_HAS_PANEL")>
${tabs}		<${aBlockId}>
	<#if B("LYT_ALL")||!B("${aBlockId}_IS_GUI_OVERRIDE")||B("${aBlockId}_IS_LYT_DESCRIBE")>
<#assign str=REGLE("${aBlockId}_RECTANGLE" tabs + "\t\t\t")>
${str}
	<#else>
${tabs}			<!-- ‚±‚Ì˜g‚ÍŒp³’è‹`‚³‚ê‚Ä‚¢‚é‚½‚ß ˜g‚Ì x,y,w,h ‚ÍŽ©“®¶¬‚µ‚Ü‚¹‚ñB-->
	</#if>
	<#if B("${aBlockId}_IS_FIT")>
${tabs}			<fit>true</fit>
	</#if>
<#if B("EXPAND_AND_CONTRACT_${aBlockId}_FPANEL")>
<#assign str=REGLE("${aBlockId}_RECTANGLE" tabs + "\t\t\t\t")>
${tabs}			<scroll>
${str}
${tabs}			</scroll>
${tabs}			<base>
${str}
${tabs}			</base>
</#if>
<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))||S("${aBlockId}_COMPONENT")="TRE">
	<#if B("LYT_ALL")||!B("${aBlockId}_IS_GUI_OVERRIDE")||B("${aBlockId}_IS_LYT_DESCRIBE")>
${tabs}		<scroll>
<#assign str=REGLE("${aBlockId}ScrollPane_RECTANGLE" tabs + "\t\t\t")>
${str}
${tabs}		</scroll>
	<#else>
${tabs}			<!-- ‚±‚Ì˜g‚ÍŒp³’è‹`‚³‚ê‚Ä‚¢‚é‚½‚ß scrollƒ^ƒu‚ÍŽ©“®¶¬‚µ‚Ü‚¹‚ñB-->
	</#if>
</#if>
<#if S("${aBlockId}_COMPONENT")="TAB">
<#assign str=REGLE("${aBlockId}TabbedPane_RECTANGLE" tabs + "\t\t\t")>
${tabs}		<tab>
${str}
${tabs}		</tab>
</#if>
<#list A("${aBlockId}_ITEM_IDS" + scsSuffix) as anItemId>
<#if B("LYT_ALL")||!B("${aBlockId}_${anItemId}_IS_GUI_OVERRIDE")||B("${aBlockId}_${anItemId}_IS_LYT_DESCRIBE")>
<#if B("${aBlockId}_${anItemId}_HAS_BEAN")||B("${aBlockId}_${anItemId}_IS_CI_TYPE")&&S("${aBlockId}_${anItemId}_CP_ALIAS")=="">
<#if S("${aBlockId}_COMPONENT")="N">
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="K"||S("${aBlockId}_${anItemId}_COMPONENT")="SC"||S("${aBlockId}_${anItemId}_COMPONENT")="LP">
<#assign str=REGLE("${aBlockId}_${anItemId}_RECTANGLE" tabs + "\t\t\t\t")>
<#if FMCONF_B("AUTO_LAYOUT_TAG")>
<#assign str2=AUTO_LAYOUT_LINE("${aBlockId}_${anItemId}" tabs + "\t\t\t\t")>
</#if>
${tabs}			<${anItemId}>
${str}
<#if str2!="">${str2}</#if>
<#if B("${aBlockId}_${anItemId}_RETURNFLAG")>
${tabs}				<new_line>true</new_line>
</#if>
${tabs}			</${anItemId}>
	<#elseif S("${aBlockId}_${anItemId}_COMPONENT")="R">
<#if FMCONF_B("AUTO_LAYOUT_TAG")>
<#assign str2=AUTO_LAYOUT_LINE("${aBlockId}_${anItemId}" tabs + "\t\t\t\t")>
</#if>
<#list A("${aBlockId}_${anItemId}_BUTTON_IDS_SCS") as aBtnId>
<#assign str=REGLE("${aBlockId}_${anItemId}_${aBtnId}_RECTANGLE" tabs + "\t\t\t\t")>
${tabs}			<${anItemId}_${aBtnId}>
${str}
<#if str2==""><#assign str2=AUTO_LAYOUT_LINE("${aBlockId}_${anItemId}_${aBtnId}" tabs + "\t\t\t\t")></#if>
<#if str2!="">${str2}</#if>
<#if !aBtnId_has_next&&B("${aBlockId}_${anItemId}_RETURNFLAG")>
${tabs}				<new_line>true</new_line>
</#if>
${tabs}			</${anItemId}_${aBtnId}>
</#list>
	<#elseif B("${aBlockId}_${anItemId}_IS_CI_TYPE")>
<#assign str=REGLE("${aBlockId}_${anItemId}_RECTANGLE" tabs + "\t\t\t\t")>
<#if FMCONF_B("AUTO_LAYOUT_TAG")>
<#assign str2=AUTO_LAYOUT_LINE("${aBlockId}_${anItemId}" tabs + "\t\t\t\t")>
</#if>
<#if str!=""||str2!="">
${tabs}			<${S("${aBlockId}_${anItemId}_TER_CMP_PATH")}<#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")="T">scroll</#if>>
<#if str!="">${str}</#if>
<#if str2!="">${str2}</#if>
<#if B("${aBlockId}_${anItemId}_RETURNFLAG")>
${tabs}				<new_line>true</new_line>
</#if>
${tabs}			</${S("${aBlockId}_${anItemId}_TER_CMP_PATH")}<#if S("${aBlockId}_${anItemId}_FACT_COMPONENT")="T">scroll</#if>>
</#if>
	<#elseif S("${aBlockId}_${anItemId}_COMPONENT")!="LAB"&&!B("${aBlockId}_${anItemId}_IS_BUTTON_TYPE")&&!B("${aBlockId}_${anItemId}_IS_PB_TYPE")&&S("${aBlockId}_${anItemId}_COMPONENT")!="BL">
<#if S("${aBlockId}_${anItemId}_LABEL_CTL")=="">
<#assign str=REGLE("${aBlockId}_${anItemId}_LABEL_RECTANGLE" tabs + "\t\t\t\t")>
<#if FMCONF_B("AUTO_LAYOUT_TAG")>
<#assign str2=AUTO_LAYOUT_LINE("${aBlockId}_${anItemId}" tabs + "\t\t\t\t")>
</#if>
${tabs}			<${anItemId}_Label>
${str}
<#if str2!="">${str2}</#if>
${tabs}			</${anItemId}_Label>
</#if>
<#if S("${aBlockId}_${anItemId}_COMPONENT")="T">
<#assign str=REGLE("${aBlockId}_${anItemId}_RECTANGLE" tabs + "\t\t\t\t")>
<#if FMCONF_B("AUTO_LAYOUT_TAG")>
<#assign str2=AUTO_LAYOUT_LINE("${aBlockId}_${anItemId}" tabs + "\t\t\t\t")>
</#if>
${tabs}			<${anItemId}scroll>
${str}
<#if str2!="">${str2}</#if>
<#if B("${aBlockId}_${anItemId}_RETURNFLAG")>
${tabs}				<new_line>true</new_line>
</#if>
${tabs}			</${anItemId}scroll>
<#else>
<#assign str=REGLE("${aBlockId}_${anItemId}_RECTANGLE" tabs + "\t\t\t\t")>
<#if FMCONF_B("AUTO_LAYOUT_TAG")>
<#assign str2=AUTO_LAYOUT_LINE("${aBlockId}_${anItemId}" tabs + "\t\t\t\t")>
</#if>
${tabs}			<${anItemId}>
${str}
<#if str2!="">${str2}</#if>
<#if B("${aBlockId}_${anItemId}_RETURNFLAG")>
${tabs}				<new_line>true</new_line>
</#if>
${tabs}			</${anItemId}>
</#if>
	</#if>
</#if>
<#if PANEL.isTable(S("${aBlockId}_COMPONENT"))>
	<#if B("${aBlockId}_${anItemId}_IS_CI_TYPE")>
<#assign str=REGLE("${aBlockId}_${anItemId}_RECTANGLE" tabs + "\t\t\t\t")>
<#if str!="">
${tabs}			<${S("${aBlockId}_${anItemId}_TER_CMP_PATH")}>
${str}
${tabs}			</${S("${aBlockId}_${anItemId}_TER_CMP_PATH")}>
</#if>
	<#elseif S("${aBlockId}_${anItemId}_COMPONENT")!="LAB"&&!B("${aBlockId}_${anItemId}_IS_BUTTON_TYPE")&&!B("${aBlockId}_${anItemId}_IS_PB_TYPE")&&S("${aBlockId}_${anItemId}_COMPONENT")!="BL">
<#assign str=REGLE("${aBlockId}_${anItemId}_RECTANGLE" tabs + "\t\t\t\t")>
<#if str!="">
${tabs}			<${anItemId}>
${str}
${tabs}			</${anItemId}>
</#if>
	</#if>
</#if>
</#if>
	<#if S("${aBlockId}_${anItemId}_COMPONENT")="LAB"||B("${aBlockId}_${anItemId}_IS_BUTTON_TYPE")||S("${aBlockId}_${anItemId}_COMPONENT")="BL">
<#assign str=REGLE("${aBlockId}_${anItemId}_RECTANGLE" tabs + "\t\t\t\t")>
<#if FMCONF_B("AUTO_LAYOUT_TAG")>
<#assign str2=AUTO_LAYOUT_LINE("${aBlockId}_${anItemId}" tabs + "\t\t\t\t")>
</#if>
${tabs}			<${anItemId}>
${str}
<#if str2!="">${str2}</#if>
<#if B("${aBlockId}_${anItemId}_RETURNFLAG")>
${tabs}				<new_line>true</new_line>
</#if>
${tabs}			</${anItemId}>
	</#if>
</#if><#-- LYT_ALL||!IS_OVERRIDE -->
</#list>
${tabs}		</${aBlockId}>
</#if></#if></#list>
${tabs}	</${S("ID")}>
${tabs}</${S("MODULE_ID")}>
</#macro>

<#function REGLE key tabs>
<#assign ret="">
<#if S(key + "_X")!=""><#assign ret = ret + tabs + "<x>" + S(key + "_X") + "</x>\r\n"></#if>
<#if S(key + "_Y")!=""><#assign ret = ret + tabs + "<y>" + S(key + "_Y") + "</y>\r\n"></#if>
<#if S(key + "_W")!=""><#assign ret = ret + tabs + "<w>" + S(key + "_W") + "</w>\r\n"></#if>
<#if S(key + "_H")!=""><#assign ret = ret + tabs + "<h>" + S(key + "_H") + "</h>\r\n"></#if>
<#return ret>
</#function>

<#function AUTO_LAYOUT_LINE key tabs>
<#if S("${key}_VIEW_DIGIT")=="0"||S("${key}_RECTANGLE_W")=="0">
	<#assign ret=tabs + "<auto_layout>false</auto_layout>">
	<#return ret>
</#if>
<#assign IMV=true>
<#list A("MODE_IDS") as aMode>
	<#if S("${key}_MODE_${aMode}")!="I">
		<#assign IMV=false>
		<#break>
	</#if>
</#list>
<#assign ret="">
<#if A("MODE_IDS")?size!=0&&IMV>
	<#assign ret=tabs + "<auto_layout>false</auto_layout>">
</#if>
<#return ret>
</#function>