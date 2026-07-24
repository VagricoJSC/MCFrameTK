<#macro ID bId iId indx>
<#if S("${bId}_${iId}_CP_ALIAS")!="">
${S("${bId}_${iId}_CP_ALIAS")}<#rt>
<#else>
	<#if S("${bId}_${iId}_TYPE")=="RI">
${iId?replace(".","_")}_${indx}<#rt>
	<#else>
${iId}<#rt>
	</#if>
</#if>
</#macro>

<#macro ID_CAP_FIRST bId iId indx>
<#if S("${bId}_${iId}_CP_ALIAS")!="">
${S("${bId}_${iId}_CP_ALIAS")?cap_first}<#rt>
<#else>
	<#if S("${bId}_${iId}_TYPE")=="RI">
${iId?replace(".","_")?cap_first}_${indx}<#rt>
	<#else>
${iId?cap_first}<#rt>
	</#if>
</#if>
</#macro>