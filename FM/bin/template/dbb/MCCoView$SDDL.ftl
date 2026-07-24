{
"version" : "1.0.0",
"scriptComment" : "ƒRƒƒ“ƒg‚ğ‹L“ü",
"mcddlList" : [
	{
		"mcddl" : "CREATE_CO_VIEW",
		"viewName" : "${getCoViewName()}_$S",
		"baseTableName" : "${tableName}",
		"isLCL" : ${isCreateMulti()?then('true', 'false')},
		"addWhereList" : "${getCoViewWhereString()}",
		"addWhere_oraList" : "${getCoViewWhereOracleString()}",
		"addWhere_posList" : "${getCoViewWherePostgreSqlString()}",
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
			<#assign alias = getColumnAlias(column.name)>
			{
				"isKey" : ${column.isKey()?then('true', 'false')},
				"name" : "${alias}.${column.name}",
				"isB" : ${column.isB()?then('true', 'false')}
			}<#if column_has_next>,</#if>
			</#list>
		]
	}
]
}