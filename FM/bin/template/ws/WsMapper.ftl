<#import "/macro/RevAnnotation.ftl" as REV>
<#import "/macro/ClassDef.ftl" as CDEF>
<#import "/ws/ItemName.ftl" as INAME>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")}.service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.HandlerChain;

import mcframe.serverCore.ws.MCWSAuth;
import mcframe.serverCore.ws.MCWSContext;
import mcframe.serverCore.ws.MCWSLogicWS;
import mcframe.serverCore.ws.MCWSFault;
import mcframe.serverCore.ws.MCWSUtil;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.param.MCParam;

import ${S("PACKAGE")}.PDef;

//for JAX-WS
@WebService (
	name = "${S("MODULE_ID")}_${S("ID")}",
	portName = "${S("MODULE_ID")}_${S("ID")}Port",
	serviceName = "${S("MODULE_ID")}_${S("ID")}Service",
	targetNamespace = "http://service.${S("ID")}.server${S("SUBMODULE_ID")}.mcframe/"
)
@HandlerChain(file="MCWSHandlers.xml")
public class ${S("CLASS")} extends MCWSLogicWS {

//FMCB LOGIC_CALL START
${CB("LOGIC_CALL")}
<#if !INC_LINE_IN_CB("public " + S("METHOD") + "_DownParam " + S("METHOD") + "(" + S("METHOD") + "_UpParam upparam)" , "LOGIC_CALL")>
	@WebMethod (
		operationName = "${S("METHOD")}"
	)
	public ${S("METHOD")}_DownParam ${S("METHOD")}(${S("METHOD")}_UpParam upparam) throws MCWSFault {
		try {
			// AuthContainer
			MCWSAuth auth = (upparam != null) ? upparam.getAuth() : null;

			// UpContainer
<#list A("TELEGRAM_UP_L_BLOCK_IDS") as aBlockId>
			<@CDEF.CONT_DEF body=aBlockId/> aUp${aBlockId_index} = <@CDEF.CONT_CLASS_NAME body0=aBlockId/>.create<#if B(aBlockId + "_FACT_IS_GENE_LIST")><@CDEF.L_CREATE_SUFFIX aBlockId/></#if>(<@CDEF.GENE_LIST_ROW_CLASS body=aBlockId/>);
</#list>

			// UpContainerConvert
			if (upparam != null) {
<#list A("TELEGRAM_UP_L_BLOCK_IDS") as aBlockId>
				${S("METHOD")}_Up_${aBlockId}<#if B(aBlockId + "_IS_LIST")>[]</#if> wsUp${aBlockId_index} = upparam.getUp${aBlockId_index}();
				if (wsUp${aBlockId_index} != null) {
	<#if B(aBlockId + "_IS_LIST")>
					for (int i = 0; i < wsUp${aBlockId_index}.length; i++) {
						${S("METHOD")}_Up_${aBlockId} wsRow = wsUp${aBlockId_index}[i];
						if (wsRow != null) {
							${S(aBlockId + "_FACT_ID")}<#if B(aBlockId + "_FACT_IS_DAO")>_</#if>R aRow = ${S(aBlockId + "_FACT_ID")}<#if B(aBlockId + "_FACT_IS_DAO")>_</#if>R.create();
		<#list A("TELEGRAM_UP_${aBlockId_index}_ITEM_IDS") as anItemId>
							aRow.<@MC_ID bId=aBlockId iId=anItemId/>(MCWSUtil.<@TO_MC bId=aBlockId iId=anItemId/>(wsRow.<#if S("${aBlockId}_${anItemId}_TYPE")=="F">is<#else>get</#if><@INAME.ID_CAP_FIRST bId=aBlockId iId=anItemId indx=anItemId_index/>()));
		</#list>
							MCWSUtil.toMCAttributes(aRow, wsRow, ${aBlockId_index}, i);
							aUp${aBlockId_index}.add(aRow);
						}
					}
	<#else>
		<#list A("TELEGRAM_UP_${aBlockId_index}_ITEM_IDS") as anItemId>
					aUp${aBlockId_index}.<@MC_ID bId=aBlockId iId=anItemId/>(MCWSUtil.<@TO_MC bId=aBlockId iId=anItemId/>(wsUp${aBlockId_index}.<#if S("${aBlockId}_${anItemId}_TYPE")=="F">is<#else>get</#if><@INAME.ID_CAP_FIRST bId=aBlockId iId=anItemId indx=anItemId_index/>()));
		</#list>
					MCWSUtil.toMCAttributes(aUp${aBlockId_index}, wsUp${aBlockId_index}, ${aBlockId_index}, -1);
	</#if>
				}
</#list>
			}

			// DownContainer
<#list A("TELEGRAM_DOWN_L_BLOCK_IDS") as aBlockId>
			<@CDEF.CONT_DEF body=aBlockId/> aDown${aBlockId_index} = <@CDEF.CONT_CLASS_NAME body0=aBlockId/>.create<#if B(aBlockId + "_FACT_IS_GENE_LIST")><@CDEF.L_CREATE_SUFFIX aBlockId/></#if>(<@CDEF.GENE_LIST_ROW_CLASS body=aBlockId/>);
</#list>

			// Param
			MCParam param = createParam("${S("MODULE_ID")}", "${S("ID")}", "${S("METHOD_ID")}", "${S("VERSION")}",
										new PDef());
<#list A("TELEGRAM_UP_L_BLOCK_IDS") as aBlockId>
			param.getContainerParam().addUpBlock(aUp${aBlockId_index});
</#list>
<#list A("TELEGRAM_DOWN_L_BLOCK_IDS") as aBlockId>
			param.getContainerParam().addDownBlock(aDown${aBlockId_index});
</#list>

			// LogicCall
			MCWSContext context = request(auth, param);

			// DownConvert
			${S("METHOD")}_DownParam downparam = new ${S("METHOD")}_DownParam();
<#list A("TELEGRAM_DOWN_L_BLOCK_IDS") as aBlockId>
	<#if B(aBlockId + "_IS_LIST")>
			int aDown${aBlockId_index}_size = aDown${aBlockId_index}.size();
			${S("METHOD")}_Down_${aBlockId}<#if B(aBlockId + "_IS_LIST")>[]</#if> wsDown${aBlockId_index} = new ${S("METHOD")}_Down_${aBlockId}[aDown${aBlockId_index}_size];
			for (int i = 0; i < aDown${aBlockId_index}_size; i++) {
				${S(aBlockId + "_FACT_ID")}<#if B(aBlockId + "_FACT_IS_DAO")>_</#if>R aRow = aDown${aBlockId_index}.get(i);
				${S("METHOD")}_Down_${aBlockId} wsRow = new ${S("METHOD")}_Down_${aBlockId}();
		<#list A("TELEGRAM_DOWN_${aBlockId_index}_ITEM_IDS") as anItemId>
				wsRow.set<@INAME.ID_CAP_FIRST bId=aBlockId iId=anItemId indx=anItemId_index/>(MCWSUtil.<@TO_WS bId=aBlockId iId=anItemId/>(aRow.<@MC_ID bId=aBlockId iId=anItemId/>()));
		</#list>
				MCWSUtil.toWSAttributes(wsRow, aRow);
				wsDown${aBlockId_index}[i] = wsRow;
			}
	<#else>
			${S("METHOD")}_Down_${aBlockId} wsDown${aBlockId_index} = new ${S("METHOD")}_Down_${aBlockId}();
		<#list A("TELEGRAM_DOWN_${aBlockId_index}_ITEM_IDS") as anItemId>
			wsDown${aBlockId_index}.set<@INAME.ID_CAP_FIRST bId=aBlockId iId=anItemId indx=anItemId_index/>(MCWSUtil.<@TO_WS bId=aBlockId iId=anItemId/>(aDown${aBlockId_index}.<@MC_ID bId=aBlockId iId=anItemId/>()));
		</#list>
			MCWSUtil.toWSAttributes(wsDown${aBlockId_index}, aDown${aBlockId_index});
	</#if>
			downparam.setDown${aBlockId_index}(wsDown${aBlockId_index});
</#list>
			downparam.setMessageArray(MCWSUtil.toWSMessageArray(
										context.locale(),
										param.getMessageParam().getMessage()));
			return downparam;
		}
		catch (Throwable e) {
			throw convWSFault(e);
		}
	}
</#if>
//FMCB LOGIC_CALL END
}
<#macro TO_MC bId iId>
<#if S("${bId}_${iId}_FACT_TYPE")=="C"||S("${bId}_${iId}_FACT_TYPE")=="CC">toMCString</#if><#rt>
<#if S("${bId}_${iId}_FACT_TYPE")=="N">toMCNumber</#if><#rt>
<#if S("${bId}_${iId}_FACT_TYPE")=="D">toMCDate</#if><#rt>
<#if S("${bId}_${iId}_FACT_TYPE")=="TS">toMCTimestamp</#if><#rt>
<#if S("${bId}_${iId}_FACT_TYPE")=="F">toMCBoolean</#if><#rt>
<#if S("${bId}_${iId}_FACT_TYPE")=="B">toMCBinary</#if><#rt>
</#macro>
<#macro TO_WS bId iId>
<#if S("${bId}_${iId}_FACT_TYPE")=="C"||S("${bId}_${iId}_FACT_TYPE")=="CC">toWSString</#if><#rt>
<#if S("${bId}_${iId}_FACT_TYPE")=="N">toWSNumber</#if><#rt>
<#if S("${bId}_${iId}_FACT_TYPE")=="D"||S("${bId}_${iId}_FACT_TYPE")=="TS">toWSDateTimeJAXB</#if><#rt>
<#if S("${bId}_${iId}_FACT_TYPE")=="F">toWSBoolean</#if><#rt>
<#if S("${bId}_${iId}_FACT_TYPE")=="B">toWSBinary</#if><#rt>
</#macro>
<#macro MC_ID bId iId>
<#if S("${bId}_${iId}_CP_ALIAS")!="">
${S("${bId}_${iId}_CP_ALIAS")}<#rt>
<#else>
	<#if S("${bId}_${iId}_TYPE")=="RI">
${S("${bId}_${iId}_ACCESSOR")}<#rt>
	<#else>
${iId}<#rt>
	</#if>
</#if>
</#macro>