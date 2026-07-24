{
"version" : "1.0.0",
"scriptComment" : "ƒRƒƒ“ƒg‚ğ‹L“ü",
"mcddlList" : [
<#assign hasJsonStr = false>
<#list uTriggerList as uTrigger>
	{
		"mcddl" : "IMPORT_MCDDL",
		"path" : "${uTrigger}"
	}<#if uTrigger_has_next>,</#if>
</#list>
]
}