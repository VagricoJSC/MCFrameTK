<#import "/macro/RevAnnotation.ftl" as REV>
<#import "/macro/ClassDef.ftl" as CDEF>
<#import "/ws/ItemName.ftl" as INAME>
<@REV.JAVA_COMMENT/>
package ${S("PACKAGE")}.sdservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.Holder;

import mcframe.serverCore.sdws.MCWSMessageParam;
import mcframe.serverCore.sdws.MCWSUpParam;
import mcframe.serverCore.sdws.MCWSDownParam;
import mcframe.serverCore.sdws.MCWSLogic;
import mcframe.serverCore.ws.MCWSFault;
import mcframe.serverCore.ws.MCWSUtil;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.param.MCParam;
import mcframe.commonCore.resource.ctrl.MCResource;

import ${S("PACKAGE")}.PDef;
import ${S("PACKAGE")}.sdservice.*;

@WebService (
<#-- CS版の名称仕様も考慮しSDの名称にはModIDは含めない。-->
<#-- SDのModIDは"M"固定が前提のため名称にはModIDを含めなくとも一意になる。 -->
	serviceName = "${S("ID")}",
	portName = "${S("ID")}",
	name = "${S("ID")}Port",
	targetNamespace = "urn:Services.MCFrame"
)
public class ${S("CLASS")} extends MCWSLogic {

//FMCB LOGIC_CALL START
${CB("LOGIC_CALL")}
<#if !INC_LINE_IN_CB("public void " + S("METHOD") + "(" , "LOGIC_CALL")>
	@WebMethod (
		operationName = "${S("METHOD_ID")}"
	)
	public void ${S("METHOD")}(
			@WebParam(name = "up", mode = WebParam.Mode.IN)
			MCWSUpParam up,
<#assign TEL_UP_BS=A("TELEGRAM_UP_L_BLOCK_IDS")>
<#list TEL_UP_BS as aBlockId>
			@WebParam(name = "up${aBlockId_index}", mode = WebParam.Mode.IN)
			${S("METHOD")}Up${aBlockId_index}<#if B(aBlockId + "_IS_LIST")>[]</#if> up${aBlockId_index},
</#list>
			@WebParam(name = "down", mode = WebParam.Mode.OUT)
<#assign TEL_DOWN_BS=A("TELEGRAM_DOWN_L_BLOCK_IDS")>
			Holder<MCWSDownParam> down<#if TEL_DOWN_BS?size!=0>,</#if>
<#list TEL_DOWN_BS as aBlockId>
			@WebParam(name = "down${aBlockId_index}", mode = WebParam.Mode.OUT)
			Holder<${S("METHOD")}Down${aBlockId_index}<#if B(aBlockId + "_IS_LIST")>[]</#if>> down${aBlockId_index}<#if aBlockId_has_next>,</#if>
</#list>
	) throws MCWSFault {
		try {
			// UpContainer
<#list A("TELEGRAM_UP_L_BLOCK_IDS") as aBlockId>
			<@CDEF.CONT_DEF body=aBlockId/> aUp${aBlockId_index} = <@CDEF.CONT_CLASS_NAME body0=aBlockId/>.create<#if B(aBlockId + "_IS_LIST")&&B(aBlockId + "_FACT_IS_GENE_LIST")><@CDEF.L_CREATE_SUFFIX aBlockId/></#if>(<@CDEF.GENE_LIST_ROW_CLASS body=aBlockId/>);
</#list>

			// UpContainerConvert
<#list A("TELEGRAM_UP_L_BLOCK_IDS") as aBlockId>
			${S("METHOD")}Up${aBlockId_index}<#if B(aBlockId + "_IS_LIST")>[]</#if> wsUp${aBlockId_index} = up${aBlockId_index};
			if (wsUp${aBlockId_index} != null) {
	<#if B(aBlockId + "_IS_LIST")>
				for (int i = 0; i < wsUp${aBlockId_index}.length; i++) {
					${S("METHOD")}Up${aBlockId_index} wsRow = wsUp${aBlockId_index}[i];
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

			// DownContainer
<#list A("TELEGRAM_DOWN_L_BLOCK_IDS") as aBlockId>
			<@CDEF.CONT_DEF body=aBlockId/> aDown${aBlockId_index} = <@CDEF.CONT_CLASS_NAME body0=aBlockId/>.create<#if B(aBlockId + "_IS_LIST")&&B(aBlockId + "_FACT_IS_GENE_LIST")><@CDEF.L_CREATE_SUFFIX aBlockId/></#if>(<@CDEF.GENE_LIST_ROW_CLASS body=aBlockId/>);
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
			request(up, param);

			// DownConvert
<#list A("TELEGRAM_DOWN_L_BLOCK_IDS") as aBlockId>
	<#if B(aBlockId + "_IS_LIST")>
			int aDown${aBlockId_index}_size = aDown${aBlockId_index}.size();
			${S("METHOD")}Down${aBlockId_index}<#if B(aBlockId + "_IS_LIST")>[]</#if> wsDown${aBlockId_index} = new ${S("METHOD")}Down${aBlockId_index}[aDown${aBlockId_index}_size];
			for (int i = 0; i < aDown${aBlockId_index}_size; i++) {
				${S(aBlockId + "_FACT_ID")}<#if B(aBlockId + "_FACT_IS_DAO")>_</#if>R aRow = aDown${aBlockId_index}.get(i);
				${S("METHOD")}Down${aBlockId_index} wsRow = new ${S("METHOD")}Down${aBlockId_index}();
		<#list A("TELEGRAM_DOWN_${aBlockId_index}_ITEM_IDS") as anItemId>
				wsRow.set<@INAME.ID_CAP_FIRST bId=aBlockId iId=anItemId indx=anItemId_index/>(MCWSUtil.<@TO_WS bId=aBlockId iId=anItemId/>(aRow.<@MC_ID bId=aBlockId iId=anItemId/>()));
		</#list>
				MCWSUtil.toWSAttributes(wsRow, aRow);
				wsDown${aBlockId_index}[i] = wsRow;
			}
			down${aBlockId_index}.value = wsDown${aBlockId_index};
	<#else>
			down${aBlockId_index}.value = new ${S("METHOD")}Down${aBlockId_index}();
		<#list A("TELEGRAM_DOWN_${aBlockId_index}_ITEM_IDS") as anItemId>
			down${aBlockId_index}.value.set<@INAME.ID_CAP_FIRST bId=aBlockId iId=anItemId indx=anItemId_index/>(MCWSUtil.<@TO_WS bId=aBlockId iId=anItemId/>(aDown${aBlockId_index}.<@MC_ID bId=aBlockId iId=anItemId/>()));
		</#list>
			MCWSUtil.toWSAttributes(down${aBlockId_index}.value, aDown${aBlockId_index});
	</#if>
</#list>
			down.value = createDownParam(up, param);
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