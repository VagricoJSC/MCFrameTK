<#import "/macro/ClassDef.ftl" as CDEF>
	//FMCB CTRL_FIELD_METHOD START
${CB("CTRL_FIELD_METHOD")}
<#list A("BLOCK_IDS") as aBlockId>
<#if !INC_LINE_IN_CB("public "+ CDEF.F_CONT_ROW_DEF(aBlockId) + " create" + aBlockId + "R(){", "CTRL_FIELD_METHOD")>
	/**
	 * ${aBlockId}ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
<#assign methodName=CDEF.METHOD_DUPLI_CHECK("create"+aBlockId+"R", "", "CTRL_FIELD_METHOD")>
	public <@CDEF.CONT_ROW_DEF body=aBlockId/> ${methodName}(){
		return <@CDEF.CONT_ROW_DEF body=aBlockId/>.create();
	}

</#if>
		<#if B("${aBlockId}_IS_LIST")>
<#if !INC_LINE_IN_CB("public " + CDEF.F_GETTER_RET_TYPE(aBlockId) + " create" + aBlockId + "L(){", "CTRL_FIELD_METHOD")>
	/**
	 * ${aBlockId}ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
<#assign methodName=CDEF.METHOD_DUPLI_CHECK("create"+aBlockId+"L", "", "CTRL_FIELD_METHOD")>
	public <@CDEF.GETTER_RET_TYPE body=aBlockId/> ${methodName}(){
		return <@CDEF.CONT_CLASS_NAME body0=aBlockId/>.create<#if B(aBlockId + "_FACT_IS_GENE_LIST")><@CDEF.L_CREATE_SUFFIX aBlockId/></#if>(<@CDEF.GENE_LIST_ROW_CLASS body=aBlockId/>);
	}

</#if>
		</#if>
</#list>
	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START
${CB("LOGIC_CONTROLLER")}
	//FMCB LOGIC_CONTROLLER END
