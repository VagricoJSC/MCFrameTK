{
"version" : "1.0.0",
"scriptComment" : "ƒRƒƒ“ƒg‚ğ‹L“ü",
"mcddlList" : [
<#assign hasJsonStr = false>
<#list tableList as table>
<#list table.checkList as check>
	{
		"mcddl" : "IMPORT_MCDDL",
		"path" : "${table.getCheckObjectPath()}${check.name}.json"
	}<#if table_has_next || check_has_next>,</#if>
</#list>
</#list>
]
}