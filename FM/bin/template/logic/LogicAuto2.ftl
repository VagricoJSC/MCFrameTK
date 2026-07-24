<#import "/macro/ClassDef.ftl" as CDEF>
	//FMCB CTRL_FIELD_METHOD START
${CB("CTRL_FIELD_METHOD")}
<#if !INC_LINE_IN_CB("protected void init" + S("METHOD") + "()", "CTRL_FIELD_METHOD")>
	<#if !B("EI")><#-- EIの場合には生成しない。-->
	protected ${S("CLASS")}.${S("METHOD")} a${S("METHOD")};

	</#if>
	protected void init${S("METHOD")}() {
		this.info = PDef.${S("MODULE_ID")}_${S("ID")}_${S("METHOD_ID")}_INFO;
		this.a${S("METHOD")} = ((${S("CLASS")})this).new ${S("METHOD")}();
	}

	<#if !B("EI")><#-- EIの場合には生成しない。-->
	<#if S(B("EI")?string("EI_MODIFIER","MODIFIER"))!="abstract">
	public static ${S("CLASS")}.${S("METHOD")} crt${S("METHOD")}() {
		${S("CLASS")} lgc = new ${S("CLASS")}();
		lgc.init${S("METHOD")}();
		return lgc.a${S("METHOD")};
	}

	</#if>
	</#if>
	protected void param${S("METHOD")}(MCParam p) {
		if (this.a${S("METHOD")} == null) {
			return;
		}
		p.setDef(this.info.def);
<#list A("TELEGRAM_UP_BLOCK_IDS") as aBlockId>
	<#if S("CLASS_SUFFIX")!="MC"&&S("CLASS_SUFFIX")!="FW">
		p.addUpBlock(((${S("METHOD")})a${S("METHOD")}).up${aBlockId_index}());
	<#else>
		p.addUpBlock(a${S("METHOD")}.up${aBlockId_index}());
	</#if><#-- PjIDがFW,MC以外でキャストするのはコアアプリ自動生成互換性のため。Ver.Up時にはPj限定を撤廃する。 -->
</#list>
<#list A("TELEGRAM_DOWN_BLOCK_IDS") as aBlockId>
	<#if S("CLASS_SUFFIX")!="MC"&&S("CLASS_SUFFIX")!="FW">
		p.addDownBlock(((${S("METHOD")})a${S("METHOD")}).down${aBlockId_index}());
	<#else>
		p.addDownBlock(a${S("METHOD")}.down${aBlockId_index}());
	</#if><#-- PjIDがFW,MC以外でキャストするのはコアアプリ自動生成互換性のため。Ver.Up時にはPj限定を撤廃する。 -->
</#list>
	}

	protected void do${S("METHOD")}() {
		a${S("METHOD")}.call();
	};

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
</#if>
	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START
${CB("LOGIC_CONTROLLER")}
<#if !INC_LINE_IN_CB("public class " + S("METHOD") , "LOGIC_CONTROLLER")>
<#include F("FTL.LOGIC.AUTO_CNTL")/>
</#if>
	//FMCB LOGIC_CONTROLLER END
<#macro CAST_CLASS body0>
<#if B(body0 + "_IS_LIST")><#if B(body0 + "_FACT_IS_GENE_LIST")>${S(body0 + "_FACT_ID")}${S(body0 + "_CODE_S")}<#else>MCList</#if><${S(body0 + "_FACT_ID")}R><#else>${S(body0 + "_FACT_ID")}${S(body0 + "_CODE_S")}</#if></#macro>
