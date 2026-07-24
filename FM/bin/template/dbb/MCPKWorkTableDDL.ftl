{
"version" : "1.0.0",
"scriptComment" : "ƒRƒƒ“ƒg‚ğ‹L“ü",
"mcddlList" : [
	{
		"mcddl" : "CREATE_TEMPORARY_TABLE",
		"dropType" : "*gtd",
		"tableName" : "${getTmpTableName()}",
		"jpName" : "${jpName}",
		"comment" : ${getInternalCommentListToString()},
		"isPkWkTable" : true,
		"columnList" : [
			<#list getPKColumnList() as column>
			{
			"isKey" : ${column.isKey()?then('true', 'false')},
			"name" : "${column.name}",
			"dataType" : "${column.dataType}",
			"length" : "${column.length}",
			"integerLength" : "${column.integerLength}",
			"decimalLength" : "${column.decimalLength}",
			"nullable" : true,
			"defaultStr" : "${column.getReplacedDefault()?json_string}",
			"jpName" : "${column.japanese?json_string}",
			"fullName" : "${column.fullName?json_string}"
			}<#if column_has_next>,</#if>
			</#list>
		],
		"indexList": [
		]
	}
]
}