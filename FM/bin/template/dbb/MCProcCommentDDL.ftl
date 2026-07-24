{
"version" : "1.0.0",
"scriptComment" : "ƒRƒƒ“ƒg‚ğ‹L“ü",
"mcddlList" : [
<#assign hasJsonStr = false>
<#list procList as proc>
	{
		"mcddl" : "MAKE_COMMENT",
		"jpName" : "proc.name",
		"columnList" : [
		]
	}<#if proc_has_next>,</#if>
</#list>
]
}