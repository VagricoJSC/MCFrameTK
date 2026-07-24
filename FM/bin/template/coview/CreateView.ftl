<#assign refTableName = getRefCoViewName()>
<#assign updTableName = getUpdCoViewName()>
<#if isCreateMultiView()><#assign lclSep=","><#else><#assign lclSep=""></#if>
CREATE OR REPLACE VIEW ${refTableName} (
	<#list getCoViewColumnList() as column>
	<#if column_has_next><#assign lineSep=","><#else><#assign lineSep=""></#if>
	${column.javaColumnName}${lineSep}
	</#list>
)
AS
SELECT
	<#list getCoViewColumnList() as column>
	<#if column_has_next><#assign lineSep=","><#else><#assign lineSep=""></#if>
	<#if isLcLColumn(column)><#assign alias="LCL"><#else><#assign alias="ORG"></#if>
	${alias}.${column.javaColumnName}${lineSep}
	</#list>
FROM
	${tableName} ORG${lclSep}
<@TRIMLINE>
	<#if isCreateMultiView()>${getBaseLclTableName()} LCL</#if>
</@TRIMLINE>
WHERE
	0 = 0
<@TRIMLINE>
	<#if isCreateMultiView()>
	<#list getPkColumn() as column>
	AND ORG.${column.name} = LCL.${column.name}(+)
	</#list>
	AND FCPA_CONTEXT.F_GET_LOCALE = LCL.LCL_CD(+)
	</#if>
	${getCoViewWhereString()}
</@TRIMLINE>
	AND ORG.CO_CD = FCPA_CONTEXT.F_GET_CO_CD
/
CREATE OR REPLACE VIEW ${updTableName} (
	<#list getCoViewColumnList() as column>
	<#if column_has_next><#assign lineSep=","><#else><#assign lineSep=""></#if>
	${column.javaColumnName}${lineSep}
	</#list>
)
AS
SELECT
	<#list getCoViewColumnList() as column>
	<#if column_has_next><#assign lineSep=","><#else><#assign lineSep=""></#if>
	ORG.${column.javaColumnName}${lineSep}
	</#list>
FROM
	${tableName} ORG
WHERE
	0 = 0
	AND ORG.CO_CD = FCPA_CONTEXT.F_GET_CO_CD
/
