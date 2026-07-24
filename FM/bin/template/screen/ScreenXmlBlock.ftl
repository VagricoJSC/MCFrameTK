<#macro SCR_XML_BLOCK aHead tabs><#-- aHeadは"MCScreen"か""のどちらか -->
<#assign HEAD_PD=aHead + ".">
<#if aHead==""><#assign HEAD_PD=""></#if>
<#-- 今回の自動生成で追加されるリソースも既存分とあわせてソートするために -->
<#-- 解析データがある場合には、解析データにソート参考情報を追加する。-->
<#if ANALYZED()>
${SET_STRING_TO_XML(HEAD_PD + S("MODULE_ID") + "." + S("ID"), "DUMMY")}<#rt>
</#if>
<#if aHead!=""><${aHead}></#if>
<#list GET_SUBKEYS_FROM_XML(HEAD_PD, S("MODULE_ID")) as modId>
	<#if modId!="initscreen">
${tabs}<${modId}>
		<#if modId=S("MODULE_ID")>
<#assign scrs=GET_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.", S("ID"))/>
		<#else>
<#assign scrs=GET_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.")/>
		</#if>
<#list scrs as anId>
		<#if modId=S("MODULE_ID")&&anId=S("ID")>
${tabs}	<${anId}>
${tabs}		<class>${S("PACKAGE")}.${S("CLASS")}</class>
${tabs}		<classid>${anId}</classid>
			<#if S("SUPER_SPEC_ID")!="">
${tabs}		<parent>${S("SUPER_SPEC_ID")}</parent>
			</#if>
			<#if A("EMBEDDED_PARTS_IDS")?size!=0>
<@TRIMLINE>
${tabs}		<embedded>
<#list A("BLOCK_IDS") as aBlockId>
<#assign embSect=EMB_BLOCK_SECT(aBlockId, tabs)/>
${embSect}
</#list>
${tabs}		</embedded>
</@TRIMLINE>
			</#if>
			<#if S("SCREEN_TYPE")=="PARTS">
${tabs}		<parts>true</parts>
			</#if>
${tabs}	</${anId}>
		<#else>
			<#if GET_FROM_XML(HEAD_PD + "${modId}.${anId}.class")!="">
			<#-- 定義されたclass情報でclassタグを書き出す。（通常）-->
${tabs}	<${anId}>
${tabs}		<class>${GET_FROM_XML(HEAD_PD + "${modId}.${anId}.class")}</class>
${tabs}		<classid>${GET_FROM_XML(HEAD_PD + "${modId}.${anId}.classid")}</classid>
				<#if GET_FROM_XML(HEAD_PD + "${modId}.${anId}.parent")!="">
${tabs}		<parent>${GET_FROM_XML(HEAD_PD + "${modId}.${anId}.parent")}</parent>
				</#if>
<#assign embBlocks=GET_NS_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.${anId}.embedded.")/>
<#if embBlocks?size!=0>
		<embedded>
<#list embBlocks as embB>
<#assign embItems=GET_NS_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.${anId}.embedded.${embB}.")/>
<#if embItems?size!=0>
			<${embB}>
<#list embItems as embI>
				<${embI}>${GET_FROM_XML(HEAD_PD + "${modId}.${anId}.embedded.${embB}.${embI}")}</${embI}>
</#list>
			</${embB}>
</#if>
</#list>
		</embedded>
</#if>
				<#if GET_FROM_XML(HEAD_PD + "${modId}.${anId}.parts")!="">
${tabs}		<parts>${GET_FROM_XML(HEAD_PD + "${modId}.${anId}.parts")}</parts>
				</#if>
${tabs}	</${anId}>
			<#else>
			<#-- class情報定義がない場合にはid情報でclassタグを書き出す。-->
${tabs}	<${anId}>
${tabs}		<class>${GET_FROM_XML(HEAD_PD + "${modId}.${anId}")}</class>
${tabs}		<classid>${anId}</classid>
${tabs}	</${anId}>
			</#if>
		</#if>
</#list>
${tabs}</${modId}>
	</#if>
</#list>
<#if GET_SUBKEYS_FROM_XML(HEAD_PD)?seq_contains("initscreen")>
${tabs}<initscreen>
	<#if GET_SUBKEYS_FROM_XML(HEAD_PD + "initscreen.")?seq_contains("name")>
${tabs}	<name>${GET_FROM_XML(HEAD_PD + "initscreen.name")}</name>
	</#if>
	<#if GET_SUBKEYS_FROM_XML(HEAD_PD + "initscreen.")?seq_contains("mode")>
${tabs}	<mode>${GET_FROM_XML(HEAD_PD + "initscreen.mode")}</mode>
	</#if>
${tabs}</initscreen>
</#if>
<#if aHead!=""></${aHead}></#if>
</#macro>

<#function EMB_BLOCK_SECT bId tabs>
<#assign body=""/>
<#list A("${bId}_ITEM_IDS") as anItemId>
<#if S("${bId}_${anItemId}_COMPONENT")=="SC"&&S(bId + "_" + anItemId + "_EMBSCR_ID")!="">
<#assign body=body + tabs + "\t\t\t\t<" + anItemId + ">" + S(bId + "_" + anItemId + "_EMBSCR_ID") + "</" + anItemId + ">\r\n"/>
</#if>
<#if S("${bId}_${anItemId}_COMPONENT")=="CM"&&S(bId + "_" + anItemId + "_EMBTBL_ID")!="">
<#assign body=body + tabs + "\t\t\t\t<" + anItemId + ">" + S(bId + "_" + anItemId + "_EMBTBL_ID") + "</" + anItemId + ">\r\n"/>
</#if>
</#list>
<#if body?length!=0>
<#assign body=tabs+"\t\t\t<" + bId + ">\r\n"+body+tabs+"\t\t\t</" + bId + ">"/>
</#if>
<#return body>
</#function>