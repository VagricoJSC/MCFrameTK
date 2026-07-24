{
"version" : "1.0.0",
"scriptComment" : "ÉRÉÅÉìÉgÇãLì¸",
"mcddlList" : [
	{
		"mcddl" : "CREATE_L_TRIGGER",
		"tableName" : "${tableName}",
		"lclTableName" : "${tableName}",
		"primaryitems" : "${primary.items}",
		"makeUpdTrigger": {
				"updCntr" : ${makeUpdTrigger.isUpdCntr()?then('true', 'false')},
				"updTs" : ${makeUpdTrigger.isUpdTs()?then('true', 'false')},
				"updUser" : ${makeUpdTrigger.isUpdUser()?then('true', 'false')},
				"updUserName" : ${makeUpdTrigger.isUpdUserName()?then('true', 'false')},
				"insTS" : ${makeUpdTrigger.isInsTS()?then('true', 'false')},
				"insUser" : ${makeUpdTrigger.isInsUser()?then('true', 'false')},
				"insUserName" : ${makeUpdTrigger.isInsUserName()?then('true', 'false')},
				"updSrvRecNo" : ${makeUpdTrigger.isUpdSrvRecNo()?then('true', 'false')},
				"updFunc" : ${makeUpdTrigger.isUpdFunc()?then('true', 'false')},
				"incFunc" : ${makeUpdTrigger.isIncFunc()?then('true', 'false')},
				"delFlg" : ${makeUpdTrigger.isDelFlg()?then('true', 'false')},
				"delTS" : ${makeUpdTrigger.isDelTS()?then('true', 'false')},
				"delUserID" : ${makeUpdTrigger.isDelUserID()?then('true', 'false')},
				"delUserName" : ${makeUpdTrigger.isDelUserName()?then('true', 'false')},
				"hasUpdColumn" : ${makeUpdTrigger.hasUpdColumn()?then('true', 'false')}
			},
		"columnList" : [
			<#list columnList as column>
			{
			"isKey" : ${column.isKey()?then('true', 'false')},
			"name" : "${column.name}",
			"isMaultiNotView" : ${column.isMaultiNotView()?then('true', 'false')}
			}<#if column_has_next>,</#if>
			</#list>
		]
	}
]
}