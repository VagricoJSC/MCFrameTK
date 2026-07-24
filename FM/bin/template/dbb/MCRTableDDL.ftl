{
"version" : "1.0.0",
"scriptComment" : "ÉRÉÅÉìÉgÇãLì¸",
"mcddlList" : [
	{
		"mcddl" : "CREATE_R_TABLE",
		"tableName" : "${tableName}",
		"jpName" : "${jpName}",
		"comment" : "${getInternalCommentListToString()?json_string}",
<#if primary.sortItem?has_content>
		"primarysortItem" : "${primary.sortItem}",
<#else>
		"primarysortItem" : "",
</#if>
		"tableSpaceHistory" : "${getTableSpaceHistory()}",
		"columnList" : [
			<#list columnList as column>
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
		]
	}
]
}