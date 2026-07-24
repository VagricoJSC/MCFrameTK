package mcframe.server${moduleID}.dbc;

import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

<@TRIMLINE>
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
<#if isExistBlobCol()>import mcframe.commonCore.lang.MCBinary;</#if>
<#if isExistDateCol()>import mcframe.commonCore.lang.MCDate;</#if>
<#if isExistNumberCol()>import mcframe.commonCore.lang.MCNumber;</#if>
<#if isExistStringCol()>import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;</#if>
<#if isExistNumberCol()>import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;</#if>
<#if isExistDateCol()>import mcframe.serverCore.queryapi.IFMCSQL.MCDatePermColumn;</#if>
<#if isExistTimestampCol()>import mcframe.serverCore.queryapi.IFMCSQL.MCTimestampPermColumn;</#if>
<#if isExistBooleanCol()>import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;</#if>
<#if isExistBlobCol()>import mcframe.serverCore.queryapi.IFMCSQL.MCBinaryPermColumn;</#if>
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
<#if isExistTimestampCol()>import mcframe.commonCore.lang.MCTimestamp;</#if>
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;
</@TRIMLINE>

<#assign index = 1>
<#assign _mcrowName = tableName + "_R">
/**
 * "${jpName} // ${fullName}"DBコンテナRowクラスです。<p>
 *
 * <br>
 *
 * <table border=1 cellspacing=0 cellpadding=2 >
 *  <caption>[項目定義]</caption>
 * 	<tr bgcolor="#cccccc">
 *  	<th>区分</th>
 *  	<th>項目名</th>
 *  	<th>型</th>
 *  	<th>桁</th>
 *  	<th>Null</th>
 *  	<th>別名/参照先</th>
 *  	<th>日本語</th>
 *  	<th>フルネーム</th>
 *  </tr>
<#list getAllColumnList() as column>
<#if index%2==0>
 *  <tr >
<#else>
 *  <tr bgcolor="Moccasin">
</#if>
 *  	<td>${column.level}</td>
 *  	<td>${column.javaColumnName}</td>
 *  	<td>${column.dataType}</td>
 *  	<td>${column.length}</td>
 *  	<td>${column.nullDisp}</td>
 *  	<td>${column.dbcRefName}</td>
 *  	<td>${column.japanese}</td>
 *  	<td>${column.fullName}</td>
 *  </tr>
<#assign index = index + 1>
</#list>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
<#-- public class ${_mcrowName} extends ${getSuperDmlClass()}<${_mcrowName}> { -->
public class ${_mcrowName} extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.${getTableTypeStr()};

	public static final String TABLE_NAME = "${tableName}";

	public static final boolean EX_CTRL = ${exCtrl?then('true', 'false')};
	
	public static final boolean LCL_TABLE = ${createMulti?then('true', 'false')};
	
	<#list getAllColumnList() as column>
	/**
	 * ${column.japanese}. ${column.fullName}.<p>
	 *
	 */
	public static final String $${column.javaColumnName} = "${column.javaColumnName}";
	<#if !column.isZcolumn()>
	private static final MCPermColumnInfo _${column.javaColumnName} = createColumnInfo("${column.javaColumnName}");
	public final ${makeDataTypeForQueryApi(column.dataType)} ${column.javaColumnName} = ${makeMethodForQueryApi(column.dataType)}(_${column.javaColumnName});
	</#if>
	
	</#list>
	<#list getAllColumnList() as column>
	public static final MCMeta ${column.javaColumnName}_META = ${column.getMetaCreator()}
	</#list>

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	<#list foreignList as foreign>
	<#if foreign.refTable != "FCT_BINARY">
	public static final String $${foreign.getRefSynonym()} = "${foreign.getRefSynonym()}";
	</#if>
	</#list>
	<#list dbcForeignKeyList as foreign>
	public static final String $${foreign.getRefSynonym()} = "${foreign.getRefSynonym()}";
	</#list>
	static {
		<#list foreignList as foreign>
		<#if foreign.refTable != "FCT_BINARY">
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"${foreign.refTable}",
				$${foreign.getRefSynonym()},
				new String[][]{
					<#list getForeignCondition4Dbc(foreign) as condition>
					<#if condition_has_next><#assign lineSep=","><#else><#assign lineSep=""></#if>
						{"${condition[0]}", "${condition[1]}"}${lineSep}
					</#list>
				},
				() -> {
					<#if foreign.isNotMakeForeignInfo()>
					return null;
					<#else>
					return ${foreign.getDbcPackageName()}.${foreign.refTable}_R.create("${foreign.getRefSynonym()}");
					</#if>
				},
				(alias) -> {
					<#if foreign.isNotMakeForeignInfo()>
					return null;
					<#else>
					${_mcrowName} own = ${_mcrowName}.create(alias);
					${foreign.getDbcPackageName()}.${foreign.refTable}_R ref = ${foreign.getDbcPackageName()}.${foreign.refTable}_R.create("${foreign.getRefSynonym()}");
					MCPredicate cond = value(0).eq(value(0));
					<#list getForeignCondition4Dbc(foreign) as condition>
					cond = cond.and(own.${condition[0]}.eq(ref.${condition[1]}));
					</#list>
					return cond;
					</#if>
				}
			)
		);
		</#if>
		</#list>
		<#list dbcForeignKeyList as foreign>
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"${foreign.refTable}",
				$${foreign.getRefSynonym()},
				new String[][]{
					<#list getForeignCondition4Dbc(foreign) as condition>
					<#if condition_has_next><#assign lineSep=","><#else><#assign lineSep=""></#if>
						{"${condition[0]}", "${condition[1]}"}${lineSep}
					</#list>
				},
				() -> {
					<#if foreign.isNotMakeForeignInfo()>
					return null;
					<#else>
					return ${foreign.getDbcPackageName()}.${foreign.refTable}_R.create("${foreign.getRefSynonym()}");
					</#if>
				},
				(alias) -> {
					<#if foreign.isNotMakeForeignInfo()>
					return null;
					<#else>
					${_mcrowName} own = ${_mcrowName}.create(alias);
					${foreign.getDbcPackageName()}.${foreign.refTable}_R ref = ${foreign.getDbcPackageName()}.${foreign.refTable}_R.create("${foreign.getRefSynonym()}");
					MCPredicate cond = value(0).eq(value(0));
					<#list getForeignCondition4Dbc(foreign) as condition>
					cond = cond.and(own.${condition[0]}.eq(ref.${condition[1]}));
					</#list>
					return cond;
					</#if>
				}
			)
		);
		</#list>
	}
	
	protected static final ConstMetaList<${_mcrowName}> constMetas = new ConstMetaList<${_mcrowName}>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			<#list getAllColumnList() as column>
			<#if column_has_next><#assign lineSep=","><#else><#assign lineSep=""></#if>
			${column.javaColumnName}_META${lineSep}
			</#list>
		},
		new String[][]{
			{
			},
			{
			}
		}
	);
	

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * コンストラクタです。
	 */
	protected ${_mcrowName}(ConstMetaList<? extends ${_mcrowName}> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected ${_mcrowName}(ConstMetaList<? extends ${_mcrowName}> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		<#list getAllColumnList() as column>
		COLUMN_MAP.put(
			${_mcrowName}.$${column.javaColumnName},
			new MCDBContainerColulmnInfo<${makeDataTypeForQueryApi(column.dataType)}>(
				${makeDataType(column.dataType)},
				${_mcrowName}.$${column.javaColumnName},
				"${column.javaColumnName}",
				<#if column.isZcolumn()>
				null,
				<#else>
				${column.javaColumnName},
				</#if>
				${column.isDbcKey()?then('true', 'false')},
				${column.isNullable()?then('true', 'false')},
				${column.isDbcSkipColumn()?then('true', 'false')},
				${column.isMulti()?then('true', 'false')},
				${column.isZcolumn()?then('true', 'false')},
				"${column.dbcRefName}"
			)
		);
		</#list>
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static ${_mcrowName} create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static ${_mcrowName} create(String alias) {
		${_mcrowName} row = new ${_mcrowName}(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> ${_mcrowName} createByName(T proto) {
		${_mcrowName} row = ${_mcrowName}.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ${_mcrowName} clone() {
		return (${_mcrowName}) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ${_mcrowName} createInstance() {
		return (${_mcrowName}) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ${_mcrowName} getValues(String... names) {
		return (${_mcrowName}) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	public boolean hasCocdFilter() {
		return ${hasCocdFilter()?then('true', 'false')};
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	public boolean hasLclFilter() {
		return ${hasLclFilter()?then('true', 'false')};
	}

	<#if isMakePkWorkTable()>
	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public ${getPkworkTableDbcName()} getPkWorkDbc(String alias) {
	 	return ${getPkworkTableDbcName()}.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public ${getPkworkTableDbcName()} getPkWorkDbc() {
	 	return getPkWorkDbc(${getPkworkTableDbcName()}.TABLE_NAME);
	 }
 	<#else>
	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MCDBContainer getPkWorkDbc(String alias) {
	 	return null;
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MCDBContainer getPkWorkDbc() {
	 	return null;
	 }
 	</#if>

	<#assign offset = 0>
	<#list getAllColumnList() as column>
	<#assign dataType = column.dataType>
	<#assign javaType = column.dataTypeJava>
	<#assign getter = constGetter(dataType)>
	<#assign setter = constSetter(dataType)>
	/**
	 * ${column.japanese}. ${column.fullName}.<p>
	 *
	 */
	public ${javaType} ${column.javaColumnName}() {
		return ${getter}(offset + ${offset}, $${column.javaColumnName});
	}

	<#if dataType == "N">
	/**
	 * ${column.japanese}. ${column.fullName}.<p>
	 *
	 */
	public void ${column.javaColumnName}(MCNumber value) {
		${setter}(offset + ${offset}, $${column.javaColumnName}, value);
	}
	
	/**
	 * ${column.japanese}. ${column.fullName}.<p>
	 *
	 */
	public void ${column.javaColumnName}(int value) {
		${setter}(offset + ${offset}, $${column.javaColumnName}, value);
	}
	
	/**
	 * ${column.japanese}. ${column.fullName}.<p>
	 *
	 */
	public void ${column.javaColumnName}(long value) {
		${setter}(offset + ${offset}, $${column.javaColumnName}, value);
	}
	
	/**
	 * ${column.japanese}. ${column.fullName}.<p>
	 *
	 */
	public void ${column.javaColumnName}(float value) {
		${setter}(offset + ${offset}, $${column.javaColumnName}, value);
	}
	
	/**
	 * ${column.japanese}. ${column.fullName}.<p>
	 *
	 */
	public void ${column.javaColumnName}(double value) {
		${setter}(offset + ${offset}, $${column.javaColumnName}, value);
	}
	
	<#else>
	/**
	 * ${column.japanese}. ${column.fullName}.<p>
	 *
	 */
	public void ${column.javaColumnName}(${javaType} value) {
		${setter}(offset + ${offset}, $${column.javaColumnName}, value);
	}

	</#if>
	<#assign offset = offset + 1>
	</#list>
	<#if isExistStringCol()>
	public String getString(String name) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "C">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			return ${column.javaColumnName}();
		}
		</#if>
		</#list>
		return super.getString(name);
	}

	</#if>
	<#if isExistNumberCol()>
	public MCNumber getNumber(String name) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "N">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			return ${column.javaColumnName}();
		}
		</#if>
		</#list>
		return super.getNumber(name);
	}

	</#if>
	<#if isExistDateCol()>
	public MCDate getDate(String name) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "D">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			return ${column.javaColumnName}();
		}
		</#if>
		</#list>
		return super.getDate(name);
	}

	</#if>
	<#if isExistTimestampCol()>
	public MCTimestamp getTimestamp(String name) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "TS">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			return ${column.javaColumnName}();
		}
		</#if>
		</#list>
		return super.getTimestamp(name);
	}

	</#if>
	<#if isExistBooleanCol()>
	public boolean getBoolean(String name) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "F">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			return ${column.javaColumnName}();
		}
		</#if>
		</#list>
		return super.getBoolean(name);
	}

	</#if>
	<#if isExistBlobCol()>
	public MCBinary getBinary(String name) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "B">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			return ${column.javaColumnName}();
		}
		</#if>
		</#list>
		return super.getBinary(name);
	}

	</#if>
	<#if isExistStringCol()>
	public String getStringNE(String name) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "C">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			return ${column.javaColumnName}();
		}
		</#if>
		</#list>
		return super.getStringNE(name);
	}

	</#if>
	<#if isExistNumberCol()>
	public MCNumber getNumberNE(String name) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "N">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			return ${column.javaColumnName}();
		}
		</#if>
		</#list>
		return super.getNumberNE(name);
	}

	</#if>
	<#if isExistDateCol()>
	public MCDate getDateNE(String name) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "D">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			return ${column.javaColumnName}();
		}
		</#if>
		</#list>
		return super.getDateNE(name);
	}

	</#if>
	<#if isExistTimestampCol()>
	public MCTimestamp getTimestampNE(String name) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "TS">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			return ${column.javaColumnName}();
		}
		</#if>
		</#list>
		return super.getTimestampNE(name);
	}

	</#if>
	<#if isExistBooleanCol()>
	public boolean getBooleanNE(String name) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "F">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			return ${column.javaColumnName}();
		}
		</#if>
		</#list>
		return super.getBooleanNE(name);
	}

	</#if>
	<#if isExistBlobCol()>
	public MCBinary getBinaryNE(String name) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "B">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			return ${column.javaColumnName}();
		}
		</#if>
		</#list>
		return super.getBinaryNE(name);
	}

	</#if>
	<#if isExistStringCol()>
	public void setString(String name, String value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "C">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setString(name, value);
	}

	</#if>
	<#if isExistNumberCol()>
	public void setNumber(String name, MCNumber value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "N">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "N">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "N">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "N">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "N">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setNumber(name, value);
	}

	</#if>
	<#if isExistDateCol()>
	public void setDate(String name, MCDate value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "D">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setDate(name, value);
	}

	</#if>
	<#if isExistTimestampCol()>
	public void setTimestamp(String name, MCTimestamp value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "TS">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setTimestamp(name, value);
	}

	</#if>
	<#if isExistBooleanCol()>
	public void setBoolean(String name, boolean value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "F">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setBoolean(name, value);
	}

	</#if>
	<#if isExistBlobCol()>
	public void setBinary(String name, MCBinary value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "B">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setBinary(name, value);
	}

	</#if>
	<#if isExistStringCol()>
	public void setStringNE(String name, String value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "C">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setStringNE(name, value);
	}

	</#if>
	<#if isExistNumberCol()>
	public void setNumberNE(String name, MCNumber value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "N">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "N">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "N">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "N">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "N">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setNumberNE(name, value);
	}

	</#if>
	<#if isExistDateCol()>
	public void setDateNE(String name, MCDate value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "D">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setDateNE(name, value);
	}

	</#if>
	<#if isExistTimestampCol()>
	public void setTimestampNE(String name, MCTimestamp value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "TS">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setTimestampNE(name, value);
	}

	</#if>
	<#if isExistBooleanCol()>
	public void setBooleanNE(String name, boolean value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "F">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setBooleanNE(name, value);
	}

	</#if>
	<#if isExistBlobCol()>
	public void setBinaryNE(String name, MCBinary value) {
		<#list getAllColumnList() as column>
		<#if column.dataType == "B">
		if ($${column.javaColumnName}.equalsIgnoreCase(name)) {
			${column.javaColumnName}(value);
			return;
		}
		</#if>
		</#list>
		super.setBinaryNE(name, value);
	}

	</#if>
}
<#function constGetter dataType>
	<#if dataType == "C" || dataType == "CC" || dataType == "CLB">
		<#local result = "getConstString">
	<#elseif dataType == "N">
		<#local result = "getConstNumber">
	<#elseif dataType == "D">
		<#local result = "getConstDate">
	<#elseif dataType == "TS">
		<#local result = "getConstTimestamp">
	<#elseif dataType == "F">
		<#local result = "getConstBoolean">
	<#elseif dataType == "B">
		<#local result = "getConstBinary">
	</#if>
	<#return result>
