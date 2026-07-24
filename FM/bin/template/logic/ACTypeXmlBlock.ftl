<#macro PKG_ACT_XML tabs>
<#assign HEAD_PD="MCACType."/>
${tabs}<${S("MODULE_ID")}>
${tabs}	<${S("ID")}>
<#if S("ACTYPE")!="">
  <#if ANALYZED()>
    <#assign opes=GET_SUBKEYS_FROM_XML(HEAD_PD + S("MODULE_ID") + "." + S("ID") + ".", S("METHOD_ID"))/>
  <#else>
    <#assign opes=[S("METHOD_ID")]/>
  </#if>
<#else>
  <#assign opes=GET_SUBKEYS_FROM_XML(HEAD_PD + S("MODULE_ID") + "." + S("ID") + ".")/>
</#if>
<#list opes as mthId>
${tabs}		<${mthId}>
<#if mthId==S("METHOD_ID")>
<@REV.REV_XML_WITH_CLASS tabs="\t\t\t\t\t"/>
	<#if S("ACTYPE")!="">
					<type>${S("ACTYPE")}</type>
	</#if>
<#else>
<#assign mRevs=GET_SUBKEYS_FROM_XML(HEAD_PD + S("MODULE_ID") + "." + S("ID") + "." + mthId + ".Rev.")/>
	<#if mRevs?size != 0>
					<Rev>
		<#list mRevs as mRev>
						<${mRev}><@REV.CDATA value=GET_FROM_XML(HEAD_PD + S("MODULE_ID") + "." + S("ID") + "." + mthId + ".Rev." + mRev)/></${mRev}>
		</#list>
					</Rev>
	</#if>
	<#if GET_FROM_XML(HEAD_PD + S("MODULE_ID") + "." + S("ID") + "." + mthId + ".type")!="">
					<type>${GET_FROM_XML(HEAD_PD + S("MODULE_ID") + "." + S("ID") + "." + mthId + ".type")}</type>
	</#if>
</#if>
${tabs}		</${mthId}>
</#list>
${tabs}	</${S("ID")}>
${tabs}</${S("MODULE_ID")}>
</#macro>