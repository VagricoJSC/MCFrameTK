<#import "/macro/RevAnnotation.ftl" as REV>
<#import "/ws/ItemName.ftl" as INAME>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")}.service;

import mcframe.commonCore.ws.MCWSBinary;
import mcframe.serverCore.ws.MCWSContainer;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

public class ${S("METHOD")}_${S("DIRECTION")?lower_case?capitalize}_${S("BLOCK_ID")} extends MCWSContainer {

<#list A("TELEGRAM_" + S("DIRECTION") + "_L_BLOCK_IDS") as aBlockId>
	<#if aBlockId==S("BLOCK_ID")>
		<#list A("TELEGRAM_" + S("DIRECTION") + "_${aBlockId_index}_ITEM_IDS") as anItemId>
	private <@TYPE bId=aBlockId iId=anItemId/> <@INAME.ID bId=aBlockId iId=anItemId indx=anItemId_index/><#if S("${aBlockId}_${anItemId}_FACT_TYPE")=="F"> = false</#if>;
		</#list>
	</#if>
</#list>
<#list A("TELEGRAM_" + S("DIRECTION") + "_L_BLOCK_IDS") as aBlockId>
	<#if aBlockId==S("BLOCK_ID")>
		<#list A("TELEGRAM_" + S("DIRECTION") + "_${aBlockId_index}_ITEM_IDS") as anItemId>

			<#if S("${aBlockId}_${anItemId}_FACT_TYPE")=="D"||S("${aBlockId}_${anItemId}_FACT_TYPE")=="TS">
	@javax.xml.bind.annotation.XmlSchemaType(name="dateTime")
			</#if>
	public <@TYPE bId=aBlockId iId=anItemId/> <#if S("${aBlockId}_${anItemId}_TYPE")=="F">is<#else>get</#if><@INAME.ID_CAP_FIRST bId=aBlockId iId=anItemId indx=anItemId_index/>() {
		return <@INAME.ID bId=aBlockId iId=anItemId indx=anItemId_index/>;
	}

	public void set<@INAME.ID_CAP_FIRST bId=aBlockId iId=anItemId indx=anItemId_index/>(<@TYPE bId=aBlockId iId=anItemId/> a<@INAME.ID_CAP_FIRST bId=aBlockId iId=anItemId indx=anItemId_index/>) {
		this.<@INAME.ID bId=aBlockId iId=anItemId indx=anItemId_index/> = a<@INAME.ID_CAP_FIRST bId=aBlockId iId=anItemId indx=anItemId_index/>;
	}
		</#list>
	</#if>
</#list>
}
<#macro TYPE bId iId>
<#if S("${bId}_${iId}_FACT_TYPE")=="C"||S("${bId}_${iId}_FACT_TYPE")=="CC">String</#if><#rt>
<#if S("${bId}_${iId}_FACT_TYPE")=="N">BigDecimal</#if><#rt>
<#if S("${bId}_${iId}_FACT_TYPE")=="D"||S("${bId}_${iId}_FACT_TYPE")=="TS">XMLGregorianCalendar</#if><#rt>
<#if S("${bId}_${iId}_FACT_TYPE")=="F">boolean</#if><#rt>
<#if S("${bId}_${iId}_FACT_TYPE")=="B">MCWSBinary</#if><#rt>
</#macro>