</#function>
<#function constSetter dataType>
	<#if dataType == "C" || dataType == "CC" || dataType == "CLB">
		<#local result = "setConstString">
	<#elseif dataType == "N">
		<#local result = "setConstNumber">
	<#elseif dataType == "D">
		<#local result = "setConstDate">
	<#elseif dataType == "TS">
		<#local result = "setConstTimestamp">
	<#elseif dataType == "F">
		<#local result = "setConstBoolean">
	<#elseif dataType == "B">
		<#local result = "setConstBinary">
	</#if>
	<#return result>
</#function>
<#function makeDataType dataType>
	<#if dataType == "C" || dataType == "CC" || dataType == "CLB">
		<#local result = "MCDataType.STRING">
	<#elseif dataType == "CC">
		<#local result = "MCDataType.STRING">
	<#elseif dataType == "N">
		<#local result = "MCDataType.NUMBER">
	<#elseif dataType == "D">
		<#local result = "MCDataType.DATE">
	<#elseif dataType == "TS">
		<#local result = "MCDataType.TIMESTAMP">
	<#elseif dataType == "F">
		<#local result = "MCDataType.BOOLEAN">
	<#elseif dataType == "B">
		<#local result = "MCDataType.BINARY">
	</#if>
	<#return result>
</#function>
<#function makeDataTypeForQueryApi dataType>
	<#if dataType == "C" || dataType == "CC" || dataType == "CLB">
		<#local result = "MCStringPermColumn">
	<#elseif dataType == "N">
		<#local result = "MCNumberPermColumn">
	<#elseif dataType == "D">
		<#local result = "MCDatePermColumn">
	<#elseif dataType == "TS">
		<#local result = "MCTimestampPermColumn">
	<#elseif dataType == "F">
		<#local result = "MCBooleanPermColumn">
	<#elseif dataType == "B">
		<#local result = "MCBinaryPermColumn">
	</#if>
	<#return result>
</#function>
<#function makeMethodForQueryApi dataType>
	<#if dataType == "C" || dataType == "CC" || dataType == "CLB">
		<#local result = "createStringColumn">
	<#elseif dataType == "N">
		<#local result = "createNumberColumn">
	<#elseif dataType == "D">
		<#local result = "createDateColumn">
	<#elseif dataType == "TS">
		<#local result = "createTimestampColumn">
	<#elseif dataType == "F">
		<#local result = "createBooleanColumn">
	<#elseif dataType == "B">
		<#local result = "createBinaryColumn">
	</#if>
	<#return result>
</#function>
