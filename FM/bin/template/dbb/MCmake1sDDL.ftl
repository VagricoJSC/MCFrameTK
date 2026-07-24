{
"version" : "1.0.0",
"scriptComment" : "ƒRƒƒ“ƒg‚ğ‹L“ü",
"mcddlList" : [
<#assign hasJsonStr = false>
<#list sequenceList as sequence>
	{
		"mcddl" : "IMPORT_MCDDL",
		"path" : "${sequence.getPath()}"
	}<#if sequence_has_next>,</#if>
</#list>
]
}