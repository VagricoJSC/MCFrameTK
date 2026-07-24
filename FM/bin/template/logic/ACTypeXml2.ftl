<#import "/macro/RevAnnotation.ftl" as REV>
<?xml version="1.0" encoding="UTF-8"?>
<@REV.XML_COMMENT/>
<#assign HEAD="MCACType">
<#assign HEAD_PD=HEAD + ".">
<!--MCFrame ACType Constant-->
<MCFrame>
	<${HEAD}>
<#list GET_SUBKEYS_FROM_XML(HEAD_PD, S("MODULE_ID")) as modId>
		<${modId}>
<#if modId=S("MODULE_ID")>
<#assign logics=GET_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.", S("ID"))/>
<#else>
<#assign logics=GET_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.")/>
</#if>
<#list logics as anId>
			<${anId}>
<#if modId=S("MODULE_ID")&&anId=S("ID")>
<#assign opes=GET_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.${anId}.", S("METHOD_ID"))/>
<#else>
<#assign opes=GET_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.${anId}.")/>
</#if>
<#list opes as mthId>
				<${mthId}>
<#if modId=S("MODULE_ID")&&anId=S("ID")&&mthId=S("METHOD_ID")>
<@REV.REV_XML_WITH_CLASS tabs="\t\t\t\t\t"/>
	<#if S("ACTYPE")!="">
					<type>${S("ACTYPE")}</type>
	</#if>
<#else>
<#assign mRevs=GET_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.${anId}.${mthId}.Rev.")/>
	<#if mRevs?size != 0>
					<Rev>
		<#list mRevs as mRev>
						<${mRev}><@REV.CDATA value=GET_FROM_XML(HEAD_PD + "${modId}.${anId}.${mthId}.Rev.${mRev}")/></${mRev}>
		</#list>
					</Rev>
	</#if>
	<#if GET_FROM_XML(HEAD_PD + "${modId}.${anId}.${mthId}.type")!="">
					<type>${GET_FROM_XML(HEAD_PD + "${modId}.${anId}.${mthId}.type")}</type>
	</#if>
</#if>
				</${mthId}>
</#list>
			</${anId}>
</#list>
		</${modId}>
</#list>
	</${HEAD}>
</MCFrame>