{
"version" : "1.0.0",
"scriptComment" : "ƒRƒƒ“ƒg‚ğ‹L“ü",
"mcddlList" : [
	{
		"mcddl" : "CREATE_TABLE",
		"tableName" : "${tableName}",
		"jpName" : "${getJpName()}",
		"comment" : "${getInternalCommentListToString()}",
		"doDynamic" : ${isDoDynamic()?then('true', 'false')},
		"columnList" : [
			<#list columnList as column>
			{
			"isKey" : ${column.isKey()?then('true', 'false')},
			"name" : "${column.name}",
			"dataType" : "${column.dataType}",
			"length" : "${column.length}",
			"integerLength" : "${column.integerLength}",
			"decimalLength" : "${column.decimalLength}",
			"nullable" : ${column.isNullable()?then('true', 'false')},
			"defaultStr" : "${column.getReplacedDefault()?json_string}",
			"jpName" : "${column.japanese?json_string}",
			"fullName" : "${column.fullName?json_string}"
			}<#if column_has_next>,</#if>
			</#list>
		],
		"indexList": [
			<#list indexList as index>
			{
			"name" : "${index.name}",
			"items" : "${index.items}",
			"tableSpace" : "${index.getTablespace()}"
			}<#if index_has_next>,</#if>
			</#list>
		],
		"tableSpace" : "${getTablespace()}",
		"primaryTableSpace" : "${getPrimaryTablespace()}"
	}
]
}