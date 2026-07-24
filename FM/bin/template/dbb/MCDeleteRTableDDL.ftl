{
"version" : "1.0.0",
"scriptComment" : "ƒRƒƒ“ƒg‚ğ‹L“ü",
"mcddlList" : [
	{
		"mcddl" : "DELETE_R_TABLE",
		"tableList" : [
<#list tableList as item>
			{
			"tableName" : "${item}"
			}<#if item_has_next>,</#if>
</#list>
		]
	}
]
}