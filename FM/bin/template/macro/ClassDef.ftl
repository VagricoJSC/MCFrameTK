<#macro _CONT_DEF body gth lth>
<@CONT_CLASS_NAME body0=body/><#if B(body + "_IS_LIST")>${lth}<@CONT_ROW_DEF body=body/>${gth}</#if></#macro>

<#macro CONT_DEF body>
<@_CONT_DEF body ">" "<"/></#macro>

<#macro CONT_CLASS_NAME body0>
<#if B(body0 + "_IS_LIST")><#if B(body0 + "_FACT_IS_GENE_LIST")>${S(body0 + "_FACT_ID")}<#if B(body0 + "_FACT_IS_DAO")>_</#if>${S(body0 + "_CODE_S")}<#else>MCList</#if><#else><@CONT_ROW_DEF body=body0/></#if></#macro>

<#macro GENE_LIST_ROW_CLASS body>
<#if B(body + "_IS_LIST")><@CONT_ROW_DEF body=body/>.class</#if></#macro>

<#macro CONT_ROW_DEF body>
${F_CONT_ROW_DEF(body)}</#macro>

<#macro GETTER_RET_TYPE body>
<@CONT_CLASS_NAME body0=body/><#if B(body + "_IS_LIST")&&!(B(body + "_IS_OVERRIDE")&&!B(body + "_IS_EI"))><<@CONT_ROW_DEF body=body/>></#if></#macro>

<#macro UD_GETTER_RET_TYPE body ud><#-- Operation自動生成用。-->
<#-- LISTの場合、「親OpeSpecに同Blockが定義されている(非EI)場合。or Interfaceに実装を強要されていて$super$の場合。」にジェネリクス無指定とする。  -->
<@CONT_CLASS_NAME body0=body/><#if B(body + "_IS_LIST")&&!((B(body + "_IS_OVERRIDE")&&!B(body + "_IS_EI"))||(S(body + "_DEPEND_TYPE")=="$super$"&&B(body + "_IS_" + ud + "_FORCED_IMPLE")))><<@CONT_ROW_DEF body=body/>></#if></#macro>

<#function F_GETTER_RET_TYPE body>
<#assign ret=F_CONT_CLASS_NAME(body)>
<#if B(body + "_IS_LIST")&&!B(body + "_IS_OVERRIDE")>
<#assign ret=ret+"<"+F_CONT_ROW_DEF(body)+">">
</#if>
<#return ret>
</#function>

<#function F_CONT_CLASS_NAME body0>
<#if B(body0 + "_IS_LIST")>
	<#if B(body0 + "_FACT_IS_GENE_LIST")>
<#assign ret=S(body0 + "_FACT_ID")>
		<#if B(body0 + "_FACT_IS_DAO")>
<#assign ret=ret+"_">
		</#if>
<#assign ret=ret+S(body0 + "_CODE_S")>
	<#else>
<#assign ret="MCList">
	</#if>
<#else>
<#assign ret=F_CONT_ROW_DEF(body0)>
</#if>
<#return ret>
</#function>

<#function F_CONT_ROW_DEF body>
<#assign ret=S(body + "_FACT_ID")>
	<#if B(body + "_FACT_IS_DAO")>
<#assign ret=ret+"_R">
	<#else>
<#assign ret=ret+"R">
	</#if>
<#return ret>
</#function>

<#function METHOD_DUPLI_CHECK name sfx cb>
<#assign temp=name + (sfx=="")?string("", "_" + sfx)>
<#if LAST_INC_LINE_IN_CB(temp + "(){", cb)>
<#if sfx=="">
<#assign nextSfx="0">
<#else>
<#assign nextSfx=(sfx?number+1)?c>
</#if>
<#return METHOD_DUPLI_CHECK(name, nextSfx, cb)>
<#else>
<#return temp>
</#if>
</#function>

<#macro MY_L_CREATE_SUFFIX>
<#-- genericsに関連するメソッドオーバーロードを避ける（Java7対応）-->
<#if !FMCONST_B("LIST_GENE_630")>
<#if B("IS_DAO")>
${S("BLOCK_ID")}<#rt>
<#else>
${S("MODULE_ID")}_${S("ID")}_${S("BLOCK_ID")}<#rt>
</#if>
</#if>
</#macro>

<#macro DBC_L_CREATE_SUFFIX b>
<#-- genericsに関連するメソッドオーバーロードを避ける（Java7対応）-->
<#if !FMCONST_B("LIST_GENE_630")>
${b}<#rt>
</#if>
</#macro>

<#macro L_CREATE_SUFFIX b>
<#-- genericsに関連するメソッドオーバーロードを避ける（Java7対応）-->
<#if !FMCONST_B("LIST_GENE_630")>
<#if B(b + "_FACT_IS_DAO")>
${S(b + "_FACT_BLOCK_ID")}<#rt>
<#else>
${S(b + "_FACT_MODULE_ID")}_${S(b + "_FACT_SPEC_ID")}_${S(b + "_FACT_BLOCK_ID")}<#rt>
</#if>
</#if>
</#macro>