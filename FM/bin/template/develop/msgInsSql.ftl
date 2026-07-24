<#list A("BLOCK_IDS") as aBlockId>
<#list A("${aBlockId}_ITEM_IDS") as anItemId>
DELETE FROM WT_MSG WHERE MSGID = '${S("${aBlockId}_ID")}${S("${aBlockId}_${anItemId}_ID")}';
INSERT INTO WT_MSG (MSGID, LVL, MSG) VALUES(
	'${S("${aBlockId}_ID")}${S("${aBlockId}_${anItemId}_ID")}',
	'${S("${aBlockId}_${anItemId}_LV")}',
	'${CNV_BIND(S("${aBlockId}_${anItemId}_BODY"), "%s")?replace("\n","")}');
</#list>
</#list>