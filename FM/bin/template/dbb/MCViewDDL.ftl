{
"version" : "1.0.0",
"scriptComment" : "ƒRƒƒ“ƒg‚ğ‹L“ü",
"mcddlList" : [
	{
		"mcddl" : "CREATE_OR_REPLACE_VIEW",
		"viewName" : "${tableName}",
		"asStatementFile" : "${getFilePath()}",
		"columnList" : [
			<#list columnList as column>
			{
			"name" : "${column.name}"
			}<#if column_has_next>,</#if>
			</#list>
		]
	}
]
}