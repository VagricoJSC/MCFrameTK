{
"version" : "1.0.0",
"scriptComment" : "ƒRƒƒ“ƒg‚ğ‹L“ü",
"mcddlList" : [
<#assign hasJsonStr = false>
	{
		"mcddl" : "MAKE_COMMENT",
		"tableName" : "${tableName}",
		"tableType" : "${tableType}",
		"jpName" : "${jpName}",
		"fullName" : "${fullName}",
		"columnList" : [
			<#list columnList as column>
			{
			"columnName" : "${tableName}.${column.name}",
			"jpName" : "${column.japanese}",
			"srcDataMeta" : "${column.metaID}",
			"fullName" : "${column.fullName}"
			}<#if column_has_next>,</#if>
			</#list>
		]
	}
]
}