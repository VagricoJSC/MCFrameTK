<?xml version="1.0" encoding="UTF-8"?><!--MCframe Message Constant--><message>

<#list A("BLOCK_IDS") as aBlockId>
<#list A("${aBlockId}_ITEM_IDS") as anItemId>
<${S("${aBlockId}_ID")}${S("${aBlockId}_${anItemId}_ID")}>
	<lv>${S("${aBlockId}_${anItemId}_LV")}</lv>
	<upd_name>${S("DEVELOPER")}</upd_name>
	<msg><@CDATA value=S("${aBlockId}_${anItemId}_BODY")/></msg>
	<upd_ts>${S("SYSTEM_DATE")}</upd_ts>
	<memo><@CDATA value=S("${aBlockId}_${anItemId}_MEMO")/></memo>
</${S("${aBlockId}_ID")}${S("${aBlockId}_${anItemId}_ID")}>
</#list>
</#list>
</message>

<#macro CDATA value>
<![CDATA[${value?replace("]]>","]]]]><![CDATA[>")}]]><#rt>
</#macro>