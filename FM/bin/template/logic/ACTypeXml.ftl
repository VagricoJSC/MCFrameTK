<#import "/macro/RevAnnotation.ftl" as REV>
<?xml version="1.0" encoding="UTF-8"?>
<@REV.XML_COMMENT/>
<!--MCFrame ACType Constant-->
<MCFrame>
<#list GET_SUBKEYS_FROM_XML("", S("MODULE_ID")) as modId>
<${modId}>
<#if modId=S("MODULE_ID")>
<#assign logics=GET_SUBKEYS_FROM_XML("${modId}.", S("ID"))/>
<#else>
<#assign logics=GET_SUBKEYS_FROM_XML("${modId}.")/>
</#if>
<#list logics as anId>
	<${anId}>
<#if modId=S("MODULE_ID")&&anId=S("ID")>
<#assign opes=GET_SUBKEYS_FROM_XML("${modId}.${anId}.", S("METHOD_ID"))/>
<#else>
<#assign opes=GET_SUBKEYS_FROM_XML("${modId}.${anId}.")/>
</#if>
<#list opes as mthId>
		<${mthId}>
<#if modId=S("MODULE_ID")&&anId=S("ID")&&mthId=S("METHOD_ID")>
<@REV.REV_XML_WITH_CLASS tabs="\t\t\t"/>
	<#if S("ACTYPE")!="">
			<type>${S("ACTYPE")}</type>
	</#if>
<#else>
<#assign mRevs=GET_SUBKEYS_FROM_XML("${modId}.${anId}.${mthId}.Rev.")/>
	<#if mRevs?size != 0>
			<Rev>
		<#list mRevs as mRev>
				<${mRev}><@REV.CDATA value=GET_FROM_XML("${modId}.${anId}.${mthId}.Rev.${mRev}")/></${mRev}>
		</#list>
			</Rev>
	</#if>
	<#if GET_FROM_XML("${modId}.${anId}.${mthId}.type")!="">
			<type>${GET_FROM_XML("${modId}.${anId}.${mthId}.type")}</type>
	</#if>
</#if>
		</${mthId}>
</#list>
	</${anId}>
</#list>
</${modId}>
</#list>
</MCFrame>