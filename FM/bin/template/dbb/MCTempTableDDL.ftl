{
"version" : "1.0.0",
"scriptComment" : "ÉRÉÅÉìÉgÇãLì¸",
"mcddlList" : [
	{
		"mcddl" : "CREATE_TEMPORARY_TABLE",
		"dropType" : "${getTableType()}",
		"tableName" : "${getTmpTableName()}",
		"jpName" : "${jpName}",
		"comment" : ${getInternalCommentListToString()},
		"isPkWkTable" : false,
		"columnList" : [
			<#list columnList as column>
			{
			"isKey" : ${column.isKey()?then('true', 'false')},
			"name" : "${column.name}",
			"dataType" : "${column.dataType}",
			"length" : "${column.length}",
			"integerLength" : "${column.integerLength}",
			"decimalLength" : "${column.decimalLength}",
			"nullable" : ${column.nullable?then('true', 'false')},
			"defaultStr" : "${column.getReplacedDefault()}",
			"jpName" : "${column.getJapanese()}",
			"fullName" : "${column.getFullName()}"
			}<#if column_has_next>,</#if>
			</#list>
		],
		"indexList": [
			<#list indexList as index>
			{
			"name" : "${index.name}",
			"items" : "${index.items}"
			}<#if index_has_next>,</#if>
			</#list>
		],
		"checkList": [
			<#list checkList as check>
			{
			"item" : "${check.item}",
			"name" : "${check.name}",
			"value" : ${check.getValueString()}
			}<#if check_has_next>,</#if>
			</#list>
		]
	}
]
}