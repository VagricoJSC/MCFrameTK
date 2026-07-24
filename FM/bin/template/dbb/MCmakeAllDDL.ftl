{
"version" : "1.0.0",
"scriptComment" : "ƒRƒƒ“ƒg‚ğ‹L“ü",
"mcddlList" : [
<#assign hasJsonStr = false>
<#list makeAllList as item>
	{
		"mcddl" : "IMPORT_MCDDL",
		"path" : "${item}"
	}<#if item_has_next>,</#if>
</#list>
]
}