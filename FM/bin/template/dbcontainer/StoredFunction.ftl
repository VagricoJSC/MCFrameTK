package mcframe.server${getModuleID()}.dbc;

import static mcframe.commonCore.lang.MCDataType.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.function.Function;
<@TRIMLINE>
import mcframe.serverCore.mcjdbc.MCDatabaseManager;
<#if isExistStoredStringCol()>import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGStringExpr;</#if>
<#if isExistStoredNumberCol()>import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGNumberExpr;</#if>
<#if isExistStoredDateCol()>import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGDateExpr;</#if>
<#if isExistStoredTimestampCol()>import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGTimestampExpr;</#if>
<#if isExistStoredBooleanCol()>import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGBooleanExpr;</#if>
</@TRIMLINE>

<#assign index = 1>
/**
 * ${getSubModuleID()}ファンクションクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
public class ${getSubModuleID()}Function extends MCFunctionFactory {
	
	<#list getDbcStoredProcedureList() as function>
	/**
	 * ${function.logicalName}
	 */
	public static ${makeReturnType(function.rtnType)} ${function.logicalName}(
		<#list function.columnList as column>
		<#if column_has_next><#assign lineSep=","><#else><#assign lineSep=""></#if>
		${makeColumnExpr(column.dataType)} ${column.item}${lineSep}
		</#list>
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										<#list function.nameForDBList as dbList>
										<#if dbList_has_next><#assign lineSep=","><#else><#assign lineSep=""></#if>
										new String[]{"${dbList.dbName}", "${dbList.procedureName}"}${lineSep}
										</#list>
									}
							  );
		return value(
			physicalName,
			${makeReturnOf(function.rtnType)}<#if function.columnList?size != 0>,</#if>
			<#list function.columnList as column>
			<#if column_has_next><#assign lineSep=","><#else><#assign lineSep=""></#if>
			arg(${column.item}, ${makeColumnType(column.dataType)})${lineSep}
			</#list>
		);
	}
	
	</#list>
	public static Function<String[], MCExprValue> getFunctionExecuter(String name) {
		<#list getDbcStoredProcedureList() as function>
		if ("${function.logicalName}".equalsIgnoreCase(name)) {
			return binds -> ${function.logicalName}(<#list function.columnList as column><#if column_has_next><#assign lineSep=", "><#else><#assign lineSep=""></#if>bind(binds[${column_index}])${lineSep}</#list>);
		}
		</#list>
		return null;
	}
}
<#function makeReturnType dataType>
	<#if dataType == "C" || dataType == "CC">
		<#local result = "MCStringValue">
	<#elseif dataType == "N">
		<#local result = "MCNumberValue">
	<#elseif dataType == "D">
		<#local result = "MCDateValue">
	<#elseif dataType == "TS">
		<#local result = "MCTimestampValue">
	<#elseif dataType == "F">
		<#local result = "MCBooleanValue">
	</#if>
	<#return result>
</#function>
<#function makeColumnExpr dataType>
	<#if dataType == "C" || dataType == "CC">
		<#local result = "MCFMAGStringExpr">
	<#elseif dataType == "N">
		<#local result = "MCFMAGNumberExpr">
	<#elseif dataType == "D">
		<#local result = "MCFMAGDateExpr">
	<#elseif dataType == "TS">
		<#local result = "MCFMAGTimestampExpr">
	<#elseif dataType == "F">
		<#local result = "MCFMAGBooleanExpr">
	</#if>
	<#return result>
</#function>
<#function makeReturnOf dataType>
	<#if dataType == "C" || dataType == "CC">
		<#local result = "STRING">
	<#elseif dataType == "N">
		<#local result = "NUMBER">
	<#elseif dataType == "D">
		<#local result = "DATE">
	<#elseif dataType == "TS">
		<#local result = "TIMESTAMP">
	<#elseif dataType == "F">
		<#local result = "BOOLEAN">
	</#if>
	<#return result>
</#function>
<#function makeColumnType dataType>
	<#if dataType == "C" || dataType == "CC">
		<#local result = "STRING">
	<#elseif dataType == "N">
		<#local result = "NUMBER">
	<#elseif dataType == "D">
		<#local result = "DATE">
	<#elseif dataType == "TS">
		<#local result = "TIMESTAMP">
	<#elseif dataType == "F">
		<#local result = "BOOLEAN">
	</#if>
	<#return result>
</#function>
