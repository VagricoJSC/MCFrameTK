{
"version" : "1.0.0",
"scriptComment" : "ƒRƒƒ“ƒg‚ğ‹L“ü",
"mcddlList" : [
	{
		"mcddl" : "CREATE_CO_VIEW",
		"viewName" : "${getCoViewName()}_$U",
		"baseTableName" : "${tableName}",
		"isLCL" : ${isCreateMulti()?then('true', 'false')},
		"addWhereList" : "",
		"addWhere_oraList" : "",
		"addWhere_posList" : "",
		"hasDelflg" : ${hasDelflg()?then('true', 'false')},
		"isAllViews" : ${isAllViews()?then('true', 'false')},
		"hasCocdKey" : ${hasCocdKey()?then('true', 'false')},
<@TRIMLINE>
		<#if hasCocdInBaseTable()>
		"hasCocdInBaseTable" : true,
		</#if>
</@TRIMLINE>
		"columnList" : [
			<#list getCoViewColumnList() as column>
			{
				"isKey" : ${column.isKey()?then('true', 'false')},
				"name" : "ORG.${column.name}",
				"isB" : ${column.isB()?then('true', 'false')}
			}<#if column_has_next>,</#if>
			</#list>
		]
	}
]
}