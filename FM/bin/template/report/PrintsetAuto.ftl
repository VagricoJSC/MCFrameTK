<#import "/macro/ClassDef.ftl" as CDEF>
<#import "/macro/RevAnnotation.ftl" as REV>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")};

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.report.container.MCReportSet;
import mcframe.commonCore.report.container.MCReportMeta;
<@REV.REV_IMPORT/>

<#if FMCONST_B("FTL.SUPPRESSWARNINGS")>
@SuppressWarnings({"all"})
</#if>
<@REV.REV_ANNOTATION/>
abstract public class ${S("CLASS")}_${S("CLASS_SUFFIX")}_A extends ${S("EXTENDS_CLASS")} {

	static final String _defaultModuleId = "${S("MODULE_ID")}";
	static final String _defaultReportId = "${S("ID")}";
	static final String _version = <#if S("VERSION")!="">"${S("VERSION")}"<#else>null</#if>;

	/**
	 *
	 * Rowの要素になり得るクラスの配列
	 *
	 */
<#list A("BLOCK_IDS") as aBlockId>
	static public final MCReportClass ${aBlockId?upper_case}${S(aBlockId + "_CODE_S")}_RC = new MCReportClass("${aBlockId}", ${S(aBlockId + "_FACT_ID")}R.class<#if B(aBlockId + "_IS_LIST")>, <@CDEF.CONT_CLASS_NAME body0=aBlockId/>.class</#if>);
</#list>

	static public final MCReportClassList rowClassList = new MCReportClassList(
		${S("EXTENDS_CLASS")}.rowClassList,
<#list A("BLOCK_IDS") as aBlockId>
		${aBlockId?upper_case}${S(aBlockId + "_CODE_S")}_RC<#if aBlockId_has_next>,</#if>
</#list>
		);

	/**
	 *
	 * 印刷用メタ
	 *
	 */
<#list A("BLOCK_IDS") as aBlockId>
<#list A("${aBlockId}_ITEM_IDS_SCS") as anItemId>
	<#if !B("${aBlockId}_${anItemId}_IS_DEF_INHERITED")>
		<#if S("${aBlockId}_${anItemId}_FACT_TYPE")!="R">
			<#if S("${aBlockId}_${anItemId}_TYPE")=="RI">
	static public final MCReportMeta ${S("${aBlockId}_${anItemId}_RI_ALIAS")}_META_${aBlockId_index} = new MCReportMeta("${S(aBlockId + "_" + anItemId + "_DEPEND_ITEM_ID")}.${S(aBlockId + "_" + anItemId + "_DEPEND_TER_PATH")}", "<#if S(aBlockId + "_${anItemId}_TYPE")=="D"||S(aBlockId + "_${anItemId}_TYPE")=="TS">${S(aBlockId + "_" + anItemId + "__FORMAT")}<#else>${S(aBlockId + "_" + anItemId + "_DIGIT")}</#if>", "${S(aBlockId + "_" + anItemId + "_NAME")}", true);
			<#else>
	static public final MCReportMeta ${anItemId}_META_${aBlockId_index} = new MCReportMeta("${anItemId}", "<#if S(aBlockId + "_" + anItemId + "__FORMAT")!="-">${S(aBlockId + "_" + anItemId + "__FORMAT")}</#if>", "${S(aBlockId + "_" + anItemId + "_DIGIT")}", "${S(aBlockId + "_" + anItemId + "_NAME")}", true);
			</#if>
		</#if>
	</#if>
</#list>

</#list>
	static protected MCReportMetaMap reportMetaMap = new MCReportMetaMap(${S("EXTENDS_CLASS")}.reportMetaMap);
	static{
<#list A("BLOCK_IDS") as aBlockId>
<#assign nrList=notRowItems(aBlockId)?word_list>
		reportMetaMap.add("${aBlockId}"<#if nrList?size!=0>,</#if>
<#list nrList as anItemId>
			<#if S("${aBlockId}_${anItemId}_RI_ALIAS")!="">${S("${aBlockId}_${anItemId}_RI_ALIAS")}<#else>${anItemId}</#if>_META_${aBlockId_index}<#if anItemId_has_next>,</#if>
</#list>
		);
</#list>
		MCReportSet.setReportMetaMapInit(rowClassList, reportMetaMap);
	}

	/**
	 *
	 * コンストラクタ
	 *
	 */
	protected ${S("CLASS")}_${S("CLASS_SUFFIX")}_A() {
		setRowClassList(rowClassList);
		setReportMetaMap(reportMetaMap);
	}
}

<#function notRowItems aBlockId>
<#assign tList="">
<#list A("${aBlockId}_ITEM_IDS_SCS") as anItemId>
<#if !B("${aBlockId}_${anItemId}_IS_DEF_INHERITED")>
<#if S("${aBlockId}_${anItemId}_FACT_TYPE")!="R">
<#assign tList = tList + " " + anItemId>
</#if>
</#if>
</#list>
<#return tList>
</#function>