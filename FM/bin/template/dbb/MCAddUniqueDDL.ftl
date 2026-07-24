{
"version" : "1.0.0",
"scriptComment" : "ƒRƒƒ“ƒg‚ğ‹L“ü",
"mcddlList" : [
	{
		"mcddl" : "ADD_UNIQUE",
		"tableName" : "${tableName}",
		"uniqueList": [
			<#list uniqueList as unique>
			{
			"name" : "${unique.name}",
			"items" : "${unique.items}",
			"tableSpace" : "${unique.getTablespace()}"
			}<#if unique_has_next>,</#if>
			</#list>
		],
		"columnList" : [
			<#list columnList as column>
			{
			"name" : "${column.name}",
			"dataType" : "${column.dataType}",
			"nullable" : ${column.isNullable()?then('true', 'false')}
			}<#if column_has_next>,</#if>
			</#list>
		]
	}
]
}