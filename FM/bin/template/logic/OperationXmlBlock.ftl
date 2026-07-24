<#macro OPE_XML_BLOCK aHead tabs><#-- aHeadは"MCOperation"か""のどちらか -->
<#assign HEAD_PD=aHead + ".">
<#if aHead==""><#assign HEAD_PD=""></#if>
<#-- 今回の自動生成で追加されるリソースも既存分とあわせてソートするために -->
<#-- 解析データがある場合には、解析データにソート参考情報を追加する。-->
<#if ANALYZED()>
${SET_STRING_TO_XML(HEAD_PD + S("MODULE_ID") + "." + S("ID") + "." + S("METHOD_ID"), "DUMMY")}<#rt>
</#if>
<#if aHead!=""><${aHead}></#if>
<#list GET_SUBKEYS_FROM_XML(HEAD_PD, S("MODULE_ID")) as modId>
${tabs}<${modId}>
<#if modId=S("MODULE_ID")>
<#assign logics=GET_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.", S("ID"))/>
<#else>
<#assign logics=GET_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.")/>
</#if>
<#list logics as anId>
${tabs}	<${anId}>
<#if modId=S("MODULE_ID")&&anId=S("ID")>
${tabs}		<package>${S("PACKAGE")}</package>
<#else>
${tabs}		<package>${GET_FROM_XML(HEAD_PD + "${modId}.${anId}.package")}</package>
</#if>
<#if modId=S("MODULE_ID")&&anId=S("ID")>
<#assign opes=GET_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.${anId}.", S("METHOD_ID"))/>
<#else>
<#assign opes=GET_SUBKEYS_FROM_XML(HEAD_PD + "${modId}.${anId}.")/>
</#if>
<#list opes as mthId>
<#if mthId!="package">
<#if !(modId==S("MODULE_ID")&&anId==S("ID")&&mthId!=S("METHOD_ID")&&B("IS_FIRST_IN_LOGIC"))>
<#-- 同一Excelの最初のOpe自動生成では、同Logic(同Excel内)の他Opeの書き出しはしない。 -->
<#-- 「削除されたOpe」のOperation.xmlのOpe定義を削除するための仕様 -->
${tabs}		<${mthId}>
	<#if modId==S("MODULE_ID")&&anId==S("ID")&&mthId==S("METHOD_ID")>
${tabs}			<class>${S("CLASS")}</class>
${tabs}			<method>${S("METHOD")}</method>
	<#else>
${tabs}			<class>${GET_FROM_XML(HEAD_PD + "${modId}.${anId}.${mthId}.class")}</class>
${tabs}			<method>${GET_FROM_XML(HEAD_PD + "${modId}.${anId}.${mthId}.method")}</method>
	</#if>
${tabs}		</${mthId}>
</#if>
</#if>
</#list>
${tabs}	</${anId}>
</#list>
${tabs}</${modId}>
</#list>
<#if aHead!=""></${aHead}></#if>
</#macro>
