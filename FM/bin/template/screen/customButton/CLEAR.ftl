<#if S("${aBlockId}_${anItemId}_EVENT_${eIndex}_IN")!="">
${"\t\t"}<@GET_CLEAR block=S("${aBlockId}_${anItemId}_EVENT_${eIndex}_IN")/>
<#else>
${"\t\t"}<@GET_CLEAR block=aBlockId/>
</#if>
<#macro GET_CLEAR block>
clear(get${block}${S("${block}_CODE_S")}());
</#macro>
