{
"version" : "1.0.0",
"scriptComment" : "ƒRƒƒ“ƒg‚ğ‹L“ü",
"mcddlList" : [
	{
		"mcddl" : "EXEC_TRIGGER",
		"path" : "${path}",
		"fileList" : [
<#list fileList as file>
			{
				"name" : "${file.name}",
				"db" : "${file.db}"
			}<#if file_has_next>,</#if>
</#list>
		]
	}
]
